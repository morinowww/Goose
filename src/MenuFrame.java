import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MenuFrame extends FrameLayout implements ActionListener{

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
        button_newTransact.addActionListener(this);

        button_logs = new JButton();
        button_logs.setSize(200, 100);
        button_logs.setHorizontalAlignment(JButton.CENTER);
        button_logs.setVerticalAlignment(JButton.CENTER);
        button_logs.setFocusable(false);
        button_logs.setText("Logs");

        button_exit = new JButton();
        button_exit.setSize(200, 100);
        button_exit.setHorizontalAlignment(JButton.CENTER);
        button_exit.setVerticalAlignment(JButton.CENTER);
        button_exit.setFocusable(false);
        button_exit.setText("Exit");
        //BUTTONS

        //PANELS
        //PANELS

        //FRAMES
        pan_menu.add(button_newTransact);
        pan_menu.add(button_logs);
        pan_menu.add(button_exit);

        this.setVisible(true);
        //FRAMES
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_exit)
            System.exit(0);
        if (e.getSource() == button_newTransact){
            this.dispose();
            new TransactFrame();
        }
    }
}