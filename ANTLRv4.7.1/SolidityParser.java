// Generated from Solidity.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, VersionLiteral=83, LiteralBooleano=84, NumeroDecimale=85, 
		NumeroEsadecimale=86, UnitaNumero=87, LiteralEsadecimale=88, ReservedKeyword=89, 
		AnonymousKeyword=90, BreakKeyword=91, ConstantKeyword=92, ContinueKeyword=93, 
		ExternalKeyword=94, IndexedKeyword=95, InternalKeyword=96, PayableKeyword=97, 
		PrivateKeyword=98, PublicKeyword=99, PureKeyword=100, TypeKeyword=101, 
		ViewKeyword=102, Int=103, Uint=104, Byte=105, Fixed=106, Ufixed=107, Identifier=108, 
		AND=109, OR=110, NOT=111, LiteralStringa=112, WS=113, COMMENTO=114, COMMENTO_LINEA=115;
	public static final int
		RULE_sourceUnit = 0, RULE_pragma = 1, RULE_nomePragma = 2, RULE_valorePragma = 3, 
		RULE_versione = 4, RULE_operatoreVersione = 5, RULE_vincoloVersione = 6, 
		RULE_dichiarazioneImport = 7, RULE_imports = 8, RULE_definizioneContratto = 9, 
		RULE_inheritanceSpecifier = 10, RULE_parteDiContratto = 11, RULE_assegnazioneVariabile = 12, 
		RULE_usingForDeclaration = 13, RULE_definizioneStruct = 14, RULE_definizioneCostruttore = 15, 
		RULE_definizioneModifier = 16, RULE_invocazioneModifier = 17, RULE_definizioneFunzione = 18, 
		RULE_definizioneErrore = 19, RULE_valoreRitorno = 20, RULE_listaModifier = 21, 
		RULE_definizioneEvento = 22, RULE_valoreEnum = 23, RULE_definizioneEnum = 24, 
		RULE_listaParametri = 25, RULE_parametro = 26, RULE_listaParametriEvent = 27, 
		RULE_parametriEvent = 28, RULE_listaParametriFunzione = 29, RULE_parametroFunzione = 30, 
		RULE_dichiarazioneVariabile = 31, RULE_nomeTipo = 32, RULE_tipiDefinitiUtente = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_tipoStorage = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_statement = 39, RULE_expressionStatement = 40, 
		RULE_ifStatement = 41, RULE_whileStatement = 42, RULE_simpleStatement = 43, 
		RULE_forStatement = 44, RULE_doWhileStatement = 45, RULE_continueStatement = 46, 
		RULE_breakStatement = 47, RULE_returnStatement = 48, RULE_throwStatement = 49, 
		RULE_emitStatement = 50, RULE_tryCatchStatement = 51, RULE_listaCatch = 52, 
		RULE_dichiarazioneVariabileStatement = 53, RULE_listaDichiarazioneVariabili = 54, 
		RULE_listaIdentifier = 55, RULE_expression = 56, RULE_primaryExpression = 57, 
		RULE_listaExpression = 58, RULE_listaNameValue = 59, RULE_nameValue = 60, 
		RULE_argomentiChiamataFunzione = 61, RULE_chiamataFunzione = 62, RULE_tupleExpression = 63, 
		RULE_tipiExpression = 64, RULE_valoreNumerico = 65, RULE_identificatore = 66, 
		RULE_tipiPrimitivi = 67, RULE_array = 68, RULE_incremento = 69, RULE_decremento = 70, 
		RULE_operatoriSomma = 71, RULE_potenza = 72, RULE_operatoriMoltiplicazione = 73, 
		RULE_operatoriRelazionali = 74, RULE_operatoriConfrontoDiretto = 75, RULE_puntoVirgola = 76, 
		RULE_operatoriAssegnazione = 77;
	public static final String[] ruleNames = {
		"sourceUnit", "pragma", "nomePragma", "valorePragma", "versione", "operatoreVersione", 
		"vincoloVersione", "dichiarazioneImport", "imports", "definizioneContratto", 
		"inheritanceSpecifier", "parteDiContratto", "assegnazioneVariabile", "usingForDeclaration", 
		"definizioneStruct", "definizioneCostruttore", "definizioneModifier", 
		"invocazioneModifier", "definizioneFunzione", "definizioneErrore", "valoreRitorno", 
		"listaModifier", "definizioneEvento", "valoreEnum", "definizioneEnum", 
		"listaParametri", "parametro", "listaParametriEvent", "parametriEvent", 
		"listaParametriFunzione", "parametroFunzione", "dichiarazioneVariabile", 
		"nomeTipo", "tipiDefinitiUtente", "mapping", "functionTypeName", "tipoStorage", 
		"stateMutability", "block", "statement", "expressionStatement", "ifStatement", 
		"whileStatement", "simpleStatement", "forStatement", "doWhileStatement", 
		"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
		"emitStatement", "tryCatchStatement", "listaCatch", "dichiarazioneVariabileStatement", 
		"listaDichiarazioneVariabili", "listaIdentifier", "expression", "primaryExpression", 
		"listaExpression", "listaNameValue", "nameValue", "argomentiChiamataFunzione", 
		"chiamataFunzione", "tupleExpression", "tipiExpression", "valoreNumerico", 
		"identificatore", "tipiPrimitivi", "array", "incremento", "decremento", 
		"operatoriSomma", "potenza", "operatoriMoltiplicazione", "operatoriRelazionali", 
		"operatoriConfrontoDiretto", "puntoVirgola", "operatoriAssegnazione"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pragma'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", "'='", "'as'", 
		"'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", "'interface'", 
		"'library'", "'is'", "'('", "')'", "'using'", "'for'", "'struct'", "'constructor'", 
		"'modifier'", "'function'", "'error'", "'returns'", "'event'", "'enum'", 
		"'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", "'memory'", "'storage'", 
		"'calldata'", "'if'", "'else'", "'while'", "'do'", "'return'", "'throw'", 
		"'emit'", "'try'", "'catch'", "'var'", "'new'", "'after'", "'delete'", 
		"'<<'", "'>>'", "'&'", "'|'", "'?'", "':'", "'bool'", "'string'", "'byte'", 
		"'++'", "'--'", "'+'", "'-'", "'**'", "'/'", "'%'", "'=='", "'!='", "';'", 
		"'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", null, null, null, null, null, null, null, "'anonymous'", "'break'", 
		"'constant'", "'continue'", "'external'", "'indexed'", "'internal'", "'payable'", 
		"'private'", "'public'", "'pure'", "'type'", "'view'", null, null, null, 
		null, null, null, "'&&'", "'||'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "VersionLiteral", 
		"LiteralBooleano", "NumeroDecimale", "NumeroEsadecimale", "UnitaNumero", 
		"LiteralEsadecimale", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", 
		"ConstantKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
		"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
		"PureKeyword", "TypeKeyword", "ViewKeyword", "Int", "Uint", "Byte", "Fixed", 
		"Ufixed", "Identifier", "AND", "OR", "NOT", "LiteralStringa", "WS", "COMMENTO", 
		"COMMENTO_LINEA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

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
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<DefinizioneContrattoContext> definizioneContratto() {
			return getRuleContexts(DefinizioneContrattoContext.class);
		}
		public DefinizioneContrattoContext definizioneContratto(int i) {
			return getRuleContext(DefinizioneContrattoContext.class,i);
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(156);
					pragma();
					}
					break;
				case T__9:
					{
					setState(157);
					imports();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
					{
					setState(158);
					definizioneContratto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(EOF);
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
		public NomePragmaContext nomePragma() {
			return getRuleContext(NomePragmaContext.class,0);
		}
		public ValorePragmaContext valorePragma() {
			return getRuleContext(ValorePragmaContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
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
			setState(166);
			match(T__0);
			setState(167);
			nomePragma();
			setState(168);
			valorePragma();
			setState(169);
			puntoVirgola();
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
			setState(171);
			identificatore();
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				versione();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression(0);
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
			setState(177);
			vincoloVersione();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==VersionLiteral) {
				{
				setState(178);
				vincoloVersione();
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
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VincoloVersioneContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public OperatoreVersioneContext operatoreVersione() {
			return getRuleContext(OperatoreVersioneContext.class,0);
		}
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
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(183);
				operatoreVersione();
				}
			}

			setState(186);
			match(VersionLiteral);
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
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
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
			setState(188);
			identificatore();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(189);
				match(T__8);
				setState(190);
				identificatore();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<DichiarazioneImportContext> dichiarazioneImport() {
			return getRuleContexts(DichiarazioneImportContext.class);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__9);
				setState(194);
				match(LiteralStringa);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(195);
					match(T__8);
					setState(196);
					identificatore();
					}
				}

				setState(199);
				puntoVirgola();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__9);
				setState(203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(201);
					match(T__10);
					}
					break;
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(202);
					identificatore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(205);
					match(T__8);
					setState(206);
					identificatore();
					}
				}

				setState(209);
				match(T__11);
				setState(210);
				match(LiteralStringa);
				setState(211);
				puntoVirgola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__9);
				setState(213);
				match(T__12);
				setState(214);
				dichiarazioneImport();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(215);
					match(T__13);
					setState(216);
					dichiarazioneImport();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__14);
				setState(223);
				match(T__11);
				setState(224);
				match(LiteralStringa);
				setState(225);
				puntoVirgola();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ParteDiContrattoContext> parteDiContratto() {
			return getRuleContexts(ParteDiContrattoContext.class);
		}
		public ParteDiContrattoContext parteDiContratto(int i) {
			return getRuleContext(ParteDiContrattoContext.class,i);
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
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			identificatore();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(231);
				match(T__18);
				setState(232);
				inheritanceSpecifier();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(233);
					match(T__13);
					setState(234);
					inheritanceSpecifier();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(242);
			match(T__12);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				{
				setState(243);
				parteDiContratto();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__14);
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
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
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
			setState(251);
			tipiDefinitiUtente();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(252);
				match(T__19);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(253);
					listaExpression();
					}
				}

				setState(256);
				match(T__20);
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
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public DefinizioneStructContext definizioneStruct() {
			return getRuleContext(DefinizioneStructContext.class,0);
		}
		public DefinizioneCostruttoreContext definizioneCostruttore() {
			return getRuleContext(DefinizioneCostruttoreContext.class,0);
		}
		public DefinizioneModifierContext definizioneModifier() {
			return getRuleContext(DefinizioneModifierContext.class,0);
		}
		public DefinizioneFunzioneContext definizioneFunzione() {
			return getRuleContext(DefinizioneFunzioneContext.class,0);
		}
		public DefinizioneErroreContext definizioneErrore() {
			return getRuleContext(DefinizioneErroreContext.class,0);
		}
		public DefinizioneEventoContext definizioneEvento() {
			return getRuleContext(DefinizioneEventoContext.class,0);
		}
		public DefinizioneEnumContext definizioneEnum() {
			return getRuleContext(DefinizioneEnumContext.class,0);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				assegnazioneVariabile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				definizioneStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				definizioneCostruttore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				definizioneModifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				definizioneFunzione();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				definizioneErrore();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				definizioneEvento();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				definizioneEnum();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
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
			setState(270);
			nomeTipo(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (ConstantKeyword - 92)) | (1L << (InternalKeyword - 92)) | (1L << (PrivateKeyword - 92)) | (1L << (PublicKeyword - 92)))) != 0)) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (ConstantKeyword - 92)) | (1L << (InternalKeyword - 92)) | (1L << (PrivateKeyword - 92)) | (1L << (PublicKeyword - 92)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			identificatore();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(278);
				match(T__7);
				setState(279);
				expression(0);
				}
			}

			setState(282);
			puntoVirgola();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
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
			setState(284);
			match(T__21);
			setState(285);
			identificatore();
			setState(286);
			match(T__22);
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(287);
				match(T__10);
				}
				break;
			case T__11:
			case T__26:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(288);
				nomeTipo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			puntoVirgola();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
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
			setState(293);
			match(T__23);
			setState(294);
			identificatore();
			setState(295);
			match(T__12);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(296);
				dichiarazioneVariabile();
				setState(297);
				puntoVirgola();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					{
					setState(298);
					dichiarazioneVariabile();
					setState(299);
					puntoVirgola();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308);
			match(T__14);
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
			setState(310);
			match(T__24);
			setState(311);
			listaParametri();
			setState(312);
			listaModifier();
			setState(313);
			block();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
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
			setState(315);
			match(T__25);
			setState(316);
			identificatore();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(317);
				listaParametri();
				}
			}

			setState(320);
			block();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
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
			setState(322);
			identificatore();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(323);
				match(T__19);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(324);
					listaExpression();
					}
				}

				setState(327);
				match(T__20);
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
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreRitornoContext valoreRitorno() {
			return getRuleContext(ValoreRitornoContext.class,0);
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
			setState(330);
			match(T__26);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(331);
				identificatore();
				}
			}

			setState(334);
			listaParametri();
			setState(335);
			listaModifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(336);
				valoreRitorno();
				}
			}

			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
				{
				setState(339);
				puntoVirgola();
				}
				break;
			case T__12:
				{
				setState(340);
				block();
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

	public static class DefinizioneErroreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DefinizioneErroreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneErrore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefinizioneErrore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefinizioneErrore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDefinizioneErrore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinizioneErroreContext definizioneErrore() throws RecognitionException {
		DefinizioneErroreContext _localctx = new DefinizioneErroreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definizioneErrore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__27);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(344);
				identificatore();
				}
			}

			setState(347);
			listaParametri();
			setState(348);
			puntoVirgola();
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
		enterRule(_localctx, 40, RULE_valoreRitorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__28);
			setState(351);
			listaParametri();
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
		public List<InvocazioneModifierContext> invocazioneModifier() {
			return getRuleContexts(InvocazioneModifierContext.class);
		}
		public InvocazioneModifierContext invocazioneModifier(int i) {
			return getRuleContext(InvocazioneModifierContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
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
		enterRule(_localctx, 42, RULE_listaModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__39 || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (ConstantKeyword - 92)) | (1L << (ExternalKeyword - 92)) | (1L << (InternalKeyword - 92)) | (1L << (PayableKeyword - 92)) | (1L << (PrivateKeyword - 92)) | (1L << (PublicKeyword - 92)) | (1L << (PureKeyword - 92)) | (1L << (ViewKeyword - 92)) | (1L << (Identifier - 92)))) != 0)) {
				{
				setState(359);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(353);
					invocazioneModifier();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(354);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(355);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(356);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(357);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(358);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(363);
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaParametriEventContext listaParametriEvent() {
			return getRuleContext(ListaParametriEventContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
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
		enterRule(_localctx, 44, RULE_definizioneEvento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__29);
			setState(365);
			identificatore();
			setState(366);
			listaParametriEvent();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(367);
				match(AnonymousKeyword);
				}
			}

			setState(370);
			puntoVirgola();
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
		enterRule(_localctx, 46, RULE_valoreEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			identificatore();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<ValoreEnumContext> valoreEnum() {
			return getRuleContexts(ValoreEnumContext.class);
		}
		public ValoreEnumContext valoreEnum(int i) {
			return getRuleContext(ValoreEnumContext.class,i);
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
		enterRule(_localctx, 48, RULE_definizioneEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__30);
			setState(375);
			identificatore();
			setState(376);
			match(T__12);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(377);
				valoreEnum();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(380);
				match(T__13);
				setState(381);
				valoreEnum();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(T__14);
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
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
		enterRule(_localctx, 50, RULE_listaParametri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__19);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(390);
				parametro();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(391);
					match(T__13);
					setState(392);
					parametro();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(400);
			match(T__20);
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
		enterRule(_localctx, 52, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			nomeTipo(0);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(403);
				tipoStorage();
				}
				break;
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(406);
				identificatore();
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
		enterRule(_localctx, 54, RULE_listaParametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__19);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(410);
				parametriEvent();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(411);
					match(T__13);
					setState(412);
					parametriEvent();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(420);
			match(T__20);
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
		enterRule(_localctx, 56, RULE_parametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			nomeTipo(0);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(423);
				match(IndexedKeyword);
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(426);
				identificatore();
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
		enterRule(_localctx, 58, RULE_listaParametriFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__19);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(430);
				parametroFunzione();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(431);
					match(T__13);
					setState(432);
					parametroFunzione();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(440);
			match(T__20);
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
		enterRule(_localctx, 60, RULE_parametroFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			nomeTipo(0);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				setState(443);
				tipoStorage();
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
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
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
		enterRule(_localctx, 62, RULE_dichiarazioneVariabile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			nomeTipo(0);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(447);
				tipoStorage();
				}
				break;
			}
			setState(450);
			identificatore();
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
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_nomeTipo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(453);
				tipiPrimitivi();
				}
				break;
			case 2:
				{
				setState(454);
				tipiDefinitiUtente();
				}
				break;
			case 3:
				{
				setState(455);
				mapping();
				}
				break;
			case 4:
				{
				setState(456);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(457);
				match(T__33);
				setState(458);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NomeTipoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nomeTipo);
					setState(461);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(462);
					match(T__31);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(463);
						expression(0);
						}
					}

					setState(466);
					match(T__32);
					}
					} 
				}
				setState(471);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TipiDefinitiUtenteContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
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
		enterRule(_localctx, 66, RULE_tipiDefinitiUtente);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			identificatore();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(T__34);
					setState(474);
					identificatore();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
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
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__35);
			setState(481);
			match(T__19);
			setState(482);
			tipiPrimitivi();
			setState(483);
			match(T__36);
			setState(484);
			nomeTipo(0);
			setState(485);
			match(T__20);
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
		public List<ListaParametriFunzioneContext> listaParametriFunzione() {
			return getRuleContexts(ListaParametriFunzioneContext.class);
		}
		public ListaParametriFunzioneContext listaParametriFunzione(int i) {
			return getRuleContext(ListaParametriFunzioneContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
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
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__26);
			setState(488);
			listaParametriFunzione();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(492);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(489);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(490);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(491);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(497);
				match(T__28);
				setState(498);
				listaParametriFunzione();
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
		enterRule(_localctx, 72, RULE_tipoStorage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
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
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (ConstantKeyword - 92)) | (1L << (PayableKeyword - 92)) | (1L << (PureKeyword - 92)) | (1L << (ViewKeyword - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__12);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				{
				setState(506);
				statement();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			match(T__14);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
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
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				whileStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				breakStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(521);
				returnStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(522);
				throwStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(523);
				emitStatement();
				}
				break;
			case T__2:
			case T__11:
			case T__19:
			case T__26:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
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
			case NOT:
			case LiteralStringa:
				enterOuterAlt(_localctx, 11);
				{
				setState(524);
				simpleStatement();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
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
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			expression(0);
			setState(528);
			puntoVirgola();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__40);
			setState(531);
			match(T__19);
			setState(532);
			expression(0);
			setState(533);
			match(T__20);
			setState(534);
			statement();
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(535);
				match(T__41);
				setState(536);
				statement();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__42);
			setState(540);
			match(T__19);
			setState(541);
			expression(0);
			setState(542);
			match(T__20);
			setState(543);
			statement();
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
		public DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() {
			return getRuleContext(DichiarazioneVariabileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(545);
				dichiarazioneVariabileStatement();
				}
				break;
			case 2:
				{
				setState(546);
				expressionStatement();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(T__22);
			setState(550);
			match(T__19);
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__19:
			case T__26:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
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
			case NOT:
			case LiteralStringa:
				{
				setState(551);
				simpleStatement();
				}
				break;
			case T__71:
				{
				setState(552);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__19:
			case T__31:
			case T__33:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
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
			case NOT:
			case LiteralStringa:
				{
				setState(555);
				expressionStatement();
				}
				break;
			case T__71:
				{
				setState(556);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(559);
				expression(0);
				}
			}

			setState(562);
			match(T__20);
			setState(563);
			statement();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
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
		enterRule(_localctx, 90, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__43);
			setState(566);
			statement();
			setState(567);
			match(T__42);
			setState(568);
			match(T__19);
			setState(569);
			expression(0);
			setState(570);
			match(T__20);
			setState(571);
			puntoVirgola();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
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
		enterRule(_localctx, 92, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(ContinueKeyword);
			setState(574);
			puntoVirgola();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(BreakKeyword);
			setState(577);
			puntoVirgola();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__44);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(580);
				expression(0);
				}
			}

			setState(583);
			puntoVirgola();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__45);
			setState(586);
			puntoVirgola();
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
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
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
		enterRule(_localctx, 100, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__46);
			setState(589);
			chiamataFunzione();
			setState(590);
			puntoVirgola();
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

	public static class TryCatchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ListaCatchContext listaCatch() {
			return getRuleContext(ListaCatchContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tryCatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__47);
			setState(593);
			expression(0);
			setState(594);
			statement();
			setState(595);
			listaCatch();
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

	public static class ListaCatchContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListaCatchContext listaCatch() {
			return getRuleContext(ListaCatchContext.class,0);
		}
		public ListaCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterListaCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitListaCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitListaCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCatchContext listaCatch() throws RecognitionException {
		ListaCatchContext _localctx = new ListaCatchContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listaCatch);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(T__48);
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(598);
					expression(0);
					}
					break;
				case 2:
					{
					setState(599);
					match(T__19);
					setState(600);
					expression(0);
					setState(601);
					match(T__20);
					}
					break;
				}
				setState(605);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(T__48);
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(608);
					expression(0);
					}
					break;
				case 2:
					{
					setState(609);
					match(T__19);
					setState(610);
					expression(0);
					setState(611);
					match(T__20);
					}
					break;
				}
				setState(615);
				statement();
				setState(616);
				listaCatch();
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

	public static class DichiarazioneVariabileStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ListaIdentifierContext listaIdentifier() {
			return getRuleContext(ListaIdentifierContext.class,0);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile() {
			return getRuleContext(DichiarazioneVariabileContext.class,0);
		}
		public ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() {
			return getRuleContext(ListaDichiarazioneVariabiliContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 106, RULE_dichiarazioneVariabileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(620);
				match(T__49);
				setState(621);
				listaIdentifier();
				}
				break;
			case 2:
				{
				setState(622);
				dichiarazioneVariabile();
				}
				break;
			case 3:
				{
				setState(623);
				match(T__19);
				setState(624);
				listaDichiarazioneVariabili();
				setState(625);
				match(T__20);
				}
				break;
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(629);
				match(T__7);
				setState(630);
				expression(0);
				}
			}

			setState(633);
			puntoVirgola();
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
		enterRule(_localctx, 108, RULE_listaDichiarazioneVariabili);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(635);
				dichiarazioneVariabile();
				}
			}

			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(638);
				match(T__13);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					setState(639);
					dichiarazioneVariabile();
					}
				}

				}
				}
				setState(646);
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
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
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
		enterRule(_localctx, 110, RULE_listaIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__19);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11 || _la==T__39 || _la==Identifier) {
						{
						setState(648);
						identificatore();
						}
					}

					setState(651);
					match(T__13);
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(657);
				identificatore();
				}
			}

			setState(660);
			match(T__20);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public OperatoriSommaContext operatoriSomma() {
			return getRuleContext(OperatoriSommaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SolidityParser.NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PotenzaContext potenza() {
			return getRuleContext(PotenzaContext.class,0);
		}
		public OperatoriMoltiplicazioneContext operatoriMoltiplicazione() {
			return getRuleContext(OperatoriMoltiplicazioneContext.class,0);
		}
		public OperatoriRelazionaliContext operatoriRelazionali() {
			return getRuleContext(OperatoriRelazionaliContext.class,0);
		}
		public OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() {
			return getRuleContext(OperatoriConfrontoDirettoContext.class,0);
		}
		public TerminalNode AND() { return getToken(SolidityParser.AND, 0); }
		public TerminalNode OR() { return getToken(SolidityParser.OR, 0); }
		public OperatoriAssegnazioneContext operatoriAssegnazione() {
			return getRuleContext(OperatoriAssegnazioneContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(663);
				match(T__50);
				setState(664);
				nomeTipo(0);
				}
				break;
			case 2:
				{
				setState(665);
				match(T__19);
				setState(666);
				expression(0);
				setState(667);
				match(T__20);
				}
				break;
			case 3:
				{
				setState(671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__62:
					{
					setState(669);
					incremento();
					}
					break;
				case T__63:
					{
					setState(670);
					decremento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(673);
				expression(19);
				}
				break;
			case 4:
				{
				{
				setState(675);
				operatoriSomma();
				}
				setState(676);
				expression(18);
				}
				break;
			case 5:
				{
				setState(678);
				_la = _input.LA(1);
				if ( !(_la==T__51 || _la==T__52) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(679);
				expression(17);
				}
				break;
			case 6:
				{
				setState(680);
				match(NOT);
				setState(681);
				expression(16);
				}
				break;
			case 7:
				{
				setState(682);
				match(T__2);
				setState(683);
				expression(15);
				}
				break;
			case 8:
				{
				setState(684);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(753);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(688);
						potenza();
						setState(689);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(692);
						operatoriMoltiplicazione();
						}
						setState(693);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(696);
						operatoriSomma();
						}
						setState(697);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(700);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(701);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(703);
						match(T__55);
						setState(704);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(706);
						match(T__1);
						setState(707);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(709);
						match(T__56);
						setState(710);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(712);
						operatoriRelazionali();
						}
						setState(713);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(716);
						operatoriConfrontoDiretto();
						}
						setState(717);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(720);
						match(AND);
						setState(721);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(723);
						match(OR);
						setState(724);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(726);
						match(T__57);
						setState(727);
						expression(0);
						setState(728);
						match(T__58);
						setState(729);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(732);
						operatoriAssegnazione();
						}
						setState(733);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(738);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__62:
							{
							setState(736);
							incremento();
							}
							break;
						case T__63:
							{
							setState(737);
							decremento();
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
						setState(740);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(741);
						match(T__31);
						setState(742);
						expression(0);
						setState(743);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(746);
						match(T__19);
						setState(747);
						argomentiChiamataFunzione();
						setState(748);
						match(T__20);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(751);
						match(T__34);
						setState(752);
						identificatore();
						}
						break;
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		public TerminalNode LiteralBooleano() { return getToken(SolidityParser.LiteralBooleano, 0); }
		public ValoreNumericoContext valoreNumerico() {
			return getRuleContext(ValoreNumericoContext.class,0);
		}
		public TerminalNode LiteralEsadecimale() { return getToken(SolidityParser.LiteralEsadecimale, 0); }
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TipiExpressionContext tipiExpression() {
			return getRuleContext(TipiExpressionContext.class,0);
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
		enterRule(_localctx, 114, RULE_primaryExpression);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(LiteralBooleano);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				valoreNumerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				match(LiteralEsadecimale);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				match(LiteralStringa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				identificatore();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(763);
					match(T__31);
					setState(764);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(767);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(768);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(769);
				tipiExpression();
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(770);
					match(T__31);
					setState(771);
					match(T__32);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 116, RULE_listaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			expression(0);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(777);
				match(T__13);
				setState(778);
				expression(0);
				}
				}
				setState(783);
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
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
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
		enterRule(_localctx, 118, RULE_listaNameValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			nameValue();
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					match(T__13);
					setState(786);
					nameValue();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(792);
				match(T__13);
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
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			identificatore();
			setState(796);
			match(T__58);
			setState(797);
			expression(0);
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
		enterRule(_localctx, 122, RULE_argomentiChiamataFunzione);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(T__12);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__39 || _la==Identifier) {
					{
					setState(800);
					listaNameValue();
					}
				}

				setState(803);
				match(T__14);
				}
				break;
			case T__2:
			case T__11:
			case T__19:
			case T__20:
			case T__31:
			case T__33:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
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
			case NOT:
			case LiteralStringa:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(804);
					listaExpression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
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
		enterRule(_localctx, 124, RULE_chiamataFunzione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			expression(0);
			setState(810);
			match(T__19);
			setState(811);
			argomentiChiamataFunzione();
			setState(812);
			match(T__20);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 126, RULE_tupleExpression);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(T__19);
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(815);
					expression(0);
					}
				}

				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(818);
					match(T__13);
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(819);
						expression(0);
						}
					}

					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(827);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(T__31);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(829);
					expression(0);
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(830);
						match(T__13);
						setState(831);
						expression(0);
						}
						}
						setState(836);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(839);
				match(T__32);
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
		enterRule(_localctx, 128, RULE_tipiExpression);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__49:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				tipiPrimitivi();
				}
				break;
			case T__11:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				tipiDefinitiUtente();
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
		public TerminalNode NumeroDecimale() { return getToken(SolidityParser.NumeroDecimale, 0); }
		public TerminalNode NumeroEsadecimale() { return getToken(SolidityParser.NumeroEsadecimale, 0); }
		public TerminalNode UnitaNumero() { return getToken(SolidityParser.UnitaNumero, 0); }
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
		enterRule(_localctx, 130, RULE_valoreNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(_la==NumeroDecimale || _la==NumeroEsadecimale) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(847);
				match(UnitaNumero);
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
		enterRule(_localctx, 132, RULE_identificatore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__39 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TipiPrimitiviContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
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
		enterRule(_localctx, 134, RULE_tipiPrimitivi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__49) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			tipiPrimitivi();
			setState(855);
			match(T__31);
			setState(856);
			match(T__32);
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
		enterRule(_localctx, 138, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__62);
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
		enterRule(_localctx, 140, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(T__63);
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
		enterRule(_localctx, 142, RULE_operatoriSomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__65) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 144, RULE_potenza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__66);
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
		enterRule(_localctx, 146, RULE_operatoriMoltiplicazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__67 - 11)) | (1L << (T__68 - 11)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 148, RULE_operatoriRelazionali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 150, RULE_operatoriConfrontoDiretto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PuntoVirgolaContext extends ParserRuleContext {
		public PuntoVirgolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoVirgola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPuntoVirgola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPuntoVirgola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPuntoVirgola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuntoVirgolaContext puntoVirgola() throws RecognitionException {
		PuntoVirgolaContext _localctx = new PuntoVirgolaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_puntoVirgola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(T__71);
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
		enterRule(_localctx, 154, RULE_operatoriAssegnazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(_la==T__7 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return nomeTipo_sempred((NomeTipoContext)_localctx, predIndex);
		case 56:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nomeTipo_sempred(NomeTipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u036f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\7\2\u00a2\n\2\f\2"+
		"\16\2\u00a5\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00b2"+
		"\n\5\3\6\3\6\5\6\u00b6\n\6\3\7\3\7\3\b\5\b\u00bb\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\5\n\u00c8\n\n\3\n\3\n\3\n\3\n\5\n\u00ce"+
		"\n\n\3\n\3\n\5\n\u00d2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00dc\n"+
		"\n\f\n\16\n\u00df\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e6\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1\13\13\5\13\u00f3\n\13"+
		"\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u0101\n\f\3\f\5\f\u0104\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u010f\n\r\3\16\3\16\7\16\u0113\n\16\f\16\16\16\u0116\13\16\3\16\3"+
		"\16\3\16\5\16\u011b\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0124"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0130\n\20"+
		"\f\20\16\20\u0133\13\20\5\20\u0135\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u0141\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0148"+
		"\n\23\3\23\5\23\u014b\n\23\3\24\3\24\5\24\u014f\n\24\3\24\3\24\3\24\5"+
		"\24\u0154\n\24\3\24\3\24\5\24\u0158\n\24\3\25\3\25\5\25\u015c\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u016a\n\27"+
		"\f\27\16\27\u016d\13\27\3\30\3\30\3\30\3\30\5\30\u0173\n\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u017d\n\32\3\32\3\32\7\32\u0181\n"+
		"\32\f\32\16\32\u0184\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u018c\n"+
		"\33\f\33\16\33\u018f\13\33\5\33\u0191\n\33\3\33\3\33\3\34\3\34\5\34\u0197"+
		"\n\34\3\34\5\34\u019a\n\34\3\35\3\35\3\35\3\35\7\35\u01a0\n\35\f\35\16"+
		"\35\u01a3\13\35\5\35\u01a5\n\35\3\35\3\35\3\36\3\36\5\36\u01ab\n\36\3"+
		"\36\5\36\u01ae\n\36\3\37\3\37\3\37\3\37\7\37\u01b4\n\37\f\37\16\37\u01b7"+
		"\13\37\5\37\u01b9\n\37\3\37\3\37\3 \3 \5 \u01bf\n \3!\3!\5!\u01c3\n!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ce\n\"\3\"\3\"\3\"\5\"\u01d3\n"+
		"\"\3\"\7\"\u01d6\n\"\f\"\16\"\u01d9\13\"\3#\3#\3#\7#\u01de\n#\f#\16#\u01e1"+
		"\13#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\7%\u01ef\n%\f%\16%\u01f2\13%"+
		"\3%\3%\5%\u01f6\n%\3&\3&\3\'\3\'\3(\3(\7(\u01fe\n(\f(\16(\u0201\13(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0210\n)\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u021c\n+\3,\3,\3,\3,\3,\3,\3-\3-\5-\u0226\n-\3.\3.\3.\3"+
		".\5.\u022c\n.\3.\3.\5.\u0230\n.\3.\5.\u0233\n.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\5\62\u0248\n\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u025e\n\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0268\n\66\3\66\3\66\3\66\5\66\u026d\n\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u0276\n\67\3\67\3\67\5\67\u027a\n\67\3\67"+
		"\3\67\38\58\u027f\n8\38\38\58\u0283\n8\78\u0285\n8\f8\168\u0288\138\3"+
		"9\39\59\u028c\n9\39\79\u028f\n9\f9\169\u0292\139\39\59\u0295\n9\39\39"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02a2\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\5:\u02b0\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02e5\n:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\7:\u02f4\n:\f:\16:\u02f7\13:\3;\3;\3;\3;\3;\3;\3;\5;\u0300"+
		"\n;\3;\3;\3;\3;\3;\5;\u0307\n;\5;\u0309\n;\3<\3<\3<\7<\u030e\n<\f<\16"+
		"<\u0311\13<\3=\3=\3=\7=\u0316\n=\f=\16=\u0319\13=\3=\5=\u031c\n=\3>\3"+
		">\3>\3>\3?\3?\5?\u0324\n?\3?\3?\5?\u0328\n?\5?\u032a\n?\3@\3@\3@\3@\3"+
		"@\3A\3A\5A\u0333\nA\3A\3A\5A\u0337\nA\7A\u0339\nA\fA\16A\u033c\13A\3A"+
		"\3A\3A\3A\3A\7A\u0343\nA\fA\16A\u0346\13A\5A\u0348\nA\3A\5A\u034b\nA\3"+
		"B\3B\5B\u034f\nB\3C\3C\5C\u0353\nC\3D\3D\3E\3E\3F\3F\3F\3F\3G\3G\3H\3"+
		"H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\2\4BrP\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\2\21\3\2\4\n\3\2\22\24\5\2^^bbde\3\2(*"+
		"\6\2^^ccffhh\3\2\66\67\3\289\3\2WX\5\2\16\16**nn\6\2$$\64\64>@im\3\2C"+
		"D\4\2\r\rFG\3\2\6\t\3\2HI\4\2\n\nKT\2\u03b4\2\u00a3\3\2\2\2\4\u00a8\3"+
		"\2\2\2\6\u00ad\3\2\2\2\b\u00b1\3\2\2\2\n\u00b3\3\2\2\2\f\u00b7\3\2\2\2"+
		"\16\u00ba\3\2\2\2\20\u00be\3\2\2\2\22\u00e5\3\2\2\2\24\u00e7\3\2\2\2\26"+
		"\u00fd\3\2\2\2\30\u010e\3\2\2\2\32\u0110\3\2\2\2\34\u011e\3\2\2\2\36\u0127"+
		"\3\2\2\2 \u0138\3\2\2\2\"\u013d\3\2\2\2$\u0144\3\2\2\2&\u014c\3\2\2\2"+
		"(\u0159\3\2\2\2*\u0160\3\2\2\2,\u016b\3\2\2\2.\u016e\3\2\2\2\60\u0176"+
		"\3\2\2\2\62\u0178\3\2\2\2\64\u0187\3\2\2\2\66\u0194\3\2\2\28\u019b\3\2"+
		"\2\2:\u01a8\3\2\2\2<\u01af\3\2\2\2>\u01bc\3\2\2\2@\u01c0\3\2\2\2B\u01cd"+
		"\3\2\2\2D\u01da\3\2\2\2F\u01e2\3\2\2\2H\u01e9\3\2\2\2J\u01f7\3\2\2\2L"+
		"\u01f9\3\2\2\2N\u01fb\3\2\2\2P\u020f\3\2\2\2R\u0211\3\2\2\2T\u0214\3\2"+
		"\2\2V\u021d\3\2\2\2X\u0225\3\2\2\2Z\u0227\3\2\2\2\\\u0237\3\2\2\2^\u023f"+
		"\3\2\2\2`\u0242\3\2\2\2b\u0245\3\2\2\2d\u024b\3\2\2\2f\u024e\3\2\2\2h"+
		"\u0252\3\2\2\2j\u026c\3\2\2\2l\u0275\3\2\2\2n\u027e\3\2\2\2p\u0289\3\2"+
		"\2\2r\u02af\3\2\2\2t\u0308\3\2\2\2v\u030a\3\2\2\2x\u0312\3\2\2\2z\u031d"+
		"\3\2\2\2|\u0329\3\2\2\2~\u032b\3\2\2\2\u0080\u034a\3\2\2\2\u0082\u034e"+
		"\3\2\2\2\u0084\u0350\3\2\2\2\u0086\u0354\3\2\2\2\u0088\u0356\3\2\2\2\u008a"+
		"\u0358\3\2\2\2\u008c\u035c\3\2\2\2\u008e\u035e\3\2\2\2\u0090\u0360\3\2"+
		"\2\2\u0092\u0362\3\2\2\2\u0094\u0364\3\2\2\2\u0096\u0366\3\2\2\2\u0098"+
		"\u0368\3\2\2\2\u009a\u036a\3\2\2\2\u009c\u036c\3\2\2\2\u009e\u00a2\5\4"+
		"\3\2\u009f\u00a2\5\22\n\2\u00a0\u00a2\5\24\13\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\2\2\3\u00a7\3\3\2\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa\5\6\4\2"+
		"\u00aa\u00ab\5\b\5\2\u00ab\u00ac\5\u009aN\2\u00ac\5\3\2\2\2\u00ad\u00ae"+
		"\5\u0086D\2\u00ae\7\3\2\2\2\u00af\u00b2\5\n\6\2\u00b0\u00b2\5r:\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\t\3\2\2\2\u00b3\u00b5\5\16\b"+
		"\2\u00b4\u00b6\5\16\b\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\13\3\2\2\2\u00b7\u00b8\t\2\2\2\u00b8\r\3\2\2\2\u00b9\u00bb\5\f\7\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7U"+
		"\2\2\u00bd\17\3\2\2\2\u00be\u00c1\5\u0086D\2\u00bf\u00c0\7\13\2\2\u00c0"+
		"\u00c2\5\u0086D\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\21\3\2"+
		"\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c7\7r\2\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c8\5\u0086D\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00e6\5\u009aN\2\u00ca\u00cd\7\f\2\2\u00cb\u00ce\7\r\2"+
		"\2\u00cc\u00ce\5\u0086D\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d2\5\u0086D\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\16\2\2"+
		"\u00d4\u00d5\7r\2\2\u00d5\u00e6\5\u009aN\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8"+
		"\7\17\2\2\u00d8\u00dd\5\20\t\2\u00d9\u00da\7\20\2\2\u00da\u00dc\5\20\t"+
		"\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\21\2\2"+
		"\u00e1\u00e2\7\16\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\5\u009aN\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00c3\3\2\2\2\u00e5\u00ca\3\2\2\2\u00e5\u00d6\3\2"+
		"\2\2\u00e6\23\3\2\2\2\u00e7\u00e8\t\3\2\2\u00e8\u00f2\5\u0086D\2\u00e9"+
		"\u00ea\7\25\2\2\u00ea\u00ef\5\26\f\2\u00eb\u00ec\7\20\2\2\u00ec\u00ee"+
		"\5\26\f\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00e9"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\7\17\2\2"+
		"\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\7\21\2\2\u00fc\25\3\2\2\2\u00fd\u0103\5D#\2\u00fe\u0100\7\26\2"+
		"\2\u00ff\u0101\5v<\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\7\27\2\2\u0103\u00fe\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\27\3\2\2\2\u0105\u010f\5\32\16\2\u0106\u010f\5\34\17\2\u0107\u010f"+
		"\5\36\20\2\u0108\u010f\5 \21\2\u0109\u010f\5\"\22\2\u010a\u010f\5&\24"+
		"\2\u010b\u010f\5(\25\2\u010c\u010f\5.\30\2\u010d\u010f\5\62\32\2\u010e"+
		"\u0105\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2"+
		"\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\31\3\2\2\2\u0110\u0114\5B\"\2"+
		"\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u011a\5\u0086D\2\u0118\u0119\7\n\2\2\u0119\u011b\5r:\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5\u009aN\2"+
		"\u011d\33\3\2\2\2\u011e\u011f\7\30\2\2\u011f\u0120\5\u0086D\2\u0120\u0123"+
		"\7\31\2\2\u0121\u0124\7\r\2\2\u0122\u0124\5B\"\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5\u009aN\2\u0126\35\3\2"+
		"\2\2\u0127\u0128\7\32\2\2\u0128\u0129\5\u0086D\2\u0129\u0134\7\17\2\2"+
		"\u012a\u012b\5@!\2\u012b\u0131\5\u009aN\2\u012c\u012d\5@!\2\u012d\u012e"+
		"\5\u009aN\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\21\2\2\u0137\37\3\2\2\2\u0138\u0139\7\33\2\2\u0139\u013a\5\64"+
		"\33\2\u013a\u013b\5,\27\2\u013b\u013c\5N(\2\u013c!\3\2\2\2\u013d\u013e"+
		"\7\34\2\2\u013e\u0140\5\u0086D\2\u013f\u0141\5\64\33\2\u0140\u013f\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5N(\2\u0143#"+
		"\3\2\2\2\u0144\u014a\5\u0086D\2\u0145\u0147\7\26\2\2\u0146\u0148\5v<\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\7\27\2\2\u014a\u0145\3\2\2\2\u014a\u014b\3\2\2\2\u014b%\3\2\2\2\u014c"+
		"\u014e\7\35\2\2\u014d\u014f\5\u0086D\2\u014e\u014d\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\5\64\33\2\u0151\u0153\5,\27\2"+
		"\u0152\u0154\5*\26\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0158\5\u009aN\2\u0156\u0158\5N(\2\u0157\u0155\3\2\2\2"+
		"\u0157\u0156\3\2\2\2\u0158\'\3\2\2\2\u0159\u015b\7\36\2\2\u015a\u015c"+
		"\5\u0086D\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2"+
		"\2\u015d\u015e\5\64\33\2\u015e\u015f\5\u009aN\2\u015f)\3\2\2\2\u0160\u0161"+
		"\7\37\2\2\u0161\u0162\5\64\33\2\u0162+\3\2\2\2\u0163\u016a\5$\23\2\u0164"+
		"\u016a\5L\'\2\u0165\u016a\7`\2\2\u0166\u016a\7e\2\2\u0167\u016a\7b\2\2"+
		"\u0168\u016a\7d\2\2\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165"+
		"\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c-\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016e\u016f\7 \2\2\u016f\u0170\5\u0086D\2\u0170\u0172"+
		"\58\35\2\u0171\u0173\7\\\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\5\u009aN\2\u0175/\3\2\2\2\u0176\u0177\5\u0086"+
		"D\2\u0177\61\3\2\2\2\u0178\u0179\7!\2\2\u0179\u017a\5\u0086D\2\u017a\u017c"+
		"\7\17\2\2\u017b\u017d\5\60\31\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u0182\3\2\2\2\u017e\u017f\7\20\2\2\u017f\u0181\5\60\31\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\21\2\2\u0186"+
		"\63\3\2\2\2\u0187\u0190\7\26\2\2\u0188\u018d\5\66\34\2\u0189\u018a\7\20"+
		"\2\2\u018a\u018c\5\66\34\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u0190\u0188\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7\27\2\2\u0193\65\3\2\2\2\u0194\u0196\5B\"\2\u0195\u0197\5J&\2"+
		"\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a"+
		"\5\u0086D\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\67\3\2\2\2\u019b"+
		"\u01a4\7\26\2\2\u019c\u01a1\5:\36\2\u019d\u019e\7\20\2\2\u019e\u01a0\5"+
		":\36\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u019c\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\27\2\2\u01a7"+
		"9\3\2\2\2\u01a8\u01aa\5B\"\2\u01a9\u01ab\7a\2\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\5\u0086D\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae;\3\2\2\2\u01af\u01b8\7\26\2\2\u01b0"+
		"\u01b5\5> \2\u01b1\u01b2\7\20\2\2\u01b2\u01b4\5> \2\u01b3\u01b1\3\2\2"+
		"\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\7\27\2\2\u01bb=\3\2\2\2\u01bc\u01be\5B\"\2"+
		"\u01bd\u01bf\5J&\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf?\3\2"+
		"\2\2\u01c0\u01c2\5B\"\2\u01c1\u01c3\5J&\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5\u0086D\2\u01c5A\3\2\2\2\u01c6"+
		"\u01c7\b\"\1\2\u01c7\u01ce\5\u0088E\2\u01c8\u01ce\5D#\2\u01c9\u01ce\5"+
		"F$\2\u01ca\u01ce\5H%\2\u01cb\u01cc\7$\2\2\u01cc\u01ce\7c\2\2\u01cd\u01c6"+
		"\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d7\3\2\2\2\u01cf\u01d0\f\5\2\2\u01d0\u01d2\7\""+
		"\2\2\u01d1\u01d3\5r:\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\7#\2\2\u01d5\u01cf\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8C\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01da\u01df\5\u0086D\2\u01db\u01dc\7%\2\2\u01dc\u01de\5\u0086D\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0E\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7&\2\2\u01e3\u01e4"+
		"\7\26\2\2\u01e4\u01e5\5\u0088E\2\u01e5\u01e6\7\'\2\2\u01e6\u01e7\5B\""+
		"\2\u01e7\u01e8\7\27\2\2\u01e8G\3\2\2\2\u01e9\u01ea\7\35\2\2\u01ea\u01f0"+
		"\5<\37\2\u01eb\u01ef\7b\2\2\u01ec\u01ef\7`\2\2\u01ed\u01ef\5L\'\2\u01ee"+
		"\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f5\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f4\7\37\2\2\u01f4\u01f6\5<\37\2\u01f5\u01f3\3"+
		"\2\2\2\u01f5\u01f6\3\2\2\2\u01f6I\3\2\2\2\u01f7\u01f8\t\5\2\2\u01f8K\3"+
		"\2\2\2\u01f9\u01fa\t\6\2\2\u01faM\3\2\2\2\u01fb\u01ff\7\17\2\2\u01fc\u01fe"+
		"\5P)\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\21"+
		"\2\2\u0203O\3\2\2\2\u0204\u0210\5T+\2\u0205\u0210\5V,\2\u0206\u0210\5"+
		"Z.\2\u0207\u0210\5N(\2\u0208\u0210\5\\/\2\u0209\u0210\5^\60\2\u020a\u0210"+
		"\5`\61\2\u020b\u0210\5b\62\2\u020c\u0210\5d\63\2\u020d\u0210\5f\64\2\u020e"+
		"\u0210\5X-\2\u020f\u0204\3\2\2\2\u020f\u0205\3\2\2\2\u020f\u0206\3\2\2"+
		"\2\u020f\u0207\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020a"+
		"\3\2\2\2\u020f\u020b\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u020e\3\2\2\2\u0210Q\3\2\2\2\u0211\u0212\5r:\2\u0212\u0213\5\u009aN\2"+
		"\u0213S\3\2\2\2\u0214\u0215\7+\2\2\u0215\u0216\7\26\2\2\u0216\u0217\5"+
		"r:\2\u0217\u0218\7\27\2\2\u0218\u021b\5P)\2\u0219\u021a\7,\2\2\u021a\u021c"+
		"\5P)\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cU\3\2\2\2\u021d\u021e"+
		"\7-\2\2\u021e\u021f\7\26\2\2\u021f\u0220\5r:\2\u0220\u0221\7\27\2\2\u0221"+
		"\u0222\5P)\2\u0222W\3\2\2\2\u0223\u0226\5l\67\2\u0224\u0226\5R*\2\u0225"+
		"\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226Y\3\2\2\2\u0227\u0228\7\31\2\2"+
		"\u0228\u022b\7\26\2\2\u0229\u022c\5X-\2\u022a\u022c\5\u009aN\2\u022b\u0229"+
		"\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u0230\5R*\2\u022e"+
		"\u0230\5\u009aN\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0232"+
		"\3\2\2\2\u0231\u0233\5r:\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\7\27\2\2\u0235\u0236\5P)\2\u0236[\3\2\2\2\u0237"+
		"\u0238\7.\2\2\u0238\u0239\5P)\2\u0239\u023a\7-\2\2\u023a\u023b\7\26\2"+
		"\2\u023b\u023c\5r:\2\u023c\u023d\7\27\2\2\u023d\u023e\5\u009aN\2\u023e"+
		"]\3\2\2\2\u023f\u0240\7_\2\2\u0240\u0241\5\u009aN\2\u0241_\3\2\2\2\u0242"+
		"\u0243\7]\2\2\u0243\u0244\5\u009aN\2\u0244a\3\2\2\2\u0245\u0247\7/\2\2"+
		"\u0246\u0248\5r:\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024a\5\u009aN\2\u024ac\3\2\2\2\u024b\u024c\7\60\2\2\u024c"+
		"\u024d\5\u009aN\2\u024de\3\2\2\2\u024e\u024f\7\61\2\2\u024f\u0250\5~@"+
		"\2\u0250\u0251\5\u009aN\2\u0251g\3\2\2\2\u0252\u0253\7\62\2\2\u0253\u0254"+
		"\5r:\2\u0254\u0255\5P)\2\u0255\u0256\5j\66\2\u0256i\3\2\2\2\u0257\u025d"+
		"\7\63\2\2\u0258\u025e\5r:\2\u0259\u025a\7\26\2\2\u025a\u025b\5r:\2\u025b"+
		"\u025c\7\27\2\2\u025c\u025e\3\2\2\2\u025d\u0258\3\2\2\2\u025d\u0259\3"+
		"\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5P)\2\u0260\u026d\3\2\2\2\u0261"+
		"\u0267\7\63\2\2\u0262\u0268\5r:\2\u0263\u0264\7\26\2\2\u0264\u0265\5r"+
		":\2\u0265\u0266\7\27\2\2\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0267"+
		"\u0263\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5P)\2\u026a\u026b\5j\66"+
		"\2\u026b\u026d\3\2\2\2\u026c\u0257\3\2\2\2\u026c\u0261\3\2\2\2\u026dk"+
		"\3\2\2\2\u026e\u026f\7\64\2\2\u026f\u0276\5p9\2\u0270\u0276\5@!\2\u0271"+
		"\u0272\7\26\2\2\u0272\u0273\5n8\2\u0273\u0274\7\27\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u026e\3\2\2\2\u0275\u0270\3\2\2\2\u0275\u0271\3\2\2\2\u0276"+
		"\u0279\3\2\2\2\u0277\u0278\7\n\2\2\u0278\u027a\5r:\2\u0279\u0277\3\2\2"+
		"\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\5\u009aN\2\u027c"+
		"m\3\2\2\2\u027d\u027f\5@!\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0286\3\2\2\2\u0280\u0282\7\20\2\2\u0281\u0283\5@!\2\u0282\u0281\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0280\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287o\3\2\2\2"+
		"\u0288\u0286\3\2\2\2\u0289\u0290\7\26\2\2\u028a\u028c\5\u0086D\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\7\20"+
		"\2\2\u028e\u028b\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0295\5\u0086"+
		"D\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\7\27\2\2\u0297q\3\2\2\2\u0298\u0299\b:\1\2\u0299\u029a\7\65\2\2"+
		"\u029a\u02b0\5B\"\2\u029b\u029c\7\26\2\2\u029c\u029d\5r:\2\u029d\u029e"+
		"\7\27\2\2\u029e\u02b0\3\2\2\2\u029f\u02a2\5\u008cG\2\u02a0\u02a2\5\u008e"+
		"H\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\5r:\25\u02a4\u02b0\3\2\2\2\u02a5\u02a6\5\u0090I\2\u02a6\u02a7\5"+
		"r:\24\u02a7\u02b0\3\2\2\2\u02a8\u02a9\t\7\2\2\u02a9\u02b0\5r:\23\u02aa"+
		"\u02ab\7q\2\2\u02ab\u02b0\5r:\22\u02ac\u02ad\7\5\2\2\u02ad\u02b0\5r:\21"+
		"\u02ae\u02b0\5t;\2\u02af\u0298\3\2\2\2\u02af\u029b\3\2\2\2\u02af\u02a1"+
		"\3\2\2\2\u02af\u02a5\3\2\2\2\u02af\u02a8\3\2\2\2\u02af\u02aa\3\2\2\2\u02af"+
		"\u02ac\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u02f5\3\2\2\2\u02b1\u02b2\f\20"+
		"\2\2\u02b2\u02b3\5\u0092J\2\u02b3\u02b4\5r:\21\u02b4\u02f4\3\2\2\2\u02b5"+
		"\u02b6\f\17\2\2\u02b6\u02b7\5\u0094K\2\u02b7\u02b8\5r:\20\u02b8\u02f4"+
		"\3\2\2\2\u02b9\u02ba\f\16\2\2\u02ba\u02bb\5\u0090I\2\u02bb\u02bc\5r:\17"+
		"\u02bc\u02f4\3\2\2\2\u02bd\u02be\f\r\2\2\u02be\u02bf\t\b\2\2\u02bf\u02f4"+
		"\5r:\16\u02c0\u02c1\f\f\2\2\u02c1\u02c2\7:\2\2\u02c2\u02f4\5r:\r\u02c3"+
		"\u02c4\f\13\2\2\u02c4\u02c5\7\4\2\2\u02c5\u02f4\5r:\f\u02c6\u02c7\f\n"+
		"\2\2\u02c7\u02c8\7;\2\2\u02c8\u02f4\5r:\13\u02c9\u02ca\f\t\2\2\u02ca\u02cb"+
		"\5\u0096L\2\u02cb\u02cc\5r:\n\u02cc\u02f4\3\2\2\2\u02cd\u02ce\f\b\2\2"+
		"\u02ce\u02cf\5\u0098M\2\u02cf\u02d0\5r:\t\u02d0\u02f4\3\2\2\2\u02d1\u02d2"+
		"\f\7\2\2\u02d2\u02d3\7o\2\2\u02d3\u02f4\5r:\b\u02d4\u02d5\f\6\2\2\u02d5"+
		"\u02d6\7p\2\2\u02d6\u02f4\5r:\7\u02d7\u02d8\f\5\2\2\u02d8\u02d9\7<\2\2"+
		"\u02d9\u02da\5r:\2\u02da\u02db\7=\2\2\u02db\u02dc\5r:\6\u02dc\u02f4\3"+
		"\2\2\2\u02dd\u02de\f\4\2\2\u02de\u02df\5\u009cO\2\u02df\u02e0\5r:\5\u02e0"+
		"\u02f4\3\2\2\2\u02e1\u02e4\f\33\2\2\u02e2\u02e5\5\u008cG\2\u02e3\u02e5"+
		"\5\u008eH\2\u02e4\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02f4\3\2\2"+
		"\2\u02e6\u02e7\f\31\2\2\u02e7\u02e8\7\"\2\2\u02e8\u02e9\5r:\2\u02e9\u02ea"+
		"\7#\2\2\u02ea\u02f4\3\2\2\2\u02eb\u02ec\f\30\2\2\u02ec\u02ed\7\26\2\2"+
		"\u02ed\u02ee\5|?\2\u02ee\u02ef\7\27\2\2\u02ef\u02f4\3\2\2\2\u02f0\u02f1"+
		"\f\27\2\2\u02f1\u02f2\7%\2\2\u02f2\u02f4\5\u0086D\2\u02f3\u02b1\3\2\2"+
		"\2\u02f3\u02b5\3\2\2\2\u02f3\u02b9\3\2\2\2\u02f3\u02bd\3\2\2\2\u02f3\u02c0"+
		"\3\2\2\2\u02f3\u02c3\3\2\2\2\u02f3\u02c6\3\2\2\2\u02f3\u02c9\3\2\2\2\u02f3"+
		"\u02cd\3\2\2\2\u02f3\u02d1\3\2\2\2\u02f3\u02d4\3\2\2\2\u02f3\u02d7\3\2"+
		"\2\2\u02f3\u02dd\3\2\2\2\u02f3\u02e1\3\2\2\2\u02f3\u02e6\3\2\2\2\u02f3"+
		"\u02eb\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6s\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u0309"+
		"\7V\2\2\u02f9\u0309\5\u0084C\2\u02fa\u0309\7Z\2\2\u02fb\u0309\7r\2\2\u02fc"+
		"\u02ff\5\u0086D\2\u02fd\u02fe\7\"\2\2\u02fe\u0300\7#\2\2\u02ff\u02fd\3"+
		"\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0309\3\2\2\2\u0301\u0309\7g\2\2\u0302"+
		"\u0309\5\u0080A\2\u0303\u0306\5\u0082B\2\u0304\u0305\7\"\2\2\u0305\u0307"+
		"\7#\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308"+
		"\u02f8\3\2\2\2\u0308\u02f9\3\2\2\2\u0308\u02fa\3\2\2\2\u0308\u02fb\3\2"+
		"\2\2\u0308\u02fc\3\2\2\2\u0308\u0301\3\2\2\2\u0308\u0302\3\2\2\2\u0308"+
		"\u0303\3\2\2\2\u0309u\3\2\2\2\u030a\u030f\5r:\2\u030b\u030c\7\20\2\2\u030c"+
		"\u030e\5r:\2\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310w\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0317"+
		"\5z>\2\u0313\u0314\7\20\2\2\u0314\u0316\5z>\2\u0315\u0313\3\2\2\2\u0316"+
		"\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2"+
		"\2\2\u0319\u0317\3\2\2\2\u031a\u031c\7\20\2\2\u031b\u031a\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031cy\3\2\2\2\u031d\u031e\5\u0086D\2\u031e\u031f\7=\2"+
		"\2\u031f\u0320\5r:\2\u0320{\3\2\2\2\u0321\u0323\7\17\2\2\u0322\u0324\5"+
		"x=\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u032a\7\21\2\2\u0326\u0328\5v<\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u032a\3\2\2\2\u0329\u0321\3\2\2\2\u0329\u0327\3\2\2\2\u032a"+
		"}\3\2\2\2\u032b\u032c\5r:\2\u032c\u032d\7\26\2\2\u032d\u032e\5|?\2\u032e"+
		"\u032f\7\27\2\2\u032f\177\3\2\2\2\u0330\u0332\7\26\2\2\u0331\u0333\5r"+
		":\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u033a\3\2\2\2\u0334"+
		"\u0336\7\20\2\2\u0335\u0337\5r:\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u0339\3\2\2\2\u0338\u0334\3\2\2\2\u0339\u033c\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033d\u034b\7\27\2\2\u033e\u0347\7\"\2\2\u033f\u0344\5r:\2\u0340"+
		"\u0341\7\20\2\2\u0341\u0343\5r:\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2"+
		"\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0348\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u033f\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034b\7#\2\2\u034a\u0330\3\2\2\2\u034a\u033e\3\2\2\2\u034b"+
		"\u0081\3\2\2\2\u034c\u034f\5\u0088E\2\u034d\u034f\5D#\2\u034e\u034c\3"+
		"\2\2\2\u034e\u034d\3\2\2\2\u034f\u0083\3\2\2\2\u0350\u0352\t\t\2\2\u0351"+
		"\u0353\7Y\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0085\3\2"+
		"\2\2\u0354\u0355\t\n\2\2\u0355\u0087\3\2\2\2\u0356\u0357\t\13\2\2\u0357"+
		"\u0089\3\2\2\2\u0358\u0359\5\u0088E\2\u0359\u035a\7\"\2\2\u035a\u035b"+
		"\7#\2\2\u035b\u008b\3\2\2\2\u035c\u035d\7A\2\2\u035d\u008d\3\2\2\2\u035e"+
		"\u035f\7B\2\2\u035f\u008f\3\2\2\2\u0360\u0361\t\f\2\2\u0361\u0091\3\2"+
		"\2\2\u0362\u0363\7E\2\2\u0363\u0093\3\2\2\2\u0364\u0365\t\r\2\2\u0365"+
		"\u0095\3\2\2\2\u0366\u0367\t\16\2\2\u0367\u0097\3\2\2\2\u0368\u0369\t"+
		"\17\2\2\u0369\u0099\3\2\2\2\u036a\u036b\7J\2\2\u036b\u009b\3\2\2\2\u036c"+
		"\u036d\t\20\2\2\u036d\u009d\3\2\2\2`\u00a1\u00a3\u00b1\u00b5\u00ba\u00c1"+
		"\u00c7\u00cd\u00d1\u00dd\u00e5\u00ef\u00f2\u00f8\u0100\u0103\u010e\u0114"+
		"\u011a\u0123\u0131\u0134\u0140\u0147\u014a\u014e\u0153\u0157\u015b\u0169"+
		"\u016b\u0172\u017c\u0182\u018d\u0190\u0196\u0199\u01a1\u01a4\u01aa\u01ad"+
		"\u01b5\u01b8\u01be\u01c2\u01cd\u01d2\u01d7\u01df\u01ee\u01f0\u01f5\u01ff"+
		"\u020f\u021b\u0225\u022b\u022f\u0232\u0247\u025d\u0267\u026c\u0275\u0279"+
		"\u027e\u0282\u0286\u028b\u0290\u0294\u02a1\u02af\u02e4\u02f3\u02f5\u02ff"+
		"\u0306\u0308\u030f\u0317\u031b\u0323\u0327\u0329\u0332\u0336\u033a\u0344"+
		"\u0347\u034a\u034e\u0352";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}