
package interfazEmpresa;

import gestioninmuebleudc.GestionInmuebleUdc;
import gestioninmuebleudc.Piso;
import interfazUsuario.MenuDisponible;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AgregarPiso extends javax.swing.JFrame {

   //AgregarPisoEdificio es diferente de AgregarEdificio puesto que aca no se pide el piso ya que el sistema lo hace automatico
    //en el AgregarPiso si se pide el numero del piso
    public AgregarPiso() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        tituloMenu = new javax.swing.JLabel();
        textNumPiso = new javax.swing.JLabel();
        textDescripcion = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        numPiso = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        textPrecio = new javax.swing.JLabel();
        textDireccion = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        imagenLateral = new javax.swing.JLabel();

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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        tituloMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloMenu.setText("AGREGAR PISO");
        getContentPane().add(tituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        textNumPiso.setText("Numero de Piso");
        getContentPane().add(textNumPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        textDescripcion.setText("Descripcion");
        getContentPane().add(textDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 110, -1));

        confirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        numPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPisoActionPerformed(evt);
            }
        });
        getContentPane().add(numPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 110, -1));
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 110, -1));

        textPrecio.setText("Precio Alquiler");
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        textDireccion.setText("Direccion");
        getContentPane().add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 110, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        //para retroceder
        
        this.setVisible(false); //ocultamos el menu actual
        MenuEmpresa is = new MenuEmpresa();
        
        is.setVisible(true); //hacemos visible el menu anterior
    }//GEN-LAST:event_backActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        //generamos un codigo random para el id
        Random idRandom = new Random();
        
        //con ayuda del auxiliar le asignamos a este random al auxiliar
        //establecemos que queremos que sea entre 0 y 99 y a eso le sumamos 400
        //es decir, nuestro intervalo sera de 400 a 499
        int auxId = 400 + idRandom.nextInt(99);
        
        //tenemos que verificar que el ID del edificio sea unico
        boolean condicion = true;
        for(int i = 0; i < GestionInmuebleUdc.listaInmuebles.size(); i++){
            //comparamos si el id ingresado se encuentra en nuestro arraylist 
            if(auxId == GestionInmuebleUdc.listaInmuebles.get(i).getId()){
                condicion = false; //si se encuentra entonces marcamos como false
            }
        }
        
        //si la condicion no se hizo false, entonces
        if(condicion){
            //creamos un objeto de la clase Piso que tendra todos estos datos los cuales ya pedimos en la interfaz grafica
            //añadimos al arraylist de inmuebles
            GestionInmuebleUdc.listaInmuebles.add(new Piso(direccion.getText(), Float.parseFloat(precio.getText()),
                    Integer.parseInt(numPiso.getText()),descripcion.getText(),-1,auxId));
            
            //esto es para MenuDisponible
            //una clase del package de interfazUsuario, en MenuDisponible se encuentra mas info sobre este proceso
            MenuDisponible.precio2Static = precio.getText();
            MenuDisponible.id2Static = String.valueOf(auxId);
            MenuDisponible.descripcion2Static = descripcion.getText();
            
        }else {
            JOptionPane.showMessageDialog(null,"El ID que ingreso se encuentra\n" + "ocupado por otro inmueble\nIntente de nuevo","Agregar Piso",JOptionPane.INFORMATION_MESSAGE);
        }
        this.setVisible(false); //ocultamos este menu 
        
        MenuEmpresa menu = new MenuEmpresa(); //volvemos al menu de empresa
        menu.setVisible(true);
    }//GEN-LAST:event_confirmarActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void numPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPisoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton exit;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JTextField numPiso;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel textDescripcion;
    private javax.swing.JLabel textDireccion;
    private javax.swing.JLabel textNumPiso;
    private javax.swing.JLabel textPrecio;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
