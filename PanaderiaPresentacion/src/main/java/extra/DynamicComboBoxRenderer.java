/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra;

import DTO.DTO_IngredienteDetalle;
import java.awt.Component;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class DynamicComboBoxRenderer extends DefaultTableCellRenderer {

    private JComboBox<String> comboBox;

    public DynamicComboBoxRenderer(List<DTO_IngredienteDetalle> ingredientes) {
        comboBox = new JComboBox<>();
        comboBox.setEditable(true); // Opcional, permite escribir en el JComboBox

        // Configura el modelo del JComboBox con los ingredientes específicos
        ingredientes.forEach(ingrediente -> comboBox.addItem(ingrediente.getNombre()));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Establece el valor seleccionado en el JComboBox
        comboBox.setSelectedItem(value);
        return comboBox;
    }
}
