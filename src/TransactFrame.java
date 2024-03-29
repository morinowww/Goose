import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TransactFrame extends JFrame implements ActionListener{

    JButton button_prev;

    TransactFrame(){
        //BUTTONS
        button_prev = new JButton();
        button_prev.setSize(200, 100);
        button_prev.setHorizontalAlignment(JButton.CENTER);
        button_prev.setVerticalAlignment(JButton.CENTER);
        button_prev.setFocusable(false);
        button_prev.setText("Back");        
        button_prev.addActionListener(this);

        //PANELS
        JPanel pan_title = new JPanel();
        pan_title.setBackground(Color.red);
        pan_title.setPreferredSize(new Dimension(100, 100));
        pan_title.setLayout(new GridLayout(1, 4));

        JPanel pan_menu = new JPanel();
        pan_menu.setBackground(Color.blue);
        pan_menu.setPreferredSize(new Dimension(100, 100));
        pan_menu.setLayout(new GridLayout(3,1));

        JPanel pan_footer = new JPanel();
        pan_footer.setBackground(Color.red);
        pan_footer.setPreferredSize(new Dimension(100, 50));

        JPanel pan_sideWest = new JPanel();
        pan_sideWest.setBackground(Color.blue);
        pan_sideWest.setPreferredSize(new Dimension(25, 100));

        JPanel pan_sideEast = new JPanel();
        pan_sideEast.setBackground(Color.blue);
        pan_sideEast.setPreferredSize(new Dimension(25, 100));
        //PANELS

        //FRAMES
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(false);
        this.setResizable(true);
        this.setLayout(new BorderLayout(10, 10));
        this.setTitle("Goose");
        this.setVisible(true);
        
        pan_title.add(button_prev);
        pan_title.add(new JPanel());
        pan_title.add(new JPanel());
        pan_title.add(new JPanel());
        this.add(pan_title, BorderLayout.NORTH);
        this.add(pan_menu, BorderLayout.CENTER);
        this.add(pan_sideWest, BorderLayout.WEST);
        this.add(pan_sideEast, BorderLayout.EAST);
        this.add(pan_footer, BorderLayout.SOUTH);

        this.setVisible(true);
        //FRAMES
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_prev)
            this.dispose();
            new MenuFrame();
    }

}
