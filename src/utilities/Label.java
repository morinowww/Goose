package utilities;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel {
    public Label(String textLabel, int font_size){
        this.setText(textLabel);
        this.setFont(new Font("Arial", Font.BOLD, font_size));
        this.setForeground(new Color(249, 246, 238));
    }
    public Label(String textLabel, int font_size, Color color){
        this.setText(textLabel);
        this.setFont(new Font("Arial", Font.BOLD, font_size));
    }
}
