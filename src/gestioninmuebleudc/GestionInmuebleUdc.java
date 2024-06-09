package gestioninmuebleudc;

import interfazMain.Inicio;
import interfazMain.MenuIngreso;
import interfazEmpresa.MenuEmpresa;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class GestionInmuebleUdc {
    //atributos publicos para que puedan ser utilizados en otras clases
    public static ArrayList<Inmueble> listaInmuebles;
    public static ArrayList<Usuario> listaUsuarios;
    public static ArrayList<MovimientoBancario> listaMovimientosBancarios;
    
    private static String RUTA_USUARIOS = "usuarios.txt";
    private static String RUTA_INMUEBLES = "inmuebles.txt";
    private static String RUTA_MOVIMIENTOS = "movimientos.txt";

    public GestionInmuebleUdc() {
        listaInmuebles = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaMovimientosBancarios = new ArrayList<>();
    }
     
    //main
     public static void main(String[] args) {
        
        GestionInmuebleUdc InmuebleUdc = new GestionInmuebleUdc(); //instanciamos
        //con esto conseguimos crear un objeto del JFrame
        Inicio inicio = new Inicio(); //creamos un objeto
        inicio.setVisible(true); //hacemos visible la ventana del JFrame
        
        //zz
        MenuEmpresa empresa = new MenuEmpresa();
        MenuIngreso mi = new MenuIngreso();
        
         RUTA_INMUEBLES = "inmuebles.txt";
         RUTA_USUARIOS = "usuarios.txt";
         RUTA_MOVIMIENTOS  = "movimientos.txt";
        
        InmuebleUdc.leerArchivoInmuebles();
        InmuebleUdc.leerArchivoUsuarios();
        InmuebleUdc.leerArchivoMovimientos();
        }
    
 // Método para escribir inmuebles a un archivo
    private void escribirArchivoInmuebles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_INMUEBLES))) {
            for (Inmueble inmueble : listaInmuebles) {
                writer.write(inmueble.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void leerArchivoInmuebles() {
    try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_INMUEBLES))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            switch (datos[0]) { // datos[0] debe ser el tipo del inmueble, como "Edificio", "Piso", etc.
                case "Edificio":
                    // Asumiendo que el orden y tipos correctos son: String (direccion), float (area)
                    Edificio edificio = new Edificio(datos[1], Float.parseFloat(datos[2]),Boolean.parseBoolean(datos[3]));
                    listaInmuebles.add(edificio);
                    break;
                case "Piso":
                    // Asumiendo que el orden y tipos correctos son: String (direccion), float (area), int (numero de habitaciones), String (propietario)
                    Piso piso = new Piso(datos[1], Float.parseFloat(datos[4]), Integer.parseInt(datos[5]), datos[2],Boolean.parseBoolean(datos[4]));
                    listaInmuebles.add(piso);
                    break;
                case "Local":
                    // Asumiendo que el orden y tipos correctos son: String (direccion), String (descripcion), float (area), String (propietario)
                    Local local = new Local(datos[1], Float.parseFloat(datos[2]), datos[3], Boolean.parseBoolean(datos[4]));
                    listaInmuebles.add(local);
                    break;
                case "Finca":
                  //Falta completar la clase finca
                default:
                    System.out.println("Tipo de inmueble desconocido: " + datos[0]);
                    break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    // Método para escribir la lista de usuarios a un archivo de texto
    private void escribirArchivoUsuarios() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_USUARIOS))) {
            for (Usuario usuario : listaUsuarios) {
                writer.write(usuario.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   // Método para leer usuarios de un archivo
    private void leerArchivoUsuarios() {
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_USUARIOS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Usuario usuario = new Usuario(datos[0], datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]);
                listaUsuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para escribir movimientos a un archivo
    private void escribirArchivoMovimientos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_MOVIMIENTOS))) {
            for (MovimientoBancario movimiento : listaMovimientosBancarios) {
                writer.write(movimiento.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void leerArchivoMovimientos() {
    try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_MOVIMIENTOS))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            String tipoMovimiento = datos[0];
            Date fecha = new Date(Long.parseLong(datos[1]));
            float importe = Float.parseFloat(datos[2]); // Asegúrate que el tipo de dato coincida con el del constructor
            String deudor = datos[3];
            String acreedor = datos[4];
            Inmueble inmueble = buscarInmueblePorDireccion(datos[5]);
            if (inmueble != null) { // Asegurarse que el inmueble no es null antes de crear el objeto
                 MovimientoBancario movimiento = new MovimientoBancario(tipoMovimiento, fecha, importe, deudor, acreedor);
                listaMovimientosBancarios.add(movimiento);
            } else {
                System.out.println("No se encontró el inmueble con dirección: " + datos[5]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    //Metodo que busca inmuebles por direccion.
     private Inmueble buscarInmueblePorDireccion(String direccion) {
        for (Inmueble inmueble : listaInmuebles) {
            if (inmueble.getDireccion().equals(direccion)) {
                return inmueble;
            }
        }
        return null; // o manejar de alguna manera que no se encontró el inmueble
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
    
    //se crearon los get

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<MovimientoBancario> getListaMovimientosBancarios() {
        return listaMovimientosBancarios;
    }

    public static void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        GestionInmuebleUdc.listaInmuebles = listaInmuebles;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaMovimientosBancarios(ArrayList<MovimientoBancario> listaMovimientosBancarios) {
        this.listaMovimientosBancarios = listaMovimientosBancarios;
    }
    
    
    
}