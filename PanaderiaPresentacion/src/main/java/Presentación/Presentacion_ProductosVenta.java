/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

import Control.ControlAgregarVenta;
import DTO.DTO_DetalleVenta;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import com.mycompany.panaderiaventa.IFuncionalidadesVenta;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;



/**
 *
 * @author joseq
 */
public class Presentacion_ProductosVenta extends javax.swing.JFrame {
    
    private DTO_Venta venta;
    private Control.ControlAgregarVenta control;
    private IFuncionalidadConsultarProductos funcionalidadesProductos;
    float total;
    


    /**
     * Creates new form Presentacion_ProductosVenta
     */
    public Presentacion_ProductosVenta() {
        initComponents();
         setTitle("Productos de la venta");
        this.control = ControlAgregarVenta.getInstance();
        this.funcionalidadesProductos = new  FuncionalidadConsultarProductos();
        venta = new DTO_Venta();
        total = 0;
        llenarTabla();
        ponerTotal();
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
        btnAgregarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Detalles De la venta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total a pagar:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de entrega:");

        btnAgregarProducto.setBackground(new java.awt.Color(204, 153, 0));
        btnAgregarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregarProducto)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnAgregarProducto)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Lista de productos seleccionados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Especificaciones", "Cantidad", "Precio", "+", "-"
            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 500, 250));

        btnCancelar.setBackground(new java.awt.Color(204, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 150, 50));

        btnSiguiente.setBackground(new java.awt.Color(204, 153, 0));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      this.dispose();
      control.mostrarMenu();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
  if (validarCamposVacios()) {

            if (((DefaultTableModel) tableProductos.getModel()).getRowCount() <= 0) {
                JOptionPane.showMessageDialog(this, "No se puede continuar sin agregar algun producto.", "No hay productos en la venta", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int rowCount = this.tableProductos.getModel().getRowCount();
            List<DTO_DetalleVenta> listaDetalles = new ArrayList<>();

            for (int i = 0; i < rowCount; i++) {
                DTO_DetalleVenta detalleVenta = new DTO_DetalleVenta();
                Object valueNombre = this.tableProductos.getModel().getValueAt(i, 0); // Obtener el valor en la segunda columna (índice 1)
                Object valueEspecificaciones = this.tableProductos.getModel().getValueAt(i, 1);
                Object valueCantidad = this.tableProductos.getModel().getValueAt(i, 2);
                Object valuePrecio = this.tableProductos.getModel().getValueAt(i, 3);
                Object valueTamanio = this.tableProductos.getModel().getValueAt(i, 4);

                String nombre = valueNombre != null ? valueNombre.toString() : "";
                String especificaciones = valueEspecificaciones != null ? valueEspecificaciones.toString() : "";

                int cantidad = 0;
                if (valueCantidad != null) {
                    try {
                        cantidad = Integer.parseInt(valueCantidad.toString());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                float precio = 0.0f;
                if (valuePrecio != null) {
                    try {
                        precio = Float.parseFloat(valuePrecio.toString());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                String tamanio = valueTamanio != null ? valueTamanio.toString() : "";

                detalleVenta.setIdproducto(this.funcionalidadesProductos.consultarProductoPorNombre(nombre).getId());
                detalleVenta.setEspecificacion(especificaciones);
                detalleVenta.setCantidad(cantidad);
                detalleVenta.setPrecio(precio);
                detalleVenta.setTamanhoProducto(tamanio);
                detalleVenta.setImporte(detalleVenta.getCantidad() * detalleVenta.getPrecio());
                listaDetalles.add(detalleVenta);
            }
            venta.setDetallesVenta(listaDetalles);
            int respuesta = JOptionPane.showOptionDialog(null, "¿El cliente ya ha comprado aqui?", "Bienvenido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");
            LocalDate localDate = fechaEntrega.getDate();
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            venta.setFechaEntrega(date);
            venta.setMontoTotal(total);
            control.setVenta(venta);
            if (respuesta == JOptionPane.CLOSED_OPTION) {
                return;
            }
            if (respuesta == JOptionPane.YES_OPTION) {
                dispose();
                control.mostrarListaClientes();

            } else if (respuesta == JOptionPane.NO_OPTION) {
                System.out.println(control.getVenta());
                dispose();
                control.mostrarDatosClientes();

            }
        }
        
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables

public void ponerTotal() {
        total = calcularTotal();

        JlabelTotal.setText("Total a pagar " + total);
    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableProductos.getModel();
        DTO_Venta venta = control.getVenta();

        tableProductos.getColumnModel().getColumn(5).setCellRenderer(new BotonRenderer("+"));
        tableProductos.getColumnModel().getColumn(5).setCellEditor(new BotonEditor(new JCheckBox(), modelo, 2, 1));

        tableProductos.getColumnModel().getColumn(6).setCellRenderer(new BotonRenderer("-"));
        tableProductos.getColumnModel().getColumn(6).setCellEditor(new BotonEditor(new JCheckBox(), modelo, 2, -1));
    }

    private float calcularTotal() {
        float total = 0;
        if (tableProductos.getRowCount() > 0) {
            for (int row = tableProductos.getRowCount() - 1; row >= 0; row--) {
                Object cantidad = tableProductos.getValueAt(row, 2);
                Object precio = tableProductos.getValueAt(row, 3);
                if (cantidad != null && precio != null) {
                    float multiplicacion = Float.parseFloat(cantidad.toString()) * Float.parseFloat(precio.toString());
                    total += multiplicacion;
                }
            }
        }

        return total;
    }

// Renderer para los botones
    class BotonRenderer extends JButton implements TableCellRenderer {

        public BotonRenderer(String texto) {
            setOpaque(true);
            setText(texto);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            ponerTotal();
            return this;
        }
    }

    private boolean validarCamposVacios() {
        if (fechaEntrega.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de entrega.", "Fecha no seleccionada", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
// Editor para los botones

    class BotonEditor extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean isPushed;
        private DefaultTableModel modelo;
        private int colCantidad;
        private int incremento;
        private int row; // Agregué una variable para almacenar el índice de fila

        public BotonEditor(JCheckBox checkBox, DefaultTableModel modelo, int colCantidad, int incremento) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
            this.modelo = modelo;
            this.colCantidad = colCantidad;
            this.incremento = incremento;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.row = row; // Almaceno el índice de fila
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                int cantidad = (int) modelo.getValueAt(row, colCantidad);
                cantidad += incremento;
                if (cantidad == 0) {
                    modelo.removeRow(row);
                } else {
                    modelo.setValueAt(cantidad, row, colCantidad);
                }
                modelo.fireTableDataChanged();
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            if (row >= 0 && row < tableProductos.getRowCount()) {
                super.fireEditingStopped();
            }
        }

    }

    private void obtenerDatosTabla() {
        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (int i = 0; i < tableProductos.getRowCount(); i++) {
            DTO_DetalleVenta detalleVenta = new DTO_DetalleVenta();
            DTO_Producto producto = new DTO_Producto(tableProductos.getValueAt(i, 0).toString());
            detalleVenta.setProducto(producto);
            detalleVenta.setEspecificacion(tableProductos.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(tableProductos.getValueAt(i, 2).toString());
            detalleVenta.setCantidad(cantidad);
            float total = Float.parseFloat(tableProductos.getValueAt(i, 2).toString());
            detalleVenta.setImporte(total * cantidad);
            detalleVenta.setPrecio(total);
            detallesVenta.add(detalleVenta);
        }

        venta.setDetallesVenta(detallesVenta);
    }






















}
