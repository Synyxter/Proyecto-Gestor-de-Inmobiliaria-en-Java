
package gestioninmuebleudc;

public class Local extends Inmueble {
    public static String descripcion;
    
    //este impuesto varia dependiendo la clase
    public final static double IMPUESTO = 0.3; //cremaos este atributo static
    //es final porque no varia, es un valor que no modificadores
    
    public Local(String direccion, float precioAlquiler, String descripcion, int alquilado, int id) {
        super(direccion, precioAlquiler, alquilado, id);
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler(int i) {
        GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler = this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
        return this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int isAlquilado() {
        return alquilado;
    }

    
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setAlquilado(int alquilado) {
        this.alquilado = alquilado;
    }
    
    
    
}