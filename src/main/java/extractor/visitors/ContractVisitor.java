package extractor.visitors;

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;

import grammar_ANTLR.solidity.*;
import grammar_ANTLR.solidity.SolidityParser.*;

@SuppressWarnings("deprecation")
public class ContractVisitor extends SolidityBaseVisitor<Void> {

	private int count;
	private Map<String, Integer> contractDefCounts = new HashMap<String, Integer>();

	private DefinizioneContrattoContext currentContract;
	//sloc, cloc, mcc, nos, cbo, dit
	private Map<DefinizioneContrattoContext, Integer[]> contractMetrics = new HashMap<DefinizioneContrattoContext, Integer[]>();
	private Map<String, Integer> contractDIT = new HashMap<String, Integer>();
	private CBOCounterVisitor cboCounter = new CBOCounterVisitor();
	private String sorgente;

	public ContractVisitor(String codice) {
		this.sorgente = codice;
	}
	
	@Override
	public Void visitSourceUnit(@NotNull SourceUnitContext ctx) {
		cboCounter.runInitialization(ctx);
		super.visitSourceUnit(ctx);
		return null;
	}
	
	@Override
	public Void visitDefinizioneContratto(@NotNull DefinizioneContrattoContext ctx) {
		count++;
		int sloc = ctx.getStop().getLine() - ctx.getStart().getLine() + 1;
		LOCCalculator locCalc = new LOCCalculator("\n", ctx.getStart().getLine() - 1, ctx.getStop().getLine() - 1);
		locCalc.calculateLOCMetrics(sorgente);
		int cloc = locCalc.getCLOC();
		contractDefCounts.put(ctx.getStart().getText(),
				contractDefCounts.getOrDefault(ctx.getStart().getText(), 0) + 1);
		Integer[] mets = new Integer[6];
		mets[0] = sloc;
		mets[1] = cloc;
		mets[2] = 0;
		mets[3] = 0;
		mets[4] = cboCounter.calculateCBO(ctx);
		mets[5] = calculateDIT(ctx);
		
		currentContract = ctx;
		contractMetrics.put(ctx, mets);
		super.visitDefinizioneContratto(ctx);
		currentContract = null;
		return null;
	}

	private int calculateDIT(DefinizioneContrattoContext ctx) {
		int dit = 0;
		for (InheritanceSpecifierContext ictx : ctx.inheritanceSpecifier()) {
			String baseName = ictx.tipiDefinitiUtente().identificatore().get(0).getText();
			System.out.println(baseName);
			if (contractDIT.get(baseName) + 1 > dit) {
				dit = contractDIT.get(baseName) + 1;
			}
		}
		contractDIT.put(ctx.identificatore().getText(), dit);
		return dit;
	}

	@Override
	public Void visitDefinizioneFunzione(@NotNull DefinizioneFunzioneContext ctx) {
		int mcc = new McCabeCounterVisitor().visitDefinizioneFunzione(ctx);
		contractMetrics.get(currentContract)[2] += mcc;
		return null;
	}

	
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

	public int getTotalContractCount() {
		return count;
	}

	public Map<DefinizioneContrattoContext, Integer[]> getMetricMap() {
		return contractMetrics;
	}
}
