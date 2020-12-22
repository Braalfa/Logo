package SemanticErrorManager;

public class IndexException extends SemanticException{

    public IndexException(int line, int caracter) {
        super("línea " + line + ":" + caracter + " : el elemento buscado no existe");
    }
}
