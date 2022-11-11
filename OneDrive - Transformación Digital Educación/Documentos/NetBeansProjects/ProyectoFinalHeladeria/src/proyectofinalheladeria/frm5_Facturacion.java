package proyectofinalheladeria;

import Connection.MyConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.text.DecimalFormat;

/**
 *
 * @author Annibel y Clara
 */
public class frm5_Facturacion extends javax.swing.JFrame {

    DefaultTableModel Factura;

    /**
     * Creates new form Facturacion
     */
    Object[] detalle = new Object[4];

    public frm5_Facturacion() {
        initComponents();

        this.Factura = (DefaultTableModel) TablaFactura.getModel();
        Mostrardatos("");
        this.setResizable(false);
        setLocationRelativeTo(null);
        //Generar serie de factura
        generarIdFact();
        SetFacturaID();

    }

    public String SetIdFact() {
        String serie = "";
        String sql = "SELECT MAX(NoFactura) FROM facturacion";

        try {

            MyConnection cc = new MyConnection();
            Connection con = MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {
                serie = rs.getString(1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(frm5_Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

        return serie;
    }

    final void generarIdFact() {
        String serie = SetIdFact();
        if (serie == null) {

            tfFactura.setText("0");

        } else {
            int incrementar = Integer.parseInt(serie);

            tfFactura.setText(String.valueOf(incrementar));
        }

    }

    final void SetFacturaID() {
        String old_id_fact = tfFactura.getText();
        int sum_id_fact = Integer.parseInt(old_id_fact) + 1;
        String sum_string = String.valueOf(sum_id_fact);
        tfFactura.setText(sum_string);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblimagents = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDatosP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFactura = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        tfCantidad = new javax.swing.JTextField();
        jbImprimirF = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        tfProducto = new javax.swing.JTextField();
        jbBuscarP = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        jbBuscarP1 = new javax.swing.JButton();
        jbBuscarP2 = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();
        lblTotal1 = new javax.swing.JLabel();
        txt_id_prod_fact = new javax.swing.JTextField();
        lblNombreP1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCodigoF = new javax.swing.JLabel();
        tfFactura = new javax.swing.JTextField();
        lblCajera = new javax.swing.JLabel();
        lblFormapago = new javax.swing.JLabel();
        lblDatosF = new javax.swing.JLabel();
        lblNombreC = new javax.swing.JLabel();
        tfNombreC = new javax.swing.JTextField();
        tfCajera = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbBuscarC = new javax.swing.JButton();
        jcFormaP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        jPanel3.setBackground(new java.awt.Color(255, 233, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblimagents.setBackground(new java.awt.Color(255, 255, 255));
        lblimagents.setForeground(new java.awt.Color(255, 255, 255));
        lblimagents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TSLogo.png"))); // NOI18N
        lblimagents.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Contacto: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Redes:");

        jLabel5.setText("809-606-7723");

        jLabel6.setText("@heladeriatropicalsweet");

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Piña.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(lblimagents, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblimagents, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(58, 58, 58)
                .addComponent(lblImagen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDatosP.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblDatosP.setText("Datos Producto");

        lblNombreP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreP.setText("Producto");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad");

        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaFacturaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaFactura);

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.jpeg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbImprimirF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        jbImprimirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirFActionPerformed(evt);
            }
        });

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.jpeg"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbBuscarP.setText("Buscar Producto");
        jbBuscarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarPMouseClicked(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setText("Precio");

        tfPrecio.setEditable(false);

        jbBuscarP1.setText("Agregar");
        jbBuscarP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarP1MouseClicked(evt);
            }
        });
        jbBuscarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarP1ActionPerformed(evt);
            }
        });

