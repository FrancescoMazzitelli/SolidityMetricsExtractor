// Generated from Solidity.g4 by ANTLR 4.4
package grammar_ANTLR.solidity;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__79=1, T__78=2, T__77=3, T__76=4, T__75=5, T__74=6, T__73=7, T__72=8, 
		T__71=9, T__70=10, T__69=11, T__68=12, T__67=13, T__66=14, T__65=15, T__64=16, 
		T__63=17, T__62=18, T__61=19, T__60=20, T__59=21, T__58=22, T__57=23, 
		T__56=24, T__55=25, T__54=26, T__53=27, T__52=28, T__51=29, T__50=30, 
		T__49=31, T__48=32, T__47=33, T__46=34, T__45=35, T__44=36, T__43=37, 
		T__42=38, T__41=39, T__40=40, T__39=41, T__38=42, T__37=43, T__36=44, 
		T__35=45, T__34=46, T__33=47, T__32=48, T__31=49, T__30=50, T__29=51, 
		T__28=52, T__27=53, T__26=54, T__25=55, T__24=56, T__23=57, T__22=58, 
		T__21=59, T__20=60, T__19=61, T__18=62, T__17=63, T__16=64, T__15=65, 
		T__14=66, T__13=67, T__12=68, T__11=69, T__10=70, T__9=71, T__8=72, T__7=73, 
		T__6=74, T__5=75, T__4=76, T__3=77, T__2=78, T__1=79, T__0=80, VersionLiteral=81, 
		LiteralBooleano=82, NumeroDecimale=83, NumeroEsadecimale=84, UnitaNumero=85, 
		LiteralEsadecimale=86, ReservedKeyword=87, AnonymousKeyword=88, BreakKeyword=89, 
		ConstantKeyword=90, ContinueKeyword=91, ExternalKeyword=92, IndexedKeyword=93, 
		InternalKeyword=94, PayableKeyword=95, PrivateKeyword=96, PublicKeyword=97, 
		PureKeyword=98, TypeKeyword=99, ViewKeyword=100, Int=101, Uint=102, Byte=103, 
		Fixed=104, Ufixed=105, Identifier=106, AND=107, OR=108, LiteralStringa=109, 
		WS=110, COMMENTO=111, COMMENTO_LINEA=112;
	public static final String[] tokenNames = {
		"<INVALID>", "'+='", "'%='", "'library'", "'interface'", "'new'", "'storage'", 
		"'!='", "'while'", "'{'", "'pragma'", "'^='", "'**'", "'byte'", "'>>'", 
		"'='", "'<<='", "'for'", "'^'", "'delete'", "'|='", "'constructor'", "'do'", 
		"'('", "'-='", "','", "'/='", "'after'", "'memory'", "'var'", "'>='", 
		"'++'", "'<'", "']'", "'~'", "'calldata'", "'returns'", "'function'", 
		"'+'", "'mapping'", "'struct'", "'*='", "'/'", "'as'", "'&='", "'return'", 
		"'using'", "'>>='", "';'", "'<<'", "'}'", "'if'", "'?'", "'enum'", "'event'", 
		"'<='", "'from'", "'&'", "'is'", "'*'", "'emit'", "'.'", "'throw'", "':'", 
		"'['", "'contract'", "'=='", "'--'", "'|'", "'address'", "'bool'", "'>'", 
		"'!'", "'=>'", "'string'", "'%'", "'modifier'", "'else'", "')'", "'-'", 
		"'import'", "VersionLiteral", "LiteralBooleano", "NumeroDecimale", "NumeroEsadecimale", 
		"UnitaNumero", "LiteralEsadecimale", "ReservedKeyword", "'anonymous'", 
		"'break'", "'constant'", "'continue'", "'external'", "'indexed'", "'internal'", 
		"'payable'", "'private'", "'public'", "'pure'", "'type'", "'view'", "Int", 
		"Uint", "Byte", "Fixed", "Ufixed", "Identifier", "'&&'", "'||'", "LiteralStringa", 
		"WS", "COMMENTO", "COMMENTO_LINEA"
	};
	public static final int
		RULE_sourceUnit = 0, RULE_pragma = 1, RULE_nomePragma = 2, RULE_valorePragma = 3, 
		RULE_versione = 4, RULE_operatoreVersione = 5, RULE_vincoloVersione = 6, 
		RULE_dichiarazioneImport = 7, RULE_imports = 8, RULE_definizioneContratto = 9, 
		RULE_inheritanceSpecifier = 10, RULE_parteDiContratto = 11, RULE_assegnazioneVariabile = 12, 
		RULE_usingForDeclaration = 13, RULE_definizioneStruct = 14, RULE_definizioneCostruttore = 15, 
		RULE_definizioneModifier = 16, RULE_invocazioneModifier = 17, RULE_definizioneFunzione = 18, 
		RULE_valoreRitorno = 19, RULE_listaModifier = 20, RULE_definizioneEvento = 21, 
		RULE_valoreEnum = 22, RULE_definizioneEnum = 23, RULE_listaParametri = 24, 
		RULE_parametro = 25, RULE_listaParametriEvent = 26, RULE_parametriEvent = 27, 
		RULE_listaParametriFunzione = 28, RULE_parametroFunzione = 29, RULE_dichiarazioneVariabile = 30, 
		RULE_nomeTipo = 31, RULE_tipiDefinitiUtente = 32, RULE_mapping = 33, RULE_functionTypeName = 34, 
		RULE_tipoStorage = 35, RULE_stateMutability = 36, RULE_block = 37, RULE_statement = 38, 
		RULE_expressionStatement = 39, RULE_ifStatement = 40, RULE_whileStatement = 41, 
		RULE_simpleStatement = 42, RULE_forStatement = 43, RULE_doWhileStatement = 44, 
		RULE_continueStatement = 45, RULE_breakStatement = 46, RULE_returnStatement = 47, 
		RULE_throwStatement = 48, RULE_emitStatement = 49, RULE_dichiarazioneVariabileStatement = 50, 
		RULE_listaDichiarazioneVariabili = 51, RULE_listaIdentifier = 52, RULE_expression = 53, 
		RULE_primaryExpression = 54, RULE_listaExpression = 55, RULE_listaNameValue = 56, 
		RULE_nameValue = 57, RULE_argomentiChiamataFunzione = 58, RULE_chiamataFunzione = 59, 
		RULE_tupleExpression = 60, RULE_tipiExpression = 61, RULE_valoreNumerico = 62, 
		RULE_identificatore = 63, RULE_tipiPrimitivi = 64, RULE_incremento = 65, 
		RULE_decremento = 66, RULE_operatoriSomma = 67, RULE_potenza = 68, RULE_operatoriMoltiplicazione = 69, 
		RULE_operatoriRelazionali = 70, RULE_operatoriConfrontoDiretto = 71, RULE_operatoriAssegnazione = 72;
	public static final String[] ruleNames = {
		"sourceUnit", "pragma", "nomePragma", "valorePragma", "versione", "operatoreVersione", 
		"vincoloVersione", "dichiarazioneImport", "imports", "definizioneContratto", 
		"inheritanceSpecifier", "parteDiContratto", "assegnazioneVariabile", "usingForDeclaration", 
		"definizioneStruct", "definizioneCostruttore", "definizioneModifier", 
		"invocazioneModifier", "definizioneFunzione", "valoreRitorno", "listaModifier", 
		"definizioneEvento", "valoreEnum", "definizioneEnum", "listaParametri", 
		"parametro", "listaParametriEvent", "parametriEvent", "listaParametriFunzione", 
		"parametroFunzione", "dichiarazioneVariabile", "nomeTipo", "tipiDefinitiUtente", 
		"mapping", "functionTypeName", "tipoStorage", "stateMutability", "block", 
		"statement", "expressionStatement", "ifStatement", "whileStatement", "simpleStatement", 
		"forStatement", "doWhileStatement", "continueStatement", "breakStatement", 
		"returnStatement", "throwStatement", "emitStatement", "dichiarazioneVariabileStatement", 
		"listaDichiarazioneVariabili", "listaIdentifier", "expression", "primaryExpression", 
		"listaExpression", "listaNameValue", "nameValue", "argomentiChiamataFunzione", 
		"chiamataFunzione", "tupleExpression", "tipiExpression", "valoreNumerico", 
		"identificatore", "tipiPrimitivi", "incremento", "decremento", "operatoriSomma", 
		"potenza", "operatoriMoltiplicazione", "operatoriRelazionali", "operatoriConfrontoDiretto", 
		"operatoriAssegnazione"
	};

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceUnitContext extends ParserRuleContext {
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public List<DefinizioneContrattoContext> definizioneContratto() {
			return getRuleContexts(DefinizioneContrattoContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public DefinizioneContrattoContext definizioneContratto(int i) {
			return getRuleContext(DefinizioneContrattoContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__77) | (1L << T__76) | (1L << T__70))) != 0) || _la==T__15 || _la==T__0) {
				{
				setState(149);
				switch (_input.LA(1)) {
				case T__70:
					{
					setState(146); pragma();
					}
					break;
				case T__0:
					{
					setState(147); imports();
					}
					break;
				case T__77:
				case T__76:
				case T__15:
					{
					setState(148); definizioneContratto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaContext extends ParserRuleContext {
		public ValorePragmaContext valorePragma() {
			return getRuleContext(ValorePragmaContext.class,0);
		}
		public NomePragmaContext nomePragma() {
			return getRuleContext(NomePragmaContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__70);
			setState(157); nomePragma();
			setState(158); valorePragma();
			setState(159); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomePragmaContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public NomePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomePragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNomePragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNomePragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNomePragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomePragmaContext nomePragma() throws RecognitionException {
		NomePragmaContext _localctx = new NomePragmaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nomePragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); identificatore();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorePragmaContext extends ParserRuleContext {
		public VersioneContext versione() {
			return getRuleContext(VersioneContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValorePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorePragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValorePragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValorePragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitValorePragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorePragmaContext valorePragma() throws RecognitionException {
		ValorePragmaContext _localctx = new ValorePragmaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valorePragma);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); versione();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersioneContext extends ParserRuleContext {
		public List<VincoloVersioneContext> vincoloVersione() {
			return getRuleContexts(VincoloVersioneContext.class);
		}
		public VincoloVersioneContext vincoloVersione(int i) {
			return getRuleContext(VincoloVersioneContext.class,i);
		}
		public VersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersioneContext versione() throws RecognitionException {
		VersioneContext _localctx = new VersioneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_versione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); vincoloVersione();
			setState(169);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__65) | (1L << T__62) | (1L << T__50) | (1L << T__48) | (1L << T__46) | (1L << T__25))) != 0) || _la==T__9 || _la==VersionLiteral) {
				{
				setState(168); vincoloVersione();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoreVersioneContext extends ParserRuleContext {
		public OperatoreVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoreVersione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoreVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoreVersione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoreVersione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoreVersioneContext operatoreVersione() throws RecognitionException {
		OperatoreVersioneContext _localctx = new OperatoreVersioneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operatoreVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__65 - 15)) | (1L << (T__62 - 15)) | (1L << (T__50 - 15)) | (1L << (T__48 - 15)) | (1L << (T__46 - 15)) | (1L << (T__25 - 15)) | (1L << (T__9 - 15)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VincoloVersioneContext extends ParserRuleContext {
		public OperatoreVersioneContext operatoreVersione() {
			return getRuleContext(OperatoreVersioneContext.class,0);
		}
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VincoloVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vincoloVersione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVincoloVersione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVincoloVersione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVincoloVersione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VincoloVersioneContext vincoloVersione() throws RecognitionException {
		VincoloVersioneContext _localctx = new VincoloVersioneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vincoloVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__65 - 15)) | (1L << (T__62 - 15)) | (1L << (T__50 - 15)) | (1L << (T__48 - 15)) | (1L << (T__46 - 15)) | (1L << (T__25 - 15)) | (1L << (T__9 - 15)))) != 0)) {
				{
				setState(173); operatoreVersione();
				}
			}

			setState(176); match(VersionLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DichiarazioneImportContext extends ParserRuleContext {
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public DichiarazioneImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDichiarazioneImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DichiarazioneImportContext dichiarazioneImport() throws RecognitionException {
		DichiarazioneImportContext _localctx = new DichiarazioneImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dichiarazioneImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); identificatore();
			setState(181);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(179); match(T__37);
				setState(180); identificatore();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<DichiarazioneImportContext> dichiarazioneImport() {
			return getRuleContexts(DichiarazioneImportContext.class);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public DichiarazioneImportContext dichiarazioneImport(int i) {
			return getRuleContext(DichiarazioneImportContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imports);
		int _la;
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); match(T__0);
				setState(184); match(LiteralStringa);
				setState(187);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(185); match(T__37);
					setState(186); identificatore();
					}
				}

				setState(189); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(T__0);
				setState(193);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(191); match(T__21);
					}
					break;
				case T__45:
				case T__24:
				case Identifier:
					{
					setState(192); identificatore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(195); match(T__37);
					setState(196); identificatore();
					}
				}

				setState(199); match(T__24);
				setState(200); match(LiteralStringa);
				setState(201); match(T__32);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); match(T__0);
				setState(203); match(T__71);
				setState(204); dichiarazioneImport();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(205); match(T__55);
					setState(206); dichiarazioneImport();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212); match(T__30);
				setState(213); match(T__24);
				setState(214); match(LiteralStringa);
				setState(215); match(T__32);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneContrattoContext extends ParserRuleContext {
		public List<ParteDiContrattoContext> parteDiContratto() {
			return getRuleContexts(ParteDiContrattoContext.class);
		}
		public ParteDiContrattoContext parteDiContratto(int i) {
			return getRuleContext(ParteDiContrattoContext.class,i);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public DefinizioneContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneContratto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneContratto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneContratto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneContratto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneContrattoContext definizioneContratto() throws RecognitionException {
		DefinizioneContrattoContext _localctx = new DefinizioneContrattoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definizioneContratto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__77 - 3)) | (1L << (T__76 - 3)) | (1L << (T__15 - 3)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(220); identificatore();
			setState(230);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(221); match(T__22);
				setState(222); inheritanceSpecifier();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(223); match(T__55);
					setState(224); inheritanceSpecifier();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232); match(T__71);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__59) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__40) | (1L << T__34) | (1L << T__27) | (1L << T__26) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (T__4 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(233); parteDiContratto();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); tipiDefinitiUtente();
			setState(247);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(242); match(T__57);
				setState(244);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(243); listaExpression();
					}
				}

				setState(246); match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParteDiContrattoContext extends ParserRuleContext {
		public AssegnazioneVariabileContext assegnazioneVariabile() {
			return getRuleContext(AssegnazioneVariabileContext.class,0);
		}
		public DefinizioneEventoContext definizioneEvento() {
			return getRuleContext(DefinizioneEventoContext.class,0);
		}
		public DefinizioneEnumContext definizioneEnum() {
			return getRuleContext(DefinizioneEnumContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public DefinizioneModifierContext definizioneModifier() {
			return getRuleContext(DefinizioneModifierContext.class,0);
		}
		public DefinizioneStructContext definizioneStruct() {
			return getRuleContext(DefinizioneStructContext.class,0);
		}
		public DefinizioneFunzioneContext definizioneFunzione() {
			return getRuleContext(DefinizioneFunzioneContext.class,0);
		}
		public DefinizioneCostruttoreContext definizioneCostruttore() {
			return getRuleContext(DefinizioneCostruttoreContext.class,0);
		}
		public ParteDiContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parteDiContratto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParteDiContratto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParteDiContratto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParteDiContratto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParteDiContrattoContext parteDiContratto() throws RecognitionException {
		ParteDiContrattoContext _localctx = new ParteDiContrattoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parteDiContratto);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); assegnazioneVariabile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251); definizioneStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252); definizioneCostruttore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253); definizioneModifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254); definizioneFunzione();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255); definizioneEvento();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256); definizioneEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssegnazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public AssegnazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assegnazioneVariabile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssegnazioneVariabile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssegnazioneVariabile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssegnazioneVariabile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssegnazioneVariabileContext assegnazioneVariabile() throws RecognitionException {
		AssegnazioneVariabileContext _localctx = new AssegnazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assegnazioneVariabile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); nomeTipo(0);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)))) != 0)) {
				{
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266); identificatore();
			setState(269);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(267); match(T__65);
				setState(268); expression(0);
				}
			}

			setState(271); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(T__34);
			setState(274); identificatore();
			setState(275); match(T__63);
			setState(278);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(276); match(T__21);
				}
				break;
			case T__67:
			case T__51:
			case T__45:
			case T__43:
			case T__41:
			case T__24:
			case T__11:
			case T__10:
			case T__6:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(277); nomeTipo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneStructContext extends ParserRuleContext {
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DefinizioneStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneStructContext definizioneStruct() throws RecognitionException {
		DefinizioneStructContext _localctx = new DefinizioneStructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definizioneStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(T__40);
			setState(283); identificatore();
			setState(284); match(T__71);
			setState(295);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(285); dichiarazioneVariabile();
				setState(286); match(T__32);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					{
					setState(287); dichiarazioneVariabile();
					setState(288); match(T__32);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(297); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneCostruttoreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefinizioneCostruttoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneCostruttore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneCostruttore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneCostruttore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneCostruttore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneCostruttoreContext definizioneCostruttore() throws RecognitionException {
		DefinizioneCostruttoreContext _localctx = new DefinizioneCostruttoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definizioneCostruttore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(T__59);
			setState(300); listaParametri();
			setState(301); listaModifier();
			setState(302); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneModifierContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefinizioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneModifierContext definizioneModifier() throws RecognitionException {
		DefinizioneModifierContext _localctx = new DefinizioneModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definizioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(T__4);
			setState(305); identificatore();
			setState(307);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(306); listaParametri();
				}
			}

			setState(309); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocazioneModifierContext extends ParserRuleContext {
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public InvocazioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocazioneModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInvocazioneModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInvocazioneModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInvocazioneModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocazioneModifierContext invocazioneModifier() throws RecognitionException {
		InvocazioneModifierContext _localctx = new InvocazioneModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invocazioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); identificatore();
			setState(317);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(312); match(T__57);
				setState(314);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(313); listaExpression();
					}
				}

				setState(316); match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneFunzioneContext extends ParserRuleContext {
		public ValoreRitornoContext valoreRitorno() {
			return getRuleContext(ValoreRitornoContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DefinizioneFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneFunzione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneFunzione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneFunzioneContext definizioneFunzione() throws RecognitionException {
		DefinizioneFunzioneContext _localctx = new DefinizioneFunzioneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definizioneFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(T__43);
			setState(321);
			_la = _input.LA(1);
			if (_la==T__45 || _la==T__24 || _la==Identifier) {
				{
				setState(320); identificatore();
				}
			}

			setState(323); listaParametri();
			setState(324); listaModifier();
			setState(326);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(325); valoreRitorno();
				}
			}

			setState(330);
			switch (_input.LA(1)) {
			case T__32:
				{
				setState(328); match(T__32);
				}
				break;
			case T__71:
				{
				setState(329); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValoreRitornoContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ValoreRitornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreRitorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreRitorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreRitorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitValoreRitorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoreRitornoContext valoreRitorno() throws RecognitionException {
		ValoreRitornoContext _localctx = new ValoreRitornoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valoreRitorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(T__44);
			setState(333); listaParametri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaModifierContext extends ParserRuleContext {
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public InvocazioneModifierContext invocazioneModifier(int i) {
			return getRuleContext(InvocazioneModifierContext.class,i);
		}
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<InvocazioneModifierContext> invocazioneModifier() {
			return getRuleContexts(InvocazioneModifierContext.class);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public ListaModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaModifierContext listaModifier() throws RecognitionException {
		ListaModifierContext _localctx = new ListaModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45 || _la==T__24 || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (ExternalKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PayableKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)) | (1L << (PureKeyword - 90)) | (1L << (ViewKeyword - 90)) | (1L << (Identifier - 90)))) != 0)) {
				{
				setState(341);
				switch (_input.LA(1)) {
				case T__45:
				case T__24:
				case Identifier:
					{
					setState(335); invocazioneModifier();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(336); stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(337); match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(338); match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(339); match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(340); match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneEventoContext extends ParserRuleContext {
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaParametriEventContext listaParametriEvent() {
			return getRuleContext(ListaParametriEventContext.class,0);
		}
		public DefinizioneEventoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEvento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneEvento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneEvento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneEvento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneEventoContext definizioneEvento() throws RecognitionException {
		DefinizioneEventoContext _localctx = new DefinizioneEventoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_definizioneEvento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(T__26);
			setState(347); identificatore();
			setState(348); listaParametriEvent();
			setState(350);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(349); match(AnonymousKeyword);
				}
			}

			setState(352); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValoreEnumContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitValoreEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoreEnumContext valoreEnum() throws RecognitionException {
		ValoreEnumContext _localctx = new ValoreEnumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valoreEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); identificatore();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinizioneEnumContext extends ParserRuleContext {
		public ValoreEnumContext valoreEnum(int i) {
			return getRuleContext(ValoreEnumContext.class,i);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<ValoreEnumContext> valoreEnum() {
			return getRuleContexts(ValoreEnumContext.class);
		}
		public DefinizioneEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneEnumContext definizioneEnum() throws RecognitionException {
		DefinizioneEnumContext _localctx = new DefinizioneEnumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_definizioneEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(T__27);
			setState(357); identificatore();
			setState(358); match(T__71);
			setState(360);
			_la = _input.LA(1);
			if (_la==T__45 || _la==T__24 || _la==Identifier) {
				{
				setState(359); valoreEnum();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__55) {
				{
				{
				setState(362); match(T__55);
				setState(363); valoreEnum();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametriContext extends ParserRuleContext {
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ListaParametriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaParametri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametriContext listaParametri() throws RecognitionException {
		ListaParametriContext _localctx = new ListaParametriContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listaParametri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(T__57);
			setState(380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(372); parametro();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(373); match(T__55);
					setState(374); parametro();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(382); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); nomeTipo(0);
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(385); tipoStorage();
				}
				break;
			}
			setState(389);
			_la = _input.LA(1);
			if (_la==T__45 || _la==T__24 || _la==Identifier) {
				{
				setState(388); identificatore();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametriEventContext extends ParserRuleContext {
		public List<ParametriEventContext> parametriEvent() {
			return getRuleContexts(ParametriEventContext.class);
		}
		public ParametriEventContext parametriEvent(int i) {
			return getRuleContext(ParametriEventContext.class,i);
		}
		public ListaParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametriEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametriEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaParametriEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametriEventContext listaParametriEvent() throws RecognitionException {
		ListaParametriEventContext _localctx = new ListaParametriEventContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listaParametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(T__57);
			setState(400);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(392); parametriEvent();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(393); match(T__55);
					setState(394); parametriEvent();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(402); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametriEventContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametriEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametriEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametriEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParametriEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametriEventContext parametriEvent() throws RecognitionException {
		ParametriEventContext _localctx = new ParametriEventContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); nomeTipo(0);
			setState(406);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(405); match(IndexedKeyword);
				}
			}

			setState(409);
			_la = _input.LA(1);
			if (_la==T__45 || _la==T__24 || _la==Identifier) {
				{
				setState(408); identificatore();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametriFunzioneContext extends ParserRuleContext {
		public List<ParametroFunzioneContext> parametroFunzione() {
			return getRuleContexts(ParametroFunzioneContext.class);
		}
		public ParametroFunzioneContext parametroFunzione(int i) {
			return getRuleContext(ParametroFunzioneContext.class,i);
		}
		public ListaParametriFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaParametriFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaParametriFunzione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaParametriFunzione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametriFunzioneContext listaParametriFunzione() throws RecognitionException {
		ListaParametriFunzioneContext _localctx = new ListaParametriFunzioneContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listaParametriFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(T__57);
			setState(420);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(412); parametroFunzione();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(413); match(T__55);
					setState(414); parametroFunzione();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroFunzioneContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public ParametroFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParametroFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParametroFunzione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParametroFunzione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroFunzioneContext parametroFunzione() throws RecognitionException {
		ParametroFunzioneContext _localctx = new ParametroFunzioneContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametroFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); nomeTipo(0);
			setState(426);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__52) | (1L << T__45))) != 0)) {
				{
				setState(425); tipoStorage();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DichiarazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DichiarazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneVariabile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneVariabile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDichiarazioneVariabile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DichiarazioneVariabileContext dichiarazioneVariabile() throws RecognitionException {
		DichiarazioneVariabileContext _localctx = new DichiarazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dichiarazioneVariabile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); nomeTipo(0);
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(429); tipoStorage();
				}
				break;
			}
			setState(432); identificatore();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeTipoContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NomeTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNomeTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNomeTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNomeTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeTipoContext nomeTipo() throws RecognitionException {
		return nomeTipo(0);
	}

	private NomeTipoContext nomeTipo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NomeTipoContext _localctx = new NomeTipoContext(_ctx, _parentState);
		NomeTipoContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_nomeTipo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(435); tipiPrimitivi();
				}
				break;
			case 2:
				{
				setState(436); tipiDefinitiUtente();
				}
				break;
			case 3:
				{
				setState(437); mapping();
				}
				break;
			case 4:
				{
				setState(438); functionTypeName();
				}
				break;
			case 5:
				{
				setState(439); match(T__11);
				setState(440); match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NomeTipoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nomeTipo);
					setState(443);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(444); match(T__16);
					setState(446);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(445); expression(0);
						}
					}

					setState(448); match(T__47);
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TipiDefinitiUtenteContext extends ParserRuleContext {
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public TipiDefinitiUtenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiDefinitiUtente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiDefinitiUtente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiDefinitiUtente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTipiDefinitiUtente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipiDefinitiUtenteContext tipiDefinitiUtente() throws RecognitionException {
		TipiDefinitiUtenteContext _localctx = new TipiDefinitiUtenteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tipiDefinitiUtente);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454); identificatore();
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455); match(T__19);
					setState(456); identificatore();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(T__41);
			setState(463); match(T__57);
			setState(464); tipiPrimitivi();
			setState(465); match(T__7);
			setState(466); nomeTipo(0);
			setState(467); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public List<ListaParametriFunzioneContext> listaParametriFunzione() {
			return getRuleContexts(ListaParametriFunzioneContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public ListaParametriFunzioneContext listaParametriFunzione(int i) {
			return getRuleContext(ListaParametriFunzioneContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(T__43);
			setState(470); listaParametriFunzione();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(474);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(471); match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(472); match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(473); stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(479); match(T__44);
				setState(480); listaParametriFunzione();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoStorageContext extends ParserRuleContext {
		public TipoStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoStorage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipoStorage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipoStorage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTipoStorage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoStorageContext tipoStorage() throws RecognitionException {
		TipoStorageContext _localctx = new TipoStorageContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tipoStorage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__52) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (PayableKeyword - 90)) | (1L << (PureKeyword - 90)) | (1L << (ViewKeyword - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); match(T__71);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__72) | (1L << T__71) | (1L << T__67) | (1L << T__63) | (1L << T__61) | (1L << T__58) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__35) | (1L << T__29) | (1L << T__24) | (1L << T__20) | (1L << T__18))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				{
				setState(488); statement();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(507);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); ifStatement();
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); whileStatement();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(498); forStatement();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 4);
				{
				setState(499); block();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(500); doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 6);
				{
				setState(501); continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(502); breakStatement();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(503); returnStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(504); throwStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 10);
				{
				setState(505); emitStatement();
				}
				break;
			case T__75:
			case T__67:
			case T__61:
			case T__57:
			case T__53:
			case T__51:
			case T__49:
			case T__46:
			case T__45:
			case T__43:
			case T__42:
			case T__41:
			case T__24:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__6:
			case T__1:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case LiteralStringa:
				enterOuterAlt(_localctx, 11);
				{
				setState(506); simpleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); expression(0);
			setState(510); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); match(T__29);
			setState(513); match(T__57);
			setState(514); expression(0);
			setState(515); match(T__2);
			setState(516); statement();
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(517); match(T__3);
				setState(518); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(T__72);
			setState(522); match(T__57);
			setState(523); expression(0);
			setState(524); match(T__2);
			setState(525); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() {
			return getRuleContext(DichiarazioneVariabileStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(527); dichiarazioneVariabileStatement();
				}
				break;
			case 2:
				{
				setState(528); expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(T__63);
			setState(532); match(T__57);
			setState(535);
			switch (_input.LA(1)) {
			case T__75:
			case T__67:
			case T__61:
			case T__57:
			case T__53:
			case T__51:
			case T__49:
			case T__46:
			case T__45:
			case T__43:
			case T__42:
			case T__41:
			case T__24:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__6:
			case T__1:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case LiteralStringa:
				{
				setState(533); simpleStatement();
				}
				break;
			case T__32:
				{
				setState(534); match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(539);
			switch (_input.LA(1)) {
			case T__75:
			case T__67:
			case T__61:
			case T__57:
			case T__53:
			case T__51:
			case T__49:
			case T__46:
			case T__45:
			case T__42:
			case T__24:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__6:
			case T__1:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case LiteralStringa:
				{
				setState(537); expressionStatement();
				}
				break;
			case T__32:
				{
				setState(538); match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(541); expression(0);
				}
			}

			setState(544); match(T__2);
			setState(545); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(T__58);
			setState(548); statement();
			setState(549); match(T__72);
			setState(550); match(T__57);
			setState(551); expression(0);
			setState(552); match(T__2);
			setState(553); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(ContinueKeyword);
			setState(556); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); match(BreakKeyword);
			setState(559); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(T__35);
			setState(563);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(562); expression(0);
				}
			}

			setState(565); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(T__18);
			setState(568); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public ChiamataFunzioneContext chiamataFunzione() {
			return getRuleContext(ChiamataFunzioneContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); match(T__20);
			setState(571); chiamataFunzione();
			setState(572); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DichiarazioneVariabileStatementContext extends ParserRuleContext {
		public DichiarazioneVariabileContext dichiarazioneVariabile() {
			return getRuleContext(DichiarazioneVariabileContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListaIdentifierContext listaIdentifier() {
			return getRuleContext(ListaIdentifierContext.class,0);
		}
		public ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() {
			return getRuleContext(ListaDichiarazioneVariabiliContext.class,0);
		}
		public DichiarazioneVariabileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDichiarazioneVariabileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDichiarazioneVariabileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDichiarazioneVariabileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() throws RecognitionException {
		DichiarazioneVariabileStatementContext _localctx = new DichiarazioneVariabileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dichiarazioneVariabileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(574); match(T__51);
				setState(575); listaIdentifier();
				}
				break;
			case 2:
				{
				setState(576); dichiarazioneVariabile();
				}
				break;
			case 3:
				{
				setState(577); match(T__57);
				setState(578); listaDichiarazioneVariabili();
				setState(579); match(T__2);
				}
				break;
			}
			setState(585);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(583); match(T__65);
				setState(584); expression(0);
				}
			}

			setState(587); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaDichiarazioneVariabiliContext extends ParserRuleContext {
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public ListaDichiarazioneVariabiliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDichiarazioneVariabili; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaDichiarazioneVariabili(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaDichiarazioneVariabili(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaDichiarazioneVariabili(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() throws RecognitionException {
		ListaDichiarazioneVariabiliContext _localctx = new ListaDichiarazioneVariabiliContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_listaDichiarazioneVariabili);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(589); dichiarazioneVariabile();
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__55) {
				{
				{
				setState(592); match(T__55);
				setState(594);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__51) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__24))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(593); dichiarazioneVariabile();
					}
				}

				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaIdentifierContext extends ParserRuleContext {
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public ListaIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdentifierContext listaIdentifier() throws RecognitionException {
		ListaIdentifierContext _localctx = new ListaIdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listaIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(T__57);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					_la = _input.LA(1);
					if (_la==T__45 || _la==T__24 || _la==Identifier) {
						{
						setState(602); identificatore();
						}
					}

					setState(605); match(T__55);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(612);
			_la = _input.LA(1);
			if (_la==T__45 || _la==T__24 || _la==Identifier) {
				{
				setState(611); identificatore();
				}
			}

			setState(614); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public TerminalNode OR() { return getToken(SolidityParser.OR, 0); }
		public OperatoriRelazionaliContext operatoriRelazionali() {
			return getRuleContext(OperatoriRelazionaliContext.class,0);
		}
		public OperatoriAssegnazioneContext operatoriAssegnazione() {
			return getRuleContext(OperatoriAssegnazioneContext.class,0);
		}
		public OperatoriSommaContext operatoriSomma() {
			return getRuleContext(OperatoriSommaContext.class,0);
		}
		public TerminalNode AND() { return getToken(SolidityParser.AND, 0); }
		public OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() {
			return getRuleContext(OperatoriConfrontoDirettoContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PotenzaContext potenza() {
			return getRuleContext(PotenzaContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public OperatoriMoltiplicazioneContext operatoriMoltiplicazione() {
			return getRuleContext(OperatoriMoltiplicazioneContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(619);
				switch (_input.LA(1)) {
				case T__49:
					{
					setState(617); incremento();
					}
					break;
				case T__13:
					{
					setState(618); decremento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(621); expression(19);
				}
				break;
			case 2:
				{
				{
				setState(623); operatoriSomma();
				}
				setState(624); expression(18);
				}
				break;
			case 3:
				{
				setState(626);
				_la = _input.LA(1);
				if ( !(_la==T__61 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(627); expression(17);
				}
				break;
			case 4:
				{
				setState(628); match(T__8);
				setState(629); expression(16);
				}
				break;
			case 5:
				{
				setState(630); match(T__46);
				setState(631); expression(15);
				}
				break;
			case 6:
				{
				setState(632); match(T__75);
				setState(633); nomeTipo(0);
				}
				break;
			case 7:
				{
				setState(634); match(T__57);
				setState(635); expression(0);
				setState(636); match(T__2);
				}
				break;
			case 8:
				{
				setState(638); primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(707);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(641);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(642); potenza();
						setState(643); expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(645);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(646); operatoriMoltiplicazione();
						}
						setState(647); expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(650); operatoriSomma();
						}
						setState(651); expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(654);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__31) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(655); expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(656);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(657); match(T__23);
						setState(658); expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(660); match(T__62);
						setState(661); expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(662);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(663); match(T__12);
						setState(664); expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(665);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(666); operatoriRelazionali();
						}
						setState(667); expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(669);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(670); operatoriConfrontoDiretto();
						}
						setState(671); expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(673);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(674); match(AND);
						setState(675); expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(676);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(677); match(OR);
						setState(678); expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(679);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(680); match(T__28);
						setState(681); expression(0);
						setState(682); match(T__17);
						setState(683); expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(685);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(686); operatoriAssegnazione();
						}
						setState(687); expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(689);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(692);
						switch (_input.LA(1)) {
						case T__49:
							{
							setState(690); incremento();
							}
							break;
						case T__13:
							{
							setState(691); decremento();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(694);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(695); match(T__16);
						setState(696); expression(0);
						setState(697); match(T__47);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(700); match(T__57);
						setState(701); argomentiChiamataFunzione();
						setState(702); match(T__2);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(705); match(T__19);
						setState(706); identificatore();
						}
						break;
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TipiExpressionContext tipiExpression() {
			return getRuleContext(TipiExpressionContext.class,0);
		}
		public ValoreNumericoContext valoreNumerico() {
			return getRuleContext(ValoreNumericoContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TerminalNode LiteralEsadecimale() { return getToken(SolidityParser.LiteralEsadecimale, 0); }
		public TerminalNode LiteralBooleano() { return getToken(SolidityParser.LiteralBooleano, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primaryExpression);
		try {
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); match(LiteralBooleano);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713); valoreNumerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714); match(LiteralEsadecimale);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715); match(LiteralStringa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(716); identificatore();
				setState(719);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(717); match(T__16);
					setState(718); match(T__47);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(721); match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(722); tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(723); tipiExpression();
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(724); match(T__16);
					setState(725); match(T__47);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressionContext listaExpression() throws RecognitionException {
		ListaExpressionContext _localctx = new ListaExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_listaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); expression(0);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__55) {
				{
				{
				setState(731); match(T__55);
				setState(732); expression(0);
				}
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaNameValueContext extends ParserRuleContext {
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public ListaNameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaNameValueContext listaNameValue() throws RecognitionException {
		ListaNameValueContext _localctx = new ListaNameValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_listaNameValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738); nameValue();
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739); match(T__55);
					setState(740); nameValue();
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(747);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(746); match(T__55);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749); identificatore();
			setState(750); match(T__17);
			setState(751); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgomentiChiamataFunzioneContext extends ParserRuleContext {
		public ListaNameValueContext listaNameValue() {
			return getRuleContext(ListaNameValueContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argomentiChiamataFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgomentiChiamataFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgomentiChiamataFunzione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArgomentiChiamataFunzione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() throws RecognitionException {
		ArgomentiChiamataFunzioneContext _localctx = new ArgomentiChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argomentiChiamataFunzione);
		int _la;
		try {
			setState(761);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); match(T__71);
				setState(755);
				_la = _input.LA(1);
				if (_la==T__45 || _la==T__24 || _la==Identifier) {
					{
					setState(754); listaNameValue();
					}
				}

				setState(757); match(T__30);
				}
				break;
			case T__75:
			case T__67:
			case T__61:
			case T__57:
			case T__53:
			case T__51:
			case T__49:
			case T__46:
			case T__45:
			case T__42:
			case T__24:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__6:
			case T__2:
			case T__1:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case LiteralStringa:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(758); listaExpression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChiamataFunzioneContext extends ParserRuleContext {
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chiamataFunzione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterChiamataFunzione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitChiamataFunzione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitChiamataFunzione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChiamataFunzioneContext chiamataFunzione() throws RecognitionException {
		ChiamataFunzioneContext _localctx = new ChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_chiamataFunzione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); expression(0);
			setState(764); match(T__57);
			setState(765); argomentiChiamataFunzione();
			setState(766); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tupleExpression);
		int _la;
		try {
			setState(794);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); match(T__57);
				{
				setState(770);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(769); expression(0);
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__55) {
					{
					{
					setState(772); match(T__55);
					setState(774);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(773); expression(0);
						}
					}

					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(781); match(T__2);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(782); match(T__16);
				setState(791);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__67) | (1L << T__61) | (1L << T__57) | (1L << T__53) | (1L << T__51) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__42) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__16 - 64)) | (1L << (T__13 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__1 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(783); expression(0);
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__55) {
						{
						{
						setState(784); match(T__55);
						setState(785); expression(0);
						}
						}
						setState(790);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(793); match(T__47);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipiExpressionContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public TipiExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTipiExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipiExpressionContext tipiExpression() throws RecognitionException {
		TipiExpressionContext _localctx = new TipiExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tipiExpression);
		try {
			setState(798);
			switch (_input.LA(1)) {
			case T__67:
			case T__51:
			case T__11:
			case T__10:
			case T__6:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(796); tipiPrimitivi();
				}
				break;
			case T__45:
			case T__24:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(797); tipiDefinitiUtente();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValoreNumericoContext extends ParserRuleContext {
		public TerminalNode UnitaNumero() { return getToken(SolidityParser.UnitaNumero, 0); }
		public TerminalNode NumeroDecimale() { return getToken(SolidityParser.NumeroDecimale, 0); }
		public TerminalNode NumeroEsadecimale() { return getToken(SolidityParser.NumeroEsadecimale, 0); }
		public ValoreNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreNumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterValoreNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitValoreNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitValoreNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoreNumericoContext valoreNumerico() throws RecognitionException {
		ValoreNumericoContext _localctx = new ValoreNumericoContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_valoreNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_la = _input.LA(1);
			if ( !(_la==NumeroDecimale || _la==NumeroEsadecimale) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(801); match(UnitaNumero);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificatoreContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentificatoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificatore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentificatore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentificatore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentificatore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificatoreContext identificatore() throws RecognitionException {
		IdentificatoreContext _localctx = new IdentificatoreContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identificatore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__24 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipiPrimitiviContext extends ParserRuleContext {
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TipiPrimitiviContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiPrimitivi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTipiPrimitivi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTipiPrimitivi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTipiPrimitivi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipiPrimitiviContext tipiPrimitivi() throws RecognitionException {
		TipiPrimitiviContext _localctx = new TipiPrimitiviContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tipiPrimitivi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__51 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__11 - 69)) | (1L << (T__10 - 69)) | (1L << (T__6 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementoContext extends ParserRuleContext {
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); match(T__49);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementoContext extends ParserRuleContext {
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDecremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDecremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoriSommaContext extends ParserRuleContext {
		public OperatoriSommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriSomma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriSomma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriSomma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoriSomma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoriSommaContext operatoriSomma() throws RecognitionException {
		OperatoriSommaContext _localctx = new OperatoriSommaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_operatoriSomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotenzaContext extends ParserRuleContext {
		public PotenzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPotenza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPotenza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPotenza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenzaContext potenza() throws RecognitionException {
		PotenzaContext _localctx = new PotenzaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_potenza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); match(T__68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoriMoltiplicazioneContext extends ParserRuleContext {
		public OperatoriMoltiplicazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriMoltiplicazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriMoltiplicazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriMoltiplicazione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoriMoltiplicazione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoriMoltiplicazioneContext operatoriMoltiplicazione() throws RecognitionException {
		OperatoriMoltiplicazioneContext _localctx = new OperatoriMoltiplicazioneContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_operatoriMoltiplicazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__38 - 42)) | (1L << (T__21 - 42)) | (1L << (T__5 - 42)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoriRelazionaliContext extends ParserRuleContext {
		public OperatoriRelazionaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriRelazionali; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriRelazionali(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriRelazionali(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoriRelazionali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoriRelazionaliContext operatoriRelazionali() throws RecognitionException {
		OperatoriRelazionaliContext _localctx = new OperatoriRelazionaliContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_operatoriRelazionali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__50 - 30)) | (1L << (T__48 - 30)) | (1L << (T__25 - 30)) | (1L << (T__9 - 30)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoriConfrontoDirettoContext extends ParserRuleContext {
		public OperatoriConfrontoDirettoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriConfrontoDiretto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriConfrontoDiretto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriConfrontoDiretto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoriConfrontoDiretto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() throws RecognitionException {
		OperatoriConfrontoDirettoContext _localctx = new OperatoriConfrontoDirettoContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_operatoriConfrontoDiretto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !(_la==T__73 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatoriAssegnazioneContext extends ParserRuleContext {
		public OperatoriAssegnazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriAssegnazione; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOperatoriAssegnazione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOperatoriAssegnazione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOperatoriAssegnazione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatoriAssegnazioneContext operatoriAssegnazione() throws RecognitionException {
		OperatoriAssegnazioneContext _localctx = new OperatoriAssegnazioneContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_operatoriAssegnazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__79) | (1L << T__78) | (1L << T__69) | (1L << T__65) | (1L << T__64) | (1L << T__60) | (1L << T__56) | (1L << T__54) | (1L << T__39) | (1L << T__36) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31: return nomeTipo_sempred((NomeTipoContext)_localctx, predIndex);
		case 53: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nomeTipo_sempred(NomeTipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 14);
		case 2: return precpred(_ctx, 13);
		case 3: return precpred(_ctx, 12);
		case 4: return precpred(_ctx, 11);
		case 5: return precpred(_ctx, 10);
		case 6: return precpred(_ctx, 9);
		case 7: return precpred(_ctx, 8);
		case 8: return precpred(_ctx, 7);
		case 9: return precpred(_ctx, 6);
		case 10: return precpred(_ctx, 5);
		case 11: return precpred(_ctx, 4);
		case 12: return precpred(_ctx, 3);
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 25);
		case 15: return precpred(_ctx, 23);
		case 16: return precpred(_ctx, 22);
		case 17: return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u033b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\7\2\u0098\n\2\f\2\16\2\u009b\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\5\6\u00ac\n\6\3\7"+
		"\3\7\3\b\5\b\u00b1\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b8\n\t\3\n\3\n\3\n\3"+
		"\n\5\n\u00be\n\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\5\n\u00c8\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00dc\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e4"+
		"\n\13\f\13\16\13\u00e7\13\13\5\13\u00e9\n\13\3\13\3\13\7\13\u00ed\n\13"+
		"\f\13\16\13\u00f0\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u00f7\n\f\3\f\5\f\u00fa"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0104\n\r\3\16\3\16\7\16\u0108"+
		"\n\16\f\16\16\16\u010b\13\16\3\16\3\16\3\16\5\16\u0110\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0119\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0125\n\20\f\20\16\20\u0128\13\20\5\20\u012a"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0136\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u013d\n\23\3\23\5\23\u0140\n\23\3\24\3"+
		"\24\5\24\u0144\n\24\3\24\3\24\3\24\5\24\u0149\n\24\3\24\3\24\5\24\u014d"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0158\n\26\f\26"+
		"\16\26\u015b\13\26\3\27\3\27\3\27\3\27\5\27\u0161\n\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\5\31\u016b\n\31\3\31\3\31\7\31\u016f\n\31\f"+
		"\31\16\31\u0172\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u017a\n\32\f"+
		"\32\16\32\u017d\13\32\5\32\u017f\n\32\3\32\3\32\3\33\3\33\5\33\u0185\n"+
		"\33\3\33\5\33\u0188\n\33\3\34\3\34\3\34\3\34\7\34\u018e\n\34\f\34\16\34"+
		"\u0191\13\34\5\34\u0193\n\34\3\34\3\34\3\35\3\35\5\35\u0199\n\35\3\35"+
		"\5\35\u019c\n\35\3\36\3\36\3\36\3\36\7\36\u01a2\n\36\f\36\16\36\u01a5"+
		"\13\36\5\36\u01a7\n\36\3\36\3\36\3\37\3\37\5\37\u01ad\n\37\3 \3 \5 \u01b1"+
		"\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u01bc\n!\3!\3!\3!\5!\u01c1\n!\3!\7!"+
		"\u01c4\n!\f!\16!\u01c7\13!\3\"\3\"\3\"\7\"\u01cc\n\"\f\"\16\"\u01cf\13"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\7$\u01dd\n$\f$\16$\u01e0\13$\3"+
		"$\3$\5$\u01e4\n$\3%\3%\3&\3&\3\'\3\'\7\'\u01ec\n\'\f\'\16\'\u01ef\13\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01fe\n(\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u020a\n*\3+\3+\3+\3+\3+\3+\3,\3,\5,\u0214\n,\3-\3-\3"+
		"-\3-\5-\u021a\n-\3-\3-\5-\u021e\n-\3-\5-\u0221\n-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\5\61\u0236\n\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u0248\n\64\3\64\3\64\5\64\u024c\n\64\3\64\3\64\3\65\5\65\u0251"+
		"\n\65\3\65\3\65\5\65\u0255\n\65\7\65\u0257\n\65\f\65\16\65\u025a\13\65"+
		"\3\66\3\66\5\66\u025e\n\66\3\66\7\66\u0261\n\66\f\66\16\66\u0264\13\66"+
		"\3\66\5\66\u0267\n\66\3\66\3\66\3\67\3\67\3\67\5\67\u026e\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0282\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u02b7\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u02c6\n\67\f\67\16\67\u02c9\13\67\38\38\38\38\38"+
		"\38\38\58\u02d2\n8\38\38\38\38\38\58\u02d9\n8\58\u02db\n8\39\39\39\79"+
		"\u02e0\n9\f9\169\u02e3\139\3:\3:\3:\7:\u02e8\n:\f:\16:\u02eb\13:\3:\5"+
		":\u02ee\n:\3;\3;\3;\3;\3<\3<\5<\u02f6\n<\3<\3<\5<\u02fa\n<\5<\u02fc\n"+
		"<\3=\3=\3=\3=\3=\3>\3>\5>\u0305\n>\3>\3>\5>\u0309\n>\7>\u030b\n>\f>\16"+
		">\u030e\13>\3>\3>\3>\3>\3>\7>\u0315\n>\f>\16>\u0318\13>\5>\u031a\n>\3"+
		">\5>\u031d\n>\3?\3?\5?\u0321\n?\3@\3@\5@\u0325\n@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\2\4@lK\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2"+
		"\21\t\2\21\21\24\24  \"\"$$99II\4\2\5\6CC\5\2\\\\``bc\5\2\b\b\36\36%%"+
		"\6\2\\\\aaddff\4\2\25\25\35\35\4\2\20\20\63\63\3\2UV\5\2%%::ll\7\2\17"+
		"\17\37\37GHLLgk\4\2((QQ\5\2,,==MM\6\2  \"\"99II\4\2\t\tDD\13\2\3\4\r\r"+
		"\21\22\26\26\32\32\34\34++..\61\61\u0380\2\u0099\3\2\2\2\4\u009e\3\2\2"+
		"\2\6\u00a3\3\2\2\2\b\u00a7\3\2\2\2\n\u00a9\3\2\2\2\f\u00ad\3\2\2\2\16"+
		"\u00b0\3\2\2\2\20\u00b4\3\2\2\2\22\u00db\3\2\2\2\24\u00dd\3\2\2\2\26\u00f3"+
		"\3\2\2\2\30\u0103\3\2\2\2\32\u0105\3\2\2\2\34\u0113\3\2\2\2\36\u011c\3"+
		"\2\2\2 \u012d\3\2\2\2\"\u0132\3\2\2\2$\u0139\3\2\2\2&\u0141\3\2\2\2(\u014e"+
		"\3\2\2\2*\u0159\3\2\2\2,\u015c\3\2\2\2.\u0164\3\2\2\2\60\u0166\3\2\2\2"+
		"\62\u0175\3\2\2\2\64\u0182\3\2\2\2\66\u0189\3\2\2\28\u0196\3\2\2\2:\u019d"+
		"\3\2\2\2<\u01aa\3\2\2\2>\u01ae\3\2\2\2@\u01bb\3\2\2\2B\u01c8\3\2\2\2D"+
		"\u01d0\3\2\2\2F\u01d7\3\2\2\2H\u01e5\3\2\2\2J\u01e7\3\2\2\2L\u01e9\3\2"+
		"\2\2N\u01fd\3\2\2\2P\u01ff\3\2\2\2R\u0202\3\2\2\2T\u020b\3\2\2\2V\u0213"+
		"\3\2\2\2X\u0215\3\2\2\2Z\u0225\3\2\2\2\\\u022d\3\2\2\2^\u0230\3\2\2\2"+
		"`\u0233\3\2\2\2b\u0239\3\2\2\2d\u023c\3\2\2\2f\u0247\3\2\2\2h\u0250\3"+
		"\2\2\2j\u025b\3\2\2\2l\u0281\3\2\2\2n\u02da\3\2\2\2p\u02dc\3\2\2\2r\u02e4"+
		"\3\2\2\2t\u02ef\3\2\2\2v\u02fb\3\2\2\2x\u02fd\3\2\2\2z\u031c\3\2\2\2|"+
		"\u0320\3\2\2\2~\u0322\3\2\2\2\u0080\u0326\3\2\2\2\u0082\u0328\3\2\2\2"+
		"\u0084\u032a\3\2\2\2\u0086\u032c\3\2\2\2\u0088\u032e\3\2\2\2\u008a\u0330"+
		"\3\2\2\2\u008c\u0332\3\2\2\2\u008e\u0334\3\2\2\2\u0090\u0336\3\2\2\2\u0092"+
		"\u0338\3\2\2\2\u0094\u0098\5\4\3\2\u0095\u0098\5\22\n\2\u0096\u0098\5"+
		"\24\13\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\2\2\3\u009d\3\3\2\2\2\u009e\u009f"+
		"\7\f\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\7\62\2\2"+
		"\u00a2\5\3\2\2\2\u00a3\u00a4\5\u0080A\2\u00a4\7\3\2\2\2\u00a5\u00a8\5"+
		"\n\6\2\u00a6\u00a8\5l\67\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\t\3\2\2\2\u00a9\u00ab\5\16\b\2\u00aa\u00ac\5\16\b\2\u00ab\u00aa\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\r\3"+
		"\2\2\2\u00af\u00b1\5\f\7\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\7S\2\2\u00b3\17\3\2\2\2\u00b4\u00b7\5\u0080"+
		"A\2\u00b5\u00b6\7-\2\2\u00b6\u00b8\5\u0080A\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bd\7o\2\2"+
		"\u00bb\u00bc\7-\2\2\u00bc\u00be\5\u0080A\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00dc\7\62\2\2\u00c0\u00c3\7R\2\2\u00c1"+
		"\u00c4\7=\2\2\u00c2\u00c4\5\u0080A\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c8\5\u0080A\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7:"+
		"\2\2\u00ca\u00cb\7o\2\2\u00cb\u00dc\7\62\2\2\u00cc\u00cd\7R\2\2\u00cd"+
		"\u00ce\7\13\2\2\u00ce\u00d3\5\20\t\2\u00cf\u00d0\7\33\2\2\u00d0\u00d2"+
		"\5\20\t\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\7\64\2\2\u00d7\u00d8\7:\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7\62\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00b9\3\2\2\2\u00db\u00c0\3\2\2\2\u00db\u00cc\3\2"+
		"\2\2\u00dc\23\3\2\2\2\u00dd\u00de\t\3\2\2\u00de\u00e8\5\u0080A\2\u00df"+
		"\u00e0\7<\2\2\u00e0\u00e5\5\26\f\2\u00e1\u00e2\7\33\2\2\u00e2\u00e4\5"+
		"\26\f\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00df\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\7\13\2\2\u00eb"+
		"\u00ed\5\30\r\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\7\64\2\2\u00f2\25\3\2\2\2\u00f3\u00f9\5B\"\2\u00f4\u00f6\7\31\2"+
		"\2\u00f5\u00f7\5p9\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\7P\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\27\3\2\2\2\u00fb\u0104\5\32\16\2\u00fc\u0104\5\34\17\2\u00fd\u0104\5"+
		"\36\20\2\u00fe\u0104\5 \21\2\u00ff\u0104\5\"\22\2\u0100\u0104\5&\24\2"+
		"\u0101\u0104\5,\27\2\u0102\u0104\5\60\31\2\u0103\u00fb\3\2\2\2\u0103\u00fc"+
		"\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\31\3\2\2"+
		"\2\u0105\u0109\5@!\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\5\u0080A\2\u010d\u010e\7\21\2\2\u010e\u0110"+
		"\5l\67\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\7\62\2\2\u0112\33\3\2\2\2\u0113\u0114\7\60\2\2\u0114\u0115\5\u0080"+
		"A\2\u0115\u0118\7\23\2\2\u0116\u0119\7=\2\2\u0117\u0119\5@!\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\62\2\2"+
		"\u011b\35\3\2\2\2\u011c\u011d\7*\2\2\u011d\u011e\5\u0080A\2\u011e\u0129"+
		"\7\13\2\2\u011f\u0120\5> \2\u0120\u0126\7\62\2\2\u0121\u0122\5> \2\u0122"+
		"\u0123\7\62\2\2\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0128\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\7\64\2\2\u012c\37\3\2\2\2\u012d\u012e\7\27\2\2\u012e"+
		"\u012f\5\62\32\2\u012f\u0130\5*\26\2\u0130\u0131\5L\'\2\u0131!\3\2\2\2"+
		"\u0132\u0133\7N\2\2\u0133\u0135\5\u0080A\2\u0134\u0136\5\62\32\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\5L"+
		"\'\2\u0138#\3\2\2\2\u0139\u013f\5\u0080A\2\u013a\u013c\7\31\2\2\u013b"+
		"\u013d\5p9\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u0140\7P\2\2\u013f\u013a\3\2\2\2\u013f\u0140\3\2\2\2\u0140%\3"+
		"\2\2\2\u0141\u0143\7\'\2\2\u0142\u0144\5\u0080A\2\u0143\u0142\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5\62\32\2\u0146\u0148"+
		"\5*\26\2\u0147\u0149\5(\25\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u014d\7\62\2\2\u014b\u014d\5L\'\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\'\3\2\2\2\u014e\u014f\7&\2\2\u014f\u0150"+
		"\5\62\32\2\u0150)\3\2\2\2\u0151\u0158\5$\23\2\u0152\u0158\5J&\2\u0153"+
		"\u0158\7^\2\2\u0154\u0158\7c\2\2\u0155\u0158\7`\2\2\u0156\u0158\7b\2\2"+
		"\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0154"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a+\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015d\78\2\2\u015d\u015e\5\u0080A\2\u015e\u0160\5\66\34\2\u015f"+
		"\u0161\7Z\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\7\62\2\2\u0163-\3\2\2\2\u0164\u0165\5\u0080A\2\u0165"+
		"/\3\2\2\2\u0166\u0167\7\67\2\2\u0167\u0168\5\u0080A\2\u0168\u016a\7\13"+
		"\2\2\u0169\u016b\5.\30\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0170\3\2\2\2\u016c\u016d\7\33\2\2\u016d\u016f\5.\30\2\u016e\u016c\3"+
		"\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\64\2\2\u0174\61\3\2\2"+
		"\2\u0175\u017e\7\31\2\2\u0176\u017b\5\64\33\2\u0177\u0178\7\33\2\2\u0178"+
		"\u017a\5\64\33\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u0176\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7P"+
		"\2\2\u0181\63\3\2\2\2\u0182\u0184\5@!\2\u0183\u0185\5H%\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0188\5\u0080A"+
		"\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\65\3\2\2\2\u0189\u0192"+
		"\7\31\2\2\u018a\u018f\58\35\2\u018b\u018c\7\33\2\2\u018c\u018e\58\35\2"+
		"\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u018a\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7P\2\2\u0195\67\3\2\2\2"+
		"\u0196\u0198\5@!\2\u0197\u0199\7_\2\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\5\u0080A\2\u019b\u019a\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019c9\3\2\2\2\u019d\u01a6\7\31\2\2\u019e\u01a3"+
		"\5<\37\2\u019f\u01a0\7\33\2\2\u01a0\u01a2\5<\37\2\u01a1\u019f\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\7P\2\2\u01a9;\3\2\2\2\u01aa\u01ac\5@!\2\u01ab"+
		"\u01ad\5H%\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad=\3\2\2\2\u01ae"+
		"\u01b0\5@!\2\u01af\u01b1\5H%\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5\u0080A\2\u01b3?\3\2\2\2\u01b4\u01b5"+
		"\b!\1\2\u01b5\u01bc\5\u0082B\2\u01b6\u01bc\5B\"\2\u01b7\u01bc\5D#\2\u01b8"+
		"\u01bc\5F$\2\u01b9\u01ba\7G\2\2\u01ba\u01bc\7a\2\2\u01bb\u01b4\3\2\2\2"+
		"\u01bb\u01b6\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01c5\3\2\2\2\u01bd\u01be\f\5\2\2\u01be\u01c0\7B\2\2\u01bf"+
		"\u01c1\5l\67\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c4\7#\2\2\u01c3\u01bd\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6A\3\2\2\2\u01c7\u01c5\3\2\2\2"+
		"\u01c8\u01cd\5\u0080A\2\u01c9\u01ca\7?\2\2\u01ca\u01cc\5\u0080A\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ceC\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7)\2\2\u01d1\u01d2"+
		"\7\31\2\2\u01d2\u01d3\5\u0082B\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\5@!\2"+
		"\u01d5\u01d6\7P\2\2\u01d6E\3\2\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01de\5:"+
		"\36\2\u01d9\u01dd\7`\2\2\u01da\u01dd\7^\2\2\u01db\u01dd\5J&\2\u01dc\u01d9"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e3\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e2\7&\2\2\u01e2\u01e4\5:\36\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4G\3\2\2\2\u01e5\u01e6\t\5\2\2\u01e6I\3\2\2\2\u01e7"+
		"\u01e8\t\6\2\2\u01e8K\3\2\2\2\u01e9\u01ed\7\13\2\2\u01ea\u01ec\5N(\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\7\64\2\2\u01f1"+
		"M\3\2\2\2\u01f2\u01fe\5R*\2\u01f3\u01fe\5T+\2\u01f4\u01fe\5X-\2\u01f5"+
		"\u01fe\5L\'\2\u01f6\u01fe\5Z.\2\u01f7\u01fe\5\\/\2\u01f8\u01fe\5^\60\2"+
		"\u01f9\u01fe\5`\61\2\u01fa\u01fe\5b\62\2\u01fb\u01fe\5d\63\2\u01fc\u01fe"+
		"\5V,\2\u01fd\u01f2\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fd"+
		"\u01f5\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fd\u01f8\3\2"+
		"\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01feO\3\2\2\2\u01ff\u0200\5l\67\2\u0200\u0201\7\62\2\2"+
		"\u0201Q\3\2\2\2\u0202\u0203\7\65\2\2\u0203\u0204\7\31\2\2\u0204\u0205"+
		"\5l\67\2\u0205\u0206\7P\2\2\u0206\u0209\5N(\2\u0207\u0208\7O\2\2\u0208"+
		"\u020a\5N(\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aS\3\2\2\2\u020b"+
		"\u020c\7\n\2\2\u020c\u020d\7\31\2\2\u020d\u020e\5l\67\2\u020e\u020f\7"+
		"P\2\2\u020f\u0210\5N(\2\u0210U\3\2\2\2\u0211\u0214\5f\64\2\u0212\u0214"+
		"\5P)\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214W\3\2\2\2\u0215\u0216"+
		"\7\23\2\2\u0216\u0219\7\31\2\2\u0217\u021a\5V,\2\u0218\u021a\7\62\2\2"+
		"\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021e"+
		"\5P)\2\u021c\u021e\7\62\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u0221\5l\67\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7P\2\2\u0223\u0224\5N(\2\u0224Y\3"+
		"\2\2\2\u0225\u0226\7\30\2\2\u0226\u0227\5N(\2\u0227\u0228\7\n\2\2\u0228"+
		"\u0229\7\31\2\2\u0229\u022a\5l\67\2\u022a\u022b\7P\2\2\u022b\u022c\7\62"+
		"\2\2\u022c[\3\2\2\2\u022d\u022e\7]\2\2\u022e\u022f\7\62\2\2\u022f]\3\2"+
		"\2\2\u0230\u0231\7[\2\2\u0231\u0232\7\62\2\2\u0232_\3\2\2\2\u0233\u0235"+
		"\7/\2\2\u0234\u0236\5l\67\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\7\62\2\2\u0238a\3\2\2\2\u0239\u023a\7@\2\2"+
		"\u023a\u023b\7\62\2\2\u023bc\3\2\2\2\u023c\u023d\7>\2\2\u023d\u023e\5"+
		"x=\2\u023e\u023f\7\62\2\2\u023fe\3\2\2\2\u0240\u0241\7\37\2\2\u0241\u0248"+
		"\5j\66\2\u0242\u0248\5> \2\u0243\u0244\7\31\2\2\u0244\u0245\5h\65\2\u0245"+
		"\u0246\7P\2\2\u0246\u0248\3\2\2\2\u0247\u0240\3\2\2\2\u0247\u0242\3\2"+
		"\2\2\u0247\u0243\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u024a\7\21\2\2\u024a"+
		"\u024c\5l\67\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024e\7\62\2\2\u024eg\3\2\2\2\u024f\u0251\5> \2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0258\3\2\2\2\u0252\u0254\7\33\2\2"+
		"\u0253\u0255\5> \2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257"+
		"\3\2\2\2\u0256\u0252\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259i\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u0262\7\31\2\2"+
		"\u025c\u025e\5\u0080A\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0261\7\33\2\2\u0260\u025d\3\2\2\2\u0261\u0264\3"+
		"\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0267\5\u0080A\2\u0266\u0265\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7P\2\2\u0269k\3\2\2\2\u026a\u026d"+
		"\b\67\1\2\u026b\u026e\5\u0084C\2\u026c\u026e\5\u0086D\2\u026d\u026b\3"+
		"\2\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5l\67\25\u0270"+
		"\u0282\3\2\2\2\u0271\u0272\5\u0088E\2\u0272\u0273\5l\67\24\u0273\u0282"+
		"\3\2\2\2\u0274\u0275\t\7\2\2\u0275\u0282\5l\67\23\u0276\u0277\7J\2\2\u0277"+
		"\u0282\5l\67\22\u0278\u0279\7$\2\2\u0279\u0282\5l\67\21\u027a\u027b\7"+
		"\7\2\2\u027b\u0282\5@!\2\u027c\u027d\7\31\2\2\u027d\u027e\5l\67\2\u027e"+
		"\u027f\7P\2\2\u027f\u0282\3\2\2\2\u0280\u0282\5n8\2\u0281\u026a\3\2\2"+
		"\2\u0281\u0271\3\2\2\2\u0281\u0274\3\2\2\2\u0281\u0276\3\2\2\2\u0281\u0278"+
		"\3\2\2\2\u0281\u027a\3\2\2\2\u0281\u027c\3\2\2\2\u0281\u0280\3\2\2\2\u0282"+
		"\u02c7\3\2\2\2\u0283\u0284\f\20\2\2\u0284\u0285\5\u008aF\2\u0285\u0286"+
		"\5l\67\21\u0286\u02c6\3\2\2\2\u0287\u0288\f\17\2\2\u0288\u0289\5\u008c"+
		"G\2\u0289\u028a\5l\67\20\u028a\u02c6\3\2\2\2\u028b\u028c\f\16\2\2\u028c"+
		"\u028d\5\u0088E\2\u028d\u028e\5l\67\17\u028e\u02c6\3\2\2\2\u028f\u0290"+
		"\f\r\2\2\u0290\u0291\t\b\2\2\u0291\u02c6\5l\67\16\u0292\u0293\f\f\2\2"+
		"\u0293\u0294\7;\2\2\u0294\u02c6\5l\67\r\u0295\u0296\f\13\2\2\u0296\u0297"+
		"\7\24\2\2\u0297\u02c6\5l\67\f\u0298\u0299\f\n\2\2\u0299\u029a\7F\2\2\u029a"+
		"\u02c6\5l\67\13\u029b\u029c\f\t\2\2\u029c\u029d\5\u008eH\2\u029d\u029e"+
		"\5l\67\n\u029e\u02c6\3\2\2\2\u029f\u02a0\f\b\2\2\u02a0\u02a1\5\u0090I"+
		"\2\u02a1\u02a2\5l\67\t\u02a2\u02c6\3\2\2\2\u02a3\u02a4\f\7\2\2\u02a4\u02a5"+
		"\7m\2\2\u02a5\u02c6\5l\67\b\u02a6\u02a7\f\6\2\2\u02a7\u02a8\7n\2\2\u02a8"+
		"\u02c6\5l\67\7\u02a9\u02aa\f\5\2\2\u02aa\u02ab\7\66\2\2\u02ab\u02ac\5"+
		"l\67\2\u02ac\u02ad\7A\2\2\u02ad\u02ae\5l\67\6\u02ae\u02c6\3\2\2\2\u02af"+
		"\u02b0\f\4\2\2\u02b0\u02b1\5\u0092J\2\u02b1\u02b2\5l\67\5\u02b2\u02c6"+
		"\3\2\2\2\u02b3\u02b6\f\33\2\2\u02b4\u02b7\5\u0084C\2\u02b5\u02b7\5\u0086"+
		"D\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02c6\3\2\2\2\u02b8"+
		"\u02b9\f\31\2\2\u02b9\u02ba\7B\2\2\u02ba\u02bb\5l\67\2\u02bb\u02bc\7#"+
		"\2\2\u02bc\u02c6\3\2\2\2\u02bd\u02be\f\30\2\2\u02be\u02bf\7\31\2\2\u02bf"+
		"\u02c0\5v<\2\u02c0\u02c1\7P\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c3\f\27\2"+
		"\2\u02c3\u02c4\7?\2\2\u02c4\u02c6\5\u0080A\2\u02c5\u0283\3\2\2\2\u02c5"+
		"\u0287\3\2\2\2\u02c5\u028b\3\2\2\2\u02c5\u028f\3\2\2\2\u02c5\u0292\3\2"+
		"\2\2\u02c5\u0295\3\2\2\2\u02c5\u0298\3\2\2\2\u02c5\u029b\3\2\2\2\u02c5"+
		"\u029f\3\2\2\2\u02c5\u02a3\3\2\2\2\u02c5\u02a6\3\2\2\2\u02c5\u02a9\3\2"+
		"\2\2\u02c5\u02af\3\2\2\2\u02c5\u02b3\3\2\2\2\u02c5\u02b8\3\2\2\2\u02c5"+
		"\u02bd\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8m\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02db"+
		"\7T\2\2\u02cb\u02db\5~@\2\u02cc\u02db\7X\2\2\u02cd\u02db\7o\2\2\u02ce"+
		"\u02d1\5\u0080A\2\u02cf\u02d0\7B\2\2\u02d0\u02d2\7#\2\2\u02d1\u02cf\3"+
		"\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02db\3\2\2\2\u02d3\u02db\7e\2\2\u02d4"+
		"\u02db\5z>\2\u02d5\u02d8\5|?\2\u02d6\u02d7\7B\2\2\u02d7\u02d9\7#\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02ca\3\2"+
		"\2\2\u02da\u02cb\3\2\2\2\u02da\u02cc\3\2\2\2\u02da\u02cd\3\2\2\2\u02da"+
		"\u02ce\3\2\2\2\u02da\u02d3\3\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02d5\3\2"+
		"\2\2\u02dbo\3\2\2\2\u02dc\u02e1\5l\67\2\u02dd\u02de\7\33\2\2\u02de\u02e0"+
		"\5l\67\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2q\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e9\5t;\2\u02e5"+
		"\u02e6\7\33\2\2\u02e6\u02e8\5t;\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2"+
		"\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02ec\u02ee\7\33\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3"+
		"\2\2\2\u02ees\3\2\2\2\u02ef\u02f0\5\u0080A\2\u02f0\u02f1\7A\2\2\u02f1"+
		"\u02f2\5l\67\2\u02f2u\3\2\2\2\u02f3\u02f5\7\13\2\2\u02f4\u02f6\5r:\2\u02f5"+
		"\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fc\7\64"+
		"\2\2\u02f8\u02fa\5p9\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc"+
		"\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fcw\3\2\2\2\u02fd"+
		"\u02fe\5l\67\2\u02fe\u02ff\7\31\2\2\u02ff\u0300\5v<\2\u0300\u0301\7P\2"+
		"\2\u0301y\3\2\2\2\u0302\u0304\7\31\2\2\u0303\u0305\5l\67\2\u0304\u0303"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030c\3\2\2\2\u0306\u0308\7\33\2\2"+
		"\u0307\u0309\5l\67\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b"+
		"\3\2\2\2\u030a\u0306\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u031d\7P"+
		"\2\2\u0310\u0319\7B\2\2\u0311\u0316\5l\67\2\u0312\u0313\7\33\2\2\u0313"+
		"\u0315\5l\67\2\u0314\u0312\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0316\u0317\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0319"+
		"\u0311\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\7#"+
		"\2\2\u031c\u0302\3\2\2\2\u031c\u0310\3\2\2\2\u031d{\3\2\2\2\u031e\u0321"+
		"\5\u0082B\2\u031f\u0321\5B\"\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2"+
		"\u0321}\3\2\2\2\u0322\u0324\t\t\2\2\u0323\u0325\7W\2\2\u0324\u0323\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\177\3\2\2\2\u0326\u0327\t\n\2\2\u0327\u0081"+
		"\3\2\2\2\u0328\u0329\t\13\2\2\u0329\u0083\3\2\2\2\u032a\u032b\7!\2\2\u032b"+
		"\u0085\3\2\2\2\u032c\u032d\7E\2\2\u032d\u0087\3\2\2\2\u032e\u032f\t\f"+
		"\2\2\u032f\u0089\3\2\2\2\u0330\u0331\7\16\2\2\u0331\u008b\3\2\2\2\u0332"+
		"\u0333\t\r\2\2\u0333\u008d\3\2\2\2\u0334\u0335\t\16\2\2\u0335\u008f\3"+
		"\2\2\2\u0336\u0337\t\17\2\2\u0337\u0091\3\2\2\2\u0338\u0339\t\20\2\2\u0339"+
		"\u0093\3\2\2\2\\\u0097\u0099\u00a7\u00ab\u00b0\u00b7\u00bd\u00c3\u00c7"+
		"\u00d3\u00db\u00e5\u00e8\u00ee\u00f6\u00f9\u0103\u0109\u010f\u0118\u0126"+
		"\u0129\u0135\u013c\u013f\u0143\u0148\u014c\u0157\u0159\u0160\u016a\u0170"+
		"\u017b\u017e\u0184\u0187\u018f\u0192\u0198\u019b\u01a3\u01a6\u01ac\u01b0"+
		"\u01bb\u01c0\u01c5\u01cd\u01dc\u01de\u01e3\u01ed\u01fd\u0209\u0213\u0219"+
		"\u021d\u0220\u0235\u0247\u024b\u0250\u0254\u0258\u025d\u0262\u0266\u026d"+
		"\u0281\u02b6\u02c5\u02c7\u02d1\u02d8\u02da\u02e1\u02e9\u02ed\u02f5\u02f9"+
		"\u02fb\u0304\u0308\u030c\u0316\u0319\u031c\u0320\u0324";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}