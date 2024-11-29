/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.RealizarCobro;

import DTO.DTO_DetalleVenta;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import Presentacion.Menu.Presentacion_MenuPrincipal;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import com.mycompany.s_panaderiarealizarpago.FuncionalidadRealizarPago;
import com.mycompany.s_panaderiarealizarpago.IFuncionalidadRealizarPago;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author adane
 */
public class DlgRealizarCobro extends javax.swing.JFrame {
    private  int Paguina = 1;
    private final int Limite = 10;
   
    private IFuncionalidadRealizarPago funcionalidadRealizarPago;
    private IFuncionalidadConsultarProductos consultarProductos;

    /**
     * Creates new form DlgRealizarCobro
     */
    public DlgRealizarCobro() {
        initComponents();
        this.funcionalidadRealizarPago = new FuncionalidadRealizarPago();
        this.consultarProductos = new FuncionalidadConsultarProductos();
        this.metodosIniciales();
    }
    
    
    public void metodosIniciales() {
        this.setTitle("Realizar Cobro ");
        this.setResizable(false);
        this.setSize(1280, 780);
        this.setLocationRelativeTo(null);
        this.cargarTablaPago();
        this.pageStatus();

    }
    
     private void addInfoTable(List<DTO_Venta> listaVenta) {
       if (listaVenta == null) {
        return;
    }

    DefaultTableModel tableModel = (DefaultTableModel) this.tblRealizarCobro.getModel();
    listaVenta.forEach(column -> {
        // Inicializar la fila de la tabla
        Object[] row = new Object[5];
        row[0] = column.getID();  // ID de la venta
        row[1] = column.getCliente().getNombre();  // Nombre del cliente

        // Usar un Set para evitar duplicados en los nombres de los productos
        Set<String> productosSet = new HashSet<>();

        // Iterar sobre los detalles de venta y obtener los nombres de los productos
        if (column.getDetallesVenta() != null && !column.getDetallesVenta().isEmpty()) {
            for (DTO_DetalleVenta detalle : column.getDetallesVenta()) {
                if (detalle != null && detalle.getIdproducto() != null) {
                    // Consultar el producto usando el ID del detalle
                    DTO_Producto producto = consultarProductos.consultarProducto(detalle.getIdproducto());
                    if (producto != null) {
                        // Agregar el nombre del producto al Set (evita duplicados)
                        productosSet.add(producto.getNombre());
                    } else {
                        // Si el producto no se encuentra, agregar mensaje por defecto
                        productosSet.add("Producto no disponible");
                    }
                } else {
                    // Si el detalle o el ID del producto es nulo, agregar mensaje por defecto
                    productosSet.add("Producto no disponible");
                }
            }
        } else {
            // Si no hay detalles, asignar "No hay detalles"
            productosSet.add("No hay detalles");
        }

        // Convertir el Set a una cadena separada por comas para mostrar en la tabla
        String productos = String.join(", ", productosSet);

        // Asignar la cadena concatenada de productos a la columna 2
        row[2] = productos;

        // Calcular el monto pagado (ejemplo: la mitad del monto total)
        float pagado = column.getMontoTotal() / 2;
        row[3] = pagado;
        row[4] = column.getMontoTotal();  // Monto total

        // Agregar la fila a la tabla
        tableModel.addRow(row);
    });
    }
     
    
    
     public void cargarTablaPago() {
        
            // Borrar registros previos antes de cargar los nuevos
            borrarInfoTablaPago();

            // Obtén solo los clientes necesarios para la página actual
            List<DTO_Venta> listaVenta = funcionalidadRealizarPago.consultarVentasPendiente(Paguina,Limite);

            //Agrega los registros paginados a la tabla
            this.addInfoTable(listaVenta);
            //Control de botones de navegación
            btnLeft.setEnabled(Paguina > 1);

        
    }
     
     private void borrarInfoTablaPago() {
        DefaultTableModel tableModel = (DefaultTableModel) this. tblRealizarCobro.getModel();
        if (tableModel.getRowCount() > 0) {
            for (int row = tableModel.getRowCount() - 1; row > -1; row--) {
                tableModel.removeRow(row);
            }
        }
    }
     
     private void leftButonStatus() {
        if (Paguina > 1) {
            btnLeft.setEnabled(true);
            return;
        }
        btnLeft.setEnabled(false);
    }

    private void rightButonStatus() {

            btnRight.setEnabled(true);
            if (this.funcionalidadRealizarPago.consultarVentasPendiente(Paguina + 1, Limite) == null
                    || this.funcionalidadRealizarPago.consultarVentasPendiente(Paguina + 1, Limite).isEmpty()) {
                btnRight.setEnabled(false);
            }
       
    }
    
     public void pageStatus() {
        String numeroPaguina = String.valueOf(Paguina);
        if (numeroPaguina.length() == 1) {
            numeroPaguina = "0" + numeroPaguina;
        }

        lblPagina.setText("Pagina " + numeroPaguina);
        leftButonStatus();
        rightButonStatus();
    }
     
    private String getSelectedIdTablaPgo() {
        int selectedIndex = this.tblRealizarCobro.getSelectedRow();
        if (selectedIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) this.tblRealizarCobro.getModel();
            int idIndexRow = 0;
            String idSelectedDegree = (String) model.getValueAt(selectedIndex,
                    idIndexRow);
            return idSelectedDegree;
        } else {
            return null;
        }
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
        jlRealizarCobro = new javax.swing.JLabel();
        jlRealizarCobro1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRealizarCobro = new javax.swing.JTable();
        jbPagar = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        lblPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlRealizarCobro.setText("Pago en tienda 50% faltante");
        jlRealizarCobro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlRealizarCobro1.setText("Realizar Cobro");
        jlRealizarCobro1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        tblRealizarCobro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Venta", "Nombre Cliente", "Nombre Pan", "Deuda", "Total de compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRealizarCobro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jbPagar.setBackground(new java.awt.Color(253, 154, 45));
        jbPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbPagar.setText("Pagar");
        jbPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagarActionPerformed(evt);
            }
        });

        jbRegresar.setBackground(new java.awt.Color(253, 154, 45));
        jbRegresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        btnLeft.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLeft.setText("<");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRight.setText(">");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        lblPagina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(lblPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jbPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(jlRealizarCobro1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(jlRealizarCobro)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jlRealizarCobro1)
                .addGap(17, 17, 17)
                .addComponent(jlRealizarCobro)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagarActionPerformed
        if (this.getSelectedIdTablaPgo() == null) {
    JOptionPane.showMessageDialog(this, "Por favor selecciona una Venta", "Información", JOptionPane.ERROR_MESSAGE);
    return;
}

int confirm = JOptionPane.showConfirmDialog(this, "¿Deseas pagar la venta seleccionada?", "Confirmar Pago", JOptionPane.YES_NO_OPTION);
if (confirm == JOptionPane.YES_OPTION) {
    try {
        // Buscar la venta seleccionada
        DTO_Venta DTOVenta = funcionalidadRealizarPago.encontrarVentaPorId(this.getSelectedIdTablaPgo());
        

        // Validar que la venta exista
        if (DTOVenta == null) {
            JOptionPane.showMessageDialog(this, "No se encontró la venta seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el estado de la venta a "Pagado"
        DTOVenta.setEstado("Pagado");
        
        funcionalidadRealizarPago.actualizarVenta(DTOVenta);
     
        

        // Confirmar al usuario que la operación fue exitosa
        if ("Pagado".equals(DTOVenta.getEstado())) {  // Usar equals() para comparar cadenas
            JOptionPane.showMessageDialog(this, "La venta ha sido marcada como 'Pagado'", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        cargarTablaPago();
    } catch (Exception e) {
        // Manejo de excepciones para cualquier error en la búsqueda o actualización
        JOptionPane.showMessageDialog(this, "Se produjo un error al procesar el pago: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();  // Opcional, solo para depuración
    }
}
    }//GEN-LAST:event_jbPagarActionPerformed

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        Presentacion_MenuPrincipal menu = new Presentacion_MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        Paguina ++;
        this.pageStatus();
        this.cargarTablaPago();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        Paguina --;
        this.pageStatus();
        this.cargarTablaPago();
    }//GEN-LAST:event_btnLeftActionPerformed


     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPagar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JLabel jlRealizarCobro;
    private javax.swing.JLabel jlRealizarCobro1;
    private javax.swing.JLabel lblPagina;
    private javax.swing.JTable tblRealizarCobro;
    // End of variables declaration//GEN-END:variables
}