        jbBuscarP2.setText("Eliminar");
        jbBuscarP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarP2MouseClicked(evt);
            }
        });

        tfTotal.setEditable(false);

        lblTotal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal1.setText("Total");

        lblNombreP1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreP1.setText("Código");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jbBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblPrecio))
                                                .addGap(6, 6, 6))
                                            .addComponent(lblNombreP)
                                            .addComponent(lblCantidad))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblNombreP1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_id_prod_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jbBuscarP1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscarP2))
                                    .addComponent(lblDatosP))
                                .addGap(35, 35, 35)))
                        .addComponent(jbImprimirF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosP)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbBuscarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_prod_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreP1))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreP))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscarP2)
                            .addComponent(jbBuscarP1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbImprimirF, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTotal1)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigoF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigoF.setText("No. Factura");

        tfFactura.setEditable(false);
        tfFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfFacturaKeyPressed(evt);
            }
        });

        lblCajera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCajera.setText("Cajera");

        lblFormapago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFormapago.setText("Forma de pago");

        lblDatosF.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblDatosF.setText("Datos Factura/Cliente");

        lblNombreC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreC.setText("Nombre Cliente");
        lblNombreC.setToolTipText("");

        tfCajera.setEditable(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        jbBuscarC.setText("Buscar cliente registrado");
        jbBuscarC.setToolTipText("");
        jbBuscarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarCMouseClicked(evt);
            }
        });
        jbBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCActionPerformed(evt);
            }
        });

        jcFormaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDatosF)
                .addGap(286, 286, 286))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCajera)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoF)
                            .addComponent(tfFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCajera, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFormapago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcFormaP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jbBuscarC))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosF)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFormapago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcFormaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoF)
                        .addComponent(lblNombreC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCajera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCajera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscarC))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbImprimirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirFActionPerformed
        // TODO add your handling code here:
        Connection cn = MyConnection.getConnection();

        try {
            int NoFactura;
            NoFactura = Integer.parseInt(tfFactura.getText());
            JasperReport jr = (JasperReport) JRLoader.loadObject(frm5_Facturacion.class.getResource("/Reporte/Facturacion.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("NoFactura", NoFactura-1);
            parametros.put("Titulo", "Reporte Factura");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_jbImprimirFActionPerformed

    public final void Mostrardatos(String valor) {
        //Funcion para llenar la jtable de Usuarios desde la BD
        MyConnection cc = new MyConnection();
        Connection cn = MyConnection.getConnection();
        RefrescarTabla();
        Factura.addColumn("NoFactura");
        Factura.addColumn("Id_producto");
        Factura.addColumn("Cantidad a vender");
        Factura.addColumn("Importe");

        this.TablaFactura.setModel(Factura);
        try {
            TablaFactura.setModel(Factura);
        } catch (Exception ex) {
            Logger.getLogger(frm5_Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void RefrescarTabla() {
        //Funcion encargada de Refrescar la tabla 
        try {
            Factura.setColumnCount(0);
            Factura.setRowCount(0);
            TablaFactura.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void Limpiar() {
        //Funcion para limpiar los text field 
        try {
            tfFactura.setText("");
            tfCajera.setText("");
            tfNombreC.setText("");
            tfProducto.setText("");
            tfCantidad.setText("");
            tfTotal.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public float suma() {
        float contar = TablaFactura.getRowCount();
        float total = 0;
        for (int i = 0; i < contar; i++) {
            total = total + Float.parseFloat(TablaFactura.getValueAt(i, 3).toString());
        }

        return total;
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // 
        Limpiar();
        Mostrardatos("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nofac = tfFactura.getText();
        String form_pago = jcFormaP.getItemAt(jcFormaP.getSelectedIndex());
        String caj = tfCajera.getText();
        String nomcli = tfNombreC.getText();
        String total = tfTotal.getText().substring(1);

        PreparedStatement ps;
        String query = "INSERT INTO `Facturacion`(`NoFactura`,`Cajera`,`NombreCliente`,`FormaPago`,`Total`) VALUES (?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, nofac);
            ps.setString(2, caj);
            ps.setString(3, nomcli);
            ps.setString(4, form_pago);
            ps.setString(5, total);

            if (ps.executeUpdate() > 0) {

                int id_fact = Integer.parseInt(tfFactura.getText());
                PreparedStatement ps1;
                for (int i = 0; i < TablaFactura.getRowCount(); i++) {
                    
                    String id_product = TablaFactura.getValueAt(i, 1).toString();
                    int cant = Integer.parseInt(TablaFactura.getValueAt(i, 2).toString());
                    float importe = Float.parseFloat(TablaFactura.getValueAt(i, 3).toString());
                    String query_ = "INSERT INTO `detalle_factura`(`id_factura`,`id_producto`,`cantidad_vendida`,`importe`) VALUES (?,?,?,?)";
                    try {
                        ps1 = MyConnection.getConnection().prepareStatement(query_);

                        ps1.setInt(1, id_fact);
                        ps1.setString(2, id_product);
                        ps1.setInt(3, cant);
                        ps1.setFloat(4, importe);

                        if (ps1.executeUpdate() > 0) {
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(frm5_Facturacion.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "error: " + ex);
                    }

                }
                            Limpiar();
                            Mostrardatos("");
                            JOptionPane.showMessageDialog(null, "Factura Guardada");
                               generarIdFact();
                               SetFacturaID();

            }

        } catch (SQLException ex) {
            Logger.getLogger(frm3_ControlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }


    }//GEN-LAST:event_jbGuardarActionPerformed


    private void tfFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFacturaKeyPressed
        // 
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String B = tfFactura.getText() + "";
                Mostrardatos(B);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_tfFacturaKeyPressed

    private void jbBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCActionPerformed

//        VistaClienteF a = new VistaClienteF();
//        a.setVisible(true);
//        a.pack();
//        a.setLocationRelativeTo(null);
//        

    }//GEN-LAST:event_jbBuscarCActionPerformed

    private void jbBuscarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarCMouseClicked
        frm_VistaClienteF a = new frm_VistaClienteF();
        a.setVisible(true);
    }//GEN-LAST:event_jbBuscarCMouseClicked

    private void jbBuscarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarPMouseClicked
        frm_VistaProducto b = new frm_VistaProducto();
        b.setVisible(true);
    }//GEN-LAST:event_jbBuscarPMouseClicked

    private void TablaFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaFacturaKeyPressed
        // TODO add your handling code here:
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String B = tfFactura.getText() + "";
                Mostrardatos(B);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_TablaFacturaKeyPressed

    private void jbBuscarP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarP1MouseClicked

    private void jbBuscarP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarP2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarP2MouseClicked
    public boolean RevisarStockDisponible(int id_prod, int cantidad) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkStock = false;
        String query = "SELECT Disponibilidad FROM producto WHERE Disponibilidad > ? AND Codigo_producto = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setInt(1, cantidad);
            ps.setInt(2, id_prod);
            rs = ps.executeQuery();
            if (rs.next()) {
                checkStock = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return checkStock;
    }

    public void LimpiarDatosProdFact() {
        txt_id_prod_fact.setText("");
        tfProducto.setText("");
        tfCantidad.setText("");
        tfPrecio.setText("");
    }
    private void jbBuscarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarP1ActionPerformed

        if (RevisarStockDisponible(Integer.parseInt(txt_id_prod_fact.getText()), Integer.parseInt(tfCantidad.getText())) == true) {

            Float importe = Float.parseFloat(tfPrecio.getText()) * Float.parseFloat(String.valueOf(Integer.parseInt(tfCantidad.getText())));

            DecimalFormat formato_decimal = new DecimalFormat("#.00");

            detalle[0] = tfFactura.getText();
            detalle[1] = txt_id_prod_fact.getText();
            detalle[2] = tfCantidad.getText();
            detalle[3] = formato_decimal.format(importe);

            //funcion para tomar el array con los datos e insertarlo en la tabla temporal
            Factura.addRow(detalle);

            tfTotal.setText(String.valueOf("$" + suma()));

            //Si se almaceno todo correctamente, con un ciclo se limpia el array
            for (int i = 0; i < detalle.length; i++) {
                detalle[i] = "";
            }
            LimpiarDatosProdFact();

        } else {

            JOptionPane.showMessageDialog(null, "La cantidad a facturar supera el stock disponible.", "Agregue más stock al producto #" + txt_id_prod_fact.getText(), 2);

        }
    }//GEN-LAST:event_jbBuscarP1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm5_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm5_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm5_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm5_Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm5_Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarC;
    private javax.swing.JButton jbBuscarP;
    private javax.swing.JButton jbBuscarP1;
    private javax.swing.JButton jbBuscarP2;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbImprimirF;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcFormaP;
    private javax.swing.JLabel lblCajera;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigoF;
    private javax.swing.JLabel lblDatosF;
    private javax.swing.JLabel lblDatosP;
    private javax.swing.JLabel lblFormapago;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblNombreC;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JLabel lblNombreP1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblimagents;
    public static javax.swing.JTextField tfCajera;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfFactura;
    public static javax.swing.JTextField tfNombreC;
    public static javax.swing.JTextField tfPrecio;
    public static javax.swing.JTextField tfProducto;
    private javax.swing.JTextField tfTotal;
    public static javax.swing.JTextField txt_id_prod_fact;
    // End of variables declaration//GEN-END:variables
}
