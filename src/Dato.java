import java.util.ArrayList;

public class Dato {
    private Object dato;
    private int tipo;

    public static final int TYPE_STRING=0;
    public static final int TYPE_BOOL=1;
    public static final int TYPE_INT=2;


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

    public void setTipo(int tipo) {
        this.tipo = tipo;
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

    public ArrayList<Dato> toSingleArraylist(){
        ArrayList<Dato> retval=new ArrayList<>();
        retval.add(this);
        return retval;
    }

    @Override
    public String toString() {
        String datoStr="";
        switch (this.tipo){
            case Dato.TYPE_STRING:
                datoStr=this.getDatoAsString();
                break;
            case Dato.TYPE_BOOL:
                datoStr=this.getDatoAsBoolean().toString();
                break;
            case Dato.TYPE_INT:
                datoStr=this.getDatoAsInteger().toString();
                break;
        }
        return  datoStr;
    }

    public String getTypeAsString() {
        String tipoStr = "";
        switch (this.tipo) {
            case Dato.TYPE_STRING:
                tipoStr = "Hilera";
                break;
            case Dato.TYPE_BOOL:
                tipoStr = "Booleano";
                break;
            case Dato.TYPE_INT:
                tipoStr = "Entero";
                break;
        }
        return tipoStr;
    }

}
