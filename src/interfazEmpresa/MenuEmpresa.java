 
package interfazEmpresa;

import interfazMain.MenuIngreso;
import javax.swing.ImageIcon;

public class MenuEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form MenuEmpresa
     */
    public MenuEmpresa() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null); //con esta linea centramos la interfaz para que aparezca centrada al usuario
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        edificio = new javax.swing.JButton();
        local = new javax.swing.JButton();
        piso = new javax.swing.JButton();
        finca = new javax.swing.JButton();
        tituloInmobiliaria = new javax.swing.JLabel();
        deseaAgregar = new javax.swing.JLabel();
        gerenteMensaje1 = new javax.swing.JLabel();
        gerenteMensaje2 = new javax.swing.JLabel();
        edificioIcon = new javax.swing.JLabel();
        oquizas = new javax.swing.JLabel();
        economia = new javax.swing.JButton();
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

        edificio.setText("Edificio");
        edificio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edificioActionPerformed(evt);
            }
        });
        getContentPane().add(edificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        local.setText("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        getContentPane().add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        piso.setText("Piso");
        piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoActionPerformed(evt);
            }
        });
        getContentPane().add(piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        finca.setText("Finca");
        finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fincaActionPerformed(evt);
            }
        });
        getContentPane().add(finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        tituloInmobiliaria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloInmobiliaria.setText("¡Inmobiliaria UdC!");
        getContentPane().add(tituloInmobiliaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        deseaAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deseaAgregar.setText("Desea Agregar a Nuestra Empresa");
        getContentPane().add(deseaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        gerenteMensaje1.setText("Como nuestro gerente de confianza");
        getContentPane().add(gerenteMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        gerenteMensaje2.setText(" le ofrecemos una calida bienvenida");
        getContentPane().add(gerenteMensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        edificioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png"))); // NOI18N
        edificioIcon.setText(" ");
        getContentPane().add(edificioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 240, 220));

        oquizas.setText("o quizás...");
        getContentPane().add(oquizas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        economia.setText("Ingresos Inmueble");
        economia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economiaActionPerformed(evt);
            }
        });
        getContentPane().add(economia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0); //con esta linea nos salimos del programa al pulsar exit
    }//GEN-LAST:event_ExitActionPerformed

    private void edificioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edificioActionPerformed
        AgregarEdificio edificio = new AgregarEdificio(); //creamos un objeto de edificio para el menu
        edificio.setVisible(true); //abrimos una ventana del JFrame 
        
        this.setVisible(false); //cerramos la ventana anterior, es decir la de MenuEmpresa, este mismo objeto
    }//GEN-LAST:event_edificioActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuIngreso sc = new MenuIngreso();
        sc.setVisible(true); //aca cambiamos un valor del JFrame que lo hace invisible, para hacerlo visible ponemos true
        //creamos otro objeto para abrir nuevamente el JFrame del Menu de ingreso como si estuvieramos volviendo
        this.setVisible(false); //con esto ocultamos el JFrame del Menu Empresa
    }//GEN-LAST:event_BackActionPerformed

    private void pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoActionPerformed
       //creamos un nuevo objeto 
        AgregarPiso pisoMenu = new AgregarPiso();
        pisoMenu.setVisible(true); //mostramos la nueva interfaz
        this.setVisible(false); //ocultamos esta
    }//GEN-LAST:event_pisoActionPerformed

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        //hacmoes lo mismo de arriba pero con este nuevo menu que se abrira de Local
        AgregarLocal local = new AgregarLocal();
        local.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_localActionPerformed

    private void fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fincaActionPerformed
        AgregarFinca finca = new AgregarFinca();
        finca.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_fincaActionPerformed

    private void economiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economiaActionPerformed
        EconomiaEmpresa next = new EconomiaEmpresa();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_economiaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel deseaAgregar;
    private javax.swing.JButton economia;
    private javax.swing.JButton edificio;
    private javax.swing.JLabel edificioIcon;
    private javax.swing.JButton finca;
    private javax.swing.JLabel gerenteMensaje1;
    private javax.swing.JLabel gerenteMensaje2;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JButton local;
    private javax.swing.JLabel oquizas;
    private javax.swing.JButton piso;
    private javax.swing.JLabel tituloInmobiliaria;
    // End of variables declaration//GEN-END:variables
}
