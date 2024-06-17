

package interfazUsuario;

import gestioninmuebleudc.GestionInmuebleUdc;
import gestioninmuebleudc.Inmueble;
import gestioninmuebleudc.Recibo;
import java.time.LocalDate;
import gestioninmuebleudc.Usuario;
import static interfazUsuario.InicioSesion.sesionActivaUbic;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InicioExitoso extends javax.swing.JFrame {
    
    //esto sirve para saber si el usuario ya hizo su primer arriendo o no
    public static boolean alquilerYes = false;
    //utilizado para actualizar el dinero
    public static float dineroStatic;
     
    public InicioExitoso() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null); //centramos el menu
    }
    
    public void actualizarDinero(){
        dinero.setText(String.valueOf(GestorPago.dineroStatic)); //igualamos para que en ambos menus se tenga el mismo dinero
    }
    
    public void actualizarFecha(LocalDate date){
        //usamos .format para convertir el LocalDate a String 
        //el parametro del .format sirve para cambiar su formato al de dia, mes, año (por defecto viene año, mes, dia)
        Usuario.time = date;
        String auxString = Usuario.time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fecha.setText(auxString); //ahora pasamos el auxString como para parametro para que se actualice la fecha del menu
        
        //aprovechamos para determinar si se debe pagar o no (si estamos a final de mes o no)
        if(Usuario.time.getDayOfMonth() > 25 && alquilerYes == true){
            debePagar.setText("si");
        } else {
            debePagar.setText("no");
        }
    }
    
    public void llamarRecibo(){
        if(Usuario.time.getDayOfMonth() < 25 && alquilerYes == true){
            GestorPago.gasStatic = 0;
            GestorPago.luzStatic = 0;
            GestorPago.aguaStatic = 0;
        } else { //solo se genera un recibo cuando toca pagarlo, es decir mensual
            //sirve para evitar un recibo nuevo cada 15 dias
            
            int ubicInmueble = -1;
            for(int i = 0; i < GestionInmuebleUdc.listaInmuebles.size(); i++){
                //buscaremos si existe un inmueble ocupado cuyo inquilino tenga la cedula de 
                //nuestro usser, es decir sean la misma persona
                if(Integer.parseInt(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getCedula()) == GestionInmuebleUdc.listaInmuebles.get(i).getAlquilado()){
                    ubicInmueble = i;
                    GestionInmuebleUdc.listaRecibos.add(new Recibo(0,0,0,GestionInmuebleUdc.listaInmuebles.get(ubicInmueble).getId(),Usuario.time));
                    GestorPago.gasStatic = Recibo.generarReciboGas(sesionActivaUbic);
                    GestorPago.luzStatic = Recibo.generarReciboLuz(sesionActivaUbic);
                    GestorPago.aguaStatic = Recibo.generarReciboAgua(sesionActivaUbic);
                }
            }//end for
      
        }///end else if externo
    } //end funcion de llamarRecibo
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        alquilar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        textFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        avanzarTime = new javax.swing.JButton();
        verDisponible = new javax.swing.JButton();
        textPago = new javax.swing.JLabel();
        debePagar = new javax.swing.JLabel();
        textEventos = new javax.swing.JLabel();
        eventoInfo = new javax.swing.JLabel();
        textDinero = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        gestionarPago = new javax.swing.JButton();
        desalojar = new javax.swing.JButton();
        imagenLateral = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        alquilar.setText("Alquilar Inmueble");
        alquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilarActionPerformed(evt);
            }
        });
        getContentPane().add(alquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 213, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Cerrar Sesion");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 123, -1));

        textFecha.setText("Fecha Actual:");
        getContentPane().add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        fecha.setText("null");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        mensaje.setText("Si cuenta con arriendo no olvide pagar a final de mes!");
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        avanzarTime.setText("Esperar Quincena...");
        avanzarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarTimeActionPerformed(evt);
            }
        });
        getContentPane().add(avanzarTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 213, -1));

        verDisponible.setText("Ver Inmuebles");
        verDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(verDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 213, -1));

        textPago.setText("Debe pagar ahora: ");
        getContentPane().add(textPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        debePagar.setText("no");
        getContentPane().add(debePagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        textEventos.setText("eventos en este mes: ");
        getContentPane().add(textEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        eventoInfo.setText("no");
        getContentPane().add(eventoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        textDinero.setText("Dinero:");
        getContentPane().add(textDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        dinero.setText(" ");
        getContentPane().add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 103, -1));

        gestionarPago.setText("Gestionar Pagos");
        gestionarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(gestionarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 213, -1));

        desalojar.setText("Desalojar Inmueble");
        desalojar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desalojarActionPerformed(evt);
            }
        });
        getContentPane().add(desalojar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 213, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Menu de Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_exitActionPerformed

    private void avanzarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarTimeActionPerformed
        
        this.setVisible(false);
        
        InicioExitoso next = new InicioExitoso();
        Usuario.time = Usuario.time.plusDays(15); //le sumamos 15 dias al atributo static que es un LocalDate
        
        //para evitar problemas con febrero y meses con mas dias o menos (si no hacemos esto se recorta 1 dia cada
        // que le damos a avanzar 15, es decir, primero nos dejara un 29 de un mes, luego un 28, 27, 26, 25, 24...)
        //la condicion > 25 es fundamental para evitar que cada vez que queramos pasar 15 dias se pase un mes completo
        while(Usuario.time.getDayOfMonth() > 25 && Usuario.time.getDayOfMonth() < 29){
            Usuario.time = Usuario.time.plusDays(1);
        }
        
        //actualizamos el dinero
        GestionInmuebleUdc.listaUsuarios.get(InicioSesion.sesionActivaUbic).setDinero(700000);
        GestorPago.dineroStatic = GestionInmuebleUdc.listaUsuarios.get(InicioSesion.sesionActivaUbic).getDinero();
        
        //actualizamos el dinero de este menu
        InicioExitoso.dineroStatic = GestionInmuebleUdc.listaUsuarios.get(InicioSesion.sesionActivaUbic).getDinero();
        
        //ahora actualizamos la fecha del menu
        next.actualizarFecha(Usuario.time);  
        next.actualizarDinero();
        next.setVisible(true);
        
    }//GEN-LAST:event_avanzarTimeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            this.setVisible(false);
            MenuUsuario back = new MenuUsuario();
            back.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void alquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilarActionPerformed
        
        if(alquilerYes){
            JOptionPane.showMessageDialog(null,"Usted ahora mismo se encuentra\n" + "Con un inmueble ya alquilado","Alquilar Inmueble",JOptionPane.INFORMATION_MESSAGE);
            
        } else {

            String s = JOptionPane.showInputDialog(null,"Introduzca el ID del inmueble\n" + "que desea alquilar","Alquilar Inmueble",JOptionPane.QUESTION_MESSAGE);
            boolean encontrado = false;

            for(int i = 0; i < GestionInmuebleUdc.listaInmuebles.size(); i++){
                //aca descartamos para ver si se encontro o no el inmueble
                if(Integer.parseInt(s) == GestionInmuebleUdc.listaInmuebles.get(i).getId()){
                    //decimos que se encontro un inmueble con el mismo id, ahora verificamos que ese mismo id
                    //ahora comprobamos si esta o no ocupado
                    encontrado = true;


                    //por defecto todo inmueble tiene en alquilado (atributo de inmueble) un -1
                    //en un caso normal (inmueble ocupado) deberia tener la cc de un usuario y nadie colocaria en su cc un negativo
                    // si el -1 sigue es porque nadie lo ha alquilado
                    if(GestionInmuebleUdc.listaInmuebles.get(i).getAlquilado() == -1){
                        //para esto necesitamos a la variable static ccStatic, la misma se explica que hace en InicioSesion en el apartado de confirmar
                        GestionInmuebleUdc.listaInmuebles.get(i).setAlquilado(Integer.parseInt(InicioSesion.ccStatic));
                        alquilerYes = true;
                    
                        JOptionPane.showMessageDialog(null, "Felicitaciones, ha adquirido un inmueble","Alquiler Exitoso",JOptionPane.INFORMATION_MESSAGE);
                    
                    } else {
                        JOptionPane.showMessageDialog(null,"Inmueble ocupado :/","Busqueda Fallida",JOptionPane.INFORMATION_MESSAGE);
                    }//end if else interno

                } //end if externo 
            } //end for
            
            this.fecha.setText(String.valueOf(Usuario.time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            this.dinero.setText(String.valueOf(InicioExitoso.dineroStatic));
 
            //si encontrado es false significa que no se encontro ningun inmueble con ese ID
            if(!encontrado){
                JOptionPane.showMessageDialog(null,"ID del inmueble no encontrado :/","Busqueda Fallida",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }//end if else externo de comprobar si ya tiene cuenta        
    }//GEN-LAST:event_alquilarActionPerformed

    private void verDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDisponibleActionPerformed

        this.setVisible(false);
        MenuDisponible next = new MenuDisponible();
        
        //actualizamos todo para que aparezca informacion recopilada en el menu
        next.actualirMenuEdificio();
        next.actualirMenuFinca();
        next.actualirMenuLocal();
        next.actualirMenuPiso();
  
        next.setVisible(true);
  
    }//GEN-LAST:event_verDisponibleActionPerformed

    private void gestionarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarPagoActionPerformed
        
        if(alquilerYes){ 
            this.setVisible(false);
            //llamar recibo es un metodo propio de esta clase que crea un objeto de la clase Recibo e interactua con el
            //para obtener unos valores que les asigna a las variables static de GestorPago (luzStatic,aguaStatic,gasStatic)
            llamarRecibo();
            
            //actualizamos el menu de GestorPago
            GestorPago next = new GestorPago();
            next.actualizarDinero();
            GestorPago.estratoStatic = String.valueOf(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato());
            next.actualizarEstrato();
            next.setVisible(true);

            next.actualizarRecibo();
        } else {
            JOptionPane.showMessageDialog(null, "No cuenta con ningun inmueble arrendado :/","Upps...",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_gestionarPagoActionPerformed

    private void desalojarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desalojarActionPerformed
        //si el alquiler se cumple, es decir, si tiene un inmueble alquilado (true) 
        if(alquilerYes){
            String s = JOptionPane.showInputDialog(null, "Ingrese el ID del inmueble", "Pagar Arriendo", JOptionPane.QUESTION_MESSAGE);
                        
            for(int i = 0; i < GestionInmuebleUdc.listaInmuebles.size(); i++){
                //aca determinamos si se encontro o no el id introducido por el usuario
                if(Integer.parseInt(s) == GestionInmuebleUdc.listaInmuebles.get(i).getId() ){
                    //en caso de que se encontrase el inmueble se prosigue con el desalojo
                    alquilerYes = false; //decimos que no esta alquilado
                    GestionInmuebleUdc.listaInmuebles.get(i).setAlquilado(-1); //lo volvemos a colocar en -1
                    //esto es para indicar que nadie lo ocupa
                } else {
                    JOptionPane.showMessageDialog(null, "ID del Inmueble no encontrado", "Transaccion Fallida", JOptionPane.INFORMATION_MESSAGE);
                }
            }    
        } else { //si no tiene inmueble no se puede desalojar
            JOptionPane.showMessageDialog(null, "No cuenta con ningun inmueble arrendado :/","Upps...",JOptionPane.INFORMATION_MESSAGE);            
        }//end if else
        
        this.fecha.setText(String.valueOf(Usuario.time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        this.dinero.setText(String.valueOf(InicioExitoso.dineroStatic));
 
    }//GEN-LAST:event_desalojarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioExitoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioExitoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioExitoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioExitoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioExitoso().setVisible(true);
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquilar;
    private javax.swing.JButton avanzarTime;
    private javax.swing.JButton back;
    private javax.swing.JLabel debePagar;
    private javax.swing.JButton desalojar;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel eventoInfo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton gestionarPago;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel textDinero;
    private javax.swing.JLabel textEventos;
    private javax.swing.JLabel textFecha;
    private javax.swing.JLabel textPago;
    private javax.swing.JButton verDisponible;
    // End of variables declaration//GEN-END:variables
}
