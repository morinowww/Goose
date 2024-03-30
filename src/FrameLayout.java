import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameLayout extends JFrame{
    protected JPanel pan_title = new JPanel();
    protected JPanel pan_menu = new JPanel();
    protected JPanel pan_footer = new JPanel();
    protected JPanel pan_sideWest = new JPanel();
    protected JPanel pan_sideEast = new JPanel();

    FrameLayout(){
    //BUTTONS        
    //BUTTONS

    //PANELS
    pan_title.setBackground(Color.red);
    pan_title.setPreferredSize(new Dimension(100, 100));
    pan_title.setLayout(new GridLayout(1, 4));

    pan_menu.setBackground(Color.blue);
    pan_menu.setPreferredSize(new Dimension(100, 100));
    pan_menu.setLayout(new GridLayout(3,1));

    pan_footer.setBackground(Color.red);
    pan_footer.setPreferredSize(new Dimension(100, 50));

    pan_sideWest.setBackground(Color.blue);
    pan_sideWest.setPreferredSize(new Dimension(25, 100));

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

    this.add(pan_title, BorderLayout.NORTH);
    this.add(pan_menu, BorderLayout.CENTER);
    this.add(pan_sideWest, BorderLayout.WEST);
    this.add(pan_sideEast, BorderLayout.EAST);
    this.add(pan_footer, BorderLayout.SOUTH);
    //FRAMES
    }


}
