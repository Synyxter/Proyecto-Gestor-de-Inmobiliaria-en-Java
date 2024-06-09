
package gestioninmuebleudc;


public class Local extends Inmueble {
    public static String descripcion;

    public Local(String direccion, float precioAlquiler, String descripcion, boolean alquilado) {
        super(direccion, precioAlquiler, alquilado);
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler() {
        return precioAlquiler;
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

    public boolean isAlquilado() {
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

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    
    
}