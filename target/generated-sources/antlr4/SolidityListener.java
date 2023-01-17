// Generated from Solidity.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityParser}.
 */
public interface SolidityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void enterChiamataFunzione(@NotNull SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#chiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void exitChiamataFunzione(@NotNull SolidityParser.ChiamataFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneVariabileStatement(@NotNull SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneVariabileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneVariabileStatement(@NotNull SolidityParser.DichiarazioneVariabileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(@NotNull SolidityParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(@NotNull SolidityParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 */
	void enterValoreNumerico(@NotNull SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreNumerico}.
	 * @param ctx the parse tree
	 */
	void exitValoreNumerico(@NotNull SolidityParser.ValoreNumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 */
	void enterParametroFunzione(@NotNull SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametroFunzione}.
	 * @param ctx the parse tree
	 */
	void exitParametroFunzione(@NotNull SolidityParser.ParametroFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(@NotNull SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(@NotNull SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 */
	void enterValoreEnum(@NotNull SolidityParser.ValoreEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreEnum}.
	 * @param ctx the parse tree
	 */
	void exitValoreEnum(@NotNull SolidityParser.ValoreEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(@NotNull SolidityParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(@NotNull SolidityParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriAssegnazione(@NotNull SolidityParser.OperatoriAssegnazioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriAssegnazione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriAssegnazione(@NotNull SolidityParser.OperatoriAssegnazioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SolidityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SolidityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void enterAssegnazioneVariabile(@NotNull SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assegnazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void exitAssegnazioneVariabile(@NotNull SolidityParser.AssegnazioneVariabileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 */
	void enterTipoStorage(@NotNull SolidityParser.TipoStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipoStorage}.
	 * @param ctx the parse tree
	 */
	void exitTipoStorage(@NotNull SolidityParser.TipoStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneFunzione(@NotNull SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneFunzione}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneFunzione(@NotNull SolidityParser.DefinizioneFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 */
	void enterListaDichiarazioneVariabili(@NotNull SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaDichiarazioneVariabili}.
	 * @param ctx the parse tree
	 */
	void exitListaDichiarazioneVariabili(@NotNull SolidityParser.ListaDichiarazioneVariabiliContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 */
	void enterTipiDefinitiUtente(@NotNull SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiDefinitiUtente}.
	 * @param ctx the parse tree
	 */
	void exitTipiDefinitiUtente(@NotNull SolidityParser.TipiDefinitiUtenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 */
	void enterNomeTipo(@NotNull SolidityParser.NomeTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nomeTipo}.
	 * @param ctx the parse tree
	 */
	void exitNomeTipo(@NotNull SolidityParser.NomeTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(@NotNull SolidityParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(@NotNull SolidityParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(@NotNull SolidityParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(@NotNull SolidityParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 */
	void enterVersione(@NotNull SolidityParser.VersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#versione}.
	 * @param ctx the parse tree
	 */
	void exitVersione(@NotNull SolidityParser.VersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(@NotNull SolidityParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(@NotNull SolidityParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 */
	void enterListaExpression(@NotNull SolidityParser.ListaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaExpression}.
	 * @param ctx the parse tree
	 */
	void exitListaExpression(@NotNull SolidityParser.ListaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 */
	void enterTipiPrimitivi(@NotNull SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiPrimitivi}.
	 * @param ctx the parse tree
	 */
	void exitTipiPrimitivi(@NotNull SolidityParser.TipiPrimitiviContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneContratto(@NotNull SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneContratto}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneContratto(@NotNull SolidityParser.DefinizioneContrattoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(@NotNull SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(@NotNull SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(@NotNull SolidityParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(@NotNull SolidityParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(@NotNull SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(@NotNull SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 */
	void enterIdentificatore(@NotNull SolidityParser.IdentificatoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identificatore}.
	 * @param ctx the parse tree
	 */
	void exitIdentificatore(@NotNull SolidityParser.IdentificatoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriRelazionali(@NotNull SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriRelazionali}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriRelazionali(@NotNull SolidityParser.OperatoriRelazionaliContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoreVersione(@NotNull SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoreVersione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoreVersione(@NotNull SolidityParser.OperatoreVersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 */
	void enterVincoloVersione(@NotNull SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#vincoloVersione}.
	 * @param ctx the parse tree
	 */
	void exitVincoloVersione(@NotNull SolidityParser.VincoloVersioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneEnum(@NotNull SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneEnum}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneEnum(@NotNull SolidityParser.DefinizioneEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 */
	void enterListaModifier(@NotNull SolidityParser.ListaModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaModifier}.
	 * @param ctx the parse tree
	 */
	void exitListaModifier(@NotNull SolidityParser.ListaModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull SolidityParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull SolidityParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(@NotNull SolidityParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(@NotNull SolidityParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull SolidityParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull SolidityParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(@NotNull SolidityParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(@NotNull SolidityParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 */
	void enterParametriEvent(@NotNull SolidityParser.ParametriEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parametriEvent}.
	 * @param ctx the parse tree
	 */
	void exitParametriEvent(@NotNull SolidityParser.ParametriEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 */
	void enterPotenza(@NotNull SolidityParser.PotenzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#potenza}.
	 * @param ctx the parse tree
	 */
	void exitPotenza(@NotNull SolidityParser.PotenzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 */
	void enterListaParametriFunzione(@NotNull SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametriFunzione}.
	 * @param ctx the parse tree
	 */
	void exitListaParametriFunzione(@NotNull SolidityParser.ListaParametriFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneVariabile(@NotNull SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneVariabile}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneVariabile(@NotNull SolidityParser.DichiarazioneVariabileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SolidityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SolidityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 */
	void enterParteDiContratto(@NotNull SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parteDiContratto}.
	 * @param ctx the parse tree
	 */
	void exitParteDiContratto(@NotNull SolidityParser.ParteDiContrattoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 */
	void enterNomePragma(@NotNull SolidityParser.NomePragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nomePragma}.
	 * @param ctx the parse tree
	 */
	void exitNomePragma(@NotNull SolidityParser.NomePragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneModifier(@NotNull SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneModifier}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneModifier(@NotNull SolidityParser.DefinizioneModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 */
	void enterInvocazioneModifier(@NotNull SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#invocazioneModifier}.
	 * @param ctx the parse tree
	 */
	void exitInvocazioneModifier(@NotNull SolidityParser.InvocazioneModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneStruct(@NotNull SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneStruct}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneStruct(@NotNull SolidityParser.DefinizioneStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SolidityParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SolidityParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 */
	void enterListaNameValue(@NotNull SolidityParser.ListaNameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaNameValue}.
	 * @param ctx the parse tree
	 */
	void exitListaNameValue(@NotNull SolidityParser.ListaNameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull SolidityParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull SolidityParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 */
	void enterDichiarazioneImport(@NotNull SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#dichiarazioneImport}.
	 * @param ctx the parse tree
	 */
	void exitDichiarazioneImport(@NotNull SolidityParser.DichiarazioneImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneCostruttore(@NotNull SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneCostruttore}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneCostruttore(@NotNull SolidityParser.DefinizioneCostruttoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull SolidityParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull SolidityParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull SolidityParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull SolidityParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentifier(@NotNull SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentifier(@NotNull SolidityParser.ListaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull SolidityParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull SolidityParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneEvento(@NotNull SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneEvento}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneEvento(@NotNull SolidityParser.DefinizioneEventoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 */
	void enterDecremento(@NotNull SolidityParser.DecrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#decremento}.
	 * @param ctx the parse tree
	 */
	void exitDecremento(@NotNull SolidityParser.DecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull SolidityParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull SolidityParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 */
	void enterListaParametri(@NotNull SolidityParser.ListaParametriContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametri}.
	 * @param ctx the parse tree
	 */
	void exitListaParametri(@NotNull SolidityParser.ListaParametriContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void enterArgomentiChiamataFunzione(@NotNull SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#argomentiChiamataFunzione}.
	 * @param ctx the parse tree
	 */
	void exitArgomentiChiamataFunzione(@NotNull SolidityParser.ArgomentiChiamataFunzioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriConfrontoDiretto(@NotNull SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriConfrontoDiretto}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriConfrontoDiretto(@NotNull SolidityParser.OperatoriConfrontoDirettoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(@NotNull SolidityParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(@NotNull SolidityParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 */
	void enterTipiExpression(@NotNull SolidityParser.TipiExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tipiExpression}.
	 * @param ctx the parse tree
	 */
	void exitTipiExpression(@NotNull SolidityParser.TipiExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriMoltiplicazione(@NotNull SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriMoltiplicazione}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriMoltiplicazione(@NotNull SolidityParser.OperatoriMoltiplicazioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 */
	void enterListaParametriEvent(@NotNull SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#listaParametriEvent}.
	 * @param ctx the parse tree
	 */
	void exitListaParametriEvent(@NotNull SolidityParser.ListaParametriEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 */
	void enterValorePragma(@NotNull SolidityParser.ValorePragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valorePragma}.
	 * @param ctx the parse tree
	 */
	void exitValorePragma(@NotNull SolidityParser.ValorePragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 */
	void enterValoreRitorno(@NotNull SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#valoreRitorno}.
	 * @param ctx the parse tree
	 */
	void exitValoreRitorno(@NotNull SolidityParser.ValoreRitornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull SolidityParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull SolidityParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#definizioneErrore}.
	 * @param ctx the parse tree
	 */
	void enterDefinizioneErrore(@NotNull SolidityParser.DefinizioneErroreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#definizioneErrore}.
	 * @param ctx the parse tree
	 */
	void exitDefinizioneErrore(@NotNull SolidityParser.DefinizioneErroreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 */
	void enterOperatoriSomma(@NotNull SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#operatoriSomma}.
	 * @param ctx the parse tree
	 */
	void exitOperatoriSomma(@NotNull SolidityParser.OperatoriSommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(@NotNull SolidityParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(@NotNull SolidityParser.SourceUnitContext ctx);
}