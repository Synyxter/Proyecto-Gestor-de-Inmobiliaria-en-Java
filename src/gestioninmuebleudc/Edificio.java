package gestioninmuebleudc;
import java.util.ArrayList;

public class Edificio extends Inmueble {
    private String nombreEdificio; //el nombre del edificio sera usado como una ID
    public static ArrayList<Piso> listaPisos; //
    public static ArrayList<Local> listaLocales; //
    
    //este impuesto varia dependiendo la clase
    public final static double IMPUESTO = 0.4; //cremaos este atributo static
    //es final porque no varia, es un valor que no modificadores
    
    public Edificio(String direccion, float precioAlquiler, int alquilado, int id) {
        super(direccion, precioAlquiler, alquilado, id);
        listaPisos = new ArrayList<>();
        listaLocales = new ArrayList<>();
    }

    //ponemos en static para poder utilizar este metodo desde otra clase
    public static void agregarPiso(Piso piso) {
        listaPisos.add(piso);
    }

    public static void agregarLocal(Local local) {
        listaLocales.add(local);
    }
    @Override
    public float consultarPrecioAlquiler(int i) {
        GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler = this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
        return this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
    }
}
