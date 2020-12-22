package SemanticErrorManager;

public class UnexpectedTypeException extends SemanticException{

    public UnexpectedTypeException(int line, int caracter, String esperado, String recibido) {
        super("línea " + line + ":" + caracter + " : tipo de dato erróneo, tipo esperado:" + esperado + "recibido"+ recibido);
    }


}
