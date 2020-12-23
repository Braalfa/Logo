package SemanticErrorManager;

public class InvalidColorException extends SemanticException {
    public InvalidColorException(int line, int caracter, String colorInvalido) {
        super("línea " + line + ":" + caracter + " : el color "+ colorInvalido + " no es permitido ");
    }
}
