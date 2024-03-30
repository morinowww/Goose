package others;

import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton {
    public Button(String text, int font_size){
        this.setFocusable(false);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setVerticalAlignment(JButton.CENTER);
        this.setFont(new Font("Arial", Font.BOLD, font_size));
        this.setText(text);
    }
}
