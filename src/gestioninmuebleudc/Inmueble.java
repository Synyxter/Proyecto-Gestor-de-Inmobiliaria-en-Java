package gestioninmuebleudc;

// Inmueble.java
public abstract class Inmueble {
    //al tratarse de una herencia usamos protected en la clase madre
    protected String direccion;
    protected float precioAlquiler;
    protected int alquilado; //cada inmueble tendra un estado de si alquilado o no alquilado
    protected int id; //cada inmueble tendra un id
    
    public Inmueble(String direccion, float precioAlquiler, int alquilado, int id) {
        this.direccion = direccion;
        this.precioAlquiler = precioAlquiler;
        this.alquilado = alquilado;
        this.id = id;
    }
    
    public abstract float consultarPrecioAlquiler();

    public String getDireccion() {
        return direccion; 
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }
    
    public int getAlquilado(){
        return alquilado;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setAlquilado(int alquilado){
        this.alquilado = alquilado;
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
}
