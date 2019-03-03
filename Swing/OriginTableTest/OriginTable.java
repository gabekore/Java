/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTable;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author rakuda
 */
public class OriginTable extends JTable {

    protected TableCellRenderer genericRendere = new GenericCellRenderer();
    protected TableCellEditor   genericEditor  = new GenericCellEditor();

    /**
     * コンストラクタ
     * 
     * @param row
     * @param column 
     */
    public OriginTable(int row, int column) {
        super(row, column);
        setCellSelectionEnabled(true);
    }
    
    
    /**
     * セルレンダラの取得
     * 
     * セルが表示される時にセルレンダラが呼ばれる
     * セルレンダラが呼ばれる時に、getCellRenderer()が呼び出される
     * 通常のセルレンダラではなく、任意のコンポーネントを持つレンダラ（genericRendereの事）を返すようにしている
     * 
     * @param row
     * @param column
     * @return 
     */
    @Override
    public TableCellRenderer getCellRenderer(int row, int column) {
        TableCellRenderer renderer;
        
        Object o = getValueAt(row, column);
        
        if (o instanceof JComponent) {
            renderer = genericRendere;
        } else {
            renderer = super.getCellRenderer(row, column);
        }
        
        return renderer;
    }
    
    
    /**
     * セルエディタの取得
     * 
     * セルが編集される時にセルエディタが呼ばれる
     * セルエディタが呼ばれる時に、このgetCellEditor()が呼び出される
     * 通常のセルエディタではなく、任意のコンポーネントを持つエディタ（genericEditorの事）を返すようにしている
     * 
     * 
     * @param row
     * @param column
     * @return 
     */
    @Override
    public TableCellEditor getCellEditor(int row, int column) {
        TableCellEditor editor;
        
        Object o = getValueAt(row, column);
        
        if (o instanceof JComponent) {
            editor = genericEditor;
        } else {
            editor = super.getCellEditor(row, column);
        }
        
        return editor;
    }
}
