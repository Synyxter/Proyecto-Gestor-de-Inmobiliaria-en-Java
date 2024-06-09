

package interfazUsuario;

import gestioninmuebleudc.GestionInmuebleUdc;
import gestioninmuebleudc.Recibo;
import java.time.LocalDate;
import gestioninmuebleudc.Usuario;
import static interfazUsuario.InicioSesion.sesionActivaUbic;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InicioExitoso extends javax.swing.JFrame {
    
    //esto sirve para saber si el usuario ya hizo su primer arriendo o no
    public static boolean alquilerYes = false;
    //utilizado para actualizar el dinero
    public static float dineroStatic;
     
    public InicioExitoso() {
        initComponents();
        this.setLocationRelativeTo(null); //centramos el menu
    }
    
    public void actualizarDinero(){
        dinero.setText(String.valueOf(dineroStatic));
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
            
        } else { //solo se genera un recibo cuando toca pagarlo, es decir mensual
            //sirve para evitar un recibo nuevo cada 15 dias
            
            //SSSSSSS no olvidar confirmar que tenemos arriendo antes de generar recibos
            Recibo next = new Recibo();    //creamos un objeto de Recibo
            next.generarRecibo(InicioSesion.sesionActivaUbic); //llamamos a su metodo para que genere valores aleatorios
            //apartir del estrato.
            //actualizamos los atributos static con los valores aleatorios que recibimos usando los getters
            GestorPago.gasStatic = next.getGas();
            GestorPago.luzStatic = next.getLuz();
            GestorPago.aguaStatic = next.getAgua();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        alquilar = new javax.swing.JButton();
        textFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        avanzarTime = new javax.swing.JButton();
        back = new javax.swing.JButton();
        verDisponible = new javax.swing.JButton();
        textPago = new javax.swing.JLabel();
        debePagar = new javax.swing.JLabel();
        textEventos = new javax.swing.JLabel();
        eventoInfo = new javax.swing.JLabel();
        infoEvento = new javax.swing.JButton();
        textDinero = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        gestionarPago = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        alquilar.setText("Alquilar Inmueble");
        alquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilarActionPerformed(evt);
            }
        });

        textFecha.setText("Fecha Actual:");

        fecha.setText("null");

        mensaje.setText("Si cuenta con arriendo no olvide pagar a final de mes!");

        avanzarTime.setText("Esperar Quincena...");
        avanzarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarTimeActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Cerrar Sesion");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        verDisponible.setText("Ver lista de inmuebles Disponibles");
        verDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDisponibleActionPerformed(evt);
            }
        });

        textPago.setText("Debe pagar ahora: ");

        debePagar.setText("no");

        textEventos.setText("eventos en este mes: ");

        eventoInfo.setText("no");

        infoEvento.setText("Ver Información Evento");

        textDinero.setText("Dinero:");

        dinero.setText(" ");

        gestionarPago.setText("Gestionar Pagos");
        gestionarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarPagoActionPerformed(evt);
            }
        });

        jButton1.setText("Desalojar Inmueble");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFecha)
                                .addGap(18, 18, 18)
                                .addComponent(fecha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textEventos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eventoInfo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textPago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(debePagar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDinero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dinero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(alquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(gestionarPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avanzarTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFecha)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPago)
                    .addComponent(debePagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEventos)
                    .addComponent(eventoInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDinero)
                    .addComponent(dinero))
                .addGap(38, 38, 38)
                .addComponent(infoEvento)
                .addGap(18, 18, 18)
                .addComponent(alquilar)
                .addGap(18, 18, 18)
                .addComponent(verDisponible)
                .addGap(18, 18, 18)
                .addComponent(gestionarPago)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(avanzarTime)
                .addContainerGap(35, Short.MAX_VALUE))
        );

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
            next.actualizarEstrato();
            GestorPago.estratoStatic = String.valueOf(GestionInmuebleUdc.listaUsuarios.get(sesionActivaUbic).getEstrato());
            next.setVisible(true);

            next.actualizarRecibo();
        } else {
            JOptionPane.showMessageDialog(null, "No cuenta con ningun inmueble arrendado :/","Upps...",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_gestionarPagoActionPerformed

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
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel eventoInfo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton gestionarPago;
    private javax.swing.JButton infoEvento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel textDinero;
    private javax.swing.JLabel textEventos;
    private javax.swing.JLabel textFecha;
    private javax.swing.JLabel textPago;
    private javax.swing.JButton verDisponible;
    // End of variables declaration//GEN-END:variables
}
