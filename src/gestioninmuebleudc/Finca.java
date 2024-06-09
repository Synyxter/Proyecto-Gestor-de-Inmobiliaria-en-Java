/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninmuebleudc;

public class Finca extends Inmueble {
    private String descripcion;
    
    //este impuesto varia dependiendo la clase
    public final static double IMPUESTO = 0.1; //cremaos este atributo static
    //es final porque no varia, es un valor que no modificadores
    
    public Finca(String direccion, float precioAlquiler, String descripcion, int alquilado, int id) {
        super(direccion, precioAlquiler, alquilado, id);
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler(int i) {
        GestionInmuebleUdc.listaInmuebles.get(i).precioAlquiler = this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
        return this.precioAlquiler + (this.precioAlquiler * (float)IMPUESTO);
    }

}