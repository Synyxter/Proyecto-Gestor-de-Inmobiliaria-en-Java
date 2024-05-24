package gestioninmuebleudc;
import java.util.ArrayList;

public class Edificio extends Inmueble {
    private ArrayList<Piso> listaPisos;
    private ArrayList<Local> listaLocales;

    public Edificio(String direccion, float precioAlquiler) {
        super(direccion, precioAlquiler);
        listaPisos = new ArrayList<>();
        listaLocales = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        listaPisos.add(piso);
    }

    public void agregarLocal(Local local) {
        listaLocales.add(local);
    }

    @Override
    public float consultarPrecioAlquiler() {
        return precioAlquiler;
    }
}
