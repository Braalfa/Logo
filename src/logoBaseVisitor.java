// Generated from C:/Users/alfab/Desktop/Practica Para el Examen 2/Logo/src\logo.g4 by ANTLR 4.8
import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;
import org.omg.DynamicAny.DynArray;

import java.awt.image.AreaAveragingScaleFilter;
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

	private final Map<String, Funcion> funcionMap = new HashMap<>();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPrograma(logoParser.ProgramaContext ctx) {
		visitChildren(ctx);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitCodigo(logoParser.CodigoContext ctx) {
		visitChildren(ctx);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInstrucciones(logoParser.InstruccionesContext ctx) {
		visitChildren(ctx);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInstruccion(logoParser.InstruccionContext ctx) {
		visitChildren(ctx);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitProcedimiento(logoParser.ProcedimientoContext ctx) {
		String variable = visitVariable(ctx.variable()).get(0).getDatoAsString();
		List<Dato> parametros = visitListaParametros(ctx.listaParametros());
		List<String> stringParam = new ArrayList<>();

		for (Dato parametro : parametros) {
			stringParam.add(parametro.getDatoAsString());
		}

		funcionMap.put(variable, new Funcion(variable, stringParam, ctx.instrucciones()));
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitHaz(logoParser.HazContext ctx) {
		String variable = ctx.variable().getText();
		Dato token = visitToken(ctx.token()).get(0);

		if (token.getTipo() == Dato.TYPE_STRING){
			stringStringMap.put(variable,token.getDatoAsString());
		}else if(token.getTipo() == Dato.TYPE_INT){
			integerMap.put(variable,token.getDatoAsInteger());
		}else{
			booleanMap.put(variable,token.getDatoAsBoolean());
		}

		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInic(logoParser.InicContext ctx) {
		String variable = visitVariable(ctx.variable()).get(0).getDatoAsString();
		Dato token = visitToken(ctx.token()).get(0);

		if (token.getTipo() == Dato.TYPE_STRING){
			stringStringMap.replace(variable,token.getDatoAsString());
		}else if(token.getTipo() == Dato.TYPE_INT){
			integerMap.replace(variable,token.getDatoAsInteger());
		}else{
			booleanMap.replace(variable,token.getDatoAsBoolean());
		}
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitToken(logoParser.TokenContext ctx) {
		return visitChildren(ctx);
		//Listo, dejar asi
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitInc(logoParser.IncContext ctx) {
		String variable = visitVariable(ctx.variable()).get(0).getDatoAsString();
		int currentVar = integerMap.get(variable);

		int incVar;
		if(ctx.tokenNumerico()==null){
			incVar = currentVar + 1;
		} else{
			int incremento = visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
			incVar = currentVar + incremento;
		}
		integerMap.replace(variable,incVar);
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitAvanza(logoParser.AvanzaContext ctx) {
		int pasos= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRetrocede(logoParser.RetrocedeContext ctx) {
		int pasos= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGirarderecha(logoParser.GirarderechaContext ctx) {
		int angulo= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGirarizquierda(logoParser.GirarizquierdaContext ctx) {
		int angulo= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOcultartortuga(logoParser.OcultartortugaContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitAparecertortuga(logoParser.AparecertortugaContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPonpos(logoParser.PonposContext ctx) {
		int posX = visitTokenNumerico(ctx.tokenNumerico(0)).get(0).getDatoAsInteger();
		int posY = visitTokenNumerico(ctx.tokenNumerico(1)).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPonrumbo(logoParser.PonrumboContext ctx) {
		int rumbo= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
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
	@Override public List<Dato> visitPonx(logoParser.PonxContext ctx) {
		int orientacionX= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPony(logoParser.PonyContext ctx) {
		int orientacionY= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		//Do stuff
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitGoma(logoParser.GomaContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitBajalapiz(logoParser.BajalapizContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSubelapiz(logoParser.SubelapizContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitPoncolor(logoParser.PoncolorContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitCentro(logoParser.CentroContext ctx) {
		return new ArrayList<>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitEspera(logoParser.EsperaContext ctx) {
		int espera= visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		try {
			Thread.sleep(espera*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
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
	@Override public List<Dato> visitBooleanos(logoParser.BooleanosContext ctx) {
		return visitChildren(ctx);
		//Listo, dejar asi
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitIguales(logoParser.IgualesContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer n1 =visitTokenNumerico( ctx.tokenNumerico().get(0)).get(0).getDatoAsInteger();
		Integer n2 =visitTokenNumerico( ctx.tokenNumerico().get(1)).get(0).getDatoAsInteger();

		if (n1.equals(n2)){
			returnVal.add(new Dato(true,Dato.TYPE_BOOL));
		}
		else{
			returnVal.add(new Dato(false,Dato.TYPE_BOOL));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitYLogico(logoParser.YLogicoContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Boolean condicion1 =visitTokenLogico( ctx.tokenLogico().get(0)).get(0).getDatoAsBoolean();
		Boolean condicion2 =visitTokenLogico( ctx.tokenLogico().get(1)).get(0).getDatoAsBoolean();

		if (condicion1 && condicion2){
			returnVal.add(new Dato(true,Dato.TYPE_BOOL));
		}
		else{
			returnVal.add(new Dato(false,Dato.TYPE_BOOL));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOLogico(logoParser.OLogicoContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Boolean condicion1 =visitTokenLogico( ctx.tokenLogico().get(0)).get(0).getDatoAsBoolean();
		Boolean condicion2 =visitTokenLogico( ctx.tokenLogico().get(1)).get(0).getDatoAsBoolean();

		if (condicion1 || condicion2){
			returnVal.add(new Dato(true,Dato.TYPE_BOOL));
		}
		else{
			returnVal.add(new Dato(false,Dato.TYPE_BOOL));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitTokenLogico(logoParser.TokenLogicoContext ctx) {
		List<Dato> retlist = new ArrayList<>();
		if(ctx.expresionLogica()!=null){
			retlist=visitExpresionLogica(ctx.expresionLogica());
		}else{
			Dato indeterminado = visitExpresionIndeterminada(ctx.expresionIndeterminada()).get(0);
			if (indeterminado.getTipo() == Dato.TYPE_BOOL) {
				retlist.add(indeterminado);
			}else{
				///Error, no va a devolver nada
			}

		}
		return retlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionLogica(logoParser.ExpresionLogicaContext ctx) {
		List<Dato> returnVal = new ArrayList<>();
		if(ctx.expresionLogicaSimple()!=null){
			returnVal = visitExpresionLogicaSimple(ctx.expresionLogicaSimple());
		}else if(ctx.booleanos()!=null){
			returnVal = visitBooleanos(ctx.booleanos());
		}else if(ctx.BOOL()!=null){
			String symbol=ctx.BOOL().getSymbol().getText();
			if(symbol.equals("TRUE")){
				returnVal.add(new Dato(true, Dato.TYPE_BOOL));
			}else{
				returnVal.add(new Dato(false, Dato.TYPE_BOOL));
			}
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionLogicaSimple(logoParser.ExpresionLogicaSimpleContext ctx) {
		List<Dato> retlist=new ArrayList<>();
		if(ctx.mayorque()!=null){
			retlist= visitMayorque(ctx.mayorque());
		}else if(ctx.menorque()!= null){
			retlist= visitMenorque(ctx.menorque());
		}else{
			int num1 = visitTokenNumerico(ctx.tokenNumerico(0)).get(0).getDatoAsInteger();
			int num2 = visitTokenNumerico(ctx.tokenNumerico(1)).get(0).getDatoAsInteger();
			String operador= visitOperadorCondicional(ctx.operadorCondicional()).get(0).getDatoAsString();
			Boolean result=null;
			switch(operador){
				case ">":
					result= num1>num2;
					break;
				case "<":
					result= num1<num2;
					break;
				case "=":
					result = num1==num2;
					break;
			}
			retlist.add(new Dato(result, Dato.TYPE_BOOL));
		}
		return retlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOperadorCondicional(logoParser.OperadorCondicionalContext ctx) {
		return visitChildren(ctx);
		//Listo, dejar asi
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMayorque(logoParser.MayorqueContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer n1 =visitTokenNumerico( ctx.tokenNumerico(0)).get(0).getDatoAsInteger();
		Integer n2 =visitTokenNumerico( ctx.tokenNumerico(1)).get(0).getDatoAsInteger();

		if (n1 > n2){
			returnVal.add(new Dato(true,Dato.TYPE_BOOL));
		}
		else{
			returnVal.add(new Dato(false,Dato.TYPE_BOOL));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMenorque(logoParser.MenorqueContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer n1 =visitTokenNumerico( ctx.tokenNumerico().get(0)).get(0).getDatoAsInteger();
		Integer n2 =visitTokenNumerico( ctx.tokenNumerico().get(1)).get(0).getDatoAsInteger();

		if (n1 < n2){
			returnVal.add(new Dato(true,Dato.TYPE_BOOL));
		}
		else{
			returnVal.add(new Dato(false,Dato.TYPE_BOOL));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitOperacionAritmetica(logoParser.OperacionAritmeticaContext ctx) {
		return visitChildren(ctx);
		//Listo, dejar asi
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitRedondea(logoParser.RedondeaContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer n1 =visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		Integer result = Math.round(n1);

		returnVal.add(new Dato(result,Dato.TYPE_INT));
		return returnVal;
	}
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
	@Override public List<Dato> visitAzar(logoParser.AzarContext ctx) {
		List<Dato> returnVal= new ArrayList<>();
		Integer rango = visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();

		Random rand= new Random();
		Integer randVal = rand.nextInt(rango+1);

		returnVal.add(new Dato(randVal,Dato.TYPE_INT));

		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitMenos(logoParser.MenosContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer n1 = visitTokenNumerico(ctx.tokenNumerico()).get(0).getDatoAsInteger();
		Integer result = n1*-1;

		returnVal.add(new Dato(result,Dato.TYPE_INT));
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitProducto(logoParser.ProductoContext ctx) {
		List<Dato> dato = new ArrayList<>();
		List<logoParser.TokenNumericoContext> listaContext = ctx.tokenNumerico();

		for(logoParser.TokenNumericoContext tokenNumericoContext: listaContext){
			dato.addAll(visitTokenNumerico(tokenNumericoContext));
		}

		int resultado=dato.get(0).getDatoAsInteger();
		int contador=1;
		while (dato.size()>contador){
			resultado *= dato.get(contador).getDatoAsInteger();
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
	@Override public List<Dato> visitPotencia(logoParser.PotenciaContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer num =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(0).getDatoAsInteger();
		Integer exp =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(1).getDatoAsInteger();

		double result = Math.pow(num, exp);
		returnVal.add(new Dato(result,Dato.TYPE_INT));

		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitDivision(logoParser.DivisionContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer num =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(0).getDatoAsInteger();
		Integer denom =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(1).getDatoAsInteger();

		if(!denom.equals(0)){
			Integer result = num/denom;
			returnVal.add(new Dato(result,Dato.TYPE_INT));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitResto(logoParser.RestoContext ctx) {
		List<Dato> returnVal= new ArrayList<>();

		Integer num =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(0).getDatoAsInteger();
		Integer denom =visitTokenNumerico((logoParser.TokenNumericoContext) ctx.tokenNumerico()).get(1).getDatoAsInteger();

		if(!denom.equals(0)){
			Integer result = num%denom;
			returnVal.add(new Dato(result,Dato.TYPE_INT));
		}
		return returnVal;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitSuma(logoParser.SumaContext ctx) {
		List<Dato> dato = new ArrayList<>();
		List<logoParser.TokenNumericoContext> listaContext = ctx.tokenNumerico();

		for(logoParser.TokenNumericoContext tokenNumericoContext: listaContext){
			dato.addAll(visitTokenNumerico(tokenNumericoContext));
		}

		int resultado=dato.get(0).getDatoAsInteger();
		int contador=1;
		while (dato.size()>contador){
			resultado+=dato.get(contador).getDatoAsInteger();
			contador++;
		}
		Dato retval= new Dato(resultado,Dato.TYPE_INT);
		return retval.toSingleArraylist();
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

		List<Dato> returnVal= new ArrayList<>();
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
	@Override public List<Dato> visitBorrarPantalla(logoParser.BorrarPantallaContext ctx) { return new ArrayList<>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitTokenNumerico(logoParser.TokenNumericoContext ctx) {
		List<Dato> retlist = new ArrayList<>();
		if(ctx.expresionNumerica()!=null){
			retlist=visitExpresionNumerica(ctx.expresionNumerica());
		}else{
			Dato indeterminado = visitExpresionIndeterminada(ctx.expresionIndeterminada()).get(0);
			if (indeterminado.getTipo() == Dato.TYPE_INT) {
				retlist.add(indeterminado);
			}
		}
		return retlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionNumerica(logoParser.ExpresionNumericaContext ctx) {
		List<Dato> retlist;
		if(ctx.expresionNumericaSimple()!=null) {
			retlist= visitExpresionNumericaSimple(ctx.expresionNumericaSimple());
		}else if(ctx.operacionAritmetica()!=null) {
			retlist=visitOperacionAritmetica(ctx.operacionAritmetica());
		}else{
			retlist=visitCuenta(ctx.cuenta());
		}
		return retlist;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionNumericaSimple(logoParser.ExpresionNumericaSimpleContext ctx) {
		List<Dato> datos = visitChildren(ctx);
		int result = datos.get(0).getDatoAsInteger();
		String operador= null;
		for(int i=1; i<datos.size();i++){
			Dato dato= datos.get(i);
			if(i%2==0){
				int nextNum= dato.getDatoAsInteger();
				switch (operador) {
					case "+":
						result+=nextNum;
						break;
					case "-":
						result-=nextNum;
						break;
				}
			}else{
				operador= dato.getDatoAsString();
			}
		}
		Dato retval= new Dato(result,Dato.TYPE_INT);
		return retval.toSingleArraylist();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionMultiplicativa(logoParser.ExpresionMultiplicativaContext ctx) {
		return visitExpresionMultiplicativaSimple(ctx.expresionMultiplicativaSimple());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionMultiplicativaSimple(logoParser.ExpresionMultiplicativaSimpleContext ctx) {
		List<Dato> datos = visitChildren(ctx);
		int result = datos.get(0).getDatoAsInteger();
		String operador= null;
		for(int i=1; i<datos.size();i++){
			Dato dato= datos.get(i);
			if(i%2==0){
				int nextNum= dato.getDatoAsInteger();
				switch (operador) {
					case "*":
						result*=nextNum;
						break;
					case "/":
						result/=nextNum;
						break;
				}
			}else{
				operador= dato.getDatoAsString();
			}
		}
		Dato retval= new Dato(result,Dato.TYPE_INT);
		return retval.toSingleArraylist();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitExpresionConSigno(logoParser.ExpresionConSignoContext ctx) {
		List<Dato> datos = visitChildren(ctx);

		int signo = 1;
		for(int i=0; i<datos.size()-1;i++){
			Dato signoDato= datos.get(i);
			String signoStr= signoDato.getDatoAsString();
			if(signoStr.equals("-")){
				signo*=-1;
			}
		}

		int numero = datos.get(datos.size()-1).getDatoAsInteger();
		Dato retVal=new Dato(numero*signo, Dato.TYPE_INT);

		return retVal.toSingleArraylist();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitNumero(logoParser.NumeroContext ctx) {
		String numeroInt = ctx.NUMERO().getSymbol().getText();
		Dato numeroDato = new Dato(Integer.parseInt(numeroInt),Dato.TYPE_INT);
		List<Dato> datos = new ArrayList<>();
		datos.add(numeroDato);
		return datos;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Dato> visitComment(logoParser.CommentContext ctx) { return new ArrayList<>(); }
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