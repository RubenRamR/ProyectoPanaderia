/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.gestioninventarios;

import Control.ControlGestionarInventario;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import com.mycompany.panaderiaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import extra.Render;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Presentacion_DlgIngresarDatosDelProducto extends javax.swing.JFrame {
    
    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngrediente;
    private IFuncionalidadConsultarProductos funcionalidadAgregarProducto;
    private ControlGestionarInventario control;

    
    /**
     * Creates new form Presentacion_DlgSeleccionarIngredientesProducto
     */
    public Presentacion_DlgIngresarDatosDelProducto() {
        initComponents();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngredientes();
        funcionalidadAgregarProducto = new FuncionalidadConsultarProductos();
        control = ControlGestionarInventario.getInstance();
        cargaTabla();
    }

    private void cargaTabla() {
        tableIngredientes.setDefaultRenderer(Object.class, new Render());
        String[] columnas = {"Nombre", "Selección"};
        boolean[] editable = {false, true};
        Class[] tipos = new Class[]{java.lang.Object.class, java.lang.Boolean.class};

        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            public Class getColumnClass(int i) {
                return tipos[i];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        limipiarTabla(tableIngredientes, model);

        Object datos = new Object[columnas.length];
        List<DTO_Ingrediente> ingredientes = funcionalidadConsultarIngrediente.consultarIngredientes();
        for (DTO_Ingrediente ingrediente : ingredientes) {

            model.addRow(new Object[]{ingrediente.getNombre(), false});
        }

        tableIngredientes.setModel(model);
    }

    private void limipiarTabla(JTable tabla, DefaultTableModel modeloTabla) {
        if (modeloTabla.getRowCount() > 0) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                modeloTabla.removeRow(i);
                i -= 1;
            }
        }
    }
  

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos del producto");

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Seleccionar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableIngredientes.getTableHeader().setReorderingAllowed(false);
        tableIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIngredientesMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableIngredientes);
        if (tableIngredientes.getColumnModel().getColumnCount() > 0) {
            tableIngredientes.getColumnModel().getColumn(0).setResizable(false);
            tableIngredientes.getColumnModel().getColumn(1).setResizable(false);
            tableIngredientes.getColumnModel().getColumn(1).setPreferredWidth(1);
        }

        btnAceptar.setBackground(new java.awt.Color(204, 153, 0));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Selecciona los ingredientes.");

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        labelDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescripcion.setText("Descripcion");

        btnVolver.setBackground(new java.awt.Color(204, 153, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelDescripcion)
                            .addGap(8, 8, 8)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnVolver))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIngredientesMouseClicked

    }//GEN-LAST:event_tableIngredientesMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (this.txtDescripcion.getText().isBlank() || this.txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son necesarios.");
            return;
        }

        DTO_Producto productoDTO = new DTO_Producto();
        List<DTO_IngredienteDetalle> listaIngredienteDetalle = new ArrayList<>();

        for (int i = 0; i < tableIngredientes.getRowCount(); i++) {
            // Obtener el valor del CheckBox en la columna "Seleccionar"
            boolean seleccionado = (boolean) tableIngredientes.getValueAt(i, 1);

            if (seleccionado) {
                String fila = tableIngredientes.getValueAt(i, 0).toString();
                DTO_IngredienteDetalle ingredienteDetalleDTO = new DTO_IngredienteDetalle();
                ingredienteDetalleDTO.setNombre(fila);
                listaIngredienteDetalle.add(ingredienteDetalleDTO);

            }
        }
        if (listaIngredienteDetalle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se puede agregar sin ingredientes.");
            return;
        }
        DTO_Producto productoConsultado = funcionalidadAgregarProducto.consultarProductoPorNombre(this.txtNombre.getText());

        if (productoConsultado != null) {
            JOptionPane.showMessageDialog(this, "El producto ya se encuentra agregado.");
//            return;
        }
        productoDTO.setIngredientes(listaIngredienteDetalle);
        productoDTO.setNombre(this.txtNombre.getText());
        productoDTO.setDescripcion(this.txtDescripcion.getText());
        control.setProductoDTO(productoDTO);
        this.dispose();
        control.mostrarIngredientesSeleccionados();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        control.mostrarInvetarioProductos();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
