/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.GestionGastos;

import Panaderia.IngresosMensuales.FrmIngresosMensuales;
import Control.ControlAgregarVenta;
import Presentacion.Menu.Presentacion_MenuPrincipal;
import com.mycompany.s_panaderiagestiongastos.FuncionalidadGestionGastos;
import com.mycompany.s_panaderiagestiongastos.IFuncionalidadGestionGastos;

/**
 *
 * @author rramirez
 */
public class Frm_GestionGastos extends javax.swing.JFrame {

    IFuncionalidadGestionGastos funcionalidadGestionGastos;

    /**
     * Creates new form Frm_GestionGastos
     */
    public Frm_GestionGastos() {
        initComponents();
        funcionalidadGestionGastos = new FuncionalidadGestionGastos();
        cargarCampos();
    }

    public void cargarCampos() {
        Float gastos = funcionalidadGestionGastos.calcularMontoTotal();
        LblGastos1.setText("$" + String.format("%.2f", gastos));

        Float ingresos = funcionalidadGestionGastos.calcularIngresosTotales();
        LblIngresos.setText("$" + String.format("%.2f", ingresos));

        Float ganancias = ingresos - gastos;

        LblGanancias.setText("$" + String.format("%.2f", ganancias));
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
        LblGestionGastos = new javax.swing.JLabel();
        LblTotGas = new javax.swing.JLabel();
        LblTotIngr = new javax.swing.JLabel();
        LblTG = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        BtnVerIngresosMensuales = new javax.swing.JButton();
        LblIngresos = new javax.swing.JLabel();
        LblGastos1 = new javax.swing.JLabel();
        LblGanancias = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblGestionGastos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblGestionGastos.setForeground(new java.awt.Color(0, 0, 0));
        LblGestionGastos.setText("Gestion Gastos");
        jPanel1.add(LblGestionGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        LblTotGas.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        LblTotGas.setForeground(new java.awt.Color(0, 0, 0));
        LblTotGas.setText("Total de Gastos:");
        jPanel1.add(LblTotGas, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 80, 200, -1));

        LblTotIngr.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        LblTotIngr.setForeground(new java.awt.Color(0, 0, 0));
        LblTotIngr.setText("Total de Ingresos:");
        jPanel1.add(LblTotIngr, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 130, 230, -1));

        LblTG.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTG.setForeground(new java.awt.Color(0, 0, 0));
        LblTG.setText("GANANCIAS:");
        jPanel1.add(LblTG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 40));

        BtnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        BtnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 267, -1, -1));

        BtnVerIngresosMensuales.setBackground(new java.awt.Color(255, 153, 0));
        BtnVerIngresosMensuales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnVerIngresosMensuales.setForeground(new java.awt.Color(0, 0, 0));
        BtnVerIngresosMensuales.setText("Ver Ingresos Mensuales");
        BtnVerIngresosMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerIngresosMensualesActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVerIngresosMensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 267, -1, -1));

        LblIngresos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LblIngresos.setForeground(new java.awt.Color(0, 0, 0));
        LblIngresos.setText("$");
        jPanel1.add(LblIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, 20));

        LblGastos1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LblGastos1.setForeground(new java.awt.Color(0, 0, 0));
        LblGastos1.setText("$");
        jPanel1.add(LblGastos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, 20));

        LblGanancias.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LblGanancias.setForeground(new java.awt.Color(0, 0, 0));
        LblGanancias.setText("$");
        jPanel1.add(LblGanancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 160, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerIngresosMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerIngresosMensualesActionPerformed
        // TODO add your handling code here:
        FrmIngresosMensuales fim = new FrmIngresosMensuales();
        fim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVerIngresosMensualesActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        ControlAgregarVenta c = new ControlAgregarVenta();
        c.mostrarMenu();
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

<<<<<<< HEAD
      
=======
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(Frm_GestionGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(Frm_GestionGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(Frm_GestionGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(Frm_GestionGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Frm_GestionGastos().setVisible(true);
//            }
//        });
//    }

>>>>>>> 4d080978fafe66a4b3422eedbe6682420ca0863f
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnVerIngresosMensuales;
    private javax.swing.JLabel LblGanancias;
    private javax.swing.JLabel LblGastos1;
    private javax.swing.JLabel LblGestionGastos;
    private javax.swing.JLabel LblIngresos;
    private javax.swing.JLabel LblTG;
    private javax.swing.JLabel LblTotGas;
    private javax.swing.JLabel LblTotIngr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

     

}