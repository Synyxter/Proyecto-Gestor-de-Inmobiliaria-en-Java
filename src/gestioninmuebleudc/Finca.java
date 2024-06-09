/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninmuebleudc;

public class Finca extends Inmueble {
    private String descripcion;

    public Finca(String direccion, float precioAlquiler, String descripcion, int alquilado, int id) {
        super(direccion, precioAlquiler, alquilado, id);
        this.descripcion = descripcion;
    }

    @Override
    public float consultarPrecioAlquiler() {
        return precioAlquiler;
    }

}