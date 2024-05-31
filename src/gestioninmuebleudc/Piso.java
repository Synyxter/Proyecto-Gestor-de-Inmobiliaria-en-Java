package gestioninmuebleudc;

public class Piso extends Inmueble {
    public static int numeroPiso;
    public static String descripcion;

    public Piso(String direccion, float precioAlquiler, int numeroPiso, String descripcion) {
        super(direccion, precioAlquiler);
        this.numeroPiso = numeroPiso;
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler() {
        return precioAlquiler;
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


