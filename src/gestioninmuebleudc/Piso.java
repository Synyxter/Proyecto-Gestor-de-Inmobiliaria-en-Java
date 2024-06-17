package gestioninmuebleudc;

public class Piso extends Inmueble {
    public static int numeroPiso;
    public static String descripcion;
    
    //este impuesto varia dependiendo la clase
    public final static float IMPUESTO = 0.2f; //cremaos este atributo static
    //es final porque no varia, es un valor que no modificadores
    
    public Piso(String direccion, float precioAlquiler, int numeroPiso, String descripcion, int alquilado, int id) {
        super(direccion, precioAlquiler,alquilado,id);
        this.numeroPiso = numeroPiso;
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler(int i) {
        GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler = GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler + (GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler * (IMPUESTO));
        return GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    
}


