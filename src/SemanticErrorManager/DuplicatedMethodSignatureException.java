package SemanticErrorManager;

public class DuplicatedMethodSignatureException extends SemanticException{

    public DuplicatedMethodSignatureException(int line, int caracter ,String variable, int cantParam) {
        super("línea " + line + ":" + caracter + " : el procedimiento " + variable + " con " + cantParam +" parámetros ya está definido.");
    }
}
