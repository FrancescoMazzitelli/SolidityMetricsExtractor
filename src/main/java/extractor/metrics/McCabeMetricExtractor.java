package extractor.metrics;

import org.antlr.v4.runtime.misc.NotNull;

import extractor.grammar.*;
import extractor.grammar.SolidityParser.*;

@SuppressWarnings("deprecation")
public class McCabeMetricExtractor extends SolidityBaseVisitor<Integer> {

	private int mcc;
	
	public McCabeMetricExtractor() {
		mcc = 0;
	}
	
	@Override
	public Integer visitDefinizioneFunzione(@NotNull DefinizioneFunzioneContext ctx) {
		super.visitDefinizioneFunzione(ctx);
		return mcc + 1;
	}

	@Override
	public Integer visitIfStatement(@NotNull IfStatementContext ctx) {
		mcc++;
		super.visitIfStatement(ctx);
		return null;
	}
	
	@Override
	public Integer visitWhileStatement(@NotNull WhileStatementContext ctx) {
		mcc++;
		super.visitWhileStatement(ctx);
		return null;
	}
	
	@Override
	public Integer visitForStatement(@NotNull ForStatementContext ctx) {
		mcc++;
		super.visitForStatement(ctx);
		return null;
	}
	
	@Override
	public Integer visitDoWhileStatement(@NotNull DoWhileStatementContext ctx) {
		mcc++;
		super.visitDoWhileStatement(ctx);
		return null;
	}
}
