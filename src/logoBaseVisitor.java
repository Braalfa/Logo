// Generated from C:/Users/alfab/Desktop/Practica Para el Examen 2/Logo/src\logo.g4 by ANTLR 4.8
import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

/**
 * This class provides an empty implementation of {@link logoVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 * 
 * operations with no return type.
 */
public class logoBaseVisitor  implements logoVisitor<List<Dato>> {

	private final Map<String, Integer> integerMap = new HashMap<>();
	private final Map<String, String> stringStringMap = new HashMap<>();
	private final Map<String, Boolean> booleanMap = new HashMap<>();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPrograma(logoParser.ProgramaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitCodigo(logoParser.CodigoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInstrucciones(logoParser.InstruccionesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInstruccion(logoParser.InstruccionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitProcedimiento(logoParser.ProcedimientoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitHaz(logoParser.HazContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInic(logoParser.InicContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitToken(logoParser.TokenContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInc(logoParser.IncContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitAvanza(logoParser.AvanzaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRetrocede(logoParser.RetrocedeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGirarderecha(logoParser.GirarderechaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGirarizquierda(logoParser.GirarizquierdaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOcultartortuga(logoParser.OcultartortugaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitAparecertortuga(logoParser.AparecertortugaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPonpos(logoParser.PonposContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPonrumbo(logoParser.PonrumboContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRumbo(logoParser.RumboContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPonx(logoParser.PonxContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPony(logoParser.PonyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGoma(logoParser.GomaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitBajalapiz(logoParser.BajalapizContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSubelapiz(logoParser.SubelapizContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPoncolor(logoParser.PoncolorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitCentro(logoParser.CentroContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitEspera(logoParser.EsperaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitEjecuta(logoParser.EjecutaContext ctx) {
		visitInstrucciones(ctx.instrucciones());
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRepite(logoParser.RepiteContext ctx) {
		Integer rango=visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		for(int i = 0;i < rango; i++){
			visitInstrucciones(ctx.instrucciones());
		}
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSi(logoParser.SiContext ctx) {
		Boolean condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		if(condicion){
			visitInstrucciones(ctx.instrucciones());
		}
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSisino(logoParser.SisinoContext ctx) {
		Boolean condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		if(condicion){
			visitInstrucciones(ctx.instrucciones(0));
		}else{
			visitInstrucciones(ctx.instrucciones(1));
		}
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitHasHasta(logoParser.HasHastaContext ctx) {
		Boolean condicion;
		do{
			visitInstrucciones(ctx.instrucciones());
			condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		}while (!condicion);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitHasta(logoParser.HastaContext ctx) {
		Boolean condicion = visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		while(!condicion){
			visitInstrucciones(ctx.instrucciones());
			condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		}
		return new ArrayList<>();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitHazMientras(logoParser.HazMientrasContext ctx) {
		Boolean condicion;
		do{
			visitInstrucciones(ctx.instrucciones());
			condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		}while (condicion);
		return new ArrayList<>();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMientras(logoParser.MientrasContext ctx) {
		Boolean condicion = visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		while(condicion){
			visitInstrucciones(ctx.instrucciones());
			condicion=visitTokenLogico(ctx.tokenLogico()).get(0).getDatoAsBoolean();
		}
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitBooleanos(logoParser.BooleanosContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitIguales(logoParser.IgualesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitYLogico(logoParser.YLogicoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOLogico(logoParser.OLogicoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitTokenLogico(logoParser.TokenLogicoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionLogica(logoParser.ExpresionLogicaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionLogicaSimple(logoParser.ExpresionLogicaSimpleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOperadorCondicional(logoParser.OperadorCondicionalContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMayorque(logoParser.MayorqueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMenorque(logoParser.MenorqueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOperacionAritmetica(logoParser.OperacionAritmeticaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRedondea(logoParser.RedondeaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitDiferencia(logoParser.DiferenciaContext ctx) {
		List<Dato> dato = new ArrayList<>();
		List<logoParser.TokenNumericoContext> listaContext = ctx.tokenNumerico();

		for(logoParser.TokenNumericoContext tokenNumericoContext: listaContext){
			dato.addAll(visitTokenNumerico(tokenNumericoContext));
		}

		int resultado=dato.get(0).getDatoAsInteger();
		int contador=1;
		while (dato.size()>contador){
			resultado-=dato.get(contador).getDatoAsInteger();
			contador++;
		}

		List<Dato> returnVal= new ArrayList<>();
		returnVal.add(new Dato(resultado,Dato.TYPE_INT));
		return returnVal;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitAzar(logoParser.AzarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMenos(logoParser.MenosContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitProducto(logoParser.ProductoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPotencia(logoParser.PotenciaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitDivision(logoParser.DivisionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitResto(logoParser.RestoContext ctx) { return visitChildren(ctx);}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSuma(logoParser.SumaContext ctx) {
		List<Dato> dato = visitChildren(ctx);
		int valorSuma=0;
		int contador=1;
		while (dato.size()>contador){
			valorSuma+=dato.get(contador).getDatoAsInteger();
			contador++;
		}
		List<Dato> returnVal= new ArrayList<>();
		returnVal.add(new Dato(valorSuma,Dato.TYPE_INT));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionIndeterminada(logoParser.ExpresionIndeterminadaContext ctx) {
		return visitChildren(ctx);
		//Lista, dejar asi
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitElegir(logoParser.ElegirContext ctx) {
		List<Dato> returnVal = new ArrayList<>();
		List<Dato> lista = visitLista(ctx.lista());
		Random rand= new Random();
		returnVal.add(lista.get(rand.nextInt(lista.size())));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitCuenta(logoParser.CuentaContext ctx) {
		List<Dato> returnVal = new ArrayList<>();
		List<Dato> lista = visitLista(ctx.lista());
		returnVal.add(new Dato(lista.size(),Dato.TYPE_INT));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitUltimo(logoParser.UltimoContext ctx) {
		List<Dato> returnVal = new ArrayList<>();
		List<Dato> lista = visitLista(ctx.lista());
		returnVal.add(lista.get(lista.size()-1));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitElemento(logoParser.ElementoContext ctx){
		List<Dato> lista = visitLista(ctx.lista());
		Integer elemento = visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();

		List<Dato> returnVal= new ArrayList<Dato>();
		returnVal.add(lista.get(elemento));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPrimero(logoParser.PrimeroContext ctx) {
		List<Dato> returnVal = new ArrayList<Dato>();
		returnVal.add(visitLista(ctx.lista()).get(0));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitBorrarPantalla(logoParser.BorrarPantallaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitTokenNumerico(logoParser.TokenNumericoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionNumerica(logoParser.ExpresionNumericaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionNumericaSimple(logoParser.ExpresionNumericaSimpleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionMultiplicativa(logoParser.ExpresionMultiplicativaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionMultiplicativaSimple(logoParser.ExpresionMultiplicativaSimpleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionConSigno(logoParser.ExpresionConSignoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitNumero(logoParser.NumeroContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitComment(logoParser.CommentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitListaParametros(logoParser.ListaParametrosContext ctx) {
		List<Dato> datos = visitChildren(ctx);
		datos.remove(0);
		datos.remove(datos.size()-1);
		return datos;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitLista(logoParser.ListaContext ctx) {
		 List<Dato> datos = visitChildren(ctx);
		 datos.remove(0);
		 datos.remove(datos.size()-1);
		 return datos;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitVariable(logoParser.VariableContext ctx) {
		String key=ctx.NOMBRE().getSymbol().getText();
		Integer integerValue=integerMap.get(key);
		String stringValue=stringStringMap.get(key);
		Boolean boolValue=booleanMap.get(key);
		Dato dato=null;
		if(integerValue!=null){
			dato= new Dato(integerValue,Dato.TYPE_INT);
		}else if(stringValue!=null){
			dato= new Dato(stringValue,Dato.TYPE_STRING);
		}else if(boolValue!=null){
			dato= new Dato(boolValue,Dato.TYPE_BOOL);
		}else{
			///ERROR: la variable no existe
			///Falta manejo de errores
		}
		List<Dato> retval= new ArrayList<>();
		retval.add(dato);
		return retval;
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitString(logoParser.StringContext ctx) {
		return visitChildren(ctx);
		//Lista, dejar asi
	}

	@Override
	public List<Dato> visit(ParseTree parseTree) {
		return parseTree.accept(this);
	}

	@Override
	public List<Dato> visitChildren(RuleNode ruleNode) {
		List<Dato> result = new ArrayList<>();

		int n = ruleNode.getChildCount();

		for(int i = 0; i < n; ++i) {
			ParseTree c = ruleNode.getChild(i);
			List<Dato> childDato = c.accept(this);
			result.addAll(childDato);
		}

		return result;
	}

	@Override
	public List<Dato> visitTerminal(TerminalNode terminalNode) {
		List<Dato> returnVal= new ArrayList<>();
		returnVal.add(new Dato(terminalNode.getSymbol().getText(),Dato.TYPE_STRING));
		return returnVal;
	}

	@Override
	public List<Dato> visitErrorNode(ErrorNode errorNode) {
		return new ArrayList<>();
	}
}