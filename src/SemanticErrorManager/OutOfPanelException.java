package SemanticErrorManager;

public class OutOfPanelException extends SemanticException{

    public OutOfPanelException(int line, int caracter) {
        super("línea " + line + ":" + caracter + " :  El valor ingresado sobresale el panel de dibujo");
    }
}
