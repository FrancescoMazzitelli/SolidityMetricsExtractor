// Generated from Solidity.g4 by ANTLR 4.7.1
package extractor.grammar;

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
		VersionLiteral=81, LiteralBooleano=82, NumeroDecimale=83, NumeroEsadecimale=84, 
		UnitaNumero=85, LiteralEsadecimale=86, ReservedKeyword=87, AnonymousKeyword=88, 
		BreakKeyword=89, ConstantKeyword=90, ContinueKeyword=91, ExternalKeyword=92, 
		IndexedKeyword=93, InternalKeyword=94, PayableKeyword=95, PrivateKeyword=96, 
		PublicKeyword=97, PureKeyword=98, TypeKeyword=99, ViewKeyword=100, Int=101, 
		Uint=102, Byte=103, Fixed=104, Ufixed=105, Identifier=106, AND=107, OR=108, 
		NOT=109, LiteralStringa=110, WS=111, COMMENTO=112, COMMENTO_LINEA=113;
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
		RULE_emitStatement = 50, RULE_dichiarazioneVariabileStatement = 51, RULE_listaDichiarazioneVariabili = 52, 
		RULE_listaIdentifier = 53, RULE_expression = 54, RULE_primaryExpression = 55, 
		RULE_listaExpression = 56, RULE_listaNameValue = 57, RULE_nameValue = 58, 
		RULE_argomentiChiamataFunzione = 59, RULE_chiamataFunzione = 60, RULE_tupleExpression = 61, 
		RULE_tipiExpression = 62, RULE_valoreNumerico = 63, RULE_identificatore = 64, 
		RULE_tipiPrimitivi = 65, RULE_array = 66, RULE_incremento = 67, RULE_decremento = 68, 
		RULE_operatoriSomma = 69, RULE_potenza = 70, RULE_operatoriMoltiplicazione = 71, 
		RULE_operatoriRelazionali = 72, RULE_operatoriConfrontoDiretto = 73, RULE_puntoVirgola = 74, 
		RULE_operatoriAssegnazione = 75;
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
		"emitStatement", "dichiarazioneVariabileStatement", "listaDichiarazioneVariabili", 
		"listaIdentifier", "expression", "primaryExpression", "listaExpression", 
		"listaNameValue", "nameValue", "argomentiChiamataFunzione", "chiamataFunzione", 
		"tupleExpression", "tipiExpression", "valoreNumerico", "identificatore", 
		"tipiPrimitivi", "array", "incremento", "decremento", "operatoriSomma", 
		"potenza", "operatoriMoltiplicazione", "operatoriRelazionali", "operatoriConfrontoDiretto", 
		"puntoVirgola", "operatoriAssegnazione"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pragma'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", "'='", "'as'", 
		"'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", "'interface'", 
		"'library'", "'is'", "'('", "')'", "'using'", "'for'", "'struct'", "'constructor'", 
		"'modifier'", "'function'", "'error'", "'returns'", "'event'", "'enum'", 
		"'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", "'memory'", "'storage'", 
		"'calldata'", "'if'", "'else'", "'while'", "'do'", "'return'", "'throw'", 
		"'emit'", "'var'", "'new'", "'after'", "'delete'", "'<<'", "'>>'", "'&'", 
		"'|'", "'?'", "':'", "'bool'", "'string'", "'byte'", "'++'", "'--'", "'+'", 
		"'-'", "'**'", "'/'", "'%'", "'=='", "'!='", "';'", "'|='", "'^='", "'&='", 
		"'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", null, null, 
		null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
		"'continue'", "'external'", "'indexed'", "'internal'", "'payable'", "'private'", 
		"'public'", "'pure'", "'type'", "'view'", null, null, null, null, null, 
		null, "'&&'", "'||'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "VersionLiteral", 
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(152);
					pragma();
					}
					break;
				case T__9:
					{
					setState(153);
					imports();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
					{
					setState(154);
					definizioneContratto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
			setState(162);
			match(T__0);
			setState(163);
			nomePragma();
			setState(164);
			valorePragma();
			setState(165);
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
			setState(167);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				versione();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
			setState(173);
			vincoloVersione();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==VersionLiteral) {
				{
				setState(174);
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
			setState(177);
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
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(179);
				operatoreVersione();
				}
			}

			setState(182);
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
			setState(184);
			identificatore();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(185);
				match(T__8);
				setState(186);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__9);
				setState(190);
				match(LiteralStringa);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(191);
					match(T__8);
					setState(192);
					identificatore();
					}
				}

				setState(195);
				puntoVirgola();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__9);
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(197);
					match(T__10);
					}
					break;
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(198);
					identificatore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(201);
					match(T__8);
					setState(202);
					identificatore();
					}
				}

				setState(205);
				match(T__11);
				setState(206);
				match(LiteralStringa);
				setState(207);
				puntoVirgola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(T__9);
				setState(209);
				match(T__12);
				setState(210);
				dichiarazioneImport();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(211);
					match(T__13);
					setState(212);
					dichiarazioneImport();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__14);
				setState(219);
				match(T__11);
				setState(220);
				match(LiteralStringa);
				setState(221);
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
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226);
			identificatore();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(227);
				match(T__18);
				setState(228);
				inheritanceSpecifier();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(229);
					match(T__13);
					setState(230);
					inheritanceSpecifier();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			match(T__12);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				{
				setState(239);
				parteDiContratto();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
			setState(247);
			tipiDefinitiUtente();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(248);
				match(T__19);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(249);
					listaExpression();
					}
				}

				setState(252);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				assegnazioneVariabile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				definizioneStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				definizioneCostruttore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				definizioneModifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				definizioneFunzione();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				definizioneErrore();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				definizioneEvento();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
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
			setState(266);
			nomeTipo(0);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)))) != 0)) {
				{
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			identificatore();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(274);
				match(T__7);
				setState(275);
				expression(0);
				}
			}

			setState(278);
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
			setState(280);
			match(T__21);
			setState(281);
			identificatore();
			setState(282);
			match(T__22);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(283);
				match(T__10);
				}
				break;
			case T__11:
			case T__26:
			case T__33:
			case T__35:
			case T__39:
			case T__47:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(284);
				nomeTipo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
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
			setState(289);
			match(T__23);
			setState(290);
			identificatore();
			setState(291);
			match(T__12);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(292);
				dichiarazioneVariabile();
				setState(293);
				puntoVirgola();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					{
					setState(294);
					dichiarazioneVariabile();
					setState(295);
					puntoVirgola();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(304);
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
			setState(306);
			match(T__24);
			setState(307);
			listaParametri();
			setState(308);
			listaModifier();
			setState(309);
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
			setState(311);
			match(T__25);
			setState(312);
			identificatore();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(313);
				listaParametri();
				}
			}

			setState(316);
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
			setState(318);
			identificatore();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(319);
				match(T__19);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(320);
					listaExpression();
					}
				}

				setState(323);
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
			setState(326);
			match(T__26);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(327);
				identificatore();
				}
			}

			setState(330);
			listaParametri();
			setState(331);
			listaModifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(332);
				valoreRitorno();
				}
			}

			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__69:
				{
				setState(335);
				puntoVirgola();
				}
				break;
			case T__12:
				{
				setState(336);
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
			setState(339);
			match(T__27);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(340);
				identificatore();
				}
			}

			setState(343);
			listaParametri();
			setState(344);
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
			setState(346);
			match(T__28);
			setState(347);
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
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__39 || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (ExternalKeyword - 90)) | (1L << (InternalKeyword - 90)) | (1L << (PayableKeyword - 90)) | (1L << (PrivateKeyword - 90)) | (1L << (PublicKeyword - 90)) | (1L << (PureKeyword - 90)) | (1L << (ViewKeyword - 90)) | (1L << (Identifier - 90)))) != 0)) {
				{
				setState(355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__39:
				case Identifier:
					{
					setState(349);
					invocazioneModifier();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(350);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(351);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(352);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(353);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(354);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(359);
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
			setState(360);
			match(T__29);
			setState(361);
			identificatore();
			setState(362);
			listaParametriEvent();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(363);
				match(AnonymousKeyword);
				}
			}

			setState(366);
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
			setState(368);
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
			setState(370);
			match(T__30);
			setState(371);
			identificatore();
			setState(372);
			match(T__12);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(373);
				valoreEnum();
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(376);
				match(T__13);
				setState(377);
				valoreEnum();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
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
			setState(385);
			match(T__19);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(386);
				parametro();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(387);
					match(T__13);
					setState(388);
					parametro();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(396);
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
			setState(398);
			nomeTipo(0);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(399);
				tipoStorage();
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(402);
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
			setState(405);
			match(T__19);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(406);
				parametriEvent();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(407);
					match(T__13);
					setState(408);
					parametriEvent();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(416);
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
			setState(418);
			nomeTipo(0);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(419);
				match(IndexedKeyword);
				}
			}

			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(422);
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
			setState(425);
			match(T__19);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(426);
				parametroFunzione();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(427);
					match(T__13);
					setState(428);
					parametroFunzione();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
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
			setState(438);
			nomeTipo(0);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				setState(439);
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
			setState(442);
			nomeTipo(0);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(443);
				tipoStorage();
				}
				break;
			}
			setState(446);
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
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(449);
				tipiPrimitivi();
				}
				break;
			case 2:
				{
				setState(450);
				tipiDefinitiUtente();
				}
				break;
			case 3:
				{
				setState(451);
				mapping();
				}
				break;
			case 4:
				{
				setState(452);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(453);
				match(T__33);
				setState(454);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
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
					setState(457);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(458);
					match(T__31);
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(459);
						expression(0);
						}
					}

					setState(462);
					match(T__32);
					}
					} 
				}
				setState(467);
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
			setState(468);
			identificatore();
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					match(T__34);
					setState(470);
					identificatore();
					}
					} 
				}
				setState(475);
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
			setState(476);
			match(T__35);
			setState(477);
			match(T__19);
			setState(478);
			tipiPrimitivi();
			setState(479);
			match(T__36);
			setState(480);
			nomeTipo(0);
			setState(481);
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
			setState(483);
			match(T__26);
			setState(484);
			listaParametriFunzione();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(488);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(485);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(486);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(487);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(493);
				match(T__28);
				setState(494);
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
			setState(497);
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
			setState(499);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ConstantKeyword - 90)) | (1L << (PayableKeyword - 90)) | (1L << (PureKeyword - 90)) | (1L << (ViewKeyword - 90)))) != 0)) ) {
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
			setState(501);
			match(T__12);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				{
				setState(502);
				statement();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
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
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				whileStatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 6);
				{
				setState(515);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				breakStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(517);
				returnStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(518);
				throwStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(519);
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
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
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
				setState(520);
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
			setState(523);
			expression(0);
			setState(524);
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
			setState(526);
			match(T__40);
			setState(527);
			match(T__19);
			setState(528);
			expression(0);
			setState(529);
			match(T__20);
			setState(530);
			statement();
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(531);
				match(T__41);
				setState(532);
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
			setState(535);
			match(T__42);
			setState(536);
			match(T__19);
			setState(537);
			expression(0);
			setState(538);
			match(T__20);
			setState(539);
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
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(541);
				dichiarazioneVariabileStatement();
				}
				break;
			case 2:
				{
				setState(542);
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
			setState(545);
			match(T__22);
			setState(546);
			match(T__19);
			setState(549);
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
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
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
				setState(547);
				simpleStatement();
				}
				break;
			case T__69:
				{
				setState(548);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__19:
			case T__31:
			case T__33:
			case T__39:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
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
				expressionStatement();
				}
				break;
			case T__69:
				{
				setState(552);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(555);
				expression(0);
				}
			}

			setState(558);
			match(T__20);
			setState(559);
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
			setState(561);
			match(T__43);
			setState(562);
			statement();
			setState(563);
			match(T__42);
			setState(564);
			match(T__19);
			setState(565);
			expression(0);
			setState(566);
			match(T__20);
			setState(567);
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
			setState(569);
			match(ContinueKeyword);
			setState(570);
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
			setState(572);
			match(BreakKeyword);
			setState(573);
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
			setState(575);
			match(T__44);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
				{
				setState(576);
				expression(0);
				}
			}

			setState(579);
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
			setState(581);
			match(T__45);
			setState(582);
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
			setState(584);
			match(T__46);
			setState(585);
			chiamataFunzione();
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
		enterRule(_localctx, 102, RULE_dichiarazioneVariabileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(588);
				match(T__47);
				setState(589);
				listaIdentifier();
				}
				break;
			case 2:
				{
				setState(590);
				dichiarazioneVariabile();
				}
				break;
			case 3:
				{
				setState(591);
				match(T__19);
				setState(592);
				listaDichiarazioneVariabili();
				setState(593);
				match(T__20);
				}
				break;
			}
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(597);
				match(T__7);
				setState(598);
				expression(0);
				}
			}

			setState(601);
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
		enterRule(_localctx, 104, RULE_listaDichiarazioneVariabili);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				setState(603);
				dichiarazioneVariabile();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(606);
				match(T__13);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__26) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
					{
					setState(607);
					dichiarazioneVariabile();
					}
				}

				}
				}
				setState(614);
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
		enterRule(_localctx, 106, RULE_listaIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(T__19);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11 || _la==T__39 || _la==Identifier) {
						{
						setState(616);
						identificatore();
						}
					}

					setState(619);
					match(T__13);
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__39 || _la==Identifier) {
				{
				setState(625);
				identificatore();
				}
			}

			setState(628);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(631);
				match(T__48);
				setState(632);
				nomeTipo(0);
				}
				break;
			case 2:
				{
				setState(633);
				match(T__19);
				setState(634);
				expression(0);
				setState(635);
				match(T__20);
				}
				break;
			case 3:
				{
				setState(639);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__60:
					{
					setState(637);
					incremento();
					}
					break;
				case T__61:
					{
					setState(638);
					decremento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(641);
				expression(19);
				}
				break;
			case 4:
				{
				{
				setState(643);
				operatoriSomma();
				}
				setState(644);
				expression(18);
				}
				break;
			case 5:
				{
				setState(646);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__50) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(647);
				expression(17);
				}
				break;
			case 6:
				{
				setState(648);
				match(NOT);
				setState(649);
				expression(16);
				}
				break;
			case 7:
				{
				setState(650);
				match(T__2);
				setState(651);
				expression(15);
				}
				break;
			case 8:
				{
				setState(652);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(721);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(655);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(656);
						potenza();
						setState(657);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(660);
						operatoriMoltiplicazione();
						}
						setState(661);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						{
						setState(664);
						operatoriSomma();
						}
						setState(665);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(667);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(668);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(669);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(670);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(671);
						match(T__53);
						setState(672);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(673);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(674);
						match(T__1);
						setState(675);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(676);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(677);
						match(T__54);
						setState(678);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(679);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(680);
						operatoriRelazionali();
						}
						setState(681);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(684);
						operatoriConfrontoDiretto();
						}
						setState(685);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(688);
						match(AND);
						setState(689);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(691);
						match(OR);
						setState(692);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(694);
						match(T__55);
						setState(695);
						expression(0);
						setState(696);
						match(T__56);
						setState(697);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(700);
						operatoriAssegnazione();
						}
						setState(701);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(706);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__60:
							{
							setState(704);
							incremento();
							}
							break;
						case T__61:
							{
							setState(705);
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
						setState(708);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(709);
						match(T__31);
						setState(710);
						expression(0);
						setState(711);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(714);
						match(T__19);
						setState(715);
						argomentiChiamataFunzione();
						setState(716);
						match(T__20);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(719);
						match(T__34);
						setState(720);
						identificatore();
						}
						break;
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 110, RULE_primaryExpression);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(LiteralBooleano);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				valoreNumerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				match(LiteralEsadecimale);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				match(LiteralStringa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				identificatore();
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(731);
					match(T__31);
					setState(732);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				tipiExpression();
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(738);
					match(T__31);
					setState(739);
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
		enterRule(_localctx, 112, RULE_listaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			expression(0);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(745);
				match(T__13);
				setState(746);
				expression(0);
				}
				}
				setState(751);
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
		enterRule(_localctx, 114, RULE_listaNameValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			nameValue();
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(753);
					match(T__13);
					setState(754);
					nameValue();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(760);
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
		enterRule(_localctx, 116, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			identificatore();
			setState(764);
			match(T__56);
			setState(765);
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
		enterRule(_localctx, 118, RULE_argomentiChiamataFunzione);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(T__12);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__39 || _la==Identifier) {
					{
					setState(768);
					listaNameValue();
					}
				}

				setState(771);
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
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
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
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(772);
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
		enterRule(_localctx, 120, RULE_chiamataFunzione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			expression(0);
			setState(778);
			match(T__19);
			setState(779);
			argomentiChiamataFunzione();
			setState(780);
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
		enterRule(_localctx, 122, RULE_tupleExpression);
		int _la;
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(T__19);
				{
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(783);
					expression(0);
					}
				}

				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(786);
					match(T__13);
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
						{
						setState(787);
						expression(0);
						}
					}

					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(795);
				match(T__20);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(T__31);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__19) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (LiteralBooleano - 64)) | (1L << (NumeroDecimale - 64)) | (1L << (NumeroEsadecimale - 64)) | (1L << (LiteralEsadecimale - 64)) | (1L << (TypeKeyword - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)) | (1L << (NOT - 64)) | (1L << (LiteralStringa - 64)))) != 0)) {
					{
					setState(797);
					expression(0);
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(798);
						match(T__13);
						setState(799);
						expression(0);
						}
						}
						setState(804);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(807);
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
		enterRule(_localctx, 124, RULE_tipiExpression);
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__47:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				tipiPrimitivi();
				}
				break;
			case T__11:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
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
		enterRule(_localctx, 126, RULE_valoreNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==NumeroDecimale || _la==NumeroEsadecimale) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(815);
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
		enterRule(_localctx, 128, RULE_identificatore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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
		enterRule(_localctx, 130, RULE_tipiPrimitivi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__47) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)))) != 0)) ) {
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
		enterRule(_localctx, 132, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			tipiPrimitivi();
			setState(823);
			match(T__31);
			setState(824);
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
		enterRule(_localctx, 134, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(T__60);
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
		enterRule(_localctx, 136, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(T__61);
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
		enterRule(_localctx, 138, RULE_operatoriSomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(_la==T__62 || _la==T__63) ) {
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
		enterRule(_localctx, 140, RULE_potenza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(T__64);
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
		enterRule(_localctx, 142, RULE_operatoriMoltiplicazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__65 - 11)) | (1L << (T__66 - 11)))) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_operatoriRelazionali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		enterRule(_localctx, 146, RULE_operatoriConfrontoDiretto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__68) ) {
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
		enterRule(_localctx, 148, RULE_puntoVirgola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(T__69);
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
		enterRule(_localctx, 150, RULE_operatoriAssegnazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if ( !(_la==T__7 || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)))) != 0)) ) {
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
		case 54:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u034f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\5"+
		"\6\u00b2\n\6\3\7\3\7\3\b\5\b\u00b7\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00be\n"+
		"\t\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\3\n\3\n\5\n\u00ca\n\n\3\n\3\n"+
		"\5\n\u00ce\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d8\n\n\f\n\16\n"+
		"\u00db\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ea\n\13\f\13\16\13\u00ed\13\13\5\13\u00ef\n\13\3\13\3\13"+
		"\7\13\u00f3\n\13\f\13\16\13\u00f6\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u00fd"+
		"\n\f\3\f\5\f\u0100\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010b\n"+
		"\r\3\16\3\16\7\16\u010f\n\16\f\16\16\16\u0112\13\16\3\16\3\16\3\16\5\16"+
		"\u0117\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0120\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012c\n\20\f\20\16\20"+
		"\u012f\13\20\5\20\u0131\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\5\22\u013d\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0144\n\23\3\23"+
		"\5\23\u0147\n\23\3\24\3\24\5\24\u014b\n\24\3\24\3\24\3\24\5\24\u0150\n"+
		"\24\3\24\3\24\5\24\u0154\n\24\3\25\3\25\5\25\u0158\n\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0166\n\27\f\27\16"+
		"\27\u0169\13\27\3\30\3\30\3\30\3\30\5\30\u016f\n\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\5\32\u0179\n\32\3\32\3\32\7\32\u017d\n\32\f\32\16"+
		"\32\u0180\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0188\n\33\f\33\16"+
		"\33\u018b\13\33\5\33\u018d\n\33\3\33\3\33\3\34\3\34\5\34\u0193\n\34\3"+
		"\34\5\34\u0196\n\34\3\35\3\35\3\35\3\35\7\35\u019c\n\35\f\35\16\35\u019f"+
		"\13\35\5\35\u01a1\n\35\3\35\3\35\3\36\3\36\5\36\u01a7\n\36\3\36\5\36\u01aa"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u01b0\n\37\f\37\16\37\u01b3\13\37\5\37"+
		"\u01b5\n\37\3\37\3\37\3 \3 \5 \u01bb\n \3!\3!\5!\u01bf\n!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ca\n\"\3\"\3\"\3\"\5\"\u01cf\n\"\3\"\7\""+
		"\u01d2\n\"\f\"\16\"\u01d5\13\"\3#\3#\3#\7#\u01da\n#\f#\16#\u01dd\13#\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\7%\u01eb\n%\f%\16%\u01ee\13%\3%\3%"+
		"\5%\u01f2\n%\3&\3&\3\'\3\'\3(\3(\7(\u01fa\n(\f(\16(\u01fd\13(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u020c\n)\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u0218\n+\3,\3,\3,\3,\3,\3,\3-\3-\5-\u0222\n-\3.\3.\3.\3.\5.\u0228"+
		"\n.\3.\3.\5.\u022c\n.\3.\5.\u022f\n.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\5\62\u0244\n\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0256\n\65\3\65\3\65\5\65\u025a\n\65\3\65\3\65\3\66\5\66\u025f\n\66\3"+
		"\66\3\66\5\66\u0263\n\66\7\66\u0265\n\66\f\66\16\66\u0268\13\66\3\67\3"+
		"\67\5\67\u026c\n\67\3\67\7\67\u026f\n\67\f\67\16\67\u0272\13\67\3\67\5"+
		"\67\u0275\n\67\3\67\3\67\38\38\38\38\38\38\38\38\38\58\u0282\n8\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\58\u0290\n8\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02c5\n8"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u02d4\n8\f8\168\u02d7\138\3"+
		"9\39\39\39\39\39\39\59\u02e0\n9\39\39\39\39\39\59\u02e7\n9\59\u02e9\n"+
		"9\3:\3:\3:\7:\u02ee\n:\f:\16:\u02f1\13:\3;\3;\3;\7;\u02f6\n;\f;\16;\u02f9"+
		"\13;\3;\5;\u02fc\n;\3<\3<\3<\3<\3=\3=\5=\u0304\n=\3=\3=\5=\u0308\n=\5"+
		"=\u030a\n=\3>\3>\3>\3>\3>\3?\3?\5?\u0313\n?\3?\3?\5?\u0317\n?\7?\u0319"+
		"\n?\f?\16?\u031c\13?\3?\3?\3?\3?\3?\7?\u0323\n?\f?\16?\u0326\13?\5?\u0328"+
		"\n?\3?\5?\u032b\n?\3@\3@\5@\u032f\n@\3A\3A\5A\u0333\nA\3B\3B\3C\3C\3D"+
		"\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\2\4"+
		"BnN\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\2\21\3\2\4\n\3\2\22\24\5\2\\\\``"+
		"bc\3\2(*\6\2\\\\aaddff\3\2\64\65\3\2\66\67\3\2UV\5\2\16\16**ll\6\2$$\62"+
		"\62<>gk\3\2AB\4\2\r\rDE\3\2\6\t\3\2FG\4\2\n\nIR\2\u0393\2\u009f\3\2\2"+
		"\2\4\u00a4\3\2\2\2\6\u00a9\3\2\2\2\b\u00ad\3\2\2\2\n\u00af\3\2\2\2\f\u00b3"+
		"\3\2\2\2\16\u00b6\3\2\2\2\20\u00ba\3\2\2\2\22\u00e1\3\2\2\2\24\u00e3\3"+
		"\2\2\2\26\u00f9\3\2\2\2\30\u010a\3\2\2\2\32\u010c\3\2\2\2\34\u011a\3\2"+
		"\2\2\36\u0123\3\2\2\2 \u0134\3\2\2\2\"\u0139\3\2\2\2$\u0140\3\2\2\2&\u0148"+
		"\3\2\2\2(\u0155\3\2\2\2*\u015c\3\2\2\2,\u0167\3\2\2\2.\u016a\3\2\2\2\60"+
		"\u0172\3\2\2\2\62\u0174\3\2\2\2\64\u0183\3\2\2\2\66\u0190\3\2\2\28\u0197"+
		"\3\2\2\2:\u01a4\3\2\2\2<\u01ab\3\2\2\2>\u01b8\3\2\2\2@\u01bc\3\2\2\2B"+
		"\u01c9\3\2\2\2D\u01d6\3\2\2\2F\u01de\3\2\2\2H\u01e5\3\2\2\2J\u01f3\3\2"+
		"\2\2L\u01f5\3\2\2\2N\u01f7\3\2\2\2P\u020b\3\2\2\2R\u020d\3\2\2\2T\u0210"+
		"\3\2\2\2V\u0219\3\2\2\2X\u0221\3\2\2\2Z\u0223\3\2\2\2\\\u0233\3\2\2\2"+
		"^\u023b\3\2\2\2`\u023e\3\2\2\2b\u0241\3\2\2\2d\u0247\3\2\2\2f\u024a\3"+
		"\2\2\2h\u0255\3\2\2\2j\u025e\3\2\2\2l\u0269\3\2\2\2n\u028f\3\2\2\2p\u02e8"+
		"\3\2\2\2r\u02ea\3\2\2\2t\u02f2\3\2\2\2v\u02fd\3\2\2\2x\u0309\3\2\2\2z"+
		"\u030b\3\2\2\2|\u032a\3\2\2\2~\u032e\3\2\2\2\u0080\u0330\3\2\2\2\u0082"+
		"\u0334\3\2\2\2\u0084\u0336\3\2\2\2\u0086\u0338\3\2\2\2\u0088\u033c\3\2"+
		"\2\2\u008a\u033e\3\2\2\2\u008c\u0340\3\2\2\2\u008e\u0342\3\2\2\2\u0090"+
		"\u0344\3\2\2\2\u0092\u0346\3\2\2\2\u0094\u0348\3\2\2\2\u0096\u034a\3\2"+
		"\2\2\u0098\u034c\3\2\2\2\u009a\u009e\5\4\3\2\u009b\u009e\5\22\n\2\u009c"+
		"\u009e\5\24\13\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\2\2\3\u00a3\3\3\2\2\2"+
		"\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8"+
		"\5\u0096L\2\u00a8\5\3\2\2\2\u00a9\u00aa\5\u0082B\2\u00aa\7\3\2\2\2\u00ab"+
		"\u00ae\5\n\6\2\u00ac\u00ae\5n8\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\t\3\2\2\2\u00af\u00b1\5\16\b\2\u00b0\u00b2\5\16\b\2\u00b1\u00b0"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\t\2\2\2\u00b4"+
		"\r\3\2\2\2\u00b5\u00b7\5\f\7\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7S\2\2\u00b9\17\3\2\2\2\u00ba\u00bd\5"+
		"\u0082B\2\u00bb\u00bc\7\13\2\2\u00bc\u00be\5\u0082B\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c3"+
		"\7p\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c4\5\u0082B\2\u00c3\u00c1\3\2\2"+
		"\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00e2\5\u0096L\2\u00c6"+
		"\u00c9\7\f\2\2\u00c7\u00ca\7\r\2\2\u00c8\u00ca\5\u0082B\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\7\13\2\2"+
		"\u00cc\u00ce\5\u0082B\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\7p\2\2\u00d1\u00e2\5\u0096"+
		"L\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d9\5\20\t\2\u00d5"+
		"\u00d6\7\20\2\2\u00d6\u00d8\5\20\t\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\7\16\2\2\u00de\u00df\7"+
		"p\2\2\u00df\u00e0\5\u0096L\2\u00e0\u00e2\3\2\2\2\u00e1\u00bf\3\2\2\2\u00e1"+
		"\u00c6\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e2\23\3\2\2\2\u00e3\u00e4\t\3\2"+
		"\2\u00e4\u00ee\5\u0082B\2\u00e5\u00e6\7\25\2\2\u00e6\u00eb\5\26\f\2\u00e7"+
		"\u00e8\7\20\2\2\u00e8\u00ea\5\26\f\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f4\7\17\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\21\2\2\u00f8\25\3\2\2\2\u00f9\u00ff"+
		"\5D#\2\u00fa\u00fc\7\26\2\2\u00fb\u00fd\5r:\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\7\27\2\2\u00ff\u00fa\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\27\3\2\2\2\u0101\u010b\5\32\16\2\u0102"+
		"\u010b\5\34\17\2\u0103\u010b\5\36\20\2\u0104\u010b\5 \21\2\u0105\u010b"+
		"\5\"\22\2\u0106\u010b\5&\24\2\u0107\u010b\5(\25\2\u0108\u010b\5.\30\2"+
		"\u0109\u010b\5\62\32\2\u010a\u0101\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0103"+
		"\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\31\3\2\2"+
		"\2\u010c\u0110\5B\"\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\5\u0082B\2\u0114\u0115\7\n\2\2\u0115\u0117"+
		"\5n8\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\5\u0096L\2\u0119\33\3\2\2\2\u011a\u011b\7\30\2\2\u011b\u011c\5"+
		"\u0082B\2\u011c\u011f\7\31\2\2\u011d\u0120\7\r\2\2\u011e\u0120\5B\"\2"+
		"\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\5\u0096L\2\u0122\35\3\2\2\2\u0123\u0124\7\32\2\2\u0124\u0125\5\u0082"+
		"B\2\u0125\u0130\7\17\2\2\u0126\u0127\5@!\2\u0127\u012d\5\u0096L\2\u0128"+
		"\u0129\5@!\2\u0129\u012a\5\u0096L\2\u012a\u012c\3\2\2\2\u012b\u0128\3"+
		"\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\21\2\2\u0133\37\3\2\2\2\u0134\u0135"+
		"\7\33\2\2\u0135\u0136\5\64\33\2\u0136\u0137\5,\27\2\u0137\u0138\5N(\2"+
		"\u0138!\3\2\2\2\u0139\u013a\7\34\2\2\u013a\u013c\5\u0082B\2\u013b\u013d"+
		"\5\64\33\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\u013f\5N(\2\u013f#\3\2\2\2\u0140\u0146\5\u0082B\2\u0141\u0143\7"+
		"\26\2\2\u0142\u0144\5r:\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\7\27\2\2\u0146\u0141\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147%\3\2\2\2\u0148\u014a\7\35\2\2\u0149\u014b\5\u0082B\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\5\64"+
		"\33\2\u014d\u014f\5,\27\2\u014e\u0150\5*\26\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0154\5\u0096L\2\u0152\u0154"+
		"\5N(\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\'\3\2\2\2\u0155\u0157"+
		"\7\36\2\2\u0156\u0158\5\u0082B\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\5\64\33\2\u015a\u015b\5\u0096L\2\u015b"+
		")\3\2\2\2\u015c\u015d\7\37\2\2\u015d\u015e\5\64\33\2\u015e+\3\2\2\2\u015f"+
		"\u0166\5$\23\2\u0160\u0166\5L\'\2\u0161\u0166\7^\2\2\u0162\u0166\7c\2"+
		"\2\u0163\u0166\7`\2\2\u0164\u0166\7b\2\2\u0165\u015f\3\2\2\2\u0165\u0160"+
		"\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168-\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7 \2\2\u016b\u016c"+
		"\5\u0082B\2\u016c\u016e\58\35\2\u016d\u016f\7Z\2\2\u016e\u016d\3\2\2\2"+
		"\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\u0096L\2\u0171"+
		"/\3\2\2\2\u0172\u0173\5\u0082B\2\u0173\61\3\2\2\2\u0174\u0175\7!\2\2\u0175"+
		"\u0176\5\u0082B\2\u0176\u0178\7\17\2\2\u0177\u0179\5\60\31\2\u0178\u0177"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017e\3\2\2\2\u017a\u017b\7\20\2\2"+
		"\u017b\u017d\5\60\31\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\7\21\2\2\u0182\63\3\2\2\2\u0183\u018c\7\26\2\2\u0184\u0189\5\66"+
		"\34\2\u0185\u0186\7\20\2\2\u0186\u0188\5\66\34\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7\27\2\2\u018f\65\3\2\2\2\u0190\u0192\5B\""+
		"\2\u0191\u0193\5J&\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195"+
		"\3\2\2\2\u0194\u0196\5\u0082B\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2"+
		"\2\u0196\67\3\2\2\2\u0197\u01a0\7\26\2\2\u0198\u019d\5:\36\2\u0199\u019a"+
		"\7\20\2\2\u019a\u019c\5:\36\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u0198\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\7\27\2\2\u01a39\3\2\2\2\u01a4\u01a6\5B\"\2\u01a5\u01a7\7_\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5\u0082"+
		"B\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa;\3\2\2\2\u01ab\u01b4"+
		"\7\26\2\2\u01ac\u01b1\5> \2\u01ad\u01ae\7\20\2\2\u01ae\u01b0\5> \2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\27\2\2\u01b7=\3\2\2\2"+
		"\u01b8\u01ba\5B\"\2\u01b9\u01bb\5J&\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb?\3\2\2\2\u01bc\u01be\5B\"\2\u01bd\u01bf\5J&\2\u01be\u01bd"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5\u0082B"+
		"\2\u01c1A\3\2\2\2\u01c2\u01c3\b\"\1\2\u01c3\u01ca\5\u0084C\2\u01c4\u01ca"+
		"\5D#\2\u01c5\u01ca\5F$\2\u01c6\u01ca\5H%\2\u01c7\u01c8\7$\2\2\u01c8\u01ca"+
		"\7a\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9"+
		"\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01d3\3\2\2\2\u01cb\u01cc\f\5"+
		"\2\2\u01cc\u01ce\7\"\2\2\u01cd\u01cf\5n8\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\7#\2\2\u01d1\u01cb\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4C\3\2\2\2"+
		"\u01d5\u01d3\3\2\2\2\u01d6\u01db\5\u0082B\2\u01d7\u01d8\7%\2\2\u01d8\u01da"+
		"\5\u0082B\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2"+
		"\2\u01db\u01dc\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df"+
		"\7&\2\2\u01df\u01e0\7\26\2\2\u01e0\u01e1\5\u0084C\2\u01e1\u01e2\7\'\2"+
		"\2\u01e2\u01e3\5B\"\2\u01e3\u01e4\7\27\2\2\u01e4G\3\2\2\2\u01e5\u01e6"+
		"\7\35\2\2\u01e6\u01ec\5<\37\2\u01e7\u01eb\7`\2\2\u01e8\u01eb\7^\2\2\u01e9"+
		"\u01eb\5L\'\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f1\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\37\2\2\u01f0\u01f2\5"+
		"<\37\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2I\3\2\2\2\u01f3\u01f4"+
		"\t\5\2\2\u01f4K\3\2\2\2\u01f5\u01f6\t\6\2\2\u01f6M\3\2\2\2\u01f7\u01fb"+
		"\7\17\2\2\u01f8\u01fa\5P)\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fe\u01ff\7\21\2\2\u01ffO\3\2\2\2\u0200\u020c\5T+\2\u0201\u020c"+
		"\5V,\2\u0202\u020c\5Z.\2\u0203\u020c\5N(\2\u0204\u020c\5\\/\2\u0205\u020c"+
		"\5^\60\2\u0206\u020c\5`\61\2\u0207\u020c\5b\62\2\u0208\u020c\5d\63\2\u0209"+
		"\u020c\5f\64\2\u020a\u020c\5X-\2\u020b\u0200\3\2\2\2\u020b\u0201\3\2\2"+
		"\2\u020b\u0202\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u0205"+
		"\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3\2\2\2\u020b\u0208\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020cQ\3\2\2\2\u020d\u020e\5n8\2\u020e"+
		"\u020f\5\u0096L\2\u020fS\3\2\2\2\u0210\u0211\7+\2\2\u0211\u0212\7\26\2"+
		"\2\u0212\u0213\5n8\2\u0213\u0214\7\27\2\2\u0214\u0217\5P)\2\u0215\u0216"+
		"\7,\2\2\u0216\u0218\5P)\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"U\3\2\2\2\u0219\u021a\7-\2\2\u021a\u021b\7\26\2\2\u021b\u021c\5n8\2\u021c"+
		"\u021d\7\27\2\2\u021d\u021e\5P)\2\u021eW\3\2\2\2\u021f\u0222\5h\65\2\u0220"+
		"\u0222\5R*\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222Y\3\2\2\2\u0223"+
		"\u0224\7\31\2\2\u0224\u0227\7\26\2\2\u0225\u0228\5X-\2\u0226\u0228\5\u0096"+
		"L\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u022c\5R*\2\u022a\u022c\5\u0096L\2\u022b\u0229\3\2\2\2\u022b\u022a\3"+
		"\2\2\2\u022c\u022e\3\2\2\2\u022d\u022f\5n8\2\u022e\u022d\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\27\2\2\u0231\u0232\5"+
		"P)\2\u0232[\3\2\2\2\u0233\u0234\7.\2\2\u0234\u0235\5P)\2\u0235\u0236\7"+
		"-\2\2\u0236\u0237\7\26\2\2\u0237\u0238\5n8\2\u0238\u0239\7\27\2\2\u0239"+
		"\u023a\5\u0096L\2\u023a]\3\2\2\2\u023b\u023c\7]\2\2\u023c\u023d\5\u0096"+
		"L\2\u023d_\3\2\2\2\u023e\u023f\7[\2\2\u023f\u0240\5\u0096L\2\u0240a\3"+
		"\2\2\2\u0241\u0243\7/\2\2\u0242\u0244\5n8\2\u0243\u0242\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\u0096L\2\u0246c\3\2\2"+
		"\2\u0247\u0248\7\60\2\2\u0248\u0249\5\u0096L\2\u0249e\3\2\2\2\u024a\u024b"+
		"\7\61\2\2\u024b\u024c\5z>\2\u024c\u024d\5\u0096L\2\u024dg\3\2\2\2\u024e"+
		"\u024f\7\62\2\2\u024f\u0256\5l\67\2\u0250\u0256\5@!\2\u0251\u0252\7\26"+
		"\2\2\u0252\u0253\5j\66\2\u0253\u0254\7\27\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u024e\3\2\2\2\u0255\u0250\3\2\2\2\u0255\u0251\3\2\2\2\u0256\u0259\3\2"+
		"\2\2\u0257\u0258\7\n\2\2\u0258\u025a\5n8\2\u0259\u0257\3\2\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\5\u0096L\2\u025ci\3\2\2\2\u025d"+
		"\u025f\5@!\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0266\3\2\2"+
		"\2\u0260\u0262\7\20\2\2\u0261\u0263\5@!\2\u0262\u0261\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0260\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267k\3\2\2\2\u0268\u0266\3\2\2\2"+
		"\u0269\u0270\7\26\2\2\u026a\u026c\5\u0082B\2\u026b\u026a\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\7\20\2\2\u026e\u026b\3"+
		"\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\5\u0082B\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\7\27\2\2"+
		"\u0277m\3\2\2\2\u0278\u0279\b8\1\2\u0279\u027a\7\63\2\2\u027a\u0290\5"+
		"B\"\2\u027b\u027c\7\26\2\2\u027c\u027d\5n8\2\u027d\u027e\7\27\2\2\u027e"+
		"\u0290\3\2\2\2\u027f\u0282\5\u0088E\2\u0280\u0282\5\u008aF\2\u0281\u027f"+
		"\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\5n8\25\u0284"+
		"\u0290\3\2\2\2\u0285\u0286\5\u008cG\2\u0286\u0287\5n8\24\u0287\u0290\3"+
		"\2\2\2\u0288\u0289\t\7\2\2\u0289\u0290\5n8\23\u028a\u028b\7o\2\2\u028b"+
		"\u0290\5n8\22\u028c\u028d\7\5\2\2\u028d\u0290\5n8\21\u028e\u0290\5p9\2"+
		"\u028f\u0278\3\2\2\2\u028f\u027b\3\2\2\2\u028f\u0281\3\2\2\2\u028f\u0285"+
		"\3\2\2\2\u028f\u0288\3\2\2\2\u028f\u028a\3\2\2\2\u028f\u028c\3\2\2\2\u028f"+
		"\u028e\3\2\2\2\u0290\u02d5\3\2\2\2\u0291\u0292\f\20\2\2\u0292\u0293\5"+
		"\u008eH\2\u0293\u0294\5n8\21\u0294\u02d4\3\2\2\2\u0295\u0296\f\17\2\2"+
		"\u0296\u0297\5\u0090I\2\u0297\u0298\5n8\20\u0298\u02d4\3\2\2\2\u0299\u029a"+
		"\f\16\2\2\u029a\u029b\5\u008cG\2\u029b\u029c\5n8\17\u029c\u02d4\3\2\2"+
		"\2\u029d\u029e\f\r\2\2\u029e\u029f\t\b\2\2\u029f\u02d4\5n8\16\u02a0\u02a1"+
		"\f\f\2\2\u02a1\u02a2\78\2\2\u02a2\u02d4\5n8\r\u02a3\u02a4\f\13\2\2\u02a4"+
		"\u02a5\7\4\2\2\u02a5\u02d4\5n8\f\u02a6\u02a7\f\n\2\2\u02a7\u02a8\79\2"+
		"\2\u02a8\u02d4\5n8\13\u02a9\u02aa\f\t\2\2\u02aa\u02ab\5\u0092J\2\u02ab"+
		"\u02ac\5n8\n\u02ac\u02d4\3\2\2\2\u02ad\u02ae\f\b\2\2\u02ae\u02af\5\u0094"+
		"K\2\u02af\u02b0\5n8\t\u02b0\u02d4\3\2\2\2\u02b1\u02b2\f\7\2\2\u02b2\u02b3"+
		"\7m\2\2\u02b3\u02d4\5n8\b\u02b4\u02b5\f\6\2\2\u02b5\u02b6\7n\2\2\u02b6"+
		"\u02d4\5n8\7\u02b7\u02b8\f\5\2\2\u02b8\u02b9\7:\2\2\u02b9\u02ba\5n8\2"+
		"\u02ba\u02bb\7;\2\2\u02bb\u02bc\5n8\6\u02bc\u02d4\3\2\2\2\u02bd\u02be"+
		"\f\4\2\2\u02be\u02bf\5\u0098M\2\u02bf\u02c0\5n8\5\u02c0\u02d4\3\2\2\2"+
		"\u02c1\u02c4\f\33\2\2\u02c2\u02c5\5\u0088E\2\u02c3\u02c5\5\u008aF\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02d4\3\2\2\2\u02c6\u02c7\f\31"+
		"\2\2\u02c7\u02c8\7\"\2\2\u02c8\u02c9\5n8\2\u02c9\u02ca\7#\2\2\u02ca\u02d4"+
		"\3\2\2\2\u02cb\u02cc\f\30\2\2\u02cc\u02cd\7\26\2\2\u02cd\u02ce\5x=\2\u02ce"+
		"\u02cf\7\27\2\2\u02cf\u02d4\3\2\2\2\u02d0\u02d1\f\27\2\2\u02d1\u02d2\7"+
		"%\2\2\u02d2\u02d4\5\u0082B\2\u02d3\u0291\3\2\2\2\u02d3\u0295\3\2\2\2\u02d3"+
		"\u0299\3\2\2\2\u02d3\u029d\3\2\2\2\u02d3\u02a0\3\2\2\2\u02d3\u02a3\3\2"+
		"\2\2\u02d3\u02a6\3\2\2\2\u02d3\u02a9\3\2\2\2\u02d3\u02ad\3\2\2\2\u02d3"+
		"\u02b1\3\2\2\2\u02d3\u02b4\3\2\2\2\u02d3\u02b7\3\2\2\2\u02d3\u02bd\3\2"+
		"\2\2\u02d3\u02c1\3\2\2\2\u02d3\u02c6\3\2\2\2\u02d3\u02cb\3\2\2\2\u02d3"+
		"\u02d0\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6o\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02e9\7T\2\2\u02d9\u02e9"+
		"\5\u0080A\2\u02da\u02e9\7X\2\2\u02db\u02e9\7p\2\2\u02dc\u02df\5\u0082"+
		"B\2\u02dd\u02de\7\"\2\2\u02de\u02e0\7#\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e9\3\2\2\2\u02e1\u02e9\7e\2\2\u02e2\u02e9\5|?\2\u02e3"+
		"\u02e6\5~@\2\u02e4\u02e5\7\"\2\2\u02e5\u02e7\7#\2\2\u02e6\u02e4\3\2\2"+
		"\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02d8\3\2\2\2\u02e8\u02d9"+
		"\3\2\2\2\u02e8\u02da\3\2\2\2\u02e8\u02db\3\2\2\2\u02e8\u02dc\3\2\2\2\u02e8"+
		"\u02e1\3\2\2\2\u02e8\u02e2\3\2\2\2\u02e8\u02e3\3\2\2\2\u02e9q\3\2\2\2"+
		"\u02ea\u02ef\5n8\2\u02eb\u02ec\7\20\2\2\u02ec\u02ee\5n8\2\u02ed\u02eb"+
		"\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"s\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f7\5v<\2\u02f3\u02f4\7\20\2\2\u02f4"+
		"\u02f6\5v<\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2"+
		"\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc"+
		"\7\20\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fcu\3\2\2\2\u02fd"+
		"\u02fe\5\u0082B\2\u02fe\u02ff\7;\2\2\u02ff\u0300\5n8\2\u0300w\3\2\2\2"+
		"\u0301\u0303\7\17\2\2\u0302\u0304\5t;\2\u0303\u0302\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030a\7\21\2\2\u0306\u0308\5r:\2\u0307"+
		"\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0301\3\2"+
		"\2\2\u0309\u0307\3\2\2\2\u030ay\3\2\2\2\u030b\u030c\5n8\2\u030c\u030d"+
		"\7\26\2\2\u030d\u030e\5x=\2\u030e\u030f\7\27\2\2\u030f{\3\2\2\2\u0310"+
		"\u0312\7\26\2\2\u0311\u0313\5n8\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u031a\3\2\2\2\u0314\u0316\7\20\2\2\u0315\u0317\5n8\2\u0316"+
		"\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0314\3\2"+
		"\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u032b\7\27\2\2\u031e\u0327\7"+
		"\"\2\2\u031f\u0324\5n8\2\u0320\u0321\7\20\2\2\u0321\u0323\5n8\2\u0322"+
		"\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u031f\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7#\2\2\u032a\u0310\3\2"+
		"\2\2\u032a\u031e\3\2\2\2\u032b}\3\2\2\2\u032c\u032f\5\u0084C\2\u032d\u032f"+
		"\5D#\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\177\3\2\2\2\u0330"+
		"\u0332\t\t\2\2\u0331\u0333\7W\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0081\3\2\2\2\u0334\u0335\t\n\2\2\u0335\u0083\3\2\2\2\u0336"+
		"\u0337\t\13\2\2\u0337\u0085\3\2\2\2\u0338\u0339\5\u0084C\2\u0339\u033a"+
		"\7\"\2\2\u033a\u033b\7#\2\2\u033b\u0087\3\2\2\2\u033c\u033d\7?\2\2\u033d"+
		"\u0089\3\2\2\2\u033e\u033f\7@\2\2\u033f\u008b\3\2\2\2\u0340\u0341\t\f"+
		"\2\2\u0341\u008d\3\2\2\2\u0342\u0343\7C\2\2\u0343\u008f\3\2\2\2\u0344"+
		"\u0345\t\r\2\2\u0345\u0091\3\2\2\2\u0346\u0347\t\16\2\2\u0347\u0093\3"+
		"\2\2\2\u0348\u0349\t\17\2\2\u0349\u0095\3\2\2\2\u034a\u034b\7H\2\2\u034b"+
		"\u0097\3\2\2\2\u034c\u034d\t\20\2\2\u034d\u0099\3\2\2\2]\u009d\u009f\u00ad"+
		"\u00b1\u00b6\u00bd\u00c3\u00c9\u00cd\u00d9\u00e1\u00eb\u00ee\u00f4\u00fc"+
		"\u00ff\u010a\u0110\u0116\u011f\u012d\u0130\u013c\u0143\u0146\u014a\u014f"+
		"\u0153\u0157\u0165\u0167\u016e\u0178\u017e\u0189\u018c\u0192\u0195\u019d"+
		"\u01a0\u01a6\u01a9\u01b1\u01b4\u01ba\u01be\u01c9\u01ce\u01d3\u01db\u01ea"+
		"\u01ec\u01f1\u01fb\u020b\u0217\u0221\u0227\u022b\u022e\u0243\u0255\u0259"+
		"\u025e\u0262\u0266\u026b\u0270\u0274\u0281\u028f\u02c4\u02d3\u02d5\u02df"+
		"\u02e6\u02e8\u02ef\u02f7\u02fb\u0303\u0307\u0309\u0312\u0316\u031a\u0324"+
		"\u0327\u032a\u032e\u0332";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}