import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame extends JFrame implements ActionListener{

    JButton button_newTransact;
    JButton button_logs;
    JButton button_exit;

    MenuFrame(){
        //BUTTONS
        button_newTransact = new JButton();
        button_newTransact.setSize(200, 100);
        button_newTransact.setHorizontalAlignment(JButton.CENTER);
        button_newTransact.setVerticalAlignment(JButton.CENTER);
        button_newTransact.setFocusable(false);
        button_newTransact.setText("New Transaction");
        //button_newTransact.addActionListener(e -> System.out.print("New transaction\n"));
        button_newTransact.addActionListener(this);

        button_logs = new JButton();
        button_logs.setSize(200, 100);
        button_logs.setHorizontalAlignment(JButton.CENTER);
        button_logs.setVerticalAlignment(JButton.CENTER);
        button_logs.setFocusable(false);
        button_logs.setText("Logs");
        button_logs.addActionListener(e -> System.out.print("Opening logs\n"));

        button_exit = new JButton();
        button_exit.setSize(200, 100);
        button_exit.setHorizontalAlignment(JButton.CENTER);
        button_exit.setVerticalAlignment(JButton.CENTER);
        button_exit.setFocusable(false);
        button_exit.setText("Exit");
        //button_exit.addActionListener(e -> System.out.print("Exit program\n"));
        button_exit.addActionListener(this);
        //BUTTONS

        //PANELS
        JPanel pan_title = new JPanel();
        pan_title.setBackground(Color.red);
        pan_title.setPreferredSize(new Dimension(100, 100));

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

        this.add(pan_title, BorderLayout.NORTH);
        pan_menu.add(button_newTransact);
        pan_menu.add(button_logs);
        pan_menu.add(button_exit);
        this.add(pan_menu, BorderLayout.CENTER);
        this.add(pan_sideWest, BorderLayout.WEST);
        this.add(pan_sideEast, BorderLayout.EAST);
        this.add(pan_footer, BorderLayout.SOUTH);

        this.setVisible(true);
        //FRAMES
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_exit)
            System.exit(0);
        if (e.getSource() == button_newTransact){
            new TransactFrame();
        }
    }
}