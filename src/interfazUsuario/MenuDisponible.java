package interfazUsuario;

import gestioninmuebleudc.Usuario;
import javax.swing.ImageIcon;

public class MenuDisponible extends javax.swing.JFrame {
   
    
    /*trabajamos con static por dos razones
    * el primero es que asi podemos asignarle valores desde otras clases, luego solo tendremos que, en la clase
    * InicioExitoso, darle a mostrar disponibles e internamente se actualizara todo, entonces todo el texto
    * en null sera reemplazado por lo que se haya almacenado en estos atributos desde otras clases
    *
    * el segundo es que asi cada usuario tiene los mismos disponibles, ya que el static no depende del objeto
    */
    
    //solo se muestran los ultimos, es decir, el ultimo edificio, el ultimo local, etc...
    //para esto tambien nos ayuda el static, ya que con cada inmueble creado se le asignan unos nuevos valores y asi con los demas
    public static String precioStatic;
    public static String idStatic;
    public static String descripcionStatic;
    
    public static String precio2Static;
    public static String id2Static;
    public static String descripcion2Static;
    
    public static String precio3Static;
    public static String id3Static;
    public static String descripcion3Static;
    
    public static String precio4Static;
    public static String id4Static;
    public static String descripcion4Static;
    
    public MenuDisponible() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/empresaIcon.png")).getImage());
        this.setLocationRelativeTo(null); //centramos
    }
    
    //aca comenzamos a actualizar, estos metodos asignan los valores static a los atributos del JLabel
    public void actualirMenuEdificio(){
        precio.setText(precioStatic);
        id.setText(idStatic);        
    }
    
    public void actualirMenuPiso(){   
        precio2.setText(precio2Static);
        id2.setText(id2Static);
        descripcion2.setText(descripcion2Static);
    }
    
    public void actualirMenuLocal(){  
        precio3.setText(precio3Static);
        id3.setText(id3Static);
        descripcion3.setText(descripcion3Static);
    }
    
    public void actualirMenuFinca(){    
        precio4.setText(precio4Static);
        id4.setText(id4Static);
        descripcion4.setText(descripcion4Static);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPrecio = new javax.swing.JLabel();
        textTipo = new javax.swing.JLabel();
        textid = new javax.swing.JLabel();
        textprecio1 = new javax.swing.JLabel();
        texttipo1 = new javax.swing.JLabel();
        textid1 = new javax.swing.JLabel();
        texttipo2 = new javax.swing.JLabel();
        textprecio2 = new javax.swing.JLabel();
        textid2 = new javax.swing.JLabel();
        textid3 = new javax.swing.JLabel();
        textprecio3 = new javax.swing.JLabel();
        texttipo3 = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        tipo2 = new javax.swing.JLabel();
        tipo3 = new javax.swing.JLabel();
        tipo4 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textDescripcion = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        textDescripcion2 = new javax.swing.JLabel();
        descripcion2 = new javax.swing.JLabel();
        descripcion3 = new javax.swing.JLabel();
        textDescripcion3 = new javax.swing.JLabel();
        textDescripcion4 = new javax.swing.JLabel();
        descripcion4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        imagenLateral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPrecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPrecio.setText("Precio:");
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        textTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textTipo.setText("Tipo:");
        getContentPane().add(textTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        textid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid.setText("Id");
        getContentPane().add(textid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        textprecio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio1.setText("Precio");
        getContentPane().add(textprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        texttipo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo1.setText("Tipo");
        getContentPane().add(texttipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        textid1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid1.setText("Id");
        getContentPane().add(textid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        texttipo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo2.setText("Tipo");
        getContentPane().add(texttipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        textprecio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio2.setText("Precio");
        getContentPane().add(textprecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        textid2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid2.setText("Id");
        getContentPane().add(textid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        textid3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid3.setText("Id");
        getContentPane().add(textid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        textprecio3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio3.setText("Precio");
        getContentPane().add(textprecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        texttipo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo3.setText("tipo");
        getContentPane().add(texttipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        tipo.setText("Edificio");
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        tipo2.setText("Piso");
        getContentPane().add(tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        tipo3.setText("Local");
        getContentPane().add(tipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        tipo4.setText("Finca");
        getContentPane().add(tipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        precio4.setText("null");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        id4.setText("null");
        getContentPane().add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        precio3.setText("null");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        id3.setText("null");
        getContentPane().add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, -1));

        precio.setText("null");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        id.setText("null");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        precio2.setText("null");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        id2.setText("null");
        getContentPane().add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Lista Inmuebles Disponibles");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        textDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion.setText("Descripcion:");
        getContentPane().add(textDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        descripcion.setText("NO APLICA");
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        textDescripcion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion2.setText("Descripcion:");
        getContentPane().add(textDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        descripcion2.setText("null");
        getContentPane().add(descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        descripcion3.setText("null");
        getContentPane().add(descripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, -1));

        textDescripcion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion3.setText("Descripcion:");
        getContentPane().add(textDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        textDescripcion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion4.setText("Descripcion:");
        getContentPane().add(textDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        descripcion4.setText("null");
        getContentPane().add(descripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        imagenLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioColorFondo.png"))); // NOI18N
        imagenLateral.setText("jLabel2");
        getContentPane().add(imagenLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        
        InicioExitoso back = new InicioExitoso();
        back.actualizarFecha(Usuario.time);
        back.actualizarDinero();
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
            java.util.logging.Logger.getLogger(MenuDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDisponible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel descripcion2;
    private javax.swing.JLabel descripcion3;
    private javax.swing.JLabel descripcion4;
    private javax.swing.JButton exit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel imagenLateral;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel textDescripcion;
    private javax.swing.JLabel textDescripcion2;
    private javax.swing.JLabel textDescripcion3;
    private javax.swing.JLabel textDescripcion4;
    private javax.swing.JLabel textPrecio;
    private javax.swing.JLabel textTipo;
    private javax.swing.JLabel textid;
    private javax.swing.JLabel textid1;
    private javax.swing.JLabel textid2;
    private javax.swing.JLabel textid3;
    private javax.swing.JLabel textprecio1;
    private javax.swing.JLabel textprecio2;
    private javax.swing.JLabel textprecio3;
    private javax.swing.JLabel texttipo1;
    private javax.swing.JLabel texttipo2;
    private javax.swing.JLabel texttipo3;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel tipo2;
    private javax.swing.JLabel tipo3;
    private javax.swing.JLabel tipo4;
    // End of variables declaration//GEN-END:variables
}
