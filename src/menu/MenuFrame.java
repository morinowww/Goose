package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import menu.layout.FrameLayout;

import utilities.Button;


public class MenuFrame extends FrameLayout implements ActionListener{

    private Button button_newTransact, button_inventory, button_logs,
    button_help, button_settings, button_exit;

    public MenuFrame(){
        //BUTTONS
        button_newTransact = new Button("New Transaction", 25);
        button_newTransact.addActionListener(this);

        button_inventory = new Button("Inventory", 25);
        button_inventory.addActionListener(this);

        button_logs = new Button("Logs", 25);
        button_logs.addActionListener(this);

        button_logs = new Button("Logs", 25);
        button_logs.addActionListener(this);

        button_help = new Button("Help", 25);
        button_help.addActionListener(this);

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
        pan_menu.add(button_help);
        pan_menu.add(button_settings);
        pan_menu.add(button_exit);
        //PANELS

        //FRAMES
        this.setVisible(true);
        //FRAMES
    }

    @Override
    public void actionPerformed(ActionEvent e){
        this.dispose();
        if (e.getSource() == button_exit){
            System.exit(0);
        }
        else if (e.getSource() == button_newTransact){
            new TransactFrame();
        }
        else if (e.getSource() == button_inventory){
            new InventoryFrame();
        }
        else if (e.getSource() == button_logs){
            new LogsFrame();
        }
        else if (e.getSource() == button_help){
            new HelpFrame();
        }
        else if (e.getSource() == button_settings){
            new SettingsFrame();
        }
    }
}