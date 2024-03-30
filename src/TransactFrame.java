import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TransactFrame extends FrameLayout implements ActionListener{

    JButton button_prev;
    JButton button_addCustom;

    TransactFrame(){ 
        button_prev = new JButton();
        button_prev.setSize(200, 100);
        button_prev.setHorizontalAlignment(JButton.CENTER);
        button_prev.setVerticalAlignment(JButton.CENTER);
        button_prev.setFocusable(false);
        button_prev.setText("Back");        
        button_prev.addActionListener(this);

        button_addCustom = new JButton();
        button_addCustom.setSize(200, 100);
        button_addCustom.setHorizontalAlignment(JButton.CENTER);
        button_addCustom.setVerticalAlignment(JButton.CENTER);
        button_addCustom.setFocusable(false);
        button_addCustom.setText("Add Custom");
        button_addCustom.addActionListener(this);

        pan_title.add(button_prev);
        pan_title.add(new JPanel());
        pan_title.add(new JPanel());
        pan_title.add(button_addCustom);

        this.setVisible(true);
    
    }   
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_prev){
            this.dispose();
            new MenuFrame();
        }
        if (e.getSource() == button_addCustom){
            new AddCustom();
        }
    }
}
