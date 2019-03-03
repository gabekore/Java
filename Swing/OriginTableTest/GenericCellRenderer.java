package MyTable;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class GenericCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JComponent c = (JComponent) value;
        
        //----------------------------------------------------------------------
        // テーブルの各行の高さを調整する
        //----------------------------------------------------------------------
        Dimension d = c.getPreferredSize();
        // テーブルの行の高さが、コンポーネントの高さより小さいのであれば、コンポーネントの高さにする
        if (table.getRowHeight(row) < d.height) {
            table.setRowHeight(row, d.height);
        }
        
        return c;
    }

    
}
