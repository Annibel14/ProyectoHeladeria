
package proyectofinalheladeria;

/**
 *
 * @author Annibel y Clara
 */
public class frm_ControlUPP extends javax.swing.JFrame {

    /**
     * Creates new form frm_ControlUPP
     */
    public static String nombre_;
    public frm_ControlUPP() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbImagen = new javax.swing.JButton();
        jbUsuario = new javax.swing.JButton();
        jbProducto = new javax.swing.JButton();
        jbCliente = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FlechaVA.png"))); // NOI18N
        jbImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImagenActionPerformed(evt);
            }
        });

        jbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesion.png"))); // NOI18N
        jbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuarioActionPerformed(evt);
            }
        });

        jbProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto.png"))); // NOI18N
        jbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductoActionPerformed(evt);
            }
        });

        jbCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente.png"))); // NOI18N
        jbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClienteActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCliente.setText("Control Factura");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Control Usuario");

        lblProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProducto.setText("Control Producto");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EstampadoClara.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente)
                            .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProducto)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProducto)
                .addGap(48, 48, 48)
                .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCliente))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuarioActionPerformed
        //Codigo para ir al formulario de Control Usuario
        frm3_ControlUsuarios mf = new frm3_ControlUsuarios();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
        this.dispose();
        
    }//GEN-LAST:event_jbUsuarioActionPerformed

    private void jbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductoActionPerformed
        //Codigo para ir al formulario de Control Producto
        frm6_ControlProductos mf = new frm6_ControlProductos();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
        this.dispose();
        
    }//GEN-LAST:event_jbProductoActionPerformed

    private void jbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClienteActionPerformed
        
        frm5_Facturacion mf = new frm5_Facturacion();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        frm5_Facturacion.tfCajera.setText(nombre_);
        this.dispose();
        
        
    }//GEN-LAST:event_jbClienteActionPerformed

    private void jbImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImagenActionPerformed
        //Codigo para volver atras
        frm2_InicioSesion mf = new frm2_InicioSesion();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
        this.dispose();
        
    }//GEN-LAST:event_jbImagenActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ControlUPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ControlUPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ControlUPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ControlUPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ControlUPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCliente;
    private javax.swing.JButton jbImagen;
    private javax.swing.JButton jbProducto;
    private javax.swing.JButton jbUsuario;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
