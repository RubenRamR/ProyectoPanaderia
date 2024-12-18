/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.gestioninventarios;

import Control.ControlGestionarInventario;
import DTO.DTO_Ingrediente;
import com.mycompany.panaderiaactualizaringrediente.FuncionalidadActualizarIngrediente;
import com.mycompany.panaderiaactualizaringrediente.IFuncionalidadActualizarIngrediente;
import com.mycompany.panaderiaagregaringrediente.FuncionalidadAgregarIngrediente;
import com.mycompany.panaderiaagregaringrediente.IFuncionalidadAgregarIngrediente;
import com.mycompany.panaderiaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaeliminaringrediente.FuncionalidadEliminarIngrediente;
import com.mycompany.panaderiaeliminaringrediente.IFuncionalidadEliminarIngrediente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Presentacion_DlgInventarioIngredientes extends javax.swing.JFrame {

    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngredientes;
    private IFuncionalidadAgregarIngrediente funcionalidadAgregarIngrediente;
    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngrediente;
    private IFuncionalidadActualizarIngrediente funcionalidadActualizarIngrediente;
    private IFuncionalidadEliminarIngrediente funcionalidadEliminarIngrediente;
    private ControlGestionarInventario control;
    private List<DTO_Ingrediente> listaIngredientes;

    public Presentacion_DlgInventarioIngredientes() {

        initComponents();
        funcionalidadConsultarIngredientes = new FuncionalidadConsultarIngredientes();
        funcionalidadAgregarIngrediente = new FuncionalidadAgregarIngrediente();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngredientes();
        funcionalidadActualizarIngrediente = new FuncionalidadActualizarIngrediente();
        funcionalidadEliminarIngrediente = new FuncionalidadEliminarIngrediente();
        listaIngredientes = funcionalidadConsultarIngredientes.consultarIngredientes();
        control = ControlGestionarInventario.getInstance();
        llenarTabla();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificarCantidad.setEnabled(false);
        btnModificarCantidad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificarCantidad = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario ingredientes");

        btnAgregar.setBackground(new java.awt.Color(204, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIngredientesMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableIngredientes);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cantidad:");

        jLabel4.setText("Precio:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(204, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(204, 153, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel5.setText("Nombre:");

        btnEliminar.setBackground(new java.awt.Color(204, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificarCantidad.setText("Modificar");
        btnModificarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCantidadActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarCantidad)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnModificarCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() ||  txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        DTO_Ingrediente ingredienteNuevo = null;
        try {
            ingredienteNuevo = funcionalidadAgregarIngrediente.agregarIngrediente(obtenerIngredienteDTO());

            if (ingredienteNuevo.getPrecio() <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad tiene que ser mayor a 0");
                return;
            }
            modelo.addRow(new Object[]{ingredienteNuevo.getNombre(), ingredienteNuevo.getCantidad(), ingredienteNuevo.getPrecio()});
            this.limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed


    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar.setEnabled(false);
        btnAgregar.setEnabled(true);
        try {
            DTO_Ingrediente ingrediente = funcionalidadActualizarIngrediente.actualizarIngrediente(obtenerIngredienteDTO());
            if (ingrediente != null) {
                JOptionPane.showMessageDialog(this, "Se he actulizado el ingrediente.");
                llenarTabla();
            }
            valoresPorDefecto();

        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        control.mostrarOpcionesGestion();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tableIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIngredientesMouseClicked
        int fila = tableIngredientes.rowAtPoint(evt.getPoint());
        txtNombre.setText(tableIngredientes.getValueAt(fila, 0).toString());
        txtCantidad.setText(tableIngredientes.getValueAt(fila, 1).toString());
        txtPrecio.setText(tableIngredientes.getValueAt(fila, 2).toString());

        btnActualizar.setEnabled(true);
        btnModificarCantidad.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(true);
        txtCantidad.setEnabled(false);
        txtNombre.setEnabled(false);

        btnModificarCantidad.setVisible(true);
    }//GEN-LAST:event_tableIngredientesMouseClicked

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        limpiarTabla();

        if (txtBuscar.getText().isBlank()) {
            llenarTabla();
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();
        DTO_Ingrediente ingredientoDTO = new DTO_Ingrediente();
        ingredientoDTO.setNombre(txtBuscar.getText());
        List<DTO_Ingrediente> ingredienteConsultado = funcionalidadConsultarIngrediente.consultarIngrediente(ingredientoDTO);
        if (ingredienteConsultado != null) {
            ingredienteConsultado.forEach(t -> modelo.addRow(new Object[]{t.getNombre(), t.getCantidad(), t.getPrecio()}));
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar el ingrediente " + txtNombre.getText() + " ?");
        if (respuesta == JOptionPane.YES_OPTION) {
            Boolean eliminado = funcionalidadEliminarIngrediente.eliminarIngrediente(obtenerIngredienteDTO());
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Se he eliminado con exito.");
                llenarTabla();

            } else {
                JOptionPane.showMessageDialog(this, "No se he eliminado con exito.");

            }
        }
        valoresPorDefecto();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCantidadActionPerformed
        String respuestaCantidad = JOptionPane.showInputDialog(this, "Ingrese la cantidad que desea aumentar, actual: " + txtCantidad.getText());
        try {
            int cantidad = Integer.parseInt(respuestaCantidad);
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "No se pueden ingresar valores negativos.");
                return;
            }
            int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas la cantidad a " + (cantidad + Integer.parseInt(txtCantidad.getText())));
            if (respuesta == JOptionPane.YES_OPTION) {
                txtCantidad.setText(String.valueOf(cantidad + Integer.parseInt(txtCantidad.getText())));
            }
        } catch (NumberFormatException e) {
        }

    }//GEN-LAST:event_btnModificarCantidadActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        valoresPorDefecto();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' || (c == '.' && txtCantidad.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarCantidad;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
 private void llenarTabla() {
        limpiarTabla();
        List<DTO_Ingrediente> listaIngredientes = funcionalidadConsultarIngredientes.consultarIngredientes();
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        if (listaIngredientes != null) {
            listaIngredientes.forEach(t -> modelo.addRow(new Object[]{t.getNombre(), t.getCantidad(), t.getPrecio()}));
        }

    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        modelo.setRowCount(0);

        tableIngredientes.setModel(modelo);
    }

    private DTO_Ingrediente obtenerIngredienteDTO() {
        DTO_Ingrediente ingredientoDTO = new DTO_Ingrediente();
        ingredientoDTO.setNombre(txtNombre.getText());
        ingredientoDTO.setPrecio(Float.parseFloat(txtPrecio.getText()));
        ingredientoDTO.setCantidad(Integer.parseInt(txtCantidad.getText()));
        return ingredientoDTO;
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPrecio.setText("");
        
        txtCantidad.setText("");
    }

    private void valoresPorDefecto() {
        txtCantidad.setEnabled(true);
        txtNombre.setEnabled(true);
        btnModificarCantidad.setVisible(false);
        btnModificarCantidad.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);

        txtCantidad.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
       

    }

}
