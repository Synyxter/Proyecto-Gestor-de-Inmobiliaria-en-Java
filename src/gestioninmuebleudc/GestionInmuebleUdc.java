package gestioninmuebleudc;

import java.util.List;
import java.util.Map;

public class GestionInmuebleUdc {
    private List<Inmueble> listaInmuebles;
    private List<Usuario> listaUsuarios;
    private List<MovimientoBancario> listaMovimientosBancarios;
    
     public static void main(String[] args) {
        // TODO code application logic here
    }
    

    public void agregarInmueble(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
    }

    public void modificarInmueble(String direccion, int numero, Map<String, Object> nuevosDatos) {
        
    }

    public void eliminarInmueble(String direccion, int numero) {
        
    }

    public List<Inmueble> consultarInmuebles(String direccion) {
        
        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void registrarAlquiler(String identificadorUsuario, Inmueble inmueble) {
       
    }

    public void registrarDesalquiler(String identificadorUsuario, Inmueble inmueble) {
        
    }

    public void recibirFactura(Factura factura) {
       
    }

    public void pagarProveedor(Cheque cheque) {
       
    }

    public List<MovimientoBancario> consultarMovimientosBancarios(Inmueble inmueble, Date periodo) {
 
      
        return null;
    }
}
