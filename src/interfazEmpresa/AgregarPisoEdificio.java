/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfazEmpresa;

import gestioninmuebleudc.Piso;
import java.util.Random;
import javax.swing.ImageIcon;

    //no confundir AgregarPisoEdificio con AgregarPiso, este ultimo es un JFrame mientras el primero es un JDialg


public class AgregarPisoEdificio extends javax.swing.JDialog {

    
    public static float precioPiso;
    public static int idStatic;
    
    public AgregarPisoEdificio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null);
        pisoActualMenu.setText(String.valueOf(AgregarEdificio.pisoActual));
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
        pisoActualMenu = new javax.swing.JLabel();
        textPrecioPiso = new javax.swing.JLabel();
        precioPisoMenu = new javax.swing.JTextField();
        imagenLateral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

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
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 115, -1));

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        pisoActualMenu.setText(" ");
        getContentPane().add(pisoActualMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        textPrecioPiso.setText("Precio Alquiler Piso");
        getContentPane().add(textPrecioPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));
        getContentPane().add(precioPisoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 113, -1));

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

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
        
        //generamos un codigo random para el id
        Random idRandom = new Random();
        
        //con ayuda del auxiliar le asignamos a este random al auxiliar
        //establecemos que queremos que sea entre 0 y 99 y a eso le sumamos 300
        //es decir, nuestro intervalo sera de 300 a 399
        int auxId = 300 + idRandom.nextInt(99);
        
        //aca llenamos los atributos de la clase piso
        Piso.descripcion = descripcion.getText();
        Piso.numeroPiso = Integer.parseInt(pisoActualMenu.getText());
        idStatic = auxId; //como no podemos pasar el atributo id directamente a AgregarEdificio
        //nos toca crear un atributo static y a ese atributo se le asignara el valor del atributo privado id, de tal forma que idStatic ira
        //variando su valor de forma constante 
        precioPiso = Float.parseFloat(precioPisoMenu.getText()); //convertimos a float el string que nos entrega el menu
        this.setVisible(false); //hacemos invisible este objeto

    }//GEN-LAST:event_confirmarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPisoEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPisoEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPisoEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPisoEdificio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPisoEdificio dialog = new AgregarPisoEdificio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton exit;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JLabel pisoActualMenu;
    private javax.swing.JTextField precioPisoMenu;
    private javax.swing.JLabel textDescripcion;
    private javax.swing.JLabel textNumPiso;
    private javax.swing.JLabel textPrecioPiso;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
