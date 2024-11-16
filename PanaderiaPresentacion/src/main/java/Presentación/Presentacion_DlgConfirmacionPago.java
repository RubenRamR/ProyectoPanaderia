/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

import ActualizarCliente.FuncionalidadActulizarCliente;
import ActualizarCliente.IFuncionalidadActualizarCliente;
import Control.ControlAgregarVenta;
import DTO.DTO_Cliente;
import DTO.DTO_Venta;
import DTO.DTO_Direccion;
import com.mycompany.funcionalidadagregarclientes.FuncionalidadAgregarClientes;
import com.mycompany.funcionalidadagregarclientes.IFuncionalidadAgregarClientes;

import com.mycompany.panaderiaventa.IFuncionalidadesVenta;
import com.mycompany.panaderiaventa.FuncionalidadesVenta;






import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseq
 */
public class Presentacion_DlgConfirmacionPago extends javax.swing.JDialog {
    
    private ControlAgregarVenta control;
    private DTO_Venta venta;
    private IFuncionalidadesVenta ventas;
    private IFuncionalidadAgregarClientes agregarCliente;
    private IFuncionalidadActualizarCliente actualizarCliente;


    /**
     * Creates new form Presentacion_DlgConfirmacionPago
     */
    public Presentacion_DlgConfirmacionPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        control = ControlAgregarVenta.getInstance();
        this.actualizarCliente = new FuncionalidadActulizarCliente();
        this.venta = control.getVenta();
        this.agregarCliente = new FuncionalidadAgregarClientes();
        this.ventas = new FuncionalidadesVenta();
        setTitle("Confirmación");
        initComponents();
        txtCliente.setText(venta.getCliente().getNombre());
        txtCosto.setText(Float.toString(venta.getMontoTotal()));
        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaEntrega.setText(ff.format(venta.getFechaEntrega()));
        txtUbicacionEntrega.setText(venta.getDireccionEntrega().getCalle());
        setVisible(true);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        txtUbicacionEntrega = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Confirmación de pago");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Costo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Entrega:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ubicacion Entrega:");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFechaEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUbicacionEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnRegresar.setBackground(new java.awt.Color(204, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(204, 153, 0));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente)
                            .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaEntrega)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUbicacionEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUbicacionEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnRegistrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (venta.getCliente().getID() == null) {

            if (!venta.getDireccionEntrega().getCalle().equalsIgnoreCase("En tienda")) {

                List<DTO_Direccion> a = new ArrayList<>();
                a.add(venta.getDireccionEntrega());
                venta.getCliente().setDirecciones(a);
                System.out.println(venta.getCliente().getDirecciones());
            }
            DTO_Cliente cliente = agregarCliente.agregarCliente(venta.getCliente());
            DTO_Cliente clienteProvisional = new DTO_Cliente();
            clienteProvisional.setID(cliente.getID());
            clienteProvisional.setNombre(cliente.getNombre());
            clienteProvisional.setApellidoP(cliente.getApellidoP());
            clienteProvisional.setApellidoM(cliente.getApellidoM());
            venta.setCliente(clienteProvisional);
            venta.setFechaRegistro(new Date());

        } else {

            if (control.isNuevaDireccion() && !venta.getDireccionEntrega().getCalle().equalsIgnoreCase("En tienda")) {
                System.out.println("entro al actualiza");
                List<DTO_Direccion> direcciones = venta.getCliente().getDirecciones();
                direcciones.add(venta.getDireccionEntrega());
                venta.getCliente().setDirecciones(direcciones);
                DTO_Cliente clienteProvisional = new DTO_Cliente();
                clienteProvisional.setID(venta.getCliente().getID());
                clienteProvisional.setNombre(venta.getCliente().getNombre());
                clienteProvisional.setApellidoP(venta.getCliente().getApellidoP());
                clienteProvisional.setApellidoM(venta.getCliente().getApellidoM());
                actualizarCliente.actualizarCliente(venta.getCliente());
                venta.getCliente().setDirecciones(direcciones);
                venta.setCliente(clienteProvisional);
                venta.setFechaRegistro(new Date());

            } else {
                DTO_Cliente clienteProvisional = new DTO_Cliente();
                clienteProvisional.setID(venta.getCliente().getID());
                clienteProvisional.setNombre(venta.getCliente().getNombre());
                clienteProvisional.setApellidoP(venta.getCliente().getApellidoP());
                clienteProvisional.setApellidoM(venta.getCliente().getApellidoM());
                venta.setCliente(clienteProvisional);
                venta.setFechaRegistro(new Date());

            }
        }
        ventas.agregarVenta(venta);
        String mensaje = "¡La venta ha sido registrada exitosamente!";
        control.setNuevaDireccion(false);
        JOptionPane.showMessageDialog(null, mensaje, "Registro de Venta Exitoso", JOptionPane.INFORMATION_MESSAGE);

        int respuesta = JOptionPane.showOptionDialog(null, "¿Quiere registrar otra venta?", "Hola", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");

        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose();
            control.mostrarProductosVenta();

        } else {
            this.dispose();
            control.mostrarMenu();

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
          this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtUbicacionEntrega;
    // End of variables declaration//GEN-END:variables
}
