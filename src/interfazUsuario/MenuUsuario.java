
package interfazUsuario;
import interfazMain.MenuIngreso;

public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        registrar.setText("Registrarse");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        iniciarSesion.setText("Iniciar Sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });

        tituloInmobiliaria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloInmobiliaria.setText("¡Inmobiliaria UdC!");

        desea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        desea.setText("Desea");

        mensajeWelcome1.setText("Bienvenido al menu de usuario");

        mensajeWelcome2.setText(" le ofrecemos una calida bienvenida");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        imagen.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(Back)
                        .addGap(6, 6, 6)
                        .addComponent(Exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(mensajeWelcome2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(imagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mensajeWelcome1)
                            .addComponent(tituloInmobiliaria))))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desea)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addComponent(Exit))
                .addGap(2, 2, 2)
                .addComponent(tituloInmobiliaria)
                .addGap(6, 6, 6)
                .addComponent(mensajeWelcome1)
                .addGap(6, 6, 6)
                .addComponent(mensajeWelcome2)
                .addGap(6, 6, 6)
                .addComponent(imagen)
                .addGap(12, 12, 12)
                .addComponent(desea)
                .addGap(6, 6, 6)
                .addComponent(registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciarSesion)
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel mensajeWelcome1;
    private javax.swing.JLabel mensajeWelcome2;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel tituloInmobiliaria;
    // End of variables declaration//GEN-END:variables
}
