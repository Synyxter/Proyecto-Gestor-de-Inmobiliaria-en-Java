
package gestioninmuebleudc;


public class Local extends Inmueble {
    public static String descripcion;

    public Local(String direccion, float precioAlquiler, String descripcion) {
        super(direccion, precioAlquiler);
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    
}