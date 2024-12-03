/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Facturar;

import DTO.DTO_Cliente;
import DTO.DTO_Venta;
import Presentacion.Menu.Presentacion_MenuPrincipal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.s_panaderiafacturar.FuncionalidadFacturar;
import com.mycompany.s_panaderiafacturar.IFuncionalidadFacturar;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NaderCroft
 */
public class DlgFacturar extends javax.swing.JFrame {

    DTO_Cliente cliente;
    private IFuncionalidadFacturar facturar;

    /**
     * Creates new form DlgFacturar
     */
    public DlgFacturar(DTO_Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        this.facturar = new FuncionalidadFacturar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaFin = new com.github.lgooddatepicker.components.DatePicker();
        fechaInicio = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturar = new javax.swing.JTable();
        btnAplicar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Facturar");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        fechaFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        fechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));

        jLabel2.setText("Inicio");
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Fin");
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        tblFacturar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Descripcion", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblFacturar);

        btnAplicar.setText("Aplicar");
        btnAplicar.setBackground(new java.awt.Color(255, 153, 51));
        btnAplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.setBackground(new java.awt.Color(255, 153, 51));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnRegresarMenu.setText("Regresar al Menu");
        btnRegresarMenu.setBackground(new java.awt.Color(255, 153, 51));
        btnRegresarMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnAplicar)))))
                .addGap(23, 23, 23))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresarMenu)
                .addGap(42, 42, 42))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(btnAplicar)
                .addGap(76, 76, 76)
                .addComponent(btnImprimir)
                .addGap(169, 169, 169))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        if (fechaInicio.getDate() == null || fechaFin.getDate() == null) {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fecha.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String fechaFinal = convertLocalDateToString(fechaFin.getDate());
        if (!esFechaValida(fechaFinal)) {
            JOptionPane.showMessageDialog(this, "No se puede seleccionar una fecha superior a la de hoy", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        llenarTabla();

    }//GEN-LAST:event_btnAplicarActionPerformed

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
            PdfWriter.getInstance(doc, new FileOutputStream(String.format("%s/ReporteFacturacion.pdf", path)));
            doc.open();

            // Descripción de los filtros
            doc.add(new Paragraph("Panaderia BuenSabor", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 32)));
            doc.add(new Paragraph("Reporte de Facturacion", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16)));
            doc.add(new Paragraph("Filtros Aplicados:", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            doc.add(new Paragraph("Fechas: " + fechaInicio.getText() + " a " + fechaFin.getText()));
            doc.add(new Paragraph("\n")); // Espacio en blanco

            // Tabla
            PdfPTable tbl = new PdfPTable(3);
            tbl.addCell("Fecha");
            tbl.addCell("Descripcion");
            tbl.addCell("Total");
            for (int i = 0; i < tblFacturar.getRowCount(); i++) {
                String fecha = tblFacturar.getValueAt(i, 0).toString();
                String descripcion = tblFacturar.getValueAt(i, 1).toString();
                String total = tblFacturar.getValueAt(i, 2).toString();
                tbl.addCell(fecha);
                tbl.addCell(descripcion);
                tbl.addCell(total);
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

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        // TODO add your handling code here:
        Presentacion_MenuPrincipal pm = new Presentacion_MenuPrincipal();
        pm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblFacturar.getModel();

        modelo.setRowCount(0);

        tblFacturar.setModel(modelo);
    }

    /**
     * Convierte un objeto {@link LocalDate} a una cadena de texto con el
     * formato "yyyy-MM-dd".
     *
     * <p>
     * Este método toma un objeto {@link LocalDate}, lo valida para asegurarse
     * de que no es nulo, y lo convierte en una cadena de texto que representa
     * la fecha en el formato "yyyy-MM-dd".</p>
     *
     * @param date La fecha que se va a convertir a una cadena. No puede ser
     * nula.
     * @return Una cadena de texto que representa la fecha en el formato
     * "yyyy-MM-dd".
     * @throws IllegalArgumentException Si el parámetro {@code date} es nulo.
     */
    private String convertLocalDateToString(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("The date cannot be null.");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatter);
    }

    private void llenarTabla() {
        limpiarTabla();
        LocalDate fechaInicioLocal = this.fechaInicio.getDate();
        LocalDate fechaFinLocal = this.fechaFin.getDate();
        Date fechaInicio = Date.from(fechaInicioLocal.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date fechaFin = Date.from(fechaFinLocal.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        List<DTO_Venta> listaVenta = facturar.consultarVentasPorClienteFecha(cliente.getID(), fechaInicio, fechaFin);
        DefaultTableModel modelo = (DefaultTableModel) tblFacturar.getModel();

        if (listaVenta != null) {
            listaVenta.forEach(t -> {
                // Agregar la fila al modelo
                modelo.addRow(new Object[]{t.getFechaRegistro(), t.getEstado(), t.getMontoTotal()});

            });
        }
    }

    /**
     * Valida si una fecha proporcionada como cadena de texto no es posterior a
     * la fecha actual.
     *
     * <p>
     * Este método toma una fecha en formato {@code "yyyy-MM-dd"} (como cadena
     * de texto), intenta convertirla a un objeto {@link Date}, y valida que la
     * fecha no sea posterior al día de hoy.</p>
     *
     * @param fechaStr La fecha en formato {@code "yyyy-MM-dd"} que se va a
     * validar.
     * @return {@code true} si la fecha proporcionada no es posterior a la fecha
     * actual; {@code false} si la fecha es posterior a hoy o si el formato de
     * la fecha es inválido.
     */
    public boolean esFechaValida(String fechaStr) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        formatoFecha.setLenient(false); // Desactiva la validación leniente

        try {
            // Convertimos la fecha proporcionada (String) a un objeto Date
            Date fechaIngresada = formatoFecha.parse(fechaStr);

            // Obtenemos la fecha actual
            Date fechaHoy = new Date();

            // Comparamos las fechas
            if (fechaIngresada.after(fechaHoy)) {
                return false; // La fecha ingresada es posterior al día de hoy
            }

            return true; // La fecha ingresada es válida (no posterior a hoy)
        } catch (ParseException e) {
            return false; // Si ocurre un error en el formato de la fecha
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresarMenu;
    private com.github.lgooddatepicker.components.DatePicker fechaFin;
    private com.github.lgooddatepicker.components.DatePicker fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFacturar;
    // End of variables declaration//GEN-END:variables
}
