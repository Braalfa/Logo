// Generated from logo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class logoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		T__66=67, T__67=68, BRACKET_OPEN=69, BRACKET_CLOSE=70, PAR_OPEN=71, PAR_CLOSE=72, 
		SEMICOLO=73, COMMENT=74, STRINGLITERAL=75, NOMBRE=76, STRING=77, CARACTER=78, 
		BOOL=79, NUMERO=80, EOL=81, WS=82;
	public static final int
		RULE_programa = 0, RULE_codigo = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_procedimiento = 4, RULE_haz = 5, RULE_inic = 6, RULE_inc = 7, RULE_avanza = 8, 
		RULE_retrocede = 9, RULE_girarderecha = 10, RULE_girarizquierda = 11, 
		RULE_ocultartortuga = 12, RULE_aparecertortuga = 13, RULE_ponpos = 14, 
		RULE_ponrumbo = 15, RULE_rumbo = 16, RULE_ponx = 17, RULE_pony = 18, RULE_goma = 19, 
		RULE_bajalapiz = 20, RULE_subelapiz = 21, RULE_poncolor = 22, RULE_centro = 23, 
		RULE_espera = 24, RULE_ejecuta = 25, RULE_repite = 26, RULE_condicionales = 27, 
		RULE_si = 28, RULE_sisino = 29, RULE_hasHasta = 30, RULE_hasta = 31, RULE_hazMientras = 32, 
		RULE_mientras = 33, RULE_booleanos = 34, RULE_iguales = 35, RULE_yLogico = 36, 
		RULE_oLogico = 37, RULE_expresionLogica = 38, RULE_expresionLogicaSimple = 39, 
		RULE_operadorCondicional = 40, RULE_mayorque = 41, RULE_menorque = 42, 
		RULE_operacionAritmetica = 43, RULE_redondea = 44, RULE_diferencia = 45, 
		RULE_azar = 46, RULE_menos = 47, RULE_producto = 48, RULE_potencia = 49, 
		RULE_division = 50, RULE_resto = 51, RULE_suma = 52, RULE_elegir = 53, 
		RULE_cuenta = 54, RULE_ultimo = 55, RULE_elemento = 56, RULE_primero = 57, 
		RULE_borrarPantalla = 58, RULE_variable = 59, RULE_expresionNumerica = 60, 
		RULE_expresionNumericaSimple = 61, RULE_expresionMultiplicativa = 62, 
		RULE_expresionMultiplicativaSimple = 63, RULE_expresionConSigno = 64, 
		RULE_numero = 65, RULE_comment = 66, RULE_listaParametros = 67, RULE_lista = 68, 
		RULE_nombre = 69, RULE_primitivo = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "codigo", "instrucciones", "instruccion", "procedimiento", 
			"haz", "inic", "inc", "avanza", "retrocede", "girarderecha", "girarizquierda", 
			"ocultartortuga", "aparecertortuga", "ponpos", "ponrumbo", "rumbo", "ponx", 
			"pony", "goma", "bajalapiz", "subelapiz", "poncolor", "centro", "espera", 
			"ejecuta", "repite", "condicionales", "si", "sisino", "hasHasta", "hasta", 
			"hazMientras", "mientras", "booleanos", "iguales", "yLogico", "oLogico", 
			"expresionLogica", "expresionLogicaSimple", "operadorCondicional", "mayorque", 
			"menorque", "operacionAritmetica", "redondea", "diferencia", "azar", 
			"menos", "producto", "potencia", "division", "resto", "suma", "elegir", 
			"cuenta", "ultimo", "elemento", "primero", "borrarPantalla", "variable", 
			"expresionNumerica", "expresionNumericaSimple", "expresionMultiplicativa", 
			"expresionMultiplicativaSimple", "expresionConSigno", "numero", "comment", 
			"listaParametros", "lista", "nombre", "primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'para'", "'fin'", "'haz'", "'inic'", "'='", "'inc'", "'avanza'", 
			"'av'", "'retrocede'", "'re'", "'girarDerecha'", "'gd'", "'girarIzquierda'", 
			"'gi'", "'ocultartortuga'", "'ot'", "'aparecetortuga'", "'at'", "'ponpos'", 
			"'ponposxy'", "'ponrumbo'", "'rumbo'", "'ponx'", "'pony'", "'goma'", 
			"'bajalapiz'", "'bj'", "'subelapiz'", "'sb'", "'poncolorlapiz'", "'poncl'", 
			"'centro'", "'espera'", "'ejecuta'", "'repite'", "'si'", "'sisino'", 
			"'haz.hasta'", "'hasta'", "'haz.mientras'", "'mientras'", "'iguales?'", 
			"'y'", "'o'", "'<'", "'>'", "'mayorque?'", "'menorque?'", "'redondea'", 
			"'diferencia'", "'azar'", "'menos'", "'producto'", "'potencia'", "'division'", 
			"'resto'", "'suma'", "'elegir'", "'cuenta'", "'ultimo'", "'ul'", "'elemento'", 
			"'primero'", "'borrarPantalla'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", 
			"'('", "')'", "';'", null, null, null, null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLO", "COMMENT", "STRINGLITERAL", 
			"NOMBRE", "STRING", "CARACTER", "BOOL", "NUMERO", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public logoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public HazContext haz() {
			return getRuleContext(HazContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			comment();
			setState(143);
			codigo();
			setState(144);
			haz();
			setState(145);
			codigo();
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

	public static class CodigoContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(150);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(147);
						comment();
						}
						break;
					case T__2:
					case T__3:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
						{
						setState(148);
						instrucciones();
						}
						break;
					case T__0:
						{
						setState(149);
						procedimiento();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(155);
					instruccion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstruccionContext extends ParserRuleContext {
		public HazContext haz() {
			return getRuleContext(HazContext.class,0);
		}
		public InicContext inic() {
			return getRuleContext(InicContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public AvanzaContext avanza() {
			return getRuleContext(AvanzaContext.class,0);
		}
		public RetrocedeContext retrocede() {
			return getRuleContext(RetrocedeContext.class,0);
		}
		public GirarderechaContext girarderecha() {
			return getRuleContext(GirarderechaContext.class,0);
		}
		public GirarizquierdaContext girarizquierda() {
			return getRuleContext(GirarizquierdaContext.class,0);
		}
		public OcultartortugaContext ocultartortuga() {
			return getRuleContext(OcultartortugaContext.class,0);
		}
		public AparecertortugaContext aparecertortuga() {
			return getRuleContext(AparecertortugaContext.class,0);
		}
		public RumboContext rumbo() {
			return getRuleContext(RumboContext.class,0);
		}
		public PonposContext ponpos() {
			return getRuleContext(PonposContext.class,0);
		}
		public PonrumboContext ponrumbo() {
			return getRuleContext(PonrumboContext.class,0);
		}
		public PonxContext ponx() {
			return getRuleContext(PonxContext.class,0);
		}
		public PonyContext pony() {
			return getRuleContext(PonyContext.class,0);
		}
		public PoncolorContext poncolor() {
			return getRuleContext(PoncolorContext.class,0);
		}
		public GomaContext goma() {
			return getRuleContext(GomaContext.class,0);
		}
		public BajalapizContext bajalapiz() {
			return getRuleContext(BajalapizContext.class,0);
		}
		public SubelapizContext subelapiz() {
			return getRuleContext(SubelapizContext.class,0);
		}
		public CentroContext centro() {
			return getRuleContext(CentroContext.class,0);
		}
		public EsperaContext espera() {
			return getRuleContext(EsperaContext.class,0);
		}
		public EjecutaContext ejecuta() {
			return getRuleContext(EjecutaContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public HasHastaContext hasHasta() {
			return getRuleContext(HasHastaContext.class,0);
		}
		public HazMientrasContext hazMientras() {
			return getRuleContext(HazMientrasContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public HastaContext hasta() {
			return getRuleContext(HastaContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				haz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				inic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				inc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				avanza();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				retrocede();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				girarderecha();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				girarizquierda();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				ocultartortuga();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				aparecertortuga();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				rumbo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
				ponpos();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				ponrumbo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(172);
				ponx();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(173);
				pony();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(174);
				poncolor();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(175);
				goma();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(176);
				bajalapiz();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(177);
				subelapiz();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(178);
				centro();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(179);
				espera();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(180);
				ejecuta();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(181);
				repite();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(182);
				hasHasta();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(183);
				haz();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(184);
				hazMientras();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(185);
				mientras();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(186);
				hasta();
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

	public static class ProcedimientoContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitProcedimiento(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__0);
			setState(190);
			nombre();
			setState(191);
			match(PAR_OPEN);
			setState(192);
			match(PAR_CLOSE);
			setState(193);
			instrucciones();
			setState(194);
			match(T__1);
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

	public static class HazContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public HazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterHaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitHaz(this);
		}
	}

	public final HazContext haz() throws RecognitionException {
		HazContext _localctx = new HazContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_haz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__2);
			setState(197);
			nombre();
			setState(198);
			primitivo();
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

	public static class InicContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterInic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitInic(this);
		}
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__3);
			setState(201);
			nombre();
			setState(202);
			match(T__4);
			setState(203);
			variable();
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitInc(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inc);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__5);
				setState(206);
				match(BRACKET_OPEN);
				setState(207);
				nombre();
				setState(208);
				variable();
				setState(209);
				match(BRACKET_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__5);
				setState(212);
				match(BRACKET_OPEN);
				setState(213);
				nombre();
				setState(214);
				match(BRACKET_CLOSE);
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

	public static class AvanzaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AvanzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterAvanza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitAvanza(this);
		}
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_avanza);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__6);
				setState(219);
				variable();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__7);
				setState(221);
				variable();
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

	public static class RetrocedeContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RetrocedeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrocede; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterRetrocede(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitRetrocede(this);
		}
	}

	public final RetrocedeContext retrocede() throws RecognitionException {
		RetrocedeContext _localctx = new RetrocedeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retrocede);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__8);
				setState(225);
				variable();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__9);
				setState(227);
				variable();
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

	public static class GirarderechaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public GirarderechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girarderecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterGirarderecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitGirarderecha(this);
		}
	}

	public final GirarderechaContext girarderecha() throws RecognitionException {
		GirarderechaContext _localctx = new GirarderechaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_girarderecha);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__10);
				setState(231);
				variable();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__11);
				setState(233);
				variable();
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

	public static class GirarizquierdaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public GirarizquierdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girarizquierda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterGirarizquierda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitGirarizquierda(this);
		}
	}

	public final GirarizquierdaContext girarizquierda() throws RecognitionException {
		GirarizquierdaContext _localctx = new GirarizquierdaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_girarizquierda);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__12);
				setState(237);
				variable();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__13);
				setState(239);
				variable();
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

	public static class OcultartortugaContext extends ParserRuleContext {
		public OcultartortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocultartortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterOcultartortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitOcultartortuga(this);
		}
	}

	public final OcultartortugaContext ocultartortuga() throws RecognitionException {
		OcultartortugaContext _localctx = new OcultartortugaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ocultartortuga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	public static class AparecertortugaContext extends ParserRuleContext {
		public AparecertortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aparecertortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterAparecertortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitAparecertortuga(this);
		}
	}

	public final AparecertortugaContext aparecertortuga() throws RecognitionException {
		AparecertortugaContext _localctx = new AparecertortugaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aparecertortuga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	public static class PonposContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public PonposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPonpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPonpos(this);
		}
	}

	public final PonposContext ponpos() throws RecognitionException {
		PonposContext _localctx = new PonposContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ponpos);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__18);
				setState(247);
				match(BRACKET_OPEN);
				setState(248);
				variable();
				setState(249);
				variable();
				setState(250);
				match(BRACKET_CLOSE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__19);
				setState(253);
				variable();
				setState(254);
				variable();
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

	public static class PonrumboContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PonrumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponrumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPonrumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPonrumbo(this);
		}
	}

	public final PonrumboContext ponrumbo() throws RecognitionException {
		PonrumboContext _localctx = new PonrumboContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__20);
			setState(259);
			variable();
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

	public static class RumboContext extends ParserRuleContext {
		public RumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterRumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitRumbo(this);
		}
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__21);
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

	public static class PonxContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PonxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPonx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPonx(this);
		}
	}

	public final PonxContext ponx() throws RecognitionException {
		PonxContext _localctx = new PonxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__22);
			setState(264);
			variable();
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

	public static class PonyContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PonyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pony; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPony(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPony(this);
		}
	}

	public final PonyContext pony() throws RecognitionException {
		PonyContext _localctx = new PonyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__23);
			setState(267);
			variable();
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

	public static class GomaContext extends ParserRuleContext {
		public GomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterGoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitGoma(this);
		}
	}

	public final GomaContext goma() throws RecognitionException {
		GomaContext _localctx = new GomaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_goma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__24);
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

	public static class BajalapizContext extends ParserRuleContext {
		public BajalapizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bajalapiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterBajalapiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitBajalapiz(this);
		}
	}

	public final BajalapizContext bajalapiz() throws RecognitionException {
		BajalapizContext _localctx = new BajalapizContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bajalapiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
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

	public static class SubelapizContext extends ParserRuleContext {
		public SubelapizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subelapiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterSubelapiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitSubelapiz(this);
		}
	}

	public final SubelapizContext subelapiz() throws RecognitionException {
		SubelapizContext _localctx = new SubelapizContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subelapiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	public static class PoncolorContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(logoParser.STRINGLITERAL, 0); }
		public PoncolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poncolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPoncolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPoncolor(this);
		}
	}

	public final PoncolorContext poncolor() throws RecognitionException {
		PoncolorContext _localctx = new PoncolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_poncolor);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__29);
				setState(276);
				match(STRINGLITERAL);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__30);
				setState(278);
				match(STRINGLITERAL);
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

	public static class CentroContext extends ParserRuleContext {
		public CentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterCentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitCentro(this);
		}
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__31);
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

	public static class EsperaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EsperaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterEspera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitEspera(this);
		}
	}

	public final EsperaContext espera() throws RecognitionException {
		EsperaContext _localctx = new EsperaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__32);
			setState(284);
			variable();
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

	public static class EjecutaContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public EjecutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejecuta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterEjecuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitEjecuta(this);
		}
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ejecuta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__33);
			setState(287);
			match(BRACKET_OPEN);
			setState(288);
			instrucciones();
			setState(289);
			match(BRACKET_CLOSE);
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

	public static class RepiteContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public RepiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterRepite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitRepite(this);
		}
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__34);
			setState(292);
			variable();
			setState(293);
			match(BRACKET_OPEN);
			setState(294);
			instrucciones();
			setState(295);
			match(BRACKET_CLOSE);
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

	public static class CondicionalesContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SisinoContext sisino() {
			return getRuleContext(SisinoContext.class,0);
		}
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterCondicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitCondicionales(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicionales);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				si();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				sisino();
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__35);
			setState(302);
			match(PAR_OPEN);
			setState(303);
			expresionLogica();
			setState(304);
			match(PAR_CLOSE);
			setState(305);
			match(BRACKET_OPEN);
			setState(306);
			instrucciones();
			setState(307);
			match(BRACKET_CLOSE);
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

	public static class SisinoContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(logoParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(logoParser.BRACKET_OPEN, i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(logoParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(logoParser.BRACKET_CLOSE, i);
		}
		public SisinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sisino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterSisino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitSisino(this);
		}
	}

	public final SisinoContext sisino() throws RecognitionException {
		SisinoContext _localctx = new SisinoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sisino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__36);
			setState(310);
			match(PAR_OPEN);
			setState(311);
			expresionLogica();
			setState(312);
			match(PAR_CLOSE);
			setState(313);
			match(BRACKET_OPEN);
			setState(314);
			instrucciones();
			setState(315);
			match(BRACKET_CLOSE);
			setState(316);
			match(BRACKET_OPEN);
			setState(317);
			instrucciones();
			setState(318);
			match(BRACKET_CLOSE);
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

	public static class HasHastaContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(logoParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(logoParser.BRACKET_OPEN, i);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(logoParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(logoParser.BRACKET_CLOSE, i);
		}
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public HasHastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasHasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterHasHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitHasHasta(this);
		}
	}

	public final HasHastaContext hasHasta() throws RecognitionException {
		HasHastaContext _localctx = new HasHastaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_hasHasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__37);
			setState(321);
			match(BRACKET_OPEN);
			setState(322);
			instrucciones();
			setState(323);
			match(BRACKET_CLOSE);
			setState(324);
			match(BRACKET_OPEN);
			setState(325);
			expresionLogica();
			setState(326);
			match(BRACKET_CLOSE);
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

	public static class HastaContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(logoParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(logoParser.BRACKET_OPEN, i);
		}
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(logoParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(logoParser.BRACKET_CLOSE, i);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public HastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitHasta(this);
		}
	}

	public final HastaContext hasta() throws RecognitionException {
		HastaContext _localctx = new HastaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__38);
			setState(329);
			match(BRACKET_OPEN);
			setState(330);
			expresionLogica();
			setState(331);
			match(BRACKET_CLOSE);
			setState(332);
			match(BRACKET_OPEN);
			setState(333);
			instrucciones();
			setState(334);
			match(BRACKET_CLOSE);
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

	public static class HazMientrasContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(logoParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(logoParser.BRACKET_OPEN, i);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(logoParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(logoParser.BRACKET_CLOSE, i);
		}
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public HazMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hazMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterHazMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitHazMientras(this);
		}
	}

	public final HazMientrasContext hazMientras() throws RecognitionException {
		HazMientrasContext _localctx = new HazMientrasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_hazMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__39);
			setState(337);
			match(BRACKET_OPEN);
			setState(338);
			instrucciones();
			setState(339);
			match(BRACKET_CLOSE);
			setState(340);
			match(BRACKET_OPEN);
			setState(341);
			expresionLogica();
			setState(342);
			match(BRACKET_CLOSE);
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

	public static class MientrasContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(logoParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(logoParser.BRACKET_OPEN, i);
		}
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(logoParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(logoParser.BRACKET_CLOSE, i);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__40);
			setState(345);
			match(BRACKET_OPEN);
			setState(346);
			expresionLogica();
			setState(347);
			match(BRACKET_CLOSE);
			setState(348);
			match(BRACKET_OPEN);
			setState(349);
			instrucciones();
			setState(350);
			match(BRACKET_CLOSE);
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

	public static class BooleanosContext extends ParserRuleContext {
		public IgualesContext iguales() {
			return getRuleContext(IgualesContext.class,0);
		}
		public YLogicoContext yLogico() {
			return getRuleContext(YLogicoContext.class,0);
		}
		public OLogicoContext oLogico() {
			return getRuleContext(OLogicoContext.class,0);
		}
		public BooleanosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterBooleanos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitBooleanos(this);
		}
	}

	public final BooleanosContext booleanos() throws RecognitionException {
		BooleanosContext _localctx = new BooleanosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booleanos);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				iguales();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				yLogico();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				oLogico();
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

	public static class IgualesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public IgualesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iguales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterIguales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitIguales(this);
		}
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__41);
			setState(358);
			variable();
			setState(359);
			variable();
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

	public static class YLogicoContext extends ParserRuleContext {
		public List<ExpresionLogicaContext> expresionLogica() {
			return getRuleContexts(ExpresionLogicaContext.class);
		}
		public ExpresionLogicaContext expresionLogica(int i) {
			return getRuleContext(ExpresionLogicaContext.class,i);
		}
		public YLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterYLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitYLogico(this);
		}
	}

	public final YLogicoContext yLogico() throws RecognitionException {
		YLogicoContext _localctx = new YLogicoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_yLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__42);
			setState(362);
			expresionLogica();
			setState(363);
			expresionLogica();
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

	public static class OLogicoContext extends ParserRuleContext {
		public List<ExpresionLogicaContext> expresionLogica() {
			return getRuleContexts(ExpresionLogicaContext.class);
		}
		public ExpresionLogicaContext expresionLogica(int i) {
			return getRuleContext(ExpresionLogicaContext.class,i);
		}
		public OLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterOLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitOLogico(this);
		}
	}

	public final OLogicoContext oLogico() throws RecognitionException {
		OLogicoContext _localctx = new OLogicoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__43);
			setState(366);
			expresionLogica();
			setState(367);
			expresionLogica();
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

	public static class ExpresionLogicaContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public ExpresionLogicaSimpleContext expresionLogicaSimple() {
			return getRuleContext(ExpresionLogicaSimpleContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public BooleanosContext booleanos() {
			return getRuleContext(BooleanosContext.class,0);
		}
		public ExpresionLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionLogica(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expresionLogica);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(PAR_OPEN);
				setState(370);
				expresionLogicaSimple();
				setState(371);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				expresionLogicaSimple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(PAR_OPEN);
				setState(375);
				booleanos();
				setState(376);
				match(PAR_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				booleanos();
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

	public static class ExpresionLogicaSimpleContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public OperadorCondicionalContext operadorCondicional() {
			return getRuleContext(OperadorCondicionalContext.class,0);
		}
		public ExpresionLogicaSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogicaSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionLogicaSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionLogicaSimple(this);
		}
	}

	public final ExpresionLogicaSimpleContext expresionLogicaSimple() throws RecognitionException {
		ExpresionLogicaSimpleContext _localctx = new ExpresionLogicaSimpleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expresionLogicaSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			variable();
			setState(382);
			operadorCondicional();
			setState(383);
			variable();
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

	public static class OperadorCondicionalContext extends ParserRuleContext {
		public OperadorCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterOperadorCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitOperadorCondicional(this);
		}
	}

	public final OperadorCondicionalContext operadorCondicional() throws RecognitionException {
		OperadorCondicionalContext _localctx = new OperadorCondicionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operadorCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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

	public static class MayorqueContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public MayorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterMayorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitMayorque(this);
		}
	}

	public final MayorqueContext mayorque() throws RecognitionException {
		MayorqueContext _localctx = new MayorqueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__46);
			setState(388);
			variable();
			setState(389);
			variable();
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

	public static class MenorqueContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public MenorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterMenorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitMenorque(this);
		}
	}

	public final MenorqueContext menorque() throws RecognitionException {
		MenorqueContext _localctx = new MenorqueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_menorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__47);
			setState(392);
			variable();
			setState(393);
			variable();
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

	public static class OperacionAritmeticaContext extends ParserRuleContext {
		public RedondeaContext redondea() {
			return getRuleContext(RedondeaContext.class,0);
		}
		public DiferenciaContext diferencia() {
			return getRuleContext(DiferenciaContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public RestoContext resto() {
			return getRuleContext(RestoContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public OperacionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterOperacionAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitOperacionAritmetica(this);
		}
	}

	public final OperacionAritmeticaContext operacionAritmetica() throws RecognitionException {
		OperacionAritmeticaContext _localctx = new OperacionAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operacionAritmetica);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				redondea();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				diferencia();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				azar();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				menos();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				producto();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(400);
				potencia();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				division();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				resto();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 9);
				{
				setState(403);
				suma();
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

	public static class RedondeaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RedondeaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redondea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterRedondea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitRedondea(this);
		}
	}

	public final RedondeaContext redondea() throws RecognitionException {
		RedondeaContext _localctx = new RedondeaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_redondea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__48);
			setState(407);
			variable();
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

	public static class DiferenciaContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DiferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitDiferencia(this);
		}
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__49);
			setState(410);
			variable();
			setState(412); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(411);
					variable();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(414); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AzarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitAzar(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__50);
			setState(417);
			variable();
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

	public static class MenosContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitMenos(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__51);
			setState(420);
			variable();
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

	public static class ProductoContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ProductoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterProducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitProducto(this);
		}
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__52);
			setState(423);
			variable();
			setState(425); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(424);
					variable();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PotenciaContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__53);
			setState(430);
			variable();
			setState(431);
			variable();
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

	public static class DivisionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__54);
			setState(434);
			variable();
			setState(435);
			variable();
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

	public static class RestoContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitResto(this);
		}
	}

	public final RestoContext resto() throws RecognitionException {
		RestoContext _localctx = new RestoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_resto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__55);
			setState(438);
			variable();
			setState(439);
			variable();
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

	public static class SumaContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__56);
			setState(442);
			variable();
			setState(444); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(443);
					variable();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElegirContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ElegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterElegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitElegir(this);
		}
	}

	public final ElegirContext elegir() throws RecognitionException {
		ElegirContext _localctx = new ElegirContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__57);
			setState(449);
			lista();
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

	public static class CuentaContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public CuentaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuenta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterCuenta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitCuenta(this);
		}
	}

	public final CuentaContext cuenta() throws RecognitionException {
		CuentaContext _localctx = new CuentaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cuenta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__58);
			setState(452);
			lista();
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

	public static class UltimoContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public UltimoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterUltimo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitUltimo(this);
		}
	}

	public final UltimoContext ultimo() throws RecognitionException {
		UltimoContext _localctx = new UltimoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ultimo);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__59);
				setState(455);
				lista();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(T__60);
				setState(457);
				lista();
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

	public static class ElementoContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitElemento(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__61);
			setState(461);
			variable();
			setState(462);
			lista();
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

	public static class PrimeroContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public PrimeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPrimero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPrimero(this);
		}
	}

	public final PrimeroContext primero() throws RecognitionException {
		PrimeroContext _localctx = new PrimeroContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__62);
			setState(465);
			lista();
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

	public static class BorrarPantallaContext extends ParserRuleContext {
		public BorrarPantallaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrarPantalla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterBorrarPantalla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitBorrarPantalla(this);
		}
	}

	public final BorrarPantallaContext borrarPantalla() throws RecognitionException {
		BorrarPantallaContext _localctx = new BorrarPantallaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_borrarPantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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

	public static class VariableContext extends ParserRuleContext {
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variable);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__64:
			case T__65:
			case PAR_OPEN:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				expresionNumerica();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				nombre();
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

	public static class ExpresionNumericaContext extends ParserRuleContext {
		public ExpresionNumericaSimpleContext expresionNumericaSimple() {
			return getRuleContext(ExpresionNumericaSimpleContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public OperacionAritmeticaContext operacionAritmetica() {
			return getRuleContext(OperacionAritmeticaContext.class,0);
		}
		public ExpresionNumericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionNumerica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionNumerica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionNumerica(this);
		}
	}

	public final ExpresionNumericaContext expresionNumerica() throws RecognitionException {
		ExpresionNumericaContext _localctx = new ExpresionNumericaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expresionNumerica);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				expresionNumericaSimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(PAR_OPEN);
				setState(475);
				expresionNumericaSimple();
				setState(476);
				match(PAR_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(PAR_OPEN);
				setState(479);
				operacionAritmetica();
				setState(480);
				match(PAR_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				operacionAritmetica();
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

	public static class ExpresionNumericaSimpleContext extends ParserRuleContext {
		public List<ExpresionMultiplicativaContext> expresionMultiplicativa() {
			return getRuleContexts(ExpresionMultiplicativaContext.class);
		}
		public ExpresionMultiplicativaContext expresionMultiplicativa(int i) {
			return getRuleContext(ExpresionMultiplicativaContext.class,i);
		}
		public ExpresionNumericaSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionNumericaSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionNumericaSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionNumericaSimple(this);
		}
	}

	public final ExpresionNumericaSimpleContext expresionNumericaSimple() throws RecognitionException {
		ExpresionNumericaSimpleContext _localctx = new ExpresionNumericaSimpleContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expresionNumericaSimple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			expresionMultiplicativa();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					_la = _input.LA(1);
					if ( !(_la==T__64 || _la==T__65) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(487);
					expresionMultiplicativa();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ExpresionMultiplicativaContext extends ParserRuleContext {
		public ExpresionMultiplicativaSimpleContext expresionMultiplicativaSimple() {
			return getRuleContext(ExpresionMultiplicativaSimpleContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public ExpresionMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionMultiplicativa(this);
		}
	}

	public final ExpresionMultiplicativaContext expresionMultiplicativa() throws RecognitionException {
		ExpresionMultiplicativaContext _localctx = new ExpresionMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expresionMultiplicativa);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case T__65:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				expresionMultiplicativaSimple();
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(PAR_OPEN);
				setState(495);
				expresionMultiplicativaSimple();
				setState(496);
				match(PAR_CLOSE);
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

	public static class ExpresionMultiplicativaSimpleContext extends ParserRuleContext {
		public List<ExpresionConSignoContext> expresionConSigno() {
			return getRuleContexts(ExpresionConSignoContext.class);
		}
		public ExpresionConSignoContext expresionConSigno(int i) {
			return getRuleContext(ExpresionConSignoContext.class,i);
		}
		public ExpresionMultiplicativaSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMultiplicativaSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionMultiplicativaSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionMultiplicativaSimple(this);
		}
	}

	public final ExpresionMultiplicativaSimpleContext expresionMultiplicativaSimple() throws RecognitionException {
		ExpresionMultiplicativaSimpleContext _localctx = new ExpresionMultiplicativaSimpleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expresionMultiplicativaSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			expresionConSigno();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66 || _la==T__67) {
				{
				{
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
				expresionConSigno();
				}
				}
				setState(507);
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

	public static class ExpresionConSignoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(logoParser.NUMERO, 0); }
		public ExpresionConSignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionConSigno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionConSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionConSigno(this);
		}
	}

	public final ExpresionConSignoContext expresionConSigno() throws RecognitionException {
		ExpresionConSignoContext _localctx = new ExpresionConSignoContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expresionConSigno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__64 || _la==T__65) {
				{
				{
				setState(508);
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
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			match(NUMERO);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(logoParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(NUMERO);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(logoParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(COMMENT);
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(BRACKET_OPEN);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE) {
				{
				{
				setState(521);
				nombre();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(BRACKET_CLOSE);
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(logoParser.BRACKET_CLOSE, 0); }
		public List<PrimitivoContext> primitivo() {
			return getRuleContexts(PrimitivoContext.class);
		}
		public PrimitivoContext primitivo(int i) {
			return getRuleContext(PrimitivoContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(BRACKET_OPEN);
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				primitivo();
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STRINGLITERAL - 75)) | (1L << (BOOL - 75)) | (1L << (NUMERO - 75)))) != 0) );
			setState(535);
			match(BRACKET_CLOSE);
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(logoParser.NOMBRE, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitNombre(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(NOMBRE);
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

	public static class PrimitivoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(logoParser.NUMERO, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(logoParser.STRINGLITERAL, 0); }
		public TerminalNode BOOL() { return getToken(logoParser.BOOL, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitPrimitivo(this);
		}
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_primitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (STRINGLITERAL - 75)) | (1L << (BOOL - 75)) | (1L << (NUMERO - 75)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0220\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0099\n\3\f\3\16\3\u009c\13\3\3\4\6\4"+
		"\u009f\n\4\r\4\16\4\u00a0\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00be"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00db\n\t\3\n\3\n\3\n\3"+
		"\n\5\n\u00e1\n\n\3\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00ed\n\f\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u011a\n\30\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u012e"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\5$\u0166\n$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u017e\n(\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0197\n-\3.\3.\3.\3/\3/\3/\6/\u019f\n"+
		"/\r/\16/\u01a0\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\6\62\u01ac"+
		"\n\62\r\62\16\62\u01ad\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\6\66\u01bf\n\66\r\66\16\66\u01c0\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\39\59\u01cd\n9\3:\3:\3:\3:\3;\3;\3;\3<\3<\3=\3"+
		"=\5=\u01da\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01e6\n>\3?\3?\3?\7?\u01eb"+
		"\n?\f?\16?\u01ee\13?\3@\3@\3@\3@\3@\5@\u01f5\n@\3A\3A\3A\7A\u01fa\nA\f"+
		"A\16A\u01fd\13A\3B\7B\u0200\nB\fB\16B\u0203\13B\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\7E\u020d\nE\fE\16E\u0210\13E\3E\3E\3F\3F\6F\u0216\nF\rF\16F\u0217\3"+
		"F\3F\3G\3G\3H\3H\3H\2\2I\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\2\n\3\2\21\22\3\2\23\24\3\2\34\35\3\2\36"+
		"\37\4\2\7\7/\60\3\2CD\3\2EF\4\2MMQR\2\u0219\2\u0090\3\2\2\2\4\u009a\3"+
		"\2\2\2\6\u009e\3\2\2\2\b\u00bd\3\2\2\2\n\u00bf\3\2\2\2\f\u00c6\3\2\2\2"+
		"\16\u00ca\3\2\2\2\20\u00da\3\2\2\2\22\u00e0\3\2\2\2\24\u00e6\3\2\2\2\26"+
		"\u00ec\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2\2\2\34\u00f6\3\2\2\2\36\u0102"+
		"\3\2\2\2 \u0104\3\2\2\2\"\u0107\3\2\2\2$\u0109\3\2\2\2&\u010c\3\2\2\2"+
		"(\u010f\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u0119\3\2\2\2\60\u011b"+
		"\3\2\2\2\62\u011d\3\2\2\2\64\u0120\3\2\2\2\66\u0125\3\2\2\28\u012d\3\2"+
		"\2\2:\u012f\3\2\2\2<\u0137\3\2\2\2>\u0142\3\2\2\2@\u014a\3\2\2\2B\u0152"+
		"\3\2\2\2D\u015a\3\2\2\2F\u0165\3\2\2\2H\u0167\3\2\2\2J\u016b\3\2\2\2L"+
		"\u016f\3\2\2\2N\u017d\3\2\2\2P\u017f\3\2\2\2R\u0183\3\2\2\2T\u0185\3\2"+
		"\2\2V\u0189\3\2\2\2X\u0196\3\2\2\2Z\u0198\3\2\2\2\\\u019b\3\2\2\2^\u01a2"+
		"\3\2\2\2`\u01a5\3\2\2\2b\u01a8\3\2\2\2d\u01af\3\2\2\2f\u01b3\3\2\2\2h"+
		"\u01b7\3\2\2\2j\u01bb\3\2\2\2l\u01c2\3\2\2\2n\u01c5\3\2\2\2p\u01cc\3\2"+
		"\2\2r\u01ce\3\2\2\2t\u01d2\3\2\2\2v\u01d5\3\2\2\2x\u01d9\3\2\2\2z\u01e5"+
		"\3\2\2\2|\u01e7\3\2\2\2~\u01f4\3\2\2\2\u0080\u01f6\3\2\2\2\u0082\u0201"+
		"\3\2\2\2\u0084\u0206\3\2\2\2\u0086\u0208\3\2\2\2\u0088\u020a\3\2\2\2\u008a"+
		"\u0213\3\2\2\2\u008c\u021b\3\2\2\2\u008e\u021d\3\2\2\2\u0090\u0091\5\u0086"+
		"D\2\u0091\u0092\5\4\3\2\u0092\u0093\5\f\7\2\u0093\u0094\5\4\3\2\u0094"+
		"\3\3\2\2\2\u0095\u0099\5\u0086D\2\u0096\u0099\5\6\4\2\u0097\u0099\5\n"+
		"\6\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\5\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009d\u009f\5\b\5\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\7\3\2\2\2\u00a2"+
		"\u00be\5\f\7\2\u00a3\u00be\5\16\b\2\u00a4\u00be\5\20\t\2\u00a5\u00be\5"+
		"\22\n\2\u00a6\u00be\5\24\13\2\u00a7\u00be\5\26\f\2\u00a8\u00be\5\30\r"+
		"\2\u00a9\u00be\5\32\16\2\u00aa\u00be\5\34\17\2\u00ab\u00be\5\"\22\2\u00ac"+
		"\u00be\5\36\20\2\u00ad\u00be\5 \21\2\u00ae\u00be\5$\23\2\u00af\u00be\5"+
		"&\24\2\u00b0\u00be\5.\30\2\u00b1\u00be\5(\25\2\u00b2\u00be\5*\26\2\u00b3"+
		"\u00be\5,\27\2\u00b4\u00be\5\60\31\2\u00b5\u00be\5\62\32\2\u00b6\u00be"+
		"\5\64\33\2\u00b7\u00be\5\66\34\2\u00b8\u00be\5> \2\u00b9\u00be\5\f\7\2"+
		"\u00ba\u00be\5B\"\2\u00bb\u00be\5D#\2\u00bc\u00be\5@!\2\u00bd\u00a2\3"+
		"\2\2\2\u00bd\u00a3\3\2\2\2\u00bd\u00a4\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd"+
		"\u00a6\3\2\2\2\u00bd\u00a7\3\2\2\2\u00bd\u00a8\3\2\2\2\u00bd\u00a9\3\2"+
		"\2\2\u00bd\u00aa\3\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00ac\3\2\2\2\u00bd"+
		"\u00ad\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b0\3\2"+
		"\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b7\3\2"+
		"\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00c0\7\3\2\2"+
		"\u00c0\u00c1\5\u008cG\2\u00c1\u00c2\7I\2\2\u00c2\u00c3\7J\2\2\u00c3\u00c4"+
		"\5\6\4\2\u00c4\u00c5\7\4\2\2\u00c5\13\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7"+
		"\u00c8\5\u008cG\2\u00c8\u00c9\5\u008eH\2\u00c9\r\3\2\2\2\u00ca\u00cb\7"+
		"\6\2\2\u00cb\u00cc\5\u008cG\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5x=\2\u00ce"+
		"\17\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2\5\u008c"+
		"G\2\u00d2\u00d3\5x=\2\u00d3\u00d4\7H\2\2\u00d4\u00db\3\2\2\2\u00d5\u00d6"+
		"\7\b\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\5\u008cG\2\u00d8\u00d9\7H\2\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d5\3\2\2\2\u00db\21"+
		"\3\2\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00e1\5x=\2\u00de\u00df\7\n\2\2\u00df"+
		"\u00e1\5x=\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\23\3\2\2\2"+
		"\u00e2\u00e3\7\13\2\2\u00e3\u00e7\5x=\2\u00e4\u00e5\7\f\2\2\u00e5\u00e7"+
		"\5x=\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\25\3\2\2\2\u00e8"+
		"\u00e9\7\r\2\2\u00e9\u00ed\5x=\2\u00ea\u00eb\7\16\2\2\u00eb\u00ed\5x="+
		"\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ef"+
		"\7\17\2\2\u00ef\u00f3\5x=\2\u00f0\u00f1\7\20\2\2\u00f1\u00f3\5x=\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\t\2\2"+
		"\2\u00f5\33\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7"+
		"\25\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\5x=\2\u00fb\u00fc\5x=\2\u00fc\u00fd"+
		"\7H\2\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\5x=\2\u0100"+
		"\u0101\5x=\2\u0101\u0103\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00fe\3\2\2"+
		"\2\u0103\37\3\2\2\2\u0104\u0105\7\27\2\2\u0105\u0106\5x=\2\u0106!\3\2"+
		"\2\2\u0107\u0108\7\30\2\2\u0108#\3\2\2\2\u0109\u010a\7\31\2\2\u010a\u010b"+
		"\5x=\2\u010b%\3\2\2\2\u010c\u010d\7\32\2\2\u010d\u010e\5x=\2\u010e\'\3"+
		"\2\2\2\u010f\u0110\7\33\2\2\u0110)\3\2\2\2\u0111\u0112\t\4\2\2\u0112+"+
		"\3\2\2\2\u0113\u0114\t\5\2\2\u0114-\3\2\2\2\u0115\u0116\7 \2\2\u0116\u011a"+
		"\7M\2\2\u0117\u0118\7!\2\2\u0118\u011a\7M\2\2\u0119\u0115\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a/\3\2\2\2\u011b\u011c\7\"\2\2\u011c\61\3\2\2\2\u011d"+
		"\u011e\7#\2\2\u011e\u011f\5x=\2\u011f\63\3\2\2\2\u0120\u0121\7$\2\2\u0121"+
		"\u0122\7G\2\2\u0122\u0123\5\6\4\2\u0123\u0124\7H\2\2\u0124\65\3\2\2\2"+
		"\u0125\u0126\7%\2\2\u0126\u0127\5x=\2\u0127\u0128\7G\2\2\u0128\u0129\5"+
		"\6\4\2\u0129\u012a\7H\2\2\u012a\67\3\2\2\2\u012b\u012e\5:\36\2\u012c\u012e"+
		"\5<\37\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e9\3\2\2\2\u012f"+
		"\u0130\7&\2\2\u0130\u0131\7I\2\2\u0131\u0132\5N(\2\u0132\u0133\7J\2\2"+
		"\u0133\u0134\7G\2\2\u0134\u0135\5\6\4\2\u0135\u0136\7H\2\2\u0136;\3\2"+
		"\2\2\u0137\u0138\7\'\2\2\u0138\u0139\7I\2\2\u0139\u013a\5N(\2\u013a\u013b"+
		"\7J\2\2\u013b\u013c\7G\2\2\u013c\u013d\5\6\4\2\u013d\u013e\7H\2\2\u013e"+
		"\u013f\7G\2\2\u013f\u0140\5\6\4\2\u0140\u0141\7H\2\2\u0141=\3\2\2\2\u0142"+
		"\u0143\7(\2\2\u0143\u0144\7G\2\2\u0144\u0145\5\6\4\2\u0145\u0146\7H\2"+
		"\2\u0146\u0147\7G\2\2\u0147\u0148\5N(\2\u0148\u0149\7H\2\2\u0149?\3\2"+
		"\2\2\u014a\u014b\7)\2\2\u014b\u014c\7G\2\2\u014c\u014d\5N(\2\u014d\u014e"+
		"\7H\2\2\u014e\u014f\7G\2\2\u014f\u0150\5\6\4\2\u0150\u0151\7H\2\2\u0151"+
		"A\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\7G\2\2\u0154\u0155\5\6\4\2\u0155"+
		"\u0156\7H\2\2\u0156\u0157\7G\2\2\u0157\u0158\5N(\2\u0158\u0159\7H\2\2"+
		"\u0159C\3\2\2\2\u015a\u015b\7+\2\2\u015b\u015c\7G\2\2\u015c\u015d\5N("+
		"\2\u015d\u015e\7H\2\2\u015e\u015f\7G\2\2\u015f\u0160\5\6\4\2\u0160\u0161"+
		"\7H\2\2\u0161E\3\2\2\2\u0162\u0166\5H%\2\u0163\u0166\5J&\2\u0164\u0166"+
		"\5L\'\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"G\3\2\2\2\u0167\u0168\7,\2\2\u0168\u0169\5x=\2\u0169\u016a\5x=\2\u016a"+
		"I\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\5N(\2\u016d\u016e\5N(\2\u016e"+
		"K\3\2\2\2\u016f\u0170\7.\2\2\u0170\u0171\5N(\2\u0171\u0172\5N(\2\u0172"+
		"M\3\2\2\2\u0173\u0174\7I\2\2\u0174\u0175\5P)\2\u0175\u0176\7J\2\2\u0176"+
		"\u017e\3\2\2\2\u0177\u017e\5P)\2\u0178\u0179\7I\2\2\u0179\u017a\5F$\2"+
		"\u017a\u017b\7J\2\2\u017b\u017e\3\2\2\2\u017c\u017e\5F$\2\u017d\u0173"+
		"\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"O\3\2\2\2\u017f\u0180\5x=\2\u0180\u0181\5R*\2\u0181\u0182\5x=\2\u0182"+
		"Q\3\2\2\2\u0183\u0184\t\6\2\2\u0184S\3\2\2\2\u0185\u0186\7\61\2\2\u0186"+
		"\u0187\5x=\2\u0187\u0188\5x=\2\u0188U\3\2\2\2\u0189\u018a\7\62\2\2\u018a"+
		"\u018b\5x=\2\u018b\u018c\5x=\2\u018cW\3\2\2\2\u018d\u0197\5Z.\2\u018e"+
		"\u0197\5\\/\2\u018f\u0197\5^\60\2\u0190\u0197\5`\61\2\u0191\u0197\5b\62"+
		"\2\u0192\u0197\5d\63\2\u0193\u0197\5f\64\2\u0194\u0197\5h\65\2\u0195\u0197"+
		"\5j\66\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u018f\3\2\2\2\u0196"+
		"\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197Y\3\2\2\2\u0198\u0199"+
		"\7\63\2\2\u0199\u019a\5x=\2\u019a[\3\2\2\2\u019b\u019c\7\64\2\2\u019c"+
		"\u019e\5x=\2\u019d\u019f\5x=\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1]\3\2\2\2\u01a2\u01a3\7"+
		"\65\2\2\u01a3\u01a4\5x=\2\u01a4_\3\2\2\2\u01a5\u01a6\7\66\2\2\u01a6\u01a7"+
		"\5x=\2\u01a7a\3\2\2\2\u01a8\u01a9\7\67\2\2\u01a9\u01ab\5x=\2\u01aa\u01ac"+
		"\5x=\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01aec\3\2\2\2\u01af\u01b0\78\2\2\u01b0\u01b1\5x=\2\u01b1"+
		"\u01b2\5x=\2\u01b2e\3\2\2\2\u01b3\u01b4\79\2\2\u01b4\u01b5\5x=\2\u01b5"+
		"\u01b6\5x=\2\u01b6g\3\2\2\2\u01b7\u01b8\7:\2\2\u01b8\u01b9\5x=\2\u01b9"+
		"\u01ba\5x=\2\u01bai\3\2\2\2\u01bb\u01bc\7;\2\2\u01bc\u01be\5x=\2\u01bd"+
		"\u01bf\5x=\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1k\3\2\2\2\u01c2\u01c3\7<\2\2\u01c3\u01c4\5"+
		"\u008aF\2\u01c4m\3\2\2\2\u01c5\u01c6\7=\2\2\u01c6\u01c7\5\u008aF\2\u01c7"+
		"o\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9\u01cd\5\u008aF\2\u01ca\u01cb\7?\2\2"+
		"\u01cb\u01cd\5\u008aF\2\u01cc\u01c8\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"q\3\2\2\2\u01ce\u01cf\7@\2\2\u01cf\u01d0\5x=\2\u01d0\u01d1\5\u008aF\2"+
		"\u01d1s\3\2\2\2\u01d2\u01d3\7A\2\2\u01d3\u01d4\5\u008aF\2\u01d4u\3\2\2"+
		"\2\u01d5\u01d6\7B\2\2\u01d6w\3\2\2\2\u01d7\u01da\5z>\2\u01d8\u01da\5\u008c"+
		"G\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01day\3\2\2\2\u01db\u01e6"+
		"\5|?\2\u01dc\u01dd\7I\2\2\u01dd\u01de\5|?\2\u01de\u01df\7J\2\2\u01df\u01e6"+
		"\3\2\2\2\u01e0\u01e1\7I\2\2\u01e1\u01e2\5X-\2\u01e2\u01e3\7J\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e6\5X-\2\u01e5\u01db\3\2\2\2\u01e5\u01dc\3\2\2"+
		"\2\u01e5\u01e0\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6{\3\2\2\2\u01e7\u01ec"+
		"\5~@\2\u01e8\u01e9\t\7\2\2\u01e9\u01eb\5~@\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed}\3\2\2\2"+
		"\u01ee\u01ec\3\2\2\2\u01ef\u01f5\5\u0080A\2\u01f0\u01f1\7I\2\2\u01f1\u01f2"+
		"\5\u0080A\2\u01f2\u01f3\7J\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01ef\3\2\2\2"+
		"\u01f4\u01f0\3\2\2\2\u01f5\177\3\2\2\2\u01f6\u01fb\5\u0082B\2\u01f7\u01f8"+
		"\t\b\2\2\u01f8\u01fa\5\u0082B\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0081\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u0200\t\7\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0205\7R\2\2\u0205\u0083\3\2\2\2\u0206\u0207\7R\2\2\u0207\u0085"+
		"\3\2\2\2\u0208\u0209\7L\2\2\u0209\u0087\3\2\2\2\u020a\u020e\7G\2\2\u020b"+
		"\u020d\5\u008cG\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0212\7H\2\2\u0212\u0089\3\2\2\2\u0213\u0215\7G\2\2\u0214\u0216\5\u008e"+
		"H\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\7H\2\2\u021a\u008b\3\2"+
		"\2\2\u021b\u021c\7N\2\2\u021c\u008d\3\2\2\2\u021d\u021e\t\t\2\2\u021e"+
		"\u008f\3\2\2\2\35\u0098\u009a\u00a0\u00bd\u00da\u00e0\u00e6\u00ec\u00f2"+
		"\u0102\u0119\u012d\u0165\u017d\u0196\u01a0\u01ad\u01c0\u01cc\u01d9\u01e5"+
		"\u01ec\u01f4\u01fb\u0201\u020e\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}