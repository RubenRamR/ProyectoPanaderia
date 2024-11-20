/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class DynamicComboBoxEditor extends DefaultCellEditor {
    private JComboBox<String> comboBox;

    public DynamicComboBoxEditor(String[] items) {
        super(new JTextField());
        comboBox = new JComboBox<>(items);
        comboBox.setEditable(true); // Opcional, permite escribir en el JComboBox
        editorComponent = comboBox;
    }

    @Override
    public Object getCellEditorValue() {
        return comboBox.getSelectedItem();
    }
}
