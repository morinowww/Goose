import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import others.Button;

public class MenuFrame extends FrameLayout implements ActionListener{

    Button button_newTransact;
    Button button_inventory;
    Button button_logs;
    Button button_settings;
    Button button_exit;

    MenuFrame(){
        //BUTTONS
        button_newTransact = new Button("New Transaction", 25);
        button_newTransact.addActionListener(this);

        button_inventory = new Button("Inventory", 25);
        button_inventory.addActionListener(this);

        button_logs = new Button("Logs", 25);
        button_logs.addActionListener(this);

        button_settings = new Button("Settings", 25);
        button_settings.addActionListener(this);

        button_exit = new Button("Exit", 25);
        button_exit.addActionListener(this);
        //BUTTONS

        //PANELS
        pan_menu.setLayout(new GridLayout(3,1));
        pan_menu.add(button_newTransact);
        pan_menu.add(button_inventory);
        pan_menu.add(button_logs);
        pan_menu.add(button_settings);
        pan_menu.add(button_exit);
        //PANELS

        //FRAMES
        this.setVisible(true);
        //FRAMES
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_exit){
            System.exit(0);
        }
        this.dispose();
        if (e.getSource() == button_newTransact){
            new TransactFrame();
        }
        if (e.getSource() == button_inventory){
            new InventoryFrame();
        }
        if (e.getSource() == button_logs){
            new LogsFrame();
        }
        if (e.getSource() == button_settings){
            new SettingsFrame();
        }
    }
}