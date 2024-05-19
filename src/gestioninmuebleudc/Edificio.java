package gestioninmuebleudc;
import java.util.ArrayList;
import java.util.List;

public class Edificio extends Inmueble {
    private List<Piso> listaPisos;
    private List<Local> listaLocales;

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
