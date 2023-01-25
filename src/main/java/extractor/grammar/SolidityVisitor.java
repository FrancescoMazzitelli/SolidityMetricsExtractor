// Generated from Solidity.g4 by ANTLR 4.7.1
package extractor.grammar;

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
	 * Visit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(SolidityParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomePragma(SolidityParser.NomePragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorePragma(SolidityParser.ValorePragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersione(SolidityParser.VersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoreVersione(SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVincoloVersione(SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneImport(SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(SolidityParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParteDiContratto(SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssegnazioneVariabile(SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneStruct(SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneCostruttore(SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneModifier(SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocazioneModifier(SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneErrore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneErrore(SolidityParser.DefinizioneErroreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreRitorno(SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaModifier(SolidityParser.ListaModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneEvento(SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreEnum(SolidityParser.ValoreEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinizioneEnum(SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametri(SolidityParser.ListaParametriContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(SolidityParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametriEvent(SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametriEvent(SolidityParser.ParametriEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametriFunzione(SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroFunzione(SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneVariabile(SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeTipo(SolidityParser.NomeTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiDefinitiUtente(SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(SolidityParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoStorage(SolidityParser.TipoStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(SolidityParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDichiarazioneVariabileStatement(SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDichiarazioneVariabili(SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdentifier(SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpression(SolidityParser.ListaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaNameValue(SolidityParser.ListaNameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(SolidityParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgomentiChiamataFunzione(SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChiamataFunzione(SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiExpression(SolidityParser.TipiExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoreNumerico(SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificatore(SolidityParser.IdentificatoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipiPrimitivi(SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SolidityParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(SolidityParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecremento(SolidityParser.DecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriSomma(SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenza(SolidityParser.PotenzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriMoltiplicazione(SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriRelazionali(SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriConfrontoDiretto(SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#puntoVirgola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuntoVirgola(SolidityParser.PuntoVirgolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatoriAssegnazione(SolidityParser.OperatoriAssegnazioneContext ctx);
}