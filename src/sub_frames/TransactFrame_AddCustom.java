package sub_frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import utilities.Button;
import utilities.Custom_TextField;
import utilities.Label;

public class TransactFrame_AddCustom extends JFrame implements ActionListener{
    protected JPanel pan_title = new JPanel();
    protected JPanel pan_menu = new JPanel();
    protected JPanel pan_sideWest = new JPanel();
    protected JPanel pan_sideEast = new JPanel();
    protected JPanel pan_footer = new JPanel();

    Button button_cancel, button_add;

    public TransactFrame_AddCustom(){
        //BUTTONS
        button_cancel = new Button("Back", 25);
        button_cancel.addActionListener(this);
        button_add = new Button("Add", 25);
        button_add.addActionListener(this);
        //BUTTONS


        //PANEL
        JPanel filler1 = new JPanel();
        filler1.setBackground(new Color(28,53,94));
        JPanel filler2 = new JPanel();
        filler2.setBackground(new Color(28,53,94));

        pan_title.setBackground(new Color(28,53,94));
        pan_title.setPreferredSize(new Dimension(100, 50));
        pan_title.setLayout(new GridLayout(1, 4));
        pan_title.add(button_cancel);
        pan_title.add(filler1);
        pan_title.add(filler2);

        pan_menu.setBackground(new Color(28,53,94));
        pan_menu.setPreferredSize(new Dimension(50, 100));
        pan_menu.setLayout(new GridBagLayout());
        pan_menu.add(new Label("Product Name: ", 16));
        pan_menu.add(new Custom_TextField("Enter product name here", 16));

        pan_sideWest.setBackground(new Color(28,53,94));
        pan_sideWest.setPreferredSize(new Dimension(50, 100));

        pan_sideEast.setBackground(new Color(28,53,94));
        pan_sideEast.setPreferredSize(new Dimension(50, 100));

        pan_footer.setBackground(new Color(28,53,94));
        pan_footer.setPreferredSize(new Dimension(100, 50)); 
        pan_footer.setLayout(new BorderLayout());
        pan_footer.add(button_add);       
        //PANEL


        //FRAMES
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setUndecorated(false);
        this.setResizable(false);
        this.setLayout(new BorderLayout(10, 10));
        this.getContentPane().setBackground(new Color(28,53,94));    
        this.setTitle("Goose - Add Custom");

        this.add(pan_title, BorderLayout.NORTH);
        this.add(pan_menu, BorderLayout.CENTER);
        this.add(pan_sideWest, BorderLayout.WEST);
        this.add(pan_sideEast, BorderLayout.EAST);
        this.add(pan_footer, BorderLayout.SOUTH);
        //FRAMESS

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_cancel){
            this.dispose();
        }
    }
}
