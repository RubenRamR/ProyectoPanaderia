/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación.RegistrarVenta;

import Control.ControlAgregarVenta;
import DTO.DTO_DetalleVenta;
import DTO.DTO_Direccion;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;

import DTO.DTO_Venta;
import com.mycompany.panaderiaactualizaringrediente.FuncionalidadActualizarIngrediente;
import com.mycompany.panaderiaactualizaringrediente.IFuncionalidadActualizarIngrediente;
import com.mycompany.panaderiaagregarproducto.FuncionalidadAgregarProducto;
import com.mycompany.panaderiaagregarproducto.IFuncionalidadAgregarProducto;
import com.mycompany.panaderiaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle.Control;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joseq
 */
public class Presentacion_DlgSeleccionarPan extends javax.swing.JDialog {

    DTO_Venta venta;
    ControlAgregarVenta control;
    DTO_Producto dtoProducto;
    DTO_DetalleVenta detalleVenta = new DTO_DetalleVenta();
    private List<DTO_DetalleVenta> detalleLista;
    float precio;
    int cantidadProducto;
    IFuncionalidadAgregarProducto agregarProducto;
    IFuncionalidadActualizarIngrediente actualizarIngrediente;
    private IFuncionalidadConsultarIngredientes funcionalidadesIngredientes;
    

    /**
     * Creates new form Presentacion_DlgDatosCliente
     */
    public Presentacion_DlgSeleccionarPan(java.awt.Frame parent, boolean modal, DTO_Producto dtoProducto) {
        super(parent, modal);
        this.control = ControlAgregarVenta.getInstance();
        this.venta = control.getVenta();
        this.dtoProducto = dtoProducto;
        this.agregarProducto = new FuncionalidadAgregarProducto();
        this.funcionalidadesIngredientes = new FuncionalidadConsultarIngredientes();
        this.actualizarIngrediente = new FuncionalidadActualizarIngrediente();
        setTitle("Datos de seleccionar Pan");
        initComponents();
        this.setLocationRelativeTo(null);
        datosIniciales();
        setVisible(true);
    }

    private void datosIniciales() {
        txtNombrePan.setText(dtoProducto.getNombre());
    }

    private void cargarCantidadTotal() {
        txtCantidad.setText(String.valueOf(cantidadProducto));
    }

    private void llenarComboBox(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombrePan = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        cbIngredienteExtra = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 355));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombrePan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNombrePan.setText("1");
        getContentPane().add(txtNombrePan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCantidad.setText("0");
        txtCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtCantidad.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 20, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingrediente Extra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        cbIngredienteExtra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Chocolate", "Vainilla" }));
        getContentPane().add(cbIngredienteExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 70, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecio.setText("0");
        txtPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtPrecio.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, -1));

        btnMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        btnMas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Seleccionar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        detalleLista = control.getVenta().getDetallesVenta();
        if (detalleLista == null) {
            detalleLista = new ArrayList<>();
        }
        detalleVenta.setCantidad(cantidadProducto);
        detalleVenta.setProducto(dtoProducto);
        detalleVenta.setPrecio(precio);
        detalleVenta.setEspecificacion((String) cbIngredienteExtra.getSelectedItem());
        detalleVenta.setImporte(precio);
        detalleVenta.setIdproducto(dtoProducto.getId());
        detalleLista.add(detalleVenta);
        List<DTO_IngredienteDetalle> ingredientes = dtoProducto.getIngredientes();
        for (DTO_IngredienteDetalle imagi : ingredientes) {
            DTO_Ingrediente pr = new DTO_Ingrediente();
            pr.setNombre(imagi.getNombre());
            pr = funcionalidadesIngredientes.consultarIngredientePorNombre(pr);
            int calc;
            int resta = (int) (imagi.getCantidad()*cantidadProducto);
            calc = (pr.getCantidad() -resta);
            pr.setCantidad(calc);
            try {
                actualizarIngrediente.actualizarIngrediente(pr);
            } catch (Exception ex) {
                Logger.getLogger(Presentacion_DlgSeleccionarPan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        venta.setMontoTotal(venta.getMontoTotal() + precio);
        venta.setDetallesVenta(detalleLista);
        cargarNumeros();
        this.dispose();
        control.mostrarAgregarPan();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        control.mostrarAgregarPan();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        btnMas.setEnabled(true);
        cantidadProducto--;
        precio -= dtoProducto.getPrecio();
        txtCantidad.setText(String.valueOf(cantidadProducto));
        txtPrecio.setText(String.valueOf(precio));
        if (cantidadProducto == 0) {
            btnMenos.setEnabled(false);
        }
        this.cargarCantidadTotal();
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
        if (cantidadProducto != 0) {
        DTO_Producto extra = dtoProducto;
        List<DTO_IngredienteDetalle> ingredientes = extra.getIngredientes();
        for (DTO_IngredienteDetalle imagi : ingredientes) {
            DTO_Ingrediente pr = new DTO_Ingrediente();
            pr.setNombre(imagi.getNombre());
            pr = funcionalidadesIngredientes.consultarIngredientePorNombre(pr);
            if (pr.getCantidad()<imagi.getCantidad()*(cantidadProducto+1)) {
                JOptionPane.showMessageDialog(rootPane, "Nomas existen "+cantidadProducto+" "+ dtoProducto.getNombre()+" Disponibles");
                return;
            }
        }
    }
        btnMenos.setEnabled(true);
        cantidadProducto++;
        precio += dtoProducto.getPrecio();
        txtCantidad.setText(String.valueOf(cantidadProducto));
        txtPrecio.setText(String.valueOf(precio));
        if (cantidadProducto == 3) {
            btnMas.setEnabled(false);
        }
        this.cargarCantidadTotal();
    }//GEN-LAST:event_btnMasActionPerformed

    public void cargarNumeros(){
        if (dtoProducto.getNombre().equalsIgnoreCase("dona")) {
            control.setDona(cantidadProducto);
        }else
        if (dtoProducto.getNombre().equalsIgnoreCase("cuernito")) {
            control.setCuernito(cantidadProducto);
        }else
        if (dtoProducto.getNombre().equalsIgnoreCase("cupcake")) {
            control.setCupcake(cantidadProducto);
        }else
        if (dtoProducto.getNombre().equalsIgnoreCase("oreja")) {
            control.setOreja(cantidadProducto);
        }else
        if (dtoProducto.getNombre().equalsIgnoreCase("concha")) {
            control.setConcha(cantidadProducto);
        }    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbIngredienteExtra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtNombrePan;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
}
