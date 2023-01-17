package extractor.metrics;

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;

import extractor.grammar.*;
import extractor.grammar.SolidityParser.*;

@SuppressWarnings("deprecation")
public class MainVisitor extends SolidityBaseVisitor<Void> {

	private Map<String, Integer> contractDefCounts = new HashMap<String, Integer>();

	private DefinizioneContrattoContext currentContract;
	//sloc, cloc, mcc, nos, cbo, dit
	private Map<DefinizioneContrattoContext, Integer[]> contractMetrics = new HashMap<DefinizioneContrattoContext, Integer[]>();
	private Map<String, Integer> contractDIT = new HashMap<String, Integer>();
	private CBOMetricExtractor cboExtractor = new CBOMetricExtractor();
	private String sorgente;

	public MainVisitor(String codice) {
		this.sorgente = codice;
	}
	
	/**
	 * Metodo che inizializza il ParseTree
	 */
	@Override
	public Void visitSourceUnit(@NotNull SourceUnitContext ctx) {
		cboExtractor.start(ctx);
		super.visitSourceUnit(ctx);
		return null;
	}
	
	/**
	 * Metodo principale che si occupa della chiamata agli altri metodi
	 * e della generazione dell'array contenente i valori delle metriche.
	 * L'array viene inserito nella Mappa [Contract -> metriche]
	 */
	@Override
	public Void visitDefinizioneContratto(@NotNull DefinizioneContrattoContext ctx) {
		int sloc = ctx.getStop().getLine() - ctx.getStart().getLine() + 1;
		LOCMetricExtractor LocExtractor = new LOCMetricExtractor("\n", ctx.getStart().getLine() - 1, ctx.getStop().getLine() - 1);
		LocExtractor.calculateLOCMetrics(sorgente);
		int cloc = LocExtractor.getCLOC();
		contractDefCounts.put(ctx.getStart().getText(),
				contractDefCounts.getOrDefault(ctx.getStart().getText(), 0) + 1);
		Integer[] mets = new Integer[6];
		mets[0] = sloc;
		mets[1] = cloc;
		mets[2] = 0;
		mets[3] = 0;
		mets[4] = cboExtractor.calculateCBO(ctx);
		mets[5] = calculateDIT(ctx);
		
		currentContract = ctx;
		contractMetrics.put(ctx, mets);
		super.visitDefinizioneContratto(ctx);
		currentContract = null;
		return null;
	}

	/**
	 * Metodo che calcola la DIT.
	 * Viene prelevato dal contesto di definizione del Contract (Header script .SOL)
	 * lo specificatore di ereditarietà. Se lo specificatore corrente  ha un valore
	 * di profondità maggiore del precedente, la metrica DIT viene aggiornata
	 * 
	 * @param ctx
	 * @return
	 */
	private int calculateDIT(DefinizioneContrattoContext ctx) {
		int dit = 0;
		for (InheritanceSpecifierContext ictx : ctx.inheritanceSpecifier()) {
			String baseName = ictx.tipiDefinitiUtente().identificatore().get(0).getText();
			if (contractDIT.get(baseName) + 1 > dit) {
				dit = contractDIT.get(baseName) + 1;
			}
		}
		contractDIT.put(ctx.identificatore().getText(), dit);
		return dit;
	}

	/**
	 * Metodo che estende quanto definito in SolidityBaseVisitor, quando il visitor
	 * arriva a tale metodo il contenuto viene aggiornato con quanto definito in
	 * questa classe.
	 * Siccome si basa sul calcolo della complessità ciclomatica, questo parametro
	 * viene incrementato ogni volta che si entra in un contesto di definizione di
	 * una funzione durante la visita del ParseTree
	 */
	@Override
	public Void visitDefinizioneFunzione(@NotNull DefinizioneFunzioneContext ctx) {
		int mcc = new McCabeMetricExtractor().visitDefinizioneFunzione(ctx);
		contractMetrics.get(currentContract)[2] += mcc;
		return null;
	}

	/**
	 * Metodo che estende quanto definito in SolidityBaseVisitor, quando il visitor
	 * arriva a tale metodo il contenuto viene aggiornato con quanto definito in
	 * questa classe.
	 * Siccome si basa sul calcolo del numero di statements, questo parametro
	 * viene incrementato ogni volta che si entra in un contesto di definizione di
	 * uno statements durante la visita del ParseTree
	 */
	@Override
	public Void visitStatement(@NotNull StatementContext ctx) {
		if (!(ctx.getChild(0) instanceof BlockContext)) {
			contractMetrics.get(currentContract)[3]++;
		}
		super.visitStatement(ctx);
		return null;
	}
	
	public int getContractCount() {
		return contractDefCounts.getOrDefault("contract", 0);
	}

	public int getLibraryCount() {
		return contractDefCounts.getOrDefault("library", 0);
	}

	public int getInterfaceCount() {
		return contractDefCounts.getOrDefault("interface", 0);
	}

	public Map<DefinizioneContrattoContext, Integer[]> getMetricMap() {
		return contractMetrics;
	}
}
