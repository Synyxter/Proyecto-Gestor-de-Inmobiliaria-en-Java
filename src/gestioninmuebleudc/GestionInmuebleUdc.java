package gestioninmuebleudc;

import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionInmuebleUdc {
    //atributos
    private ArrayList<Inmueble> listaInmuebles;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<MovimientoBancario> listaMovimientosBancarios;
     
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
        
        //esto esta en comentario porque esta siendo pasado al JFRAME en forma de interfaz grafica
        //NO BORRAR AUN
        /*
        int seleccion = 0;
        
        do{ //do while del menu
        String s = JOptionPane.showInputDialog(null,"Desea\n"
                + "1. Agregar Inmueble\n"
                + "2. Agregar Usuario\n"
                + "3. Movimiento Bancario\n"
                + "\n"
                + "0. Exit","Cyberia",JOptionPane.QUESTION_MESSAGE);
        seleccion = Integer.parseInt(s);
        
         switch(seleccion){
             
            case 1: //seleccion de opciones
                s = JOptionPane.showInputDialog(null,"Desea\n"
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
