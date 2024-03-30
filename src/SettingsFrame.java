import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import utilities.Button;

public class SettingsFrame extends FrameLayout implements ActionListener{

    Button button_prev;

    SettingsFrame(){ 
        //Buttons
        button_prev = new Button("Back", 25);
        button_prev.addActionListener(this);
        //Buttons

        //Panels
        JPanel filler1 = new JPanel();
        filler1.setBackground(new Color(28,53,94));
        JPanel filler2 = new JPanel();
        filler2.setBackground(new Color(28,53,94));
        JPanel filler3 = new JPanel();
        filler3.setBackground(new Color(28,53,94));

        pan_title.add(button_prev);
        pan_title.add(filler1);
        pan_title.add(filler2);
        pan_title.add(filler3);    

        //Framess
        this.setTitle("Goose - Settings");
        this.setVisible(true);
        //Frames

    }   
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_prev){
            this.dispose();
            new MenuFrame();
        }
    }
}
