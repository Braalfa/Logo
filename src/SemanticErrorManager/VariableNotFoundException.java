package SemanticErrorManager;

public class VariableNotFoundException extends SemanticException{

    public VariableNotFoundException(int line, int caracter ,String variable) {
        super("línea " + line + ":" + caracter + " : la variable " + variable + " no existe");
    }

}
