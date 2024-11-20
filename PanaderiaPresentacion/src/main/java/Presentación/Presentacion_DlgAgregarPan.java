/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

import Control.ControlAgregarVenta;
import DTO.DTO_Cliente;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author joseq
 */
public class Presentacion_DlgAgregarPan extends javax.swing.JDialog {

    private IFuncionalidadConsultarProductos funcionalidadesProductos;
    private ControlAgregarVenta control;
    private List<DTO_Producto> panes;
    DTO_Venta venta;
    DTO_Producto producto;
    String especificacion;

    /**
     * Creates new form DlgAgregarPastel
     */
    public Presentacion_DlgAgregarPan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.funcionalidadesProductos = new FuncionalidadConsultarProductos();
        this.producto = producto;
        this.especificacion = especificacion;
        this.control = ControlAgregarVenta.getInstance();
        this.venta = control.getVenta();
        setTitle("Agregar pan a la venta");
        initComponents();
        cargarTextoCantidad();
        this.panes = funcionalidadesProductos.consultarProductos();
//        desplegarPasteles(panes);
        setVisible(true);

    }

    private void cargarTextoCantidad() {
        txtCantidadTotal.setText(String.valueOf(control.getVenta().getMontoTotal()));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnDona = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarDona = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCupcake = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnOreja = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCuernito = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnConcha = new javax.swing.JButton();
        txtDonaCantidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOrejaCantidad = new javax.swing.JLabel();
        btnAgregarOreja = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCuernitoCantidad = new javax.swing.JLabel();
        btnAgregarCuernito = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCupcakeCantidad = new javax.swing.JLabel();
        btnAgregarCupcake = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtConchaCantidad = new javax.swing.JLabel();
        btnAgregarConcha = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        txtCantidadTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(920, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seleccione un tipo de Pan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Pan");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.setText("Aceptar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        btnDona.setMaximumSize(new java.awt.Dimension(250, 250));
        btnDona.setMinimumSize(new java.awt.Dimension(250, 250));
        jPanel1.add(btnDona);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 120));

        jLabel4.setText("Dona");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnAgregarDona.setText("Agregar");
        btnAgregarDona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDonaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarDona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jPanel2.add(btnCupcake);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, 120));

        jPanel3.add(btnOreja);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 120));

        jPanel4.add(btnCuernito);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 120));

        jPanel5.add(btnConcha);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, 120));

        txtDonaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDonaCantidad.setText("0");
        getContentPane().add(txtDonaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setText("Oreja");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        txtOrejaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOrejaCantidad.setText("0");
        getContentPane().add(txtOrejaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        btnAgregarOreja.setText("Agregar");
        btnAgregarOreja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOrejaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarOreja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel8.setText("Cuernito");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        txtCuernitoCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCuernitoCantidad.setText("0");
        getContentPane().add(txtCuernitoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnAgregarCuernito.setText("Agregar");
        btnAgregarCuernito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuernitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCuernito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel10.setText("Cupcake");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        txtCupcakeCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCupcakeCantidad.setText("0");
        getContentPane().add(txtCupcakeCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        btnAgregarCupcake.setText("Agregar");
        btnAgregarCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCupcakeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCupcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel12.setText("Concha");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        txtConchaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtConchaCantidad.setText("0");
        getContentPane().add(txtConchaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        btnAgregarConcha.setText("Agregar");
        btnAgregarConcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarConchaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtTotal.setText("Total:");
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        txtCantidadTotal.setEditable(false);
        txtCantidadTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidadTotal.setText("0");
        getContentPane().add(txtCantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        venta.setFechaEntrega(date);
        control.setVenta(venta);
        this.dispose();
        control.mostrarCobrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarDonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDonaActionPerformed
        DTO_Producto dona = new DTO_Producto();
        dona.setNombre("Dona");
        dona.setPrecio(10);
        dona.setTamanio("10cm");
        this.dispose();
        Presentacion_DlgSeleccionarPan seleccion = new Presentacion_DlgSeleccionarPan(null, true, dona);
        control.getVenta().getDetallesVenta();

    }//GEN-LAST:event_btnAgregarDonaActionPerformed

    private void btnAgregarOrejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOrejaActionPerformed
        DTO_Producto oreja = new DTO_Producto();
        oreja.setNombre("Oreja");
        oreja.setPrecio(8);
        oreja.setTamanio("10cm");
        this.dispose();
        Presentacion_DlgSeleccionarPan seleccion = new Presentacion_DlgSeleccionarPan(null, true, oreja);
        control.getVenta().getDetallesVenta();
    }//GEN-LAST:event_btnAgregarOrejaActionPerformed

    private void btnAgregarCuernitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuernitoActionPerformed
        DTO_Producto cuernito = new DTO_Producto();
        cuernito.setNombre("Cuernitos");
        cuernito.setPrecio(8);
        cuernito.setTamanio("10cm");
        this.dispose();
        Presentacion_DlgSeleccionarPan seleccion = new Presentacion_DlgSeleccionarPan(null, true, cuernito);
        control.getVenta().getDetallesVenta();
    }//GEN-LAST:event_btnAgregarCuernitoActionPerformed

    private void btnAgregarCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCupcakeActionPerformed
        DTO_Producto Cupcake = new DTO_Producto();
        Cupcake.setNombre("Cupcake");
        Cupcake.setPrecio(15);
        Cupcake.setTamanio("10cm");
        this.dispose();
        Presentacion_DlgSeleccionarPan seleccion = new Presentacion_DlgSeleccionarPan(null, true, Cupcake);
        control.getVenta().getDetallesVenta();
    }//GEN-LAST:event_btnAgregarCupcakeActionPerformed

    private void btnAgregarConchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConchaActionPerformed
        DTO_Producto concha = new DTO_Producto();
        concha.setNombre("Concha");
        concha.setPrecio(10);
        concha.setTamanio("10cm");
        this.dispose();
        Presentacion_DlgSeleccionarPan seleccion = new Presentacion_DlgSeleccionarPan(null, true, concha);
        control.getVenta().getDetallesVenta();
    }//GEN-LAST:event_btnAgregarConchaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarConcha;
    private javax.swing.JButton btnAgregarCuernito;
    private javax.swing.JButton btnAgregarCupcake;
    private javax.swing.JButton btnAgregarDona;
    private javax.swing.JButton btnAgregarOreja;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcha;
    private javax.swing.JButton btnCuernito;
    private javax.swing.JButton btnCupcake;
    private javax.swing.JButton btnDona;
    private javax.swing.JButton btnOreja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCantidadTotal;
    private javax.swing.JLabel txtConchaCantidad;
    private javax.swing.JLabel txtCuernitoCantidad;
    private javax.swing.JLabel txtCupcakeCantidad;
    private javax.swing.JLabel txtDonaCantidad;
    private javax.swing.JLabel txtOrejaCantidad;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

}
