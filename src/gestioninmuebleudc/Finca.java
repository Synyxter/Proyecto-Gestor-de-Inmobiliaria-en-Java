
package gestioninmuebleudc;

import javax.swing.JOptionPane;

public class Finca extends Inmueble {
    private String descripcion;
    
    //este impuesto varia dependiendo la clase
    public final static float IMPUESTO = 0.1f; //cremaos este atributo static
    //es final porque no varia, es un valor que no modificadores
    
    public Finca(String direccion, float precioAlquiler, String descripcion, int alquilado, int id) {
        super(direccion, precioAlquiler, alquilado, id);
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler(int i) {
        GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler = this.precioAlquiler + (this.precioAlquiler * (IMPUESTO));
        return GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler;
    }

}