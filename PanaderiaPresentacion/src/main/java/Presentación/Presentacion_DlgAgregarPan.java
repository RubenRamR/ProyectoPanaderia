/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

import Control.ControlAgregarVenta;
import DTO.DTO_Cliente;
import DTO.DTO_Producto;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import java.awt.Image;
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
        setTitle("Agregar pan a la venta");
//        initComponents();
        this.panes = funcionalidadesProductos.consultarProductos();
//        desplegarPasteles(panes);
        setVisible(true);
    
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxIngrediente = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnDona = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMenosDona = new javax.swing.JButton();
        btnMasDona = new javax.swing.JButton();
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
        btnMenosOreja = new javax.swing.JButton();
        txtOrejaCantidad = new javax.swing.JLabel();
        btnMasOreja = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnMenosCuernito = new javax.swing.JButton();
        txtCuernitoCantidad = new javax.swing.JLabel();
        btnMasCuernito = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnMenosCupcake = new javax.swing.JButton();
        txtCupcakeCantidad = new javax.swing.JLabel();
        btnMasCupcake = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnMenosConcha = new javax.swing.JButton();
        txtConchaCantidad = new javax.swing.JLabel();
        btnMasConcha = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        txtCantidadTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(920, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seleccione un tipo de Pan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrediente Extra (opcional)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Pan");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jComboBoxIngrediente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Babaria", "Canela", "Chocolate", "Azucar" }));
        jComboBoxIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIngredienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 40));

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

        btnDona.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaderCroft\\Documents\\GitHub\\ProyectoPanaderia\\PanaderiaPresentacion\\src\\main\\java\\Imagenes\\dona.png")); // NOI18N
        btnDona.setMaximumSize(new java.awt.Dimension(250, 250));
        btnDona.setMinimumSize(new java.awt.Dimension(250, 250));
        jPanel1.add(btnDona);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 120));

        jLabel4.setText("Dona");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnMenosDona.setText("-");
        btnMenosDona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosDonaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosDona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnMasDona.setText("+");
        btnMasDona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasDonaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasDona, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        btnCupcake.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaderCroft\\Documents\\GitHub\\ProyectoPanaderia\\PanaderiaPresentacion\\src\\main\\java\\Imagenes\\cupcake.png")); // NOI18N
        jPanel2.add(btnCupcake);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, 120));

        btnOreja.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaderCroft\\Documents\\GitHub\\ProyectoPanaderia\\PanaderiaPresentacion\\src\\main\\java\\Imagenes\\oreja.jpg")); // NOI18N
        jPanel3.add(btnOreja);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 120));

        btnCuernito.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaderCroft\\Documents\\GitHub\\ProyectoPanaderia\\PanaderiaPresentacion\\src\\main\\java\\Imagenes\\cuernito.png")); // NOI18N
        jPanel4.add(btnCuernito);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 120));

        btnConcha.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaderCroft\\Documents\\GitHub\\ProyectoPanaderia\\PanaderiaPresentacion\\src\\main\\java\\Imagenes\\concha.png")); // NOI18N
        jPanel5.add(btnConcha);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 110, 120));

        txtDonaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDonaCantidad.setText("0");
        getContentPane().add(txtDonaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setText("Oreja");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        btnMenosOreja.setText("-");
        btnMenosOreja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosOrejaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosOreja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        txtOrejaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOrejaCantidad.setText("0");
        getContentPane().add(txtOrejaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        btnMasOreja.setText("+");
        btnMasOreja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasOrejaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasOreja, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel8.setText("Cuernito");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        btnMenosCuernito.setText("-");
        btnMenosCuernito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCuernitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosCuernito, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        txtCuernitoCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCuernitoCantidad.setText("0");
        getContentPane().add(txtCuernitoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnMasCuernito.setText("+");
        btnMasCuernito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCuernitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasCuernito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel10.setText("Cupcake");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        btnMenosCupcake.setText("-");
        btnMenosCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCupcakeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosCupcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        txtCupcakeCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCupcakeCantidad.setText("0");
        getContentPane().add(txtCupcakeCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        btnMasCupcake.setText("+");
        btnMasCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCupcakeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasCupcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jLabel12.setText("Concha");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        btnMenosConcha.setText("-");
        btnMenosConcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosConchaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        txtConchaCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtConchaCantidad.setText("0");
        getContentPane().add(txtConchaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        btnMasConcha.setText("+");
        btnMasConcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasConchaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasConcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

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


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMenosDonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosDonaActionPerformed

    }//GEN-LAST:event_btnMenosDonaActionPerformed

    private void btnMasDonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasDonaActionPerformed

    }//GEN-LAST:event_btnMasDonaActionPerformed

    private void btnMenosOrejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosOrejaActionPerformed

    }//GEN-LAST:event_btnMenosOrejaActionPerformed

    private void btnMasOrejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasOrejaActionPerformed

    }//GEN-LAST:event_btnMasOrejaActionPerformed

    private void btnMenosCuernitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCuernitoActionPerformed

    }//GEN-LAST:event_btnMenosCuernitoActionPerformed

    private void btnMasCuernitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCuernitoActionPerformed

    }//GEN-LAST:event_btnMasCuernitoActionPerformed

    private void btnMenosCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCupcakeActionPerformed

    }//GEN-LAST:event_btnMenosCupcakeActionPerformed

    private void btnMasCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCupcakeActionPerformed

    }//GEN-LAST:event_btnMasCupcakeActionPerformed

    private void btnMenosConchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosConchaActionPerformed

    }//GEN-LAST:event_btnMenosConchaActionPerformed

    private void btnMasConchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasConchaActionPerformed

    }//GEN-LAST:event_btnMasConchaActionPerformed

    private void jComboBoxIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIngredienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcha;
    private javax.swing.JButton btnCuernito;
    private javax.swing.JButton btnCupcake;
    private javax.swing.JButton btnDona;
    private javax.swing.JButton btnMasConcha;
    private javax.swing.JButton btnMasCuernito;
    private javax.swing.JButton btnMasCupcake;
    private javax.swing.JButton btnMasDona;
    private javax.swing.JButton btnMasOreja;
    private javax.swing.JButton btnMenosConcha;
    private javax.swing.JButton btnMenosCuernito;
    private javax.swing.JButton btnMenosCupcake;
    private javax.swing.JButton btnMenosDona;
    private javax.swing.JButton btnMenosOreja;
    private javax.swing.JButton btnOreja;
    private javax.swing.JComboBox<String> jComboBoxIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
