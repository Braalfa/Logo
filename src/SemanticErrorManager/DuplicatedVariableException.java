package SemanticErrorManager;

public class DuplicatedVariableException extends SemanticException{
    public DuplicatedVariableException(int line, int caracter ,String variable) {
        super("línea " + line + ":" + caracter + " : la variable " + variable + " ya está definida");
    }
}
