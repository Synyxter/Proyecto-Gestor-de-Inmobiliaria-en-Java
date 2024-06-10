
package interfazEmpresa;

import javax.swing.ImageIcon;

public class IngresoInmueble extends javax.swing.JFrame {

    public static float luzStatic;
    public static float gasStatic;
    public static float aguaStatic;
    public static float arriendoStatic;
    
    public void actualizarTabla(){
        luz.setText(String.valueOf(luzStatic));
        gas.setText(String.valueOf(gasStatic));
        agua.setText(String.valueOf(aguaStatic));
        arriendo.setText(String.valueOf(arriendoStatic));
    }
    
    public IngresoInmueble() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        textLuz = new javax.swing.JLabel();
        textAgua = new javax.swing.JLabel();
        textGas = new javax.swing.JLabel();
        textArriendo = new javax.swing.JLabel();
        luz = new javax.swing.JLabel();
        agua = new javax.swing.JLabel();
        gas = new javax.swing.JLabel();
        arriendo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        textLuz.setText("Luz");
        getContentPane().add(textLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        textAgua.setText("Agua");
        getContentPane().add(textAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        textGas.setText("Gas");
        getContentPane().add(textGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        textArriendo.setText("Arriendo");
        getContentPane().add(textArriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        luz.setText("null");
        getContentPane().add(luz, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        agua.setText("null");
        getContentPane().add(agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        gas.setText("null");
        getContentPane().add(gas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        arriendo.setText("null");
        getContentPane().add(arriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo.setText("Ingresos Inmueble");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        codigo.setText(" ");
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 63, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);

        MenuEmpresa back = new MenuEmpresa();
        back.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agua;
    private javax.swing.JLabel arriendo;
    private javax.swing.JButton back;
    private javax.swing.JLabel codigo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gas;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JLabel luz;
    private javax.swing.JLabel textAgua;
    private javax.swing.JLabel textArriendo;
    private javax.swing.JLabel textGas;
    private javax.swing.JLabel textLuz;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
