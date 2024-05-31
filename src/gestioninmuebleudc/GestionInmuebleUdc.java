package gestioninmuebleudc;

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
    
    public GestionInmuebleUdc() {
        listaInmuebles = new ArrayList<Inmueble>();
        listaUsuarios = new ArrayList<Usuario>();
        listaMovimientosBancarios = new ArrayList<MovimientoBancario>();
    }
     
    //main
     public static void main(String[] args) {
        
        GestionInmuebleUdc InmuebleUdc = new GestionInmuebleUdc(); //instanciamos
        //con esto conseguimos crear un objeto del JFrame
        Inicio inicio = new Inicio(); //creamos un objeto
        inicio.setVisible(true); //hacemos visible la ventana del JFrame
        MenuEmpresa empresa = new MenuEmpresa();
        MenuIngreso mi = new MenuIngreso();
        String rutaInmuebles = "inmuebles.txt";
        String rutaUsuarios = "usuarios.txt";
        String rutaMovimientos = "movimientos.txt";
        
        InmuebleUdc.listaInmuebles = leerTextoInmueble(rutaInmuebles);
        InmuebleUdc.listaUsuarios = leerTextoUsuario(rutaUsuarios);
        InmuebleUdc.listaMovimientosBancarios = leerTextoMovimientoBancario(rutaMovimientos);

        inicio.setVisible(true);
        
        //esto esta en comentario porque esta siendo pasado al JFRAME en forma de interfaz grafica
        //NO BORRAR AUN
        /*

                + "1. Agregar Inmueble\n"
                + "2. Agregar Usuario\n"
                + "3. Movimiento Bancario\n"
        
         switch(seleccion){
             
            case 1: //seleccion de opciones
                + "1. Edificio\n"
                + "2. Local\n"
                + "3. Piso\n"
                + "4. Finca","Cyberia",JOptionPane.QUESTION_MESSAGE);
                
                int aux = Integer.parseInt(s);
                //sub-menu de inmuebles
                switch(aux){
                    case 1:
//                        InmuebleUdc.agregarEdificio();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;    
                }
                
            case 2:
                //llamado al metodo  
                break;
                
            case 3:    //sin terminar, copiado y pegado, movimiento bancario, falta agregarlo bien
                s = JOptionPane.showInputDialog(null,"Desea\n"
                + "1. Edificio\n"
                + "2. Local\n"
                + "3. Piso\n"
                + "4. Finca","Cyberia",JOptionPane.QUESTION_MESSAGE); 
                break;
                
             case 0: 
                 break;
         }
        }while(seleccion != 0); */
        }
    
     
//NO BORRAR AUN     
 /*   
//metodo para agregar un edificio
    public void agregarEdificio(){
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion","Cyberia",JOptionPane.QUESTION_MESSAGE);
        
        String s = JOptionPane.showInputDialog(null, "Ingrese la direccion","Cyberia",JOptionPane.QUESTION_MESSAGE);
        float precioAlquiler = Float.parseFloat(s);
        
        listaInmuebles.add(new Edificio(direccion, precioAlquiler));
        
        s = JOptionPane.showInputDialog(null,"Desea Agregarle a su Edificio\n"
                + "1. Un local\n"
                + "2. Un piso","Cyberia",JOptionPane.QUESTION_MESSAGE);
        int aux = Integer.parseInt(s);
        
        switch(aux){
            case 1:
                break;
            case 2:
                break;
        } 
 
        JOptionPane.showInputDialog(null,"SU DIRECCION ES: " + listaInmuebles.getLast().getDireccion());
        
    }

    
   */ 

 // Método para escribir la lista de inmuebles a un archivo de texto
    public static void escribirTextoInmueble(String ruta, ArrayList<Inmueble> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (Inmueble inmueble : lista) {
                writer.write(inmueble.toString()); // Convertimos el objeto a una cadena
                writer.newLine(); // Añadimos una nueva línea
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
    }

    // Método para leer la lista de inmuebles desde un archivo de texto
    public static ArrayList<Inmueble> leerTextoInmueble(String ruta) {
        ArrayList<Inmueble> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Inmueble inmueble = Inmueble.fromString(line); // Convertimos la cadena a un objeto
                lista.add(inmueble); // Añadimos el objeto a la lista
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
        return lista;
    }

    // Método para escribir la lista de usuarios a un archivo de texto
    public static void escribirTextoUsuario(String ruta, ArrayList<Usuario> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (Usuario usuario : lista) {
                writer.write(usuario.toString()); // Convertimos el objeto a una cadena
                writer.newLine(); // Añadimos una nueva línea
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
    }

    // Método para leer la lista de usuarios desde un archivo de texto
    public static ArrayList<Usuario> leerTextoUsuario(String ruta) {
        ArrayList<Usuario> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Usuario usuario = Usuario.fromString(line); // Convertimos la cadena a un objeto
                lista.add(usuario); // Añadimos el objeto a la lista
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
        return lista;
    }

    // Método para escribir la lista de movimientos bancarios a un archivo de texto
    public static void escribirTextoMovimientoBancario(String ruta, ArrayList<MovimientoBancario> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (MovimientoBancario movimiento : lista) {
                writer.write(movimiento.toString()); // Convertimos el objeto a una cadena
                writer.newLine(); // Añadimos una nueva línea
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
    }

    // Método para leer la lista de movimientos bancarios desde un archivo de texto
    public static ArrayList<MovimientoBancario> leerTextoMovimientoBancario(String ruta) {
        ArrayList<MovimientoBancario> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = reader.readLine()) != null) {
                MovimientoBancario movimiento = MovimientoBancario.fromString(line); // Convertimos la cadena a un objeto
                lista.add(movimiento); // Añadimos el objeto a la lista
            }
        } catch (IOException ex) {
            System.out.println(ex); // Imprimimos cualquier error que ocurra
        }
        return lista;
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
