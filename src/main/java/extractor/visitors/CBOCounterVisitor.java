package extractor.visitors;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;

import grammar_ANTLR.solidity.SolidityParser.*;
import grammar_ANTLR.solidity.SolidityBaseVisitor;


@SuppressWarnings("deprecation")
public class CBOCounterVisitor extends SolidityBaseVisitor<Integer> {

	private boolean pre_flight = false;
	private Set<String> contractIds = new HashSet<String>();
	private Set<String> alreadyCounted = new HashSet<String>();
	int cbo = 0;

	public void runInitialization(SourceUnitContext ctx) {
		pre_flight = true;
		visitSourceUnit(ctx);
	}

	public int calculateCBO(@NotNull DefinizioneContrattoContext ctx) {
		pre_flight = false;
		return visitContractDefinition(ctx);
	}

	public Integer visitContractDefinition(@NotNull DefinizioneContrattoContext ctx) {
		if (pre_flight) {
			contractIds.add(ctx.identificatore().getText());
		} else {
			cbo = 0;
			alreadyCounted.clear();
		}
		return cbo;
	}

	public Integer visitUserDefinedTypeName(@NotNull TipiDefinitiUtenteContext ctx) {
		String usedContract = ctx.identificatore().get(0).getText();
		if (contractIds.contains(usedContract) && !alreadyCounted.contains(usedContract)
				&& !(ctx.getParent() instanceof InheritanceSpecifierContext)) {
			cbo++;
			alreadyCounted.add(usedContract);
		}
		return null;
	}

}
