package gestioninmuebleudc;

// Inmueble.java
public abstract class Inmueble {
    //al tratarse de una herencia usamos protected en la clase madre
    protected String direccion;
    protected float precioAlquiler;
    protected boolean alquilado;
    
    public Inmueble(String direccion, float precioAlquiler, boolean alquilado) {
        this.direccion = direccion;
        this.precioAlquiler = precioAlquiler;
    }
    
    public abstract float consultarPrecioAlquiler();

    public String getDireccion() {
        return direccion; 
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }
    
    public boolean getAlquilado(){
        return alquilado;
    }

    /**
     *
     * @param direccion
     */
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
