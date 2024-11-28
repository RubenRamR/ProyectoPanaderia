/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.gestioninventarios;

import Control.ControlGestionarInventario;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import com.mycompany.panaderiaactualizarproducto.FuncionalidadActualizarProducto;
import com.mycompany.panaderiaactualizarproducto.IFuncionalidadActualizarProducto;
import com.mycompany.panaderiaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Presentacion_DlgActualizarIngredientesSeleccionados extends javax.swing.JFrame {

    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngrediente;
    private IFuncionalidadActualizarProducto funcionalidadActualizarProducto;
    private ControlGestionarInventario control;

    public Presentacion_DlgActualizarIngredientesSeleccionados() {

        initComponents();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngredientes();
        funcionalidadActualizarProducto = new FuncionalidadActualizarProducto();
        control = ControlGestionarInventario.getInstance();
        llenarTabla();
        agregarListenerCambioCantidad(); // Añadimos el listener para validar la cantidad.

    }

     private void llenarTabla() {
 limpiarTabla();

        List<DTO_IngredienteDetalle> ingredientesDetalleDTO = control.getProductoAActualizar() != null
                ? control.getProductoAActualizar().getIngredientes()
                : null;

        List<DTO_IngredienteDetalle> ingredientesOriginales = control.getProductoDTO() != null
                ? control.getProductoDTO().getIngredientes()
                : null;

        if (ingredientesDetalleDTO == null || ingredientesDetalleDTO.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ingredientes para mostrar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        for (DTO_IngredienteDetalle ingredienteDetalle : ingredientesDetalleDTO) {
            try {
                if (ingredienteDetalle.getNombre() == null || ingredienteDetalle.getNombre().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El nombre del ingrediente es inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                DTO_Ingrediente ingrediente = funcionalidadConsultarIngrediente.consultarIngredientePorNombre(
                        new DTO_Ingrediente(ingredienteDetalle.getNombre())
                );

                if (ingrediente == null) {
                    JOptionPane.showMessageDialog(this, "Ingrediente no encontrado: " + ingredienteDetalle.getNombre(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                ingredienteDetalle.setIngredienteId(ingrediente.getId());

                Object cantidad = null;
                if (ingredientesOriginales != null) {
                    for (DTO_IngredienteDetalle original : ingredientesOriginales) {
                        if (original.getNombre().equals(ingrediente.getNombre())) {
                            cantidad = original.getCantidad();
                            break;
                        }
                    }
                }

                modelo.addRow(new Object[]{ingrediente.getNombre(), cantidad});
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al consultar el ingrediente: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();
        modelo.setRowCount(0);
    }

    private List<DTO_IngredienteDetalle> obtenerListaIngredientes() {
        List<DTO_IngredienteDetalle> listaIngredientes = control.getProductoAActualizar() != null
                ? control.getProductoAActualizar().getIngredientes()
                : null;

        if (listaIngredientes == null) {
            listaIngredientes = new ArrayList<>();
        }

        for (int fila = 0; fila < tableIngredientes.getRowCount(); fila++) {
            Object valorCelda = tableIngredientes.getValueAt(fila, 1);

            if (valorCelda == null || valorCelda.toString().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todas las celdas deben tener un valor válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }

            try {
                float cantidad = Float.parseFloat(valorCelda.toString());
                if (fila < listaIngredientes.size()) {
                    listaIngredientes.get(fila).setCantidad(cantidad);
                } else {
                    DTO_IngredienteDetalle nuevoIngrediente = new DTO_IngredienteDetalle();
                    nuevoIngrediente.setCantidad(cantidad);
                    listaIngredientes.add(nuevoIngrediente);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }

        return listaIngredientes;
    }

    public void agregarListenerCambioCantidad() {
        final int columnaCantidad = 1;

        tableIngredientes.getColumnModel().getColumn(columnaCantidad).setCellEditor(new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean stopCellEditing() {
                try {
                    JTextField textField = (JTextField) getComponent();
                    String valorCelda = textField.getText();

                    double numero = Double.parseDouble(valorCelda);

                    if (numero <= 0) {
                        JOptionPane.showMessageDialog(null, "El número debe ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                return super.stopCellEditing();
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actualizar ingredientes seleccionados");

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.setRowHeight(25);
        jScrollPane1.setViewportView(tableIngredientes);
        if (tableIngredientes.getColumnModel().getColumnCount() > 0) {
            tableIngredientes.getColumnModel().getColumn(0).setResizable(false);
        }

        btnCancelar.setBackground(new java.awt.Color(204, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese las cantidades de cada ingrediente.");

        btnAceptar.setBackground(new java.awt.Color(204, 153, 0));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnCancelar))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(403, Short.MAX_VALUE)
                    .addComponent(btnAceptar)
                    .addGap(77, 77, 77)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCancelar)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(289, Short.MAX_VALUE)
                    .addComponent(btnAceptar)
                    .addGap(31, 31, 31)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        control.mostrarInvetarioProductos();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (tableIngredientes.isEditing()) {
            tableIngredientes.getCellEditor().stopCellEditing();
        }

        List<DTO_IngredienteDetalle> ingredientesAgregados = obtenerListaIngredientes();
        if (ingredientesAgregados == null) {
            return;
        }

        DTO_Producto producto = control.getProductoAActualizar();
        if (producto == null) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el producto a actualizar.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        producto.setIngredientes(ingredientesAgregados);

        DTO_Producto productoAgregado = funcionalidadActualizarProducto.actualizarProducto(producto);
        if (productoAgregado != null) {
            JOptionPane.showMessageDialog(this, "Se ha actualizado el producto.");
            control.mostrarInvetarioProductos();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha actualizado el producto.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableIngredientes;
    // End of variables declaration//GEN-END:variables
}
