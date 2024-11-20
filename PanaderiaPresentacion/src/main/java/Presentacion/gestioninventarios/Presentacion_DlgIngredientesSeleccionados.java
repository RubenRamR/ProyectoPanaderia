/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.gestioninventarios;

import Control.ControlGestionarInventario;
import DTO.DTO_Ingrediente;
import DTO.DTO_IngredienteDetalle;
import DTO.DTO_Producto;
import com.mycompany.panaderiaagregarproducto.FuncionalidadAgregarProducto;
import com.mycompany.panaderiaagregarproducto.IFuncionalidadAgregarProducto;
import com.mycompany.panaderiaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.panaderiaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




public class Presentacion_DlgIngredientesSeleccionados extends javax.swing.JFrame {
    
    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngrediente;
    private IFuncionalidadAgregarProducto funcionalidadAgregarProducto;
    private ControlGestionarInventario control;

    
     /**
     * Creates new form Presentacion_DlgIngredientesSeleccionados
     */
    public Presentacion_DlgIngredientesSeleccionados() {
        initComponents();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngredientes();
        funcionalidadAgregarProducto = new FuncionalidadAgregarProducto();
        control = ControlGestionarInventario.getInstance();
        llenarTabla();
        agregarListenerCambioCantidad();

    }
        
         private void llenarTabla() {
        limpiarTabla();
        List<DTO_Ingrediente> listaIngredientes = new ArrayList<>();
        List<DTO_IngredienteDetalle> ingredientesDetalleDTO = control.getProductoDTO().getIngredientes();
        if (ingredientesDetalleDTO != null) {

            for (int i = 0; i < ingredientesDetalleDTO.size(); i++) {
                DTO_Ingrediente ingrediente = funcionalidadConsultarIngrediente.consultarIngredientePorNombre(new DTO_Ingrediente(ingredientesDetalleDTO.get(i).getNombre()));
                ingredientesDetalleDTO.get(i).setIngredienteId(ingrediente.getId());
                listaIngredientes.add(ingrediente);
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        if (listaIngredientes != null) {
            listaIngredientes.forEach(t -> modelo.addRow(new Object[]{t.getNombre(),}));
        }

    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        modelo.setRowCount(0);

        tableIngredientes.setModel(modelo);
    }
    
     private List<DTO_IngredienteDetalle> obtenerListaIngredientes() {
        JTable tabla = tableIngredientes;
        List<DTO_IngredienteDetalle> listaIngredientes = control.getProductoDTO().getIngredientes();
        int numRows = tabla.getRowCount();

        for (int fila = 0; fila < numRows; fila++) {
            Object valorCelda = tabla.getValueAt(fila, 1);
            DTO_IngredienteDetalle ingrediente = listaIngredientes.get(fila);
            if (valorCelda == null) {
                return null;
            }
            ingrediente.setCantidad(Float.valueOf(String.valueOf(valorCelda)));

        }

        return listaIngredientes;
    }
     
     public void agregarListenerCambioCantidad() {
        final int columnaCantidad = 1; 
        final int columnaUnidad = 2; 

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

                    int fila = tableIngredientes.getEditingRow();
                    String unidad = (String) tableIngredientes.getValueAt(fila, columnaUnidad);

                    if (unidad.equalsIgnoreCase("unidad") && valorCelda.contains(".")) {
                        JOptionPane.showMessageDialog(null, "Las unidades no pueden tener decimales", "Error", JOptionPane.ERROR_MESSAGE);
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
        setTitle("Ingredientes seleccionados");

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

        btnCancelar.setBackground(new java.awt.Color(140, 220, 254));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese las cantidades de cada ingrediente.");

        btnAceptar.setBackground(new java.awt.Color(140, 220, 254));
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
         List<DTO_IngredienteDetalle> ingredientesAgregados = obtenerListaIngredientes();

        if (ingredientesAgregados == null) {
            JOptionPane.showMessageDialog(this, "Las cantidades no pueden estar vacias.");

            return;
        }
        for (int i = 0; i < ingredientesAgregados.size(); i++) {
            System.out.println(ingredientesAgregados.get(i).getIngredienteId());
        }

        control.getProductoDTO().setIngredientes(ingredientesAgregados);

        DTO_Producto producto = control.getProductoDTO();

        DTO_Producto productoAgregado = funcionalidadAgregarProducto.agregarProducto(producto);

        if (productoAgregado != null) {
            JOptionPane.showMessageDialog(this, "Se ha agregado el producto.");
            control.mostrarInvetarioProductos();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha agregado el producto.");
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
