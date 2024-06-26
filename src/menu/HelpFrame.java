package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import menu.layout.FrameLayout;

import utilities.Button;

public class HelpFrame extends FrameLayout implements ActionListener{

    private Button button_prev, button_addCustom;

    public HelpFrame(){ 
        //Buttons
        button_prev = new Button("Back", 25);
        button_prev.addActionListener(this);

        button_addCustom = new Button("Add Custom", 25);
        button_addCustom.addActionListener(this);
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

        //Frames
        this.setTitle("Goose - Help");
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
