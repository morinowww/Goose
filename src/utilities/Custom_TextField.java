package utilities;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.text.PlainDocument;

import others.TextPrompt;
import others.DigitFilter;

public class Custom_TextField extends JFormattedTextField{ 


    public Custom_TextField(String textFieldd_text, int font_size, int format){
        this.setColumns(15);
        this.setFont(new Font ("Arial", Font.PLAIN, font_size));
        TextPrompt prompt = new TextPrompt(textFieldd_text, this);
        prompt.setHorizontalAlignment(JLabel.CENTER);
        prompt.changeStyle(Font.ITALIC);
        prompt.setForeground( Color.gray );
        if (format == 1){
            PlainDocument document = (PlainDocument) this.getDocument(); 
            document.setDocumentFilter(new DigitFilter());
        }

    }
}
