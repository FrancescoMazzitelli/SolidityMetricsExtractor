// Generated from Solidity.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityParser}.
 */
public interface SolidityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(SolidityParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(SolidityParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 */
	void enterNomePragma(SolidityParser.NomePragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 */
	void exitNomePragma(SolidityParser.NomePragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 */
	void enterValorePragma(SolidityParser.ValorePragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 */
	void exitValorePragma(SolidityParser.ValorePragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 */
	void enterVersione(SolidityParser.VersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 */
	void exitVersione(SolidityParser.VersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoreVersione(SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoreVersione(SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 */
	void enterVincoloVersione(SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 */
	void exitVincoloVersione(SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneImport(SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneImport(SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(SolidityParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(SolidityParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 */
	void enterParteDiContratto(SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 */
	void exitParteDiContratto(SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void enterAssegnazioneVariabile(SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void exitAssegnazioneVariabile(SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneStruct(SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneStruct(SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneCostruttore(SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneCostruttore(SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneModifier(SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneModifier(SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 */
	void enterInvocazioneModifier(SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 */
	void exitInvocazioneModifier(SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneErrore}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneErrore(SolidityParser.DefinizioneErroreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneErrore}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneErrore(SolidityParser.DefinizioneErroreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 */
	void enterValoreRitorno(SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 */
	void exitValoreRitorno(SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 */
	void enterListaModifier(SolidityParser.ListaModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 */
	void exitListaModifier(SolidityParser.ListaModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneEvento(SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneEvento(SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 */
	void enterValoreEnum(SolidityParser.ValoreEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 */
	void exitValoreEnum(SolidityParser.ValoreEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneEnum(SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneEnum(SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 */
	void enterListaParametri(SolidityParser.ListaParametriContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 */
	void exitListaParametri(SolidityParser.ListaParametriContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(SolidityParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(SolidityParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 */
	void enterListaParametriEvent(SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 */
	void exitListaParametriEvent(SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 */
	void enterParametriEvent(SolidityParser.ParametriEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 */
	void exitParametriEvent(SolidityParser.ParametriEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 */
	void enterListaParametriFunzione(SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 */
	void exitListaParametriFunzione(SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 */
	void enterParametroFunzione(SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 */
	void exitParametroFunzione(SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneVariabile(SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneVariabile(SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 */
	void enterNomeTipo(SolidityParser.NomeTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 */
	void exitNomeTipo(SolidityParser.NomeTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 */
	void enterTipiDefinitiUtente(SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 */
	void exitTipiDefinitiUtente(SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(SolidityParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(SolidityParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 */
	void enterTipoStorage(SolidityParser.TipoStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 */
	void exitTipoStorage(SolidityParser.TipoStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolidityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SolidityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(SolidityParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(SolidityParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(SolidityParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(SolidityParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaCatch}.
	 * @param ctx the parse tree
	 */
	void enterListaCatch(SolidityParser.ListaCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaCatch}.
	 * @param ctx the parse tree
	 */
	void exitListaCatch(SolidityParser.ListaCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneVariabileStatement(SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneVariabileStatement(SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 */
	void enterListaDichiarazioneVariabili(SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 */
	void exitListaDichiarazioneVariabili(SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentifier(SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentifier(SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 */
	void enterListaExpression(SolidityParser.ListaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 */
	void exitListaExpression(SolidityParser.ListaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 */
	void enterListaNameValue(SolidityParser.ListaNameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 */
	void exitListaNameValue(SolidityParser.ListaNameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(SolidityParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(SolidityParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void enterArgomentiChiamataFunzione(SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void exitArgomentiChiamataFunzione(SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void enterChiamataFunzione(SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void exitChiamataFunzione(SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 */
	void enterTipiExpression(SolidityParser.TipiExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 */
	void exitTipiExpression(SolidityParser.TipiExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 */
	void enterValoreNumerico(SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 */
	void exitValoreNumerico(SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 */
	void enterIdentificatore(SolidityParser.IdentificatoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 */
	void exitIdentificatore(SolidityParser.IdentificatoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 */
	void enterTipiPrimitivi(SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 */
	void exitTipiPrimitivi(SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SolidityParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SolidityParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(SolidityParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(SolidityParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 */
	void enterDecremento(SolidityParser.DecrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 */
	void exitDecremento(SolidityParser.DecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriSomma(SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriSomma(SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 */
	void enterPotenza(SolidityParser.PotenzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 */
	void exitPotenza(SolidityParser.PotenzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriMoltiplicazione(SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriMoltiplicazione(SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriRelazionali(SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriRelazionali(SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriConfrontoDiretto(SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriConfrontoDiretto(SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#puntoVirgola}.
	 * @param ctx the parse tree
	 */
	void enterPuntoVirgola(SolidityParser.PuntoVirgolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#puntoVirgola}.
	 * @param ctx the parse tree
	 */
	void exitPuntoVirgola(SolidityParser.PuntoVirgolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriAssegnazione(SolidityParser.OperatoriAssegnazioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriAssegnazione(SolidityParser.OperatoriAssegnazioneContext ctx);
}