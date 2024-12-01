/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.HistorialVentas;

import DTO.DTO_DetalleVenta;
import DTO.DTO_Producto;
import DTO.DTO_Venta;
import Presentacion.Facturar.DlgFacturar;
import Presentacion.Menu.Presentacion_MenuPrincipal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.panaderiaconsultarproductos.FuncionalidadConsultarProductos;
import com.mycompany.panaderiaconsultarproductos.IFuncionalidadConsultarProductos;
import com.mycompany.s_panaderiahistorialventas.IFuncionalidadHistorialVentas;
import com.mycompany.s_panaderiahistorialventas.FuncionalidadHistorialVentas;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author adane
 */
public class DlgHistorialVentas extends javax.swing.JFrame {
    
    private IFuncionalidadHistorialVentas funcionalidadHistorialVentas;
     private IFuncionalidadConsultarProductos consultarProductos;

    /**
     * Creates new form DlgHistorialVentas
     */
    public DlgHistorialVentas() {
        initComponents();
        this.funcionalidadHistorialVentas = new FuncionalidadHistorialVentas();
        this.consultarProductos = new FuncionalidadConsultarProductos();
        this.metodosIniciales();
    }
    
     public void metodosIniciales() {
        this.setTitle("Realizar Cobro ");
        this.setResizable(false);
        this.setSize(1280, 780);
        this.setLocationRelativeTo(null);

    }

    
    
    private void addInfoTable(List<DTO_Venta> listaVenta) {
       if (listaVenta == null) {
        return;
    }

    DefaultTableModel tableModel = (DefaultTableModel) this.tblHistorialVentas.getModel();
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
        
        LocalDate localDate = column.getFechaRegistro().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        row[3] = localDate;
        row[4] = column.getMontoTotal();  // Monto total

        // Agregar la fila a la tabla
        tableModel.addRow(row);
    });
    }
    
    private void borrarInfoTablaPago() {
        DefaultTableModel tableModel = (DefaultTableModel) this. tblHistorialVentas.getModel();
        if (tableModel.getRowCount() > 0) {
            for (int row = tableModel.getRowCount() - 1; row > -1; row--) {
                tableModel.removeRow(row);
            }
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
        jlbHistorialVenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorialVentas = new javax.swing.JTable();
        dpDiaInicio = new com.github.lgooddatepicker.components.DatePicker();
        dpDiaFin = new com.github.lgooddatepicker.components.DatePicker();
        jlbDiaFin = new javax.swing.JLabel();
        jlnDiaInicio = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbHistorialVenta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlbHistorialVenta.setText("Historial de Ventas");

        tblHistorialVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Venta", "Nombre Cliente", "Nombre Pan", "Fecha", "Monto total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistorialVentas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jlbDiaFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbDiaFin.setText("Dia Fin");

        jlnDiaInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlnDiaInicio.setText("Dia Inicio");

        btnRegresar.setBackground(new java.awt.Color(253, 154, 45));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegresar.setText("Reegresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(253, 154, 45));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(253, 154, 45));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dpDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dpDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jlnDiaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbDiaFin)
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jlbHistorialVenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbHistorialVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlnDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (dpDiaInicio.getDate() == null || dpDiaFin.getDate() == null) {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fecha.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date fechaInicio = Date.from(dpDiaInicio.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaFin = Date.from(dpDiaFin.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
       
        List<DTO_Venta> listaVenta = funcionalidadHistorialVentas.consultarVentasPorRangoFechas(fechaInicio, fechaFin);
        this.borrarInfoTablaPago();
        this.addInfoTable(listaVenta);
                
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
                    String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }

        if (path.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se seleccionó ninguna carpeta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(String.format("%s/HistorialDeVentas.pdf", path)));
            doc.open();

            // Descripción de los filtros
            doc.add(new Paragraph("Panaderia BuenSabor", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 32)));
            doc.add(new Paragraph("Historial De Ventas", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16)));
            doc.add(new Paragraph("Filtros Aplicados:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            doc.add(new Paragraph("Fechas: " + dpDiaInicio.getText() + " a " + dpDiaFin.getText()));
            doc.add(new Paragraph("\n")); // Espacio en blanco

            // Tabla
            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("Id de la Venta");
            tbl.addCell("Nombre del Cliente");
            tbl.addCell("Nombre del Pan");
            tbl.addCell("Fecha");
            tbl.addCell("Monto Total");
            for (int i = 0; i < tblHistorialVentas.getRowCount(); i++) {
                String idVenta = tblHistorialVentas.getValueAt(i, 0).toString();
                String nombreCliente = tblHistorialVentas.getValueAt(i, 1).toString();
                String nombrePan = tblHistorialVentas.getValueAt(i, 2).toString();
                String fecha = tblHistorialVentas.getValueAt(i, 3).toString();
                String MontoTotal = tblHistorialVentas.getValueAt(i, 4).toString();
                tbl.addCell(idVenta);
                tbl.addCell(nombreCliente);
                tbl.addCell(nombrePan);
                tbl.addCell(fecha);
                tbl.addCell(MontoTotal);
            }

            doc.add(tbl);
            JOptionPane.showMessageDialog(this, "Se imprimió con éxito el documento!");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (DocumentException ex) {
            Logger.getLogger(DlgFacturar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            doc.close(); // Asegúrate de cerrar el documento en el bloque finally
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Presentacion_MenuPrincipal menu = new Presentacion_MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private com.github.lgooddatepicker.components.DatePicker dpDiaFin;
    private com.github.lgooddatepicker.components.DatePicker dpDiaInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbDiaFin;
    private javax.swing.JLabel jlbHistorialVenta;
    private javax.swing.JLabel jlnDiaInicio;
    private javax.swing.JTable tblHistorialVentas;
    // End of variables declaration//GEN-END:variables
}
