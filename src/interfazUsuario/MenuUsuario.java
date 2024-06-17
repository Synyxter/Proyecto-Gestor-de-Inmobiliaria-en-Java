
package interfazUsuario;
import interfazMain.MenuIngreso;
import javax.swing.ImageIcon;

public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null); //centramos el menu
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        iniciarSesion = new javax.swing.JButton();
        tituloInmobiliaria = new javax.swing.JLabel();
        desea = new javax.swing.JLabel();
        mensajeWelcome1 = new javax.swing.JLabel();
        mensajeWelcome2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        imagenLateral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        registrar.setText("Registrarse");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 130, -1));

        iniciarSesion.setText("Iniciar Sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 130, -1));

        tituloInmobiliaria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloInmobiliaria.setText("¡Inmobiliaria UdC!");
        getContentPane().add(tituloInmobiliaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        desea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        desea.setText("Desea");
        getContentPane().add(desea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        mensajeWelcome1.setText("Bienvenido al menu de usuario");
        getContentPane().add(mensajeWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        mensajeWelcome2.setText(" le ofrecemos una calida bienvenida");
        getContentPane().add(mensajeWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        imagen.setText(" ");
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MenuIngreso sc = new MenuIngreso();
        sc.setVisible(true); //aca cambiamos un valor del JFrame que lo hace invisible, para hacerlo visible ponemos true
        //creamos otro objeto para abrir nuevamente el JFrame del Menu de ingreso como si estuvieramos volviendo
        this.setVisible(false); //con esto ocultamos el JFrame del Menu Empresa
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); //con esta linea nos salimos del programa al pulsar exit
    }//GEN-LAST:event_ExitActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        Registro next = new Registro(); //creamos un objeto de edificio para el menu
        next.setVisible(true); //abrimos una ventana del JFrame

        this.setVisible(false); //cerramos la ventana anterior, es decir la de MenuUsuario, este mismo objeto
    }//GEN-LAST:event_registrarActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        InicioSesion next = new InicioSesion();
        next.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_iniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel desea;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel mensajeWelcome1;
    private javax.swing.JLabel mensajeWelcome2;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel tituloInmobiliaria;
    // End of variables declaration//GEN-END:variables
}
