 
package interfazMain;
 
import interfazEmpresa.MenuEmpresa;
import interfazUsuario.MenuUsuario; //importamos nuestra clase de otro package
import javax.swing.ImageIcon;
//entre ambas sirven para añadir un icono a la aplicacion en la barra de tareas
 
public class MenuIngreso extends javax.swing.JFrame {

    /**
     * Creates new form MenuIngreso
     */
    public MenuIngreso() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null); //con esta linea centramos la interfaz para que aparezca centrada al usuario
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        empresa = new javax.swing.JButton();
        persona = new javax.swing.JButton();
        imagenCostado = new javax.swing.JLabel();
        mensajePart1 = new javax.swing.JLabel();
        mensajePart2 = new javax.swing.JLabel();
        mensajePart3 = new javax.swing.JLabel();
        mensajePreguntaDesea = new javax.swing.JLabel();
        mensajeBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        empresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empresa.setText("Empresa");
        empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaActionPerformed(evt);
            }
        });
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        persona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        persona.setText("Persona");
        persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActionPerformed(evt);
            }
        });
        getContentPane().add(persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        imagenCostado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenCostado.setText("jLabel1");
        getContentPane().add(imagenCostado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        mensajePart1.setText("Nuestra aplicación ofrece una vista completa");
        getContentPane().add(mensajePart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 280, 60));

        mensajePart2.setText("como gerente de la inmobiliaria y como una");
        getContentPane().add(mensajePart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        mensajePart3.setText("persona natural");
        getContentPane().add(mensajePart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        mensajePreguntaDesea.setText("Ahora Mismo Desea:");
        getContentPane().add(mensajePreguntaDesea, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        mensajeBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mensajeBienvenida.setText("¡Bienvenido!");
        getContentPane().add(mensajeBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0); //para que se salga al pursar el salir
    }//GEN-LAST:event_exitActionPerformed

    private void empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaActionPerformed
        //con esto lo que estamos haciendo es llamar a otro JFrame, 
        //cuando el usuario presiona el Boton "Empresa" se llama a otro JFrame con opciones de empresa
        MenuEmpresa empresa = new MenuEmpresa(); //JFrame de empresa
        empresa.setVisible(true); //aca cambiamos un valor del JFrame que lo hace invisible, para hacerlo visible ponemos true
     
        this.setVisible(false); //hacemos invisible el JFrame de MenuIngreso
    }//GEN-LAST:event_empresaActionPerformed

    private void personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActionPerformed
        //hacemos lo mismo que arriba pero ahora con el menu del usuario
        this.setVisible(false);
        MenuUsuario usuario = new MenuUsuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_personaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empresa;
    private javax.swing.JButton exit;
    private javax.swing.JLabel imagenCostado;
    private javax.swing.JLabel mensajeBienvenida;
    private javax.swing.JLabel mensajePart1;
    private javax.swing.JLabel mensajePart2;
    private javax.swing.JLabel mensajePart3;
    private javax.swing.JLabel mensajePreguntaDesea;
    private javax.swing.JButton persona;
    // End of variables declaration//GEN-END:variables
}
