import java.util.ArrayList;

public class Dato {
    private Object dato;
    private int tipo;
    private final int TYPE_STRING=0;
    private final int TYPE_BOOL=1;
    private final int TYPE_INT=2;

    public Dato(Object dato, int tipo) {
        this.dato = dato;
        this.tipo = tipo;
    }

    public String getDatoAsString(){
        return (String )dato;
    }

    public Integer getDatoAsInteger(){
        return (Integer) dato;
    }

    public Boolean getDatoAsBoolean(){
        return (Boolean) dato;
    }

    public ArrayList<Object> getDatoAsArrayList(){
        return (ArrayList<Object>) dato;
    }
}
