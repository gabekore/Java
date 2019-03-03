package MyTable;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class GenericCellEditor extends AbstractCellEditor implements TableCellEditor {

    private JComponent c = null;
    
    @Override
    public Object getCellEditorValue() {
        return c;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        c = (JComponent) value;
        return c;
    }

    
}
