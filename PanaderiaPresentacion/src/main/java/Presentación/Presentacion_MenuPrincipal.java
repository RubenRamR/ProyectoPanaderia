package Presentación;


import Control.ControlAgregarVenta;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author joseq
 */
public class Presentacion_MenuPrincipal extends javax.swing.JFrame {
    
    
    ControlAgregarVenta control;
    
    
    

    public static JDesktopPane JDesktopPane_menu;

    public Presentacion_MenuPrincipal() {
        initComponents();
        control = ControlAgregarVenta.getInstance();
         this.setSize(new Dimension(1200, 700)); // Establecer tamaño de la ventana
        this.setLocationRelativeTo(null); // Centrar la ventana
        this.setTitle("Menu Principal");
        this.setLayout(null); // Considerar usar un layout más apropiado si es necesario
        this.setResizable(false); // Deshabilitar el redimensionamiento de la ventana
          JDesktopPane_menu = new JDesktopPane();
        
  // Cambiar el fondo del JDesktopPane a color café
        JDesktopPane_menu.setBackground(new ColorUIResource(139, 69, 19)); // Color marrón (café)


        
        this.JDesktopPane_menu.setBounds(0, 0, 1200,700);
        this.add(JDesktopPane_menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIngresosMensuales = new javax.swing.JButton();
        btnRealizarEnvio = new javax.swing.JButton();
        btnRegistrarVenta1 = new javax.swing.JButton();
        btnGestionDeGastos = new javax.swing.JButton();
        btnHistorialDeVentas1 = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        btnRealizarCobro = new javax.swing.JButton();
        btnGestionarInventario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Dulce Hogar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        btnIngresosMensuales.setBackground(new java.awt.Color(204, 153, 0));
        btnIngresosMensuales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresosMensuales.setText("Ingresos Mensuales");
        btnIngresosMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosMensualesActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresosMensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 250, 70));

        btnRealizarEnvio.setBackground(new java.awt.Color(204, 153, 0));
        btnRealizarEnvio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRealizarEnvio.setText("Realizar Envio");
        btnRealizarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarEnvioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 250, 70));

        btnRegistrarVenta1.setBackground(new java.awt.Color(204, 153, 0));
        btnRegistrarVenta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrarVenta1.setText("Registrar Venta");
        btnRegistrarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVenta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 250, 70));

        btnGestionDeGastos.setBackground(new java.awt.Color(204, 153, 0));
        btnGestionDeGastos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGestionDeGastos.setText("Gestion De Gastos");
        btnGestionDeGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionDeGastosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionDeGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 250, 70));

        btnHistorialDeVentas1.setBackground(new java.awt.Color(204, 153, 0));
        btnHistorialDeVentas1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHistorialDeVentas1.setText("Historial De Ventas");
        btnHistorialDeVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDeVentas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorialDeVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 250, 70));

        btnFacturar.setBackground(new java.awt.Color(204, 153, 0));
        btnFacturar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 250, 70));

        btnRealizarCobro.setBackground(new java.awt.Color(204, 153, 0));
        btnRealizarCobro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRealizarCobro.setText("Realizar Cobro");
        btnRealizarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCobroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizarCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 250, 70));

        btnGestionarInventario1.setBackground(new java.awt.Color(204, 153, 0));
        btnGestionarInventario1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGestionarInventario1.setText("Gestionar Inventario");
        btnGestionarInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarInventario1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionarInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 250, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarEnvioActionPerformed

    private void btnIngresosMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosMensualesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosMensualesActionPerformed

    private void btnRegistrarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVenta1ActionPerformed


 this.dispose();
 control.mostrarProductosVenta();
 
    }//GEN-LAST:event_btnRegistrarVenta1ActionPerformed

    private void btnGestionDeGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionDeGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionDeGastosActionPerformed

    private void btnHistorialDeVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDeVentas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistorialDeVentas1ActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void btnRealizarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarCobroActionPerformed

    private void btnGestionarInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarInventario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarInventario1ActionPerformed

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
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Presentacion_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnGestionDeGastos;
    private javax.swing.JButton btnGestionarInventario1;
    private javax.swing.JButton btnHistorialDeVentas1;
    private javax.swing.JButton btnIngresosMensuales;
    private javax.swing.JButton btnRealizarCobro;
    private javax.swing.JButton btnRealizarEnvio;
    private javax.swing.JButton btnRegistrarVenta1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
