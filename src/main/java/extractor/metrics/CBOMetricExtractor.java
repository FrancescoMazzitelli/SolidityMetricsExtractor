package extractor.metrics;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;

import extractor.grammar.SolidityBaseVisitor;
import extractor.grammar.SolidityParser.*;


@SuppressWarnings("deprecation")
public class CBOMetricExtractor extends SolidityBaseVisitor<Integer> {

	private boolean pre_flight = false;
	private Set<String> contractIds = new HashSet<String>();
	private Set<String> alreadyCounted = new HashSet<String>();
	int cbo = 0;

	/**
	 * Metodo che inizializza il parseTree dello script in analisi
	 * per renderlo visitabile
	 * 
	 * @param ctx
	 */
	public void start(SourceUnitContext ctx) {
		pre_flight = true;
		visitSourceUnit(ctx);
	}

	/**
	 * Metodo che richiama visitContractDefinition()
	 * 
	 * @param ctx
	 * @return
	 */
	public int calculateCBO(@NotNull DefinizioneContrattoContext ctx) {
		pre_flight = false;
		return visitDefinizioneContratto(ctx);
	}

	/**
	 * Metodo che estende quanto definito in SolidityBaseVisitor, quando il visitor
	 * arriva a tale metodo il contenuto viene aggiornato con quanto definito in
	 * questa classe
	 */
	@Override
	public Integer visitDefinizioneContratto(@NotNull DefinizioneContrattoContext ctx) {
		if (pre_flight) {
			contractIds.add(ctx.identificatore().getText());
		} else {
			cbo = 0;
			alreadyCounted.clear();
		}
		return cbo;
	}
	
	/**
	 * Metodo che estende quanto definito in SolidityBaseVisitor, quando il visitor
	 * arriva a tale metodo il contenuto viene aggiornato con quanto definito in
	 * questa classe
	 */
	@Override
	public Integer visitTipiDefinitiUtente(@NotNull TipiDefinitiUtenteContext ctx) {
		String usedContract = ctx.identificatore().get(0).getText();
		if (contractIds.contains(usedContract) && !alreadyCounted.contains(usedContract)
				&& !(ctx.getParent() instanceof InheritanceSpecifierContext)) {
			cbo++;
			alreadyCounted.add(usedContract);
		}
		super.visitTipiDefinitiUtente(ctx);
		return null;
	}

}
