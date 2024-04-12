package utilities;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class SelectionBox  extends JLabel implements ListCellRenderer {

    private Border insetBorder;
    
    private String _title;

    private DefaultListCellRenderer defaultRenderer;

    public SelectionBox (int sideMargins, String title) {
        this.insetBorder = new EmptyBorder(0, sideMargins, 0, sideMargins);
        this.defaultRenderer = new DefaultListCellRenderer();
        _title = title;
    }
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, 
    	boolean isSelected, boolean cellHasFocus){
        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        renderer.setBorder(insetBorder);
        if (index == -1 && value == null) 
        	renderer.setText(_title);
        else renderer.setText(value.toString());        
        return renderer;
    }

}