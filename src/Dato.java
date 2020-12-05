import java.util.ArrayList;

public class Dato {
    private Object dato;
    private int tipo;
    private ArrayList<Integer> tipos;

    private final int TYPE_STRING=0;
    private final int TYPE_BOOL=1;
    private final int TYPE_INT=2;
    private final int TYPE_ARRAY=3;


    public Object getDato() {
        return dato;
    }

    public int getTipo() {
        return tipo;
    }

    public int getTYPE_STRING() {
        return TYPE_STRING;
    }

    public int getTYPE_BOOL() {
        return TYPE_BOOL;
    }

    public int getTYPE_INT() {
        return TYPE_INT;
    }

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
