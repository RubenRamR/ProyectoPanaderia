
package Presentación.RegistrarVenta;

import Control.ControlAgregarVenta;
import DTO.DTO_Cliente;
import DTO.DTO_Venta;


/**
 *
 * @author joseq
 */
public class Presentacion_DlgCobrarVenta extends javax.swing.JDialog{
    ControlAgregarVenta control;
    DTO_Venta venta;

    
    public Presentacion_DlgCobrarVenta(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
        control = ControlAgregarVenta.getInstance();
        this.venta = control.getVenta();
        setTitle("Tipo de pago");
        initComponents();
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCantidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboBoxPago = new javax.swing.JComboBox<>();
        cancelarBtn = new javax.swing.JButton();
        aceptarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cobrar Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad a pagar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Seleccione Cantidad a pagar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        comboBoxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50%", "100%" }));
        getContentPane().add(comboBoxCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione metodo de pago:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        comboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Efectivo" }));
        comboBoxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPagoActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        cancelarBtn.setBackground(new java.awt.Color(204, 153, 0));
        cancelarBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelarBtn.setText("Cancelar Pedido");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        aceptarbtn.setBackground(new java.awt.Color(204, 153, 0));
        aceptarbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aceptarbtn.setText("Aceptar");
        aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
      this.dispose();
        control.mostrarProductosVenta();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void comboBoxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPagoActionPerformed

    private void aceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtnActionPerformed
        if (comboBoxPago.getSelectedItem().toString().equals("Anticipo del 50%")) {
            venta.setEstado("Pendiente");
        } else {
            venta.setEstado("Pagado");
        }
        control.setVenta(venta);
        this.dispose();
        control.mostrarConfirmacionPago();
    }//GEN-LAST:event_aceptarbtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JComboBox<String> comboBoxCantidad;
    private javax.swing.JComboBox<String> comboBoxPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
