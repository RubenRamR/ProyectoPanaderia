/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación.RegistrarVenta;

import Control.ControlAgregarVenta;
import DTO.DTO_Cliente;
import DTO.DTO_Direccion;
import DTO.DTO_Venta;
import javax.swing.JOptionPane;

/**
 *
 * @author joseq
 */
public class Presentacion_DlgDatosCliente extends javax.swing.JDialog {

    ControlAgregarVenta control;
    DTO_Venta venta;

    DTO_Cliente cliente = new DTO_Cliente();

    /**
     * Creates new form Presentacion_DlgDatosCliente
     */
    public Presentacion_DlgDatosCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        control = ControlAgregarVenta.getInstance();
        this.venta = new DTO_Venta();
        setTitle("Datos del cliente");
        initComponents();

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        campoTextoTelefono = new javax.swing.JTextField();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoApellidoP = new javax.swing.JTextField();
        campoTextoApellidoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Datos del cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Telefono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Materno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(204, 153, 0));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 153, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        campoTextoTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(campoTextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 160, -1));

        campoTextoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(campoTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));

        campoTextoApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(campoTextoApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, -1));

        campoTextoApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(campoTextoApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (campoTextoNombre.getText().isEmpty() || campoTextoApellidoP.getText().isEmpty()
                || campoTextoApellidoM.getText().isEmpty() || campoTextoTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!esValido(campoTextoTelefono.getText())) {
            JOptionPane.showMessageDialog(this, "El teléfono debe ser de 7 digitos y con caracteres validos.", "Teléfono inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!soloLetrasYEspacios(campoTextoNombre.getText()) || !soloLetrasYEspacios(campoTextoApellidoM.getText()) || !soloLetrasYEspacios(campoTextoApellidoP.getText())) {
            JOptionPane.showMessageDialog(this, "Los campos de texto deben incluir solo letras(Excluyendo el telefono).", "Texto inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DTO_Cliente cliente = new DTO_Cliente();
        cliente.setNombre(this.campoTextoNombre.getText());
        cliente.setApellidoP(this.campoTextoApellidoP.getText());
        cliente.setApellidoM(this.campoTextoApellidoM.getText());
        cliente.setTelefono(this.campoTextoTelefono.getText());

        venta.setCliente(cliente);
        control.setVenta(venta);

        int respuesta = JOptionPane.showOptionDialog(null, "¿Realizara envio a domicilio?", "Tipo de envio", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");
        if (respuesta == JOptionPane.CLOSED_OPTION) {
            return;
        }
        if (respuesta == JOptionPane.YES_OPTION) {
            control.setVentanaAnterior("Cliente");
            this.dispose();
            control.mostrarAgregarDireccion();
        } else {
            DTO_Direccion direccion = new DTO_Direccion();
            direccion.setCalle("En tienda");
            venta.setDireccionEntrega(direccion);
            control.setVenta(venta);
            this.dispose();
            control.mostrarAgregarPan();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        control.mostrarMenu();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextField campoTextoApellidoM;
    private javax.swing.JTextField campoTextoApellidoP;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


       
    public boolean esValido(String texto) {
        // Comprobamos que el texto no sea nulo y tenga exactamente 7 caracteres
        if (texto != null && texto.length() == 10) {
            // Verificamos que todos los caracteres sean dígitos
            return texto.matches("\\d{10}");
        }
        return false;
    }

    public boolean soloLetrasYEspacios(String texto) {
        // Comprobamos que el texto no sea nulo y que contenga solo letras y espacios
        if (texto != null && texto.matches("[a-zA-Z ]+")) {
            return true;
        }
        return false;
    }
}
