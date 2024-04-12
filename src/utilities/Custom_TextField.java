package utilities;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.text.PlainDocument;

import others.TextPrompt;
import others.DigitFilter;

public class Custom_TextField extends JFormattedTextField{ 
    public Custom_TextField(String textFieldd_text, int font_size, int col, String FORMAT){ //[FORMAT] 1 = Integers only
        this.setColumns(col);
        this.setFont(new Font ("Arial", Font.PLAIN, font_size));
        this.setBorder(BorderFactory.createCompoundBorder(
            this.getBorder(), BorderFactory.createEmptyBorder(0,5,0,5)
        ));
        TextPrompt prompt = new TextPrompt(textFieldd_text, this);
        prompt.setHorizontalAlignment(JLabel.LEFT);
        prompt.changeStyle(Font.ITALIC);
        prompt.setForeground( Color.gray );
        if (FORMAT == "DOUBLE"){
            PlainDocument document = (PlainDocument) this.getDocument(); 
            document.setDocumentFilter(new DigitFilter());
        }
    }
}
