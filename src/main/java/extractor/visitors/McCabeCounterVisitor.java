package extractor.visitors;

import org.antlr.v4.runtime.misc.NotNull;

import grammar_ANTLR.solidity.*;
import grammar_ANTLR.solidity.SolidityParser.*;

@SuppressWarnings("deprecation")
public class McCabeCounterVisitor extends SolidityBaseVisitor<Integer> {

	private int mcc;
	
	public McCabeCounterVisitor() {
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
