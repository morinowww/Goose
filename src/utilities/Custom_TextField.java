package utilities;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import others.TextPrompt;

public class Custom_TextField extends JTextField{
    public Custom_TextField(String textFieldd_text, int font_size){
        this.setColumns(15);
        this.setFont(new Font ("Arial", Font.PLAIN, font_size));
        TextPrompt prompt = new TextPrompt(textFieldd_text, this);
        prompt.setHorizontalAlignment(JLabel.CENTER);
        prompt.changeStyle(Font.ITALIC);
        prompt.setForeground( Color.gray );

    }
}
