/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazUsuario;

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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textPrecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPrecio.setText("Precio:");

        textTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textTipo.setText("Tipo:");

        textid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid.setText("Id");

        textprecio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio1.setText("Precio");

        texttipo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo1.setText("Tipo");

        textid1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid1.setText("Id");

        texttipo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo2.setText("Tipo");

        textprecio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio2.setText("Precio");

        textid2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid2.setText("Id");

        textid3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textid3.setText("Id");

        textprecio3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textprecio3.setText("Precio");

        texttipo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        texttipo3.setText("tipo");

        tipo.setText("Edificio");

        tipo2.setText("Piso");

        tipo3.setText("Local");

        tipo4.setText("Finca");

        precio4.setText("null");

        id4.setText("null");

        precio3.setText("null");

        id3.setText("null");

        precio.setText("null");

        id.setText("null");

        precio2.setText("null");

        id2.setText("null");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Lista Inmuebles Disponibles");

        textDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion.setText("Descripcion:");

        descripcion.setText("NO APLICA");

        textDescripcion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion2.setText("Descripcion:");

        descripcion2.setText("null");

        descripcion3.setText("null");

        textDescripcion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion3.setText("Descripcion:");

        textDescripcion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textDescripcion4.setText("Descripcion:");

        descripcion4.setText("null");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDescripcion3)
                                .addGap(49, 49, 49)
                                .addComponent(descripcion3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDescripcion4)
                                .addGap(49, 49, 49)
                                .addComponent(descripcion4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTipo)
                                    .addComponent(texttipo3)
                                    .addComponent(texttipo2)
                                    .addComponent(textprecio2)
                                    .addComponent(textid2)
                                    .addComponent(textprecio3)
                                    .addComponent(textid3)
                                    .addComponent(textPrecio)
                                    .addComponent(textid)
                                    .addComponent(textDescripcion)
                                    .addComponent(textDescripcion2)
                                    .addComponent(texttipo1)
                                    .addComponent(textprecio1)
                                    .addComponent(textid1))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id2)
                                    .addComponent(precio2)
                                    .addComponent(tipo2)
                                    .addComponent(id)
                                    .addComponent(precio)
                                    .addComponent(id3)
                                    .addComponent(precio3)
                                    .addComponent(id4)
                                    .addComponent(precio4)
                                    .addComponent(tipo4)
                                    .addComponent(tipo3)
                                    .addComponent(tipo)
                                    .addComponent(descripcion)
                                    .addComponent(descripcion2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textid))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcion)
                            .addComponent(textDescripcion))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texttipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textprecio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textid1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion2)
                    .addComponent(textDescripcion2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texttipo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textprecio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textid3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id3)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion3)
                    .addComponent(textDescripcion3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texttipo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textprecio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textid2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion4)
                    .addComponent(textDescripcion4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        
        InicioExitoso back = new InicioExitoso();
        back.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDisponible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel descripcion2;
    private javax.swing.JLabel descripcion3;
    private javax.swing.JLabel descripcion4;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
