// Generated from C:/Users/alfab/Desktop/Practica Para el Examen 2/Logo/src\logo.g4 by ANTLR 4.8
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
		T__66=67, T__67=68, T__68=69, BRACKET_OPEN=70, BRACKET_CLOSE=71, PAR_OPEN=72, 
		PAR_CLOSE=73, COMMENT=74, NOMBRE=75, NUMERO=76, BOOL=77, STRING=78, CARACTER=79, 
		WS=80;
	public static final int
		RULE_programa = 0, RULE_codigo = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_procedimiento = 4, RULE_haz = 5, RULE_inic = 6, RULE_token = 7, RULE_inc = 8, 
		RULE_avanza = 9, RULE_retrocede = 10, RULE_girarderecha = 11, RULE_girarizquierda = 12, 
		RULE_ocultartortuga = 13, RULE_aparecertortuga = 14, RULE_ponpos = 15, 
		RULE_ponrumbo = 16, RULE_rumbo = 17, RULE_ponx = 18, RULE_pony = 19, RULE_goma = 20, 
		RULE_bajalapiz = 21, RULE_subelapiz = 22, RULE_poncolor = 23, RULE_centro = 24, 
		RULE_espera = 25, RULE_ejecuta = 26, RULE_repite = 27, RULE_si = 28, RULE_sisino = 29, 
		RULE_hasHasta = 30, RULE_hasta = 31, RULE_hazMientras = 32, RULE_mientras = 33, 
		RULE_booleanos = 34, RULE_iguales = 35, RULE_yLogico = 36, RULE_oLogico = 37, 
		RULE_tokenLogico = 38, RULE_expresionLogica = 39, RULE_expresionLogicaSimple = 40, 
		RULE_operadorCondicional = 41, RULE_mayorque = 42, RULE_menorque = 43, 
		RULE_operacionAritmetica = 44, RULE_redondea = 45, RULE_diferencia = 46, 
		RULE_azar = 47, RULE_menos = 48, RULE_producto = 49, RULE_potencia = 50, 
		RULE_division = 51, RULE_resto = 52, RULE_suma = 53, RULE_expresionIndeterminada = 54, 
		RULE_elegir = 55, RULE_cuenta = 56, RULE_ultimo = 57, RULE_elemento = 58, 
		RULE_primero = 59, RULE_borrarPantalla = 60, RULE_tokenNumerico = 61, 
		RULE_expresionNumerica = 62, RULE_expresionNumericaSimple = 63, RULE_expresionMultiplicativa = 64, 
		RULE_expresionMultiplicativaSimple = 65, RULE_expresionConSigno = 66, 
		RULE_numero = 67, RULE_comment = 68, RULE_listaParametros = 69, RULE_lista = 70, 
		RULE_variable = 71, RULE_string = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "codigo", "instrucciones", "instruccion", "procedimiento", 
			"haz", "inic", "token", "inc", "avanza", "retrocede", "girarderecha", 
			"girarizquierda", "ocultartortuga", "aparecertortuga", "ponpos", "ponrumbo", 
			"rumbo", "ponx", "pony", "goma", "bajalapiz", "subelapiz", "poncolor", 
			"centro", "espera", "ejecuta", "repite", "si", "sisino", "hasHasta", 
			"hasta", "hazMientras", "mientras", "booleanos", "iguales", "yLogico", 
			"oLogico", "tokenLogico", "expresionLogica", "expresionLogicaSimple", 
			"operadorCondicional", "mayorque", "menorque", "operacionAritmetica", 
			"redondea", "diferencia", "azar", "menos", "producto", "potencia", "division", 
			"resto", "suma", "expresionIndeterminada", "elegir", "cuenta", "ultimo", 
			"elemento", "primero", "borrarPantalla", "tokenNumerico", "expresionNumerica", 
			"expresionNumericaSimple", "expresionMultiplicativa", "expresionMultiplicativaSimple", 
			"expresionConSigno", "numero", "comment", "listaParametros", "lista", 
			"variable", "string"
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
			"'primero'", "'borrarPantalla'", "'+'", "'-'", "'*'", "'/'", "'\"'", 
			"'['", "']'", "'('", "')'"
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
			null, null, null, null, null, null, null, null, null, null, "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "COMMENT", "NOMBRE", "NUMERO", 
			"BOOL", "STRING", "CARACTER", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			comment();
			setState(147);
			codigo();
			setState(148);
			haz();
			setState(149);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(154);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(151);
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
					case T__35:
					case T__36:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
					case T__63:
						{
						setState(152);
						instrucciones();
						}
						break;
					case T__0:
						{
						setState(153);
						procedimiento();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(158);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					instruccion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		public BorrarPantallaContext borrarPantalla() {
			return getRuleContext(BorrarPantallaContext.class,0);
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
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SisinoContext sisino() {
			return getRuleContext(SisinoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				haz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				inic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				inc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				avanza();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				retrocede();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				girarderecha();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				girarizquierda();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				ocultartortuga();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				aparecertortuga();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				rumbo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(174);
				ponpos();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(175);
				ponrumbo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(176);
				ponx();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(177);
				pony();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(178);
				poncolor();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(179);
				goma();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(180);
				bajalapiz();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(181);
				subelapiz();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(182);
				borrarPantalla();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(183);
				centro();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(184);
				espera();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(185);
				ejecuta();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(186);
				repite();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(187);
				hasHasta();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(188);
				haz();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(189);
				hazMientras();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(190);
				mientras();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(191);
				hasta();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(192);
				si();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(193);
				sisino();
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__0);
			setState(197);
			variable();
			setState(198);
			match(PAR_OPEN);
			setState(199);
			listaParametros();
			setState(200);
			match(PAR_CLOSE);
			setState(201);
			instrucciones();
			setState(202);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitHaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazContext haz() throws RecognitionException {
		HazContext _localctx = new HazContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_haz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__2);
			setState(205);
			variable();
			setState(206);
			token();
			}
		}
		catch (RecognitionException re) {
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitInic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__3);
			setState(209);
			variable();
			setState(210);
			match(T__4);
			setState(211);
			token();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public ExpresionIndeterminadaContext expresionIndeterminada() {
			return getRuleContext(ExpresionIndeterminadaContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				expresionLogica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				expresionNumerica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				expresionIndeterminada();
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(logoParser.BRACKET_OPEN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inc);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__5);
				setState(220);
				match(BRACKET_OPEN);
				setState(221);
				variable();
				setState(222);
				tokenNumerico();
				setState(223);
				match(BRACKET_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__5);
				setState(226);
				match(BRACKET_OPEN);
				setState(227);
				variable();
				setState(228);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitAvanza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_avanza);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__6);
				setState(233);
				tokenNumerico();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(T__7);
				setState(235);
				tokenNumerico();
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitRetrocede(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrocedeContext retrocede() throws RecognitionException {
		RetrocedeContext _localctx = new RetrocedeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_retrocede);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__8);
				setState(239);
				tokenNumerico();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__9);
				setState(241);
				tokenNumerico();
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitGirarderecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarderechaContext girarderecha() throws RecognitionException {
		GirarderechaContext _localctx = new GirarderechaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_girarderecha);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__10);
				setState(245);
				tokenNumerico();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__11);
				setState(247);
				tokenNumerico();
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitGirarizquierda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarizquierdaContext girarizquierda() throws RecognitionException {
		GirarizquierdaContext _localctx = new GirarizquierdaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_girarizquierda);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__12);
				setState(251);
				tokenNumerico();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__13);
				setState(253);
				tokenNumerico();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitOcultartortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OcultartortugaContext ocultartortuga() throws RecognitionException {
		OcultartortugaContext _localctx = new OcultartortugaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ocultartortuga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitAparecertortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AparecertortugaContext aparecertortuga() throws RecognitionException {
		AparecertortugaContext _localctx = new AparecertortugaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aparecertortuga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPonpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonposContext ponpos() throws RecognitionException {
		PonposContext _localctx = new PonposContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ponpos);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__18);
				setState(261);
				match(BRACKET_OPEN);
				setState(262);
				tokenNumerico();
				setState(263);
				tokenNumerico();
				setState(264);
				match(BRACKET_CLOSE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__19);
				setState(267);
				tokenNumerico();
				setState(268);
				tokenNumerico();
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPonrumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonrumboContext ponrumbo() throws RecognitionException {
		PonrumboContext _localctx = new PonrumboContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__20);
			setState(273);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitRumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPonx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonxContext ponx() throws RecognitionException {
		PonxContext _localctx = new PonxContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__22);
			setState(278);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPony(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonyContext pony() throws RecognitionException {
		PonyContext _localctx = new PonyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__23);
			setState(281);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitGoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GomaContext goma() throws RecognitionException {
		GomaContext _localctx = new GomaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_goma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitBajalapiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BajalapizContext bajalapiz() throws RecognitionException {
		BajalapizContext _localctx = new BajalapizContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bajalapiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitSubelapiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubelapizContext subelapiz() throws RecognitionException {
		SubelapizContext _localctx = new SubelapizContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subelapiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPoncolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoncolorContext poncolor() throws RecognitionException {
		PoncolorContext _localctx = new PoncolorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_poncolor);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__29);
				setState(290);
				string();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__30);
				setState(292);
				string();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitCentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitEspera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaContext espera() throws RecognitionException {
		EsperaContext _localctx = new EsperaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__32);
			setState(298);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitEjecuta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ejecuta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__33);
			setState(301);
			match(BRACKET_OPEN);
			setState(302);
			instrucciones();
			setState(303);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitRepite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__34);
			setState(306);
			tokenNumerico();
			setState(307);
			match(BRACKET_OPEN);
			setState(308);
			instrucciones();
			setState(309);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__35);
			setState(312);
			match(PAR_OPEN);
			setState(313);
			tokenLogico();
			setState(314);
			match(PAR_CLOSE);
			setState(315);
			match(BRACKET_OPEN);
			setState(316);
			instrucciones();
			setState(317);
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
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitSisino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SisinoContext sisino() throws RecognitionException {
		SisinoContext _localctx = new SisinoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sisino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__36);
			setState(320);
			match(PAR_OPEN);
			setState(321);
			tokenLogico();
			setState(322);
			match(PAR_CLOSE);
			setState(323);
			match(BRACKET_OPEN);
			setState(324);
			instrucciones();
			setState(325);
			match(BRACKET_CLOSE);
			setState(326);
			match(BRACKET_OPEN);
			setState(327);
			instrucciones();
			setState(328);
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
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitHasHasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasHastaContext hasHasta() throws RecognitionException {
		HasHastaContext _localctx = new HasHastaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_hasHasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__37);
			setState(331);
			match(BRACKET_OPEN);
			setState(332);
			instrucciones();
			setState(333);
			match(BRACKET_CLOSE);
			setState(334);
			match(BRACKET_OPEN);
			setState(335);
			tokenLogico();
			setState(336);
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
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitHasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastaContext hasta() throws RecognitionException {
		HastaContext _localctx = new HastaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__38);
			setState(339);
			match(BRACKET_OPEN);
			setState(340);
			tokenLogico();
			setState(341);
			match(BRACKET_CLOSE);
			setState(342);
			match(BRACKET_OPEN);
			setState(343);
			instrucciones();
			setState(344);
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
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitHazMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazMientrasContext hazMientras() throws RecognitionException {
		HazMientrasContext _localctx = new HazMientrasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_hazMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__39);
			setState(347);
			match(BRACKET_OPEN);
			setState(348);
			instrucciones();
			setState(349);
			match(BRACKET_CLOSE);
			setState(350);
			match(BRACKET_OPEN);
			setState(351);
			tokenLogico();
			setState(352);
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
		public TokenLogicoContext tokenLogico() {
			return getRuleContext(TokenLogicoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__40);
			setState(355);
			match(BRACKET_OPEN);
			setState(356);
			tokenLogico();
			setState(357);
			match(BRACKET_CLOSE);
			setState(358);
			match(BRACKET_OPEN);
			setState(359);
			instrucciones();
			setState(360);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitBooleanos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanosContext booleanos() throws RecognitionException {
		BooleanosContext _localctx = new BooleanosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booleanos);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				iguales();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				yLogico();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitIguales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__41);
			setState(368);
			tokenNumerico();
			setState(369);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenLogicoContext> tokenLogico() {
			return getRuleContexts(TokenLogicoContext.class);
		}
		public TokenLogicoContext tokenLogico(int i) {
			return getRuleContext(TokenLogicoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitYLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YLogicoContext yLogico() throws RecognitionException {
		YLogicoContext _localctx = new YLogicoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_yLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__42);
			setState(372);
			tokenLogico();
			setState(373);
			tokenLogico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenLogicoContext> tokenLogico() {
			return getRuleContexts(TokenLogicoContext.class);
		}
		public TokenLogicoContext tokenLogico(int i) {
			return getRuleContext(TokenLogicoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitOLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OLogicoContext oLogico() throws RecognitionException {
		OLogicoContext _localctx = new OLogicoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oLogico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__43);
			setState(376);
			tokenLogico();
			setState(377);
			tokenLogico();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenLogicoContext extends ParserRuleContext {
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionIndeterminadaContext expresionIndeterminada() {
			return getRuleContext(ExpresionIndeterminadaContext.class,0);
		}
		public TokenLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterTokenLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitTokenLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitTokenLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenLogicoContext tokenLogico() throws RecognitionException {
		TokenLogicoContext _localctx = new TokenLogicoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tokenLogico);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				expresionLogica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				expresionIndeterminada();
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

	public static class ExpresionLogicaContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(logoParser.PAR_OPEN, 0); }
		public ExpresionLogicaSimpleContext expresionLogicaSimple() {
			return getRuleContext(ExpresionLogicaSimpleContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(logoParser.PAR_CLOSE, 0); }
		public BooleanosContext booleanos() {
			return getRuleContext(BooleanosContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(logoParser.BOOL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expresionLogica);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(PAR_OPEN);
				setState(384);
				expresionLogicaSimple();
				setState(385);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				expresionLogicaSimple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(PAR_OPEN);
				setState(389);
				booleanos();
				setState(390);
				match(PAR_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				booleanos();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(BOOL);
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
		}
		public OperadorCondicionalContext operadorCondicional() {
			return getRuleContext(OperadorCondicionalContext.class,0);
		}
		public MayorqueContext mayorque() {
			return getRuleContext(MayorqueContext.class,0);
		}
		public MenorqueContext menorque() {
			return getRuleContext(MenorqueContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionLogicaSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaSimpleContext expresionLogicaSimple() throws RecognitionException {
		ExpresionLogicaSimpleContext _localctx = new ExpresionLogicaSimpleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expresionLogicaSimple);
		try {
			setState(402);
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
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__64:
			case T__65:
			case PAR_OPEN:
			case NOMBRE:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				tokenNumerico();
				setState(397);
				operadorCondicional();
				setState(398);
				tokenNumerico();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				mayorque();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				menorque();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitOperadorCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorCondicionalContext operadorCondicional() throws RecognitionException {
		OperadorCondicionalContext _localctx = new OperadorCondicionalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operadorCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitMayorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorqueContext mayorque() throws RecognitionException {
		MayorqueContext _localctx = new MayorqueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__46);
			setState(407);
			tokenNumerico();
			setState(408);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitMenorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorqueContext menorque() throws RecognitionException {
		MenorqueContext _localctx = new MenorqueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_menorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__47);
			setState(411);
			tokenNumerico();
			setState(412);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitOperacionAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionAritmeticaContext operacionAritmetica() throws RecognitionException {
		OperacionAritmeticaContext _localctx = new OperacionAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operacionAritmetica);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				redondea();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				diferencia();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				azar();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				menos();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				producto();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				potencia();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				division();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 8);
				{
				setState(421);
				resto();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 9);
				{
				setState(422);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitRedondea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedondeaContext redondea() throws RecognitionException {
		RedondeaContext _localctx = new RedondeaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_redondea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__48);
			setState(426);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__49);
			setState(429);
			tokenNumerico();
			setState(431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(430);
					tokenNumerico();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitAzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__50);
			setState(436);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__51);
			setState(439);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitProducto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__52);
			setState(442);
			tokenNumerico();
			setState(444); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(443);
					tokenNumerico();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__53);
			setState(449);
			tokenNumerico();
			setState(450);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__54);
			setState(453);
			tokenNumerico();
			setState(454);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitResto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoContext resto() throws RecognitionException {
		RestoContext _localctx = new RestoContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_resto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__55);
			setState(457);
			tokenNumerico();
			setState(458);
			tokenNumerico();
			}
		}
		catch (RecognitionException re) {
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
		public List<TokenNumericoContext> tokenNumerico() {
			return getRuleContexts(TokenNumericoContext.class);
		}
		public TokenNumericoContext tokenNumerico(int i) {
			return getRuleContext(TokenNumericoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__56);
			setState(461);
			tokenNumerico();
			setState(463); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(462);
					tokenNumerico();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(465); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionIndeterminadaContext extends ParserRuleContext {
		public ElegirContext elegir() {
			return getRuleContext(ElegirContext.class,0);
		}
		public UltimoContext ultimo() {
			return getRuleContext(UltimoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public PrimeroContext primero() {
			return getRuleContext(PrimeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpresionIndeterminadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionIndeterminada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterExpresionIndeterminada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitExpresionIndeterminada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionIndeterminada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionIndeterminadaContext expresionIndeterminada() throws RecognitionException {
		ExpresionIndeterminadaContext _localctx = new ExpresionIndeterminadaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expresionIndeterminada);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				elegir();
				}
				break;
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				ultimo();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				elemento();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				primero();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitElegir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElegirContext elegir() throws RecognitionException {
		ElegirContext _localctx = new ElegirContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__57);
			setState(475);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitCuenta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuentaContext cuenta() throws RecognitionException {
		CuentaContext _localctx = new CuentaContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cuenta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__58);
			setState(478);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitUltimo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UltimoContext ultimo() throws RecognitionException {
		UltimoContext _localctx = new UltimoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ultimo);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__59);
				setState(481);
				lista();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(T__60);
				setState(483);
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
		public TokenNumericoContext tokenNumerico() {
			return getRuleContext(TokenNumericoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__61);
			setState(487);
			tokenNumerico();
			setState(488);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitPrimero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeroContext primero() throws RecognitionException {
		PrimeroContext _localctx = new PrimeroContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__62);
			setState(491);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitBorrarPantalla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorrarPantallaContext borrarPantalla() throws RecognitionException {
		BorrarPantallaContext _localctx = new BorrarPantallaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_borrarPantalla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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

	public static class TokenNumericoContext extends ParserRuleContext {
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public ExpresionIndeterminadaContext expresionIndeterminada() {
			return getRuleContext(ExpresionIndeterminadaContext.class,0);
		}
		public TokenNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenNumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterTokenNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitTokenNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitTokenNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenNumericoContext tokenNumerico() throws RecognitionException {
		TokenNumericoContext _localctx = new TokenNumericoContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tokenNumerico);
		try {
			setState(497);
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
			case T__58:
			case T__64:
			case T__65:
			case PAR_OPEN:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				expresionNumerica();
				}
				break;
			case T__57:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				expresionIndeterminada();
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
		public CuentaContext cuenta() {
			return getRuleContext(CuentaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionNumerica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionNumericaContext expresionNumerica() throws RecognitionException {
		ExpresionNumericaContext _localctx = new ExpresionNumericaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expresionNumerica);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				expresionNumericaSimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(PAR_OPEN);
				setState(501);
				expresionNumericaSimple();
				setState(502);
				match(PAR_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(PAR_OPEN);
				setState(505);
				operacionAritmetica();
				setState(506);
				match(PAR_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				operacionAritmetica();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				cuenta();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionNumericaSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionNumericaSimpleContext expresionNumericaSimple() throws RecognitionException {
		ExpresionNumericaSimpleContext _localctx = new ExpresionNumericaSimpleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expresionNumericaSimple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			expresionMultiplicativa();
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					_la = _input.LA(1);
					if ( !(_la==T__64 || _la==T__65) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(514);
					expresionMultiplicativa();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionMultiplicativaContext expresionMultiplicativa() throws RecognitionException {
		ExpresionMultiplicativaContext _localctx = new ExpresionMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expresionMultiplicativa);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case T__65:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				expresionMultiplicativaSimple();
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(PAR_OPEN);
				setState(522);
				expresionMultiplicativaSimple();
				setState(523);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionMultiplicativaSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionMultiplicativaSimpleContext expresionMultiplicativaSimple() throws RecognitionException {
		ExpresionMultiplicativaSimpleContext _localctx = new ExpresionMultiplicativaSimpleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expresionMultiplicativaSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			expresionConSigno();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66 || _la==T__67) {
				{
				{
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(529);
				expresionConSigno();
				}
				}
				setState(534);
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
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitExpresionConSigno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionConSignoContext expresionConSigno() throws RecognitionException {
		ExpresionConSignoContext _localctx = new ExpresionConSignoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expresionConSigno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__64 || _la==T__65) {
				{
				{
				setState(535);
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
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			numero();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(BRACKET_OPEN);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE) {
				{
				{
				setState(548);
				variable();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
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
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(BRACKET_OPEN);
			setState(558); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557);
				token();
				}
				}
				setState(560); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__42 - 42)) | (1L << (T__43 - 42)) | (1L << (T__46 - 42)) | (1L << (T__47 - 42)) | (1L << (T__48 - 42)) | (1L << (T__49 - 42)) | (1L << (T__50 - 42)) | (1L << (T__51 - 42)) | (1L << (T__52 - 42)) | (1L << (T__53 - 42)) | (1L << (T__54 - 42)) | (1L << (T__55 - 42)) | (1L << (T__56 - 42)) | (1L << (T__57 - 42)) | (1L << (T__58 - 42)) | (1L << (T__59 - 42)) | (1L << (T__60 - 42)) | (1L << (T__61 - 42)) | (1L << (T__62 - 42)) | (1L << (T__64 - 42)) | (1L << (T__65 - 42)) | (1L << (T__68 - 42)) | (1L << (PAR_OPEN - 42)) | (1L << (NOMBRE - 42)) | (1L << (NUMERO - 42)) | (1L << (BOOL - 42)))) != 0) );
			setState(562);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(logoParser.NOMBRE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(logoParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof logoListener ) ((logoListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof logoVisitor ) return ((logoVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__68);
			setState(567);
			match(STRING);
			setState(568);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u023d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u009d\n\3\f\3\16\3\u00a0"+
		"\13\3\3\4\6\4\u00a3\n\4\r\4\16\4\u00a4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00c5\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e9\n\n\3\13\3\13\3\13\3\13\5"+
		"\13\u00ef\n\13\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\r\3\r\3\r\3\r\5\r\u00fb"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u0101\n\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\5\31\u0128\n\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0170\n$\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u0180\n(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u018d\n)\3*\3*\3*\3*\3*\3*\5*\u0195\n*\3+\3+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01aa\n.\3/\3/\3/\3\60\3\60\3"+
		"\60\6\60\u01b2\n\60\r\60\16\60\u01b3\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\6\63\u01bf\n\63\r\63\16\63\u01c0\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\6\67\u01d2\n\67\r\67"+
		"\16\67\u01d3\38\38\38\38\38\58\u01db\n8\39\39\39\3:\3:\3:\3;\3;\3;\3;"+
		"\5;\u01e7\n;\3<\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\5?\u01f4\n?\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\5@\u0201\n@\3A\3A\3A\7A\u0206\nA\fA\16A\u0209\13"+
		"A\3B\3B\3B\3B\3B\5B\u0210\nB\3C\3C\3C\7C\u0215\nC\fC\16C\u0218\13C\3D"+
		"\7D\u021b\nD\fD\16D\u021e\13D\3D\3D\3E\3E\3F\3F\3G\3G\7G\u0228\nG\fG\16"+
		"G\u022b\13G\3G\3G\3H\3H\6H\u0231\nH\rH\16H\u0232\3H\3H\3I\3I\3J\3J\3J"+
		"\3J\3J\2\2K\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\2\t\3\2\21\22\3\2\23\24\3\2\34\35\3\2\36\37\4"+
		"\2\7\7/\60\3\2CD\3\2EF\2\u0242\2\u0094\3\2\2\2\4\u009e\3\2\2\2\6\u00a2"+
		"\3\2\2\2\b\u00c4\3\2\2\2\n\u00c6\3\2\2\2\f\u00ce\3\2\2\2\16\u00d2\3\2"+
		"\2\2\20\u00db\3\2\2\2\22\u00e8\3\2\2\2\24\u00ee\3\2\2\2\26\u00f4\3\2\2"+
		"\2\30\u00fa\3\2\2\2\32\u0100\3\2\2\2\34\u0102\3\2\2\2\36\u0104\3\2\2\2"+
		" \u0110\3\2\2\2\"\u0112\3\2\2\2$\u0115\3\2\2\2&\u0117\3\2\2\2(\u011a\3"+
		"\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u0121\3\2\2\2\60\u0127\3\2\2\2\62"+
		"\u0129\3\2\2\2\64\u012b\3\2\2\2\66\u012e\3\2\2\28\u0133\3\2\2\2:\u0139"+
		"\3\2\2\2<\u0141\3\2\2\2>\u014c\3\2\2\2@\u0154\3\2\2\2B\u015c\3\2\2\2D"+
		"\u0164\3\2\2\2F\u016f\3\2\2\2H\u0171\3\2\2\2J\u0175\3\2\2\2L\u0179\3\2"+
		"\2\2N\u017f\3\2\2\2P\u018c\3\2\2\2R\u0194\3\2\2\2T\u0196\3\2\2\2V\u0198"+
		"\3\2\2\2X\u019c\3\2\2\2Z\u01a9\3\2\2\2\\\u01ab\3\2\2\2^\u01ae\3\2\2\2"+
		"`\u01b5\3\2\2\2b\u01b8\3\2\2\2d\u01bb\3\2\2\2f\u01c2\3\2\2\2h\u01c6\3"+
		"\2\2\2j\u01ca\3\2\2\2l\u01ce\3\2\2\2n\u01da\3\2\2\2p\u01dc\3\2\2\2r\u01df"+
		"\3\2\2\2t\u01e6\3\2\2\2v\u01e8\3\2\2\2x\u01ec\3\2\2\2z\u01ef\3\2\2\2|"+
		"\u01f3\3\2\2\2~\u0200\3\2\2\2\u0080\u0202\3\2\2\2\u0082\u020f\3\2\2\2"+
		"\u0084\u0211\3\2\2\2\u0086\u021c\3\2\2\2\u0088\u0221\3\2\2\2\u008a\u0223"+
		"\3\2\2\2\u008c\u0225\3\2\2\2\u008e\u022e\3\2\2\2\u0090\u0236\3\2\2\2\u0092"+
		"\u0238\3\2\2\2\u0094\u0095\5\u008aF\2\u0095\u0096\5\4\3\2\u0096\u0097"+
		"\5\f\7\2\u0097\u0098\5\4\3\2\u0098\3\3\2\2\2\u0099\u009d\5\u008aF\2\u009a"+
		"\u009d\5\6\4\2\u009b\u009d\5\n\6\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\b\5\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\7\3\2\2\2\u00a6\u00c5\5\f\7\2\u00a7\u00c5\5\16\b\2\u00a8"+
		"\u00c5\5\22\n\2\u00a9\u00c5\5\24\13\2\u00aa\u00c5\5\26\f\2\u00ab\u00c5"+
		"\5\30\r\2\u00ac\u00c5\5\32\16\2\u00ad\u00c5\5\34\17\2\u00ae\u00c5\5\36"+
		"\20\2\u00af\u00c5\5$\23\2\u00b0\u00c5\5 \21\2\u00b1\u00c5\5\"\22\2\u00b2"+
		"\u00c5\5&\24\2\u00b3\u00c5\5(\25\2\u00b4\u00c5\5\60\31\2\u00b5\u00c5\5"+
		"*\26\2\u00b6\u00c5\5,\27\2\u00b7\u00c5\5.\30\2\u00b8\u00c5\5z>\2\u00b9"+
		"\u00c5\5\62\32\2\u00ba\u00c5\5\64\33\2\u00bb\u00c5\5\66\34\2\u00bc\u00c5"+
		"\58\35\2\u00bd\u00c5\5> \2\u00be\u00c5\5\f\7\2\u00bf\u00c5\5B\"\2\u00c0"+
		"\u00c5\5D#\2\u00c1\u00c5\5@!\2\u00c2\u00c5\5:\36\2\u00c3\u00c5\5<\37\2"+
		"\u00c4\u00a6\3\2\2\2\u00c4\u00a7\3\2\2\2\u00c4\u00a8\3\2\2\2\u00c4\u00a9"+
		"\3\2\2\2\u00c4\u00aa\3\2\2\2\u00c4\u00ab\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4"+
		"\u00ad\3\2\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4\u00b0\3\2"+
		"\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c4"+
		"\u00b4\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00b7\3\2"+
		"\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\t\3\2\2\2\u00c6\u00c7\7\3\2\2"+
		"\u00c7\u00c8\5\u0090I\2\u00c8\u00c9\7J\2\2\u00c9\u00ca\5\u008cG\2\u00ca"+
		"\u00cb\7K\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7\4\2\2\u00cd\13\3\2\2\2"+
		"\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5\u0090I\2\u00d0\u00d1\5\20\t\2\u00d1"+
		"\r\3\2\2\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5\u0090I\2\u00d4\u00d5\7\7"+
		"\2\2\u00d5\u00d6\5\20\t\2\u00d6\17\3\2\2\2\u00d7\u00dc\5\u0092J\2\u00d8"+
		"\u00dc\5P)\2\u00d9\u00dc\5~@\2\u00da\u00dc\5n8\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\21\3\2\2"+
		"\2\u00dd\u00de\7\b\2\2\u00de\u00df\7H\2\2\u00df\u00e0\5\u0090I\2\u00e0"+
		"\u00e1\5|?\2\u00e1\u00e2\7I\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4\7\b\2"+
		"\2\u00e4\u00e5\7H\2\2\u00e5\u00e6\5\u0090I\2\u00e6\u00e7\7I\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\23\3\2\2"+
		"\2\u00ea\u00eb\7\t\2\2\u00eb\u00ef\5|?\2\u00ec\u00ed\7\n\2\2\u00ed\u00ef"+
		"\5|?\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\25\3\2\2\2\u00f0"+
		"\u00f1\7\13\2\2\u00f1\u00f5\5|?\2\u00f2\u00f3\7\f\2\2\u00f3\u00f5\5|?"+
		"\2\u00f4\u00f0\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f7"+
		"\7\r\2\2\u00f7\u00fb\5|?\2\u00f8\u00f9\7\16\2\2\u00f9\u00fb\5|?\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\17\2"+
		"\2\u00fd\u0101\5|?\2\u00fe\u00ff\7\20\2\2\u00ff\u0101\5|?\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\33\3\2\2\2\u0102\u0103\t\2\2\2\u0103"+
		"\35\3\2\2\2\u0104\u0105\t\3\2\2\u0105\37\3\2\2\2\u0106\u0107\7\25\2\2"+
		"\u0107\u0108\7H\2\2\u0108\u0109\5|?\2\u0109\u010a\5|?\2\u010a\u010b\7"+
		"I\2\2\u010b\u0111\3\2\2\2\u010c\u010d\7\26\2\2\u010d\u010e\5|?\2\u010e"+
		"\u010f\5|?\2\u010f\u0111\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010c\3\2\2"+
		"\2\u0111!\3\2\2\2\u0112\u0113\7\27\2\2\u0113\u0114\5|?\2\u0114#\3\2\2"+
		"\2\u0115\u0116\7\30\2\2\u0116%\3\2\2\2\u0117\u0118\7\31\2\2\u0118\u0119"+
		"\5|?\2\u0119\'\3\2\2\2\u011a\u011b\7\32\2\2\u011b\u011c\5|?\2\u011c)\3"+
		"\2\2\2\u011d\u011e\7\33\2\2\u011e+\3\2\2\2\u011f\u0120\t\4\2\2\u0120-"+
		"\3\2\2\2\u0121\u0122\t\5\2\2\u0122/\3\2\2\2\u0123\u0124\7 \2\2\u0124\u0128"+
		"\5\u0092J\2\u0125\u0126\7!\2\2\u0126\u0128\5\u0092J\2\u0127\u0123\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\61\3\2\2\2\u0129\u012a\7\"\2\2\u012a\63"+
		"\3\2\2\2\u012b\u012c\7#\2\2\u012c\u012d\5|?\2\u012d\65\3\2\2\2\u012e\u012f"+
		"\7$\2\2\u012f\u0130\7H\2\2\u0130\u0131\5\6\4\2\u0131\u0132\7I\2\2\u0132"+
		"\67\3\2\2\2\u0133\u0134\7%\2\2\u0134\u0135\5|?\2\u0135\u0136\7H\2\2\u0136"+
		"\u0137\5\6\4\2\u0137\u0138\7I\2\2\u01389\3\2\2\2\u0139\u013a\7&\2\2\u013a"+
		"\u013b\7J\2\2\u013b\u013c\5N(\2\u013c\u013d\7K\2\2\u013d\u013e\7H\2\2"+
		"\u013e\u013f\5\6\4\2\u013f\u0140\7I\2\2\u0140;\3\2\2\2\u0141\u0142\7\'"+
		"\2\2\u0142\u0143\7J\2\2\u0143\u0144\5N(\2\u0144\u0145\7K\2\2\u0145\u0146"+
		"\7H\2\2\u0146\u0147\5\6\4\2\u0147\u0148\7I\2\2\u0148\u0149\7H\2\2\u0149"+
		"\u014a\5\6\4\2\u014a\u014b\7I\2\2\u014b=\3\2\2\2\u014c\u014d\7(\2\2\u014d"+
		"\u014e\7H\2\2\u014e\u014f\5\6\4\2\u014f\u0150\7I\2\2\u0150\u0151\7H\2"+
		"\2\u0151\u0152\5N(\2\u0152\u0153\7I\2\2\u0153?\3\2\2\2\u0154\u0155\7)"+
		"\2\2\u0155\u0156\7H\2\2\u0156\u0157\5N(\2\u0157\u0158\7I\2\2\u0158\u0159"+
		"\7H\2\2\u0159\u015a\5\6\4\2\u015a\u015b\7I\2\2\u015bA\3\2\2\2\u015c\u015d"+
		"\7*\2\2\u015d\u015e\7H\2\2\u015e\u015f\5\6\4\2\u015f\u0160\7I\2\2\u0160"+
		"\u0161\7H\2\2\u0161\u0162\5N(\2\u0162\u0163\7I\2\2\u0163C\3\2\2\2\u0164"+
		"\u0165\7+\2\2\u0165\u0166\7H\2\2\u0166\u0167\5N(\2\u0167\u0168\7I\2\2"+
		"\u0168\u0169\7H\2\2\u0169\u016a\5\6\4\2\u016a\u016b\7I\2\2\u016bE\3\2"+
		"\2\2\u016c\u0170\5H%\2\u016d\u0170\5J&\2\u016e\u0170\5L\'\2\u016f\u016c"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170G\3\2\2\2\u0171"+
		"\u0172\7,\2\2\u0172\u0173\5|?\2\u0173\u0174\5|?\2\u0174I\3\2\2\2\u0175"+
		"\u0176\7-\2\2\u0176\u0177\5N(\2\u0177\u0178\5N(\2\u0178K\3\2\2\2\u0179"+
		"\u017a\7.\2\2\u017a\u017b\5N(\2\u017b\u017c\5N(\2\u017cM\3\2\2\2\u017d"+
		"\u0180\5P)\2\u017e\u0180\5n8\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2"+
		"\u0180O\3\2\2\2\u0181\u0182\7J\2\2\u0182\u0183\5R*\2\u0183\u0184\7K\2"+
		"\2\u0184\u018d\3\2\2\2\u0185\u018d\5R*\2\u0186\u0187\7J\2\2\u0187\u0188"+
		"\5F$\2\u0188\u0189\7K\2\2\u0189\u018d\3\2\2\2\u018a\u018d\5F$\2\u018b"+
		"\u018d\7O\2\2\u018c\u0181\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018dQ\3\2\2\2\u018e\u018f"+
		"\5|?\2\u018f\u0190\5T+\2\u0190\u0191\5|?\2\u0191\u0195\3\2\2\2\u0192\u0195"+
		"\5V,\2\u0193\u0195\5X-\2\u0194\u018e\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195S\3\2\2\2\u0196\u0197\t\6\2\2\u0197U\3\2\2\2\u0198"+
		"\u0199\7\61\2\2\u0199\u019a\5|?\2\u019a\u019b\5|?\2\u019bW\3\2\2\2\u019c"+
		"\u019d\7\62\2\2\u019d\u019e\5|?\2\u019e\u019f\5|?\2\u019fY\3\2\2\2\u01a0"+
		"\u01aa\5\\/\2\u01a1\u01aa\5^\60\2\u01a2\u01aa\5`\61\2\u01a3\u01aa\5b\62"+
		"\2\u01a4\u01aa\5d\63\2\u01a5\u01aa\5f\64\2\u01a6\u01aa\5h\65\2\u01a7\u01aa"+
		"\5j\66\2\u01a8\u01aa\5l\67\2\u01a9\u01a0\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9"+
		"\u01a2\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2"+
		"\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"[\3\2\2\2\u01ab\u01ac\7\63\2\2\u01ac\u01ad\5|?\2\u01ad]\3\2\2\2\u01ae"+
		"\u01af\7\64\2\2\u01af\u01b1\5|?\2\u01b0\u01b2\5|?\2\u01b1\u01b0\3\2\2"+
		"\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4_"+
		"\3\2\2\2\u01b5\u01b6\7\65\2\2\u01b6\u01b7\5|?\2\u01b7a\3\2\2\2\u01b8\u01b9"+
		"\7\66\2\2\u01b9\u01ba\5|?\2\u01bac\3\2\2\2\u01bb\u01bc\7\67\2\2\u01bc"+
		"\u01be\5|?\2\u01bd\u01bf\5|?\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1e\3\2\2\2\u01c2\u01c3\7"+
		"8\2\2\u01c3\u01c4\5|?\2\u01c4\u01c5\5|?\2\u01c5g\3\2\2\2\u01c6\u01c7\7"+
		"9\2\2\u01c7\u01c8\5|?\2\u01c8\u01c9\5|?\2\u01c9i\3\2\2\2\u01ca\u01cb\7"+
		":\2\2\u01cb\u01cc\5|?\2\u01cc\u01cd\5|?\2\u01cdk\3\2\2\2\u01ce\u01cf\7"+
		";\2\2\u01cf\u01d1\5|?\2\u01d0\u01d2\5|?\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4m\3\2\2\2\u01d5"+
		"\u01db\5p9\2\u01d6\u01db\5t;\2\u01d7\u01db\5v<\2\u01d8\u01db\5x=\2\u01d9"+
		"\u01db\5\u0090I\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbo\3\2\2\2\u01dc"+
		"\u01dd\7<\2\2\u01dd\u01de\5\u008eH\2\u01deq\3\2\2\2\u01df\u01e0\7=\2\2"+
		"\u01e0\u01e1\5\u008eH\2\u01e1s\3\2\2\2\u01e2\u01e3\7>\2\2\u01e3\u01e7"+
		"\5\u008eH\2\u01e4\u01e5\7?\2\2\u01e5\u01e7\5\u008eH\2\u01e6\u01e2\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7u\3\2\2\2\u01e8\u01e9\7@\2\2\u01e9\u01ea"+
		"\5|?\2\u01ea\u01eb\5\u008eH\2\u01ebw\3\2\2\2\u01ec\u01ed\7A\2\2\u01ed"+
		"\u01ee\5\u008eH\2\u01eey\3\2\2\2\u01ef\u01f0\7B\2\2\u01f0{\3\2\2\2\u01f1"+
		"\u01f4\5~@\2\u01f2\u01f4\5n8\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2"+
		"\u01f4}\3\2\2\2\u01f5\u0201\5\u0080A\2\u01f6\u01f7\7J\2\2\u01f7\u01f8"+
		"\5\u0080A\2\u01f8\u01f9\7K\2\2\u01f9\u0201\3\2\2\2\u01fa\u01fb\7J\2\2"+
		"\u01fb\u01fc\5Z.\2\u01fc\u01fd\7K\2\2\u01fd\u0201\3\2\2\2\u01fe\u0201"+
		"\5Z.\2\u01ff\u0201\5r:\2\u0200\u01f5\3\2\2\2\u0200\u01f6\3\2\2\2\u0200"+
		"\u01fa\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\177\3\2\2"+
		"\2\u0202\u0207\5\u0082B\2\u0203\u0204\t\7\2\2\u0204\u0206\5\u0082B\2\u0205"+
		"\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0081\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u0210\5\u0084C\2\u020b"+
		"\u020c\7J\2\2\u020c\u020d\5\u0084C\2\u020d\u020e\7K\2\2\u020e\u0210\3"+
		"\2\2\2\u020f\u020a\3\2\2\2\u020f\u020b\3\2\2\2\u0210\u0083\3\2\2\2\u0211"+
		"\u0216\5\u0086D\2\u0212\u0213\t\b\2\2\u0213\u0215\5\u0086D\2\u0214\u0212"+
		"\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0085\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\t\7\2\2\u021a\u0219\3\2"+
		"\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\5\u0088E\2\u0220\u0087"+
		"\3\2\2\2\u0221\u0222\7N\2\2\u0222\u0089\3\2\2\2\u0223\u0224\7L\2\2\u0224"+
		"\u008b\3\2\2\2\u0225\u0229\7H\2\2\u0226\u0228\5\u0090I\2\u0227\u0226\3"+
		"\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7I\2\2\u022d\u008d\3\2"+
		"\2\2\u022e\u0230\7H\2\2\u022f\u0231\5\20\t\2\u0230\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\7I\2\2\u0235\u008f\3\2\2\2\u0236\u0237\7M\2\2\u0237\u0091"+
		"\3\2\2\2\u0238\u0239\7G\2\2\u0239\u023a\7P\2\2\u023a\u023b\7G\2\2\u023b"+
		"\u0093\3\2\2\2 \u009c\u009e\u00a4\u00c4\u00db\u00e8\u00ee\u00f4\u00fa"+
		"\u0100\u0110\u0127\u016f\u017f\u018c\u0194\u01a9\u01b3\u01c0\u01d3\u01da"+
		"\u01e6\u01f3\u0200\u0207\u020f\u0216\u021c\u0229\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}