// Generated from Solidity.g4 by ANTLR 4.4
package grammar_ANTLR.solidity;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolidityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolidityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChiamataFunzione(@NotNull SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneVariabileStatement(@NotNull SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(@NotNull SolidityParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreNumerico(@NotNull SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroFunzione(@NotNull SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(@NotNull SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreEnum(@NotNull SolidityParser.ValoreEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(@NotNull SolidityParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriAssegnazione(@NotNull SolidityParser.OperatoriAssegnazioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SolidityParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(@NotNull SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssegnazioneVariabile(@NotNull SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoStorage(@NotNull SolidityParser.TipoStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneFunzione(@NotNull SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDichiarazioneVariabili(@NotNull SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiDefinitiUtente(@NotNull SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeTipo(@NotNull SolidityParser.NomeTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(@NotNull SolidityParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(@NotNull SolidityParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersione(@NotNull SolidityParser.VersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(@NotNull SolidityParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpression(@NotNull SolidityParser.ListaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiPrimitivi(@NotNull SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneContratto(@NotNull SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(@NotNull SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(@NotNull SolidityParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(@NotNull SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificatore(@NotNull SolidityParser.IdentificatoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriRelazionali(@NotNull SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoreVersione(@NotNull SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVincoloVersione(@NotNull SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneEnum(@NotNull SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaModifier(@NotNull SolidityParser.ListaModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(@NotNull SolidityParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(@NotNull SolidityParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull SolidityParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(@NotNull SolidityParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametriEvent(@NotNull SolidityParser.ParametriEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenza(@NotNull SolidityParser.PotenzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametriFunzione(@NotNull SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneVariabile(@NotNull SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SolidityParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParteDiContratto(@NotNull SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomePragma(@NotNull SolidityParser.NomePragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneModifier(@NotNull SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocazioneModifier(@NotNull SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneStruct(@NotNull SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull SolidityParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaNameValue(@NotNull SolidityParser.ListaNameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull SolidityParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneImport(@NotNull SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneCostruttore(@NotNull SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull SolidityParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull SolidityParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdentifier(@NotNull SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull SolidityParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneEvento(@NotNull SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecremento(@NotNull SolidityParser.DecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull SolidityParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametri(@NotNull SolidityParser.ListaParametriContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgomentiChiamataFunzione(@NotNull SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriConfrontoDiretto(@NotNull SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(@NotNull SolidityParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiExpression(@NotNull SolidityParser.TipiExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriMoltiplicazione(@NotNull SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametriEvent(@NotNull SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorePragma(@NotNull SolidityParser.ValorePragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreRitorno(@NotNull SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull SolidityParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriSomma(@NotNull SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(@NotNull SolidityParser.SourceUnitContext ctx);
}