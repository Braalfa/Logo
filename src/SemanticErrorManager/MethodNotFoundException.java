package SemanticErrorManager;

public class MethodNotFoundException extends SemanticException{

    public MethodNotFoundException(int line, int caracter ,String variable, int cantParam) {
        super("línea " + line + ":" + caracter + " : el procedimiento " + variable + " con " + cantParam + " parámetros no existe");
    }
}
