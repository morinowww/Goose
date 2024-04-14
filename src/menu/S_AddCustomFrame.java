package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import products.Product;
import utilities.SelectionBox;
import utilities.Button;
import utilities.Custom_TextField;
import utilities.Label;

public class S_AddCustomFrame extends JFrame implements ActionListener{
    protected JPanel pan_title = new JPanel();
    protected JPanel pan_menu = new JPanel();
    protected JPanel pan_sideWest = new JPanel();
    protected JPanel pan_sideEast = new JPanel();
    protected JPanel pan_footer = new JPanel();

    private Button button_cancel, button_add;
    private final JPanel panel = new JPanel();

    private Custom_TextField prodField_name;
    private String _productTypes[] = {"Canned and Preserved Goods", "Fruits and Vegetables", "Dairy, Meat, and Seafood", "Condiments and Spices",
                                    "Snacks", "Beverages", "Personal Care", "Health Care", "Others"};
    private JComboBox prodType = new JComboBox(_productTypes);
    private Custom_TextField prodField_desc;
    private Custom_TextField prodField_price;
    
    public S_AddCustomFrame(){
        //BUTTONS
        button_cancel = new Button("Back", 25);
        button_cancel.addActionListener(this);
        button_add = new Button("Add", 25);
        button_add.addActionListener(this);
        //BUTTONS


        //PANEL
        JPanel filler1 = new JPanel();
        filler1.setBackground(new Color(28,53,94));
        JPanel filler2 = new JPanel();
        filler2.setBackground(new Color(28,53,94));

        pan_title.setBackground(new Color(28,53,94));
        pan_title.setPreferredSize(new Dimension(100, 50));
        pan_title.setLayout(new GridLayout(1, 4));
        pan_title.add(button_cancel);
        pan_title.add(filler1);
        pan_title.add(filler2);

        pan_menu.setBackground(new Color(28,53,94));
        pan_menu.setPreferredSize(new Dimension(50, 100));
        GridBagLayout gbl_pan_menu = new GridBagLayout();
        gbl_pan_menu.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0};
        gbl_pan_menu.columnWeights = new double[]{1.0, 1.0};
        pan_menu.setLayout(gbl_pan_menu);
        
        GridBagConstraints picture_panel = new GridBagConstraints();
        picture_panel.gridwidth = 2;
        picture_panel.insets = new Insets(0, 0, 5, 0);
        picture_panel.fill = GridBagConstraints.BOTH;
        picture_panel.gridx = 0;
        picture_panel.gridy = 0;
        pan_menu.add(panel, picture_panel);
        
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.gridx = 0;
        constraints1.gridy = 1;
        constraints1.anchor = GridBagConstraints.LINE_START;
        constraints1.insets = new Insets(5,5,5,5);
        pan_menu.add(new Label("Product Name: ", 16), constraints1);
        
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.anchor = GridBagConstraints.WEST;
        constraints2.gridx = 1;
        constraints2.gridy = 1;
        constraints2.insets = new Insets(5, 5, 5, 0);
        prodField_name = new Custom_TextField("Enter product name here", 16, 20, "STRING");
        pan_menu.add(prodField_name, constraints2);
        
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.anchor = GridBagConstraints.LINE_START;
        constraints3.insets = new Insets(5, 5, 5, 5);
        constraints3.gridx = 0;
        constraints3.gridy = 2;
        pan_menu.add(new Label("Product Type: ", 16), constraints3);
        
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.fill = GridBagConstraints.HORIZONTAL;
        constraints4.insets = new Insets(5, 5, 5, 5);
        constraints4.gridx = 1;
        constraints4.gridy = 2;
        prodType.setFocusable(false);
        prodType.setRenderer(new SelectionBox(5, "Select Product Type"));
        prodType.setBackground(Color.WHITE);
        prodType.setSelectedIndex(-1);
        prodType.setFont(new Font("Arial", Font.PLAIN, 16));
        pan_menu.add(prodType, constraints4);
        
        GridBagConstraints constraints5 = new GridBagConstraints();
        constraints5.gridx = 0;
        constraints5.gridy = 3;
        constraints5.anchor = GridBagConstraints.LINE_START;
        constraints5.insets = new Insets(5, 5, 5, 5);
        pan_menu.add(new Label("Product Description: ", 16), constraints5);
        
        GridBagConstraints constraints6 = new GridBagConstraints();
        constraints6.anchor = GridBagConstraints.WEST;
        constraints6.gridx = 1;
        constraints6.gridy = 3;
        constraints6.insets = new Insets(5, 5, 5, 0);
        prodField_desc = new Custom_TextField("Enter product description here", 16, 20, "STRING");
        pan_menu.add(prodField_desc, constraints6);
        
        GridBagConstraints constraints7 = new GridBagConstraints();
        constraints7.gridx = 0;
        constraints7.gridy = 4;
        constraints7.anchor = GridBagConstraints.LINE_START;
        constraints7.insets = new Insets(5, 5, 0, 5);
        pan_menu.add(new Label("Product Price: ", 16), constraints7);
        
        GridBagConstraints constraints8 = new GridBagConstraints();
        constraints8.anchor = GridBagConstraints.WEST;
        constraints8.gridx = 1;
        constraints8.gridy = 4;
        constraints8.insets = new Insets(5, 5, 0, 0);
        prodField_price = new Custom_TextField("Enter product price here", 16, 20, "DOUBLE");
        pan_menu.add(prodField_price, constraints8);

        pan_sideWest.setBackground(new Color(28,53,94));
        pan_sideWest.setPreferredSize(new Dimension(50, 100));

        pan_sideEast.setBackground(new Color(28,53,94));
        pan_sideEast.setPreferredSize(new Dimension(50, 100));

        pan_footer.setBackground(new Color(28,53,94));
        pan_footer.setPreferredSize(new Dimension(100, 50)); 
        pan_footer.setLayout(new BorderLayout());
        pan_footer.add(button_add);       
        //PANEL


        //FRAMES
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setUndecorated(false);
        this.setResizable(false);
        getContentPane().setLayout(new BorderLayout(10, 10));
        this.getContentPane().setBackground(new Color(28,53,94));    
        this.setTitle("Goose - Add Custom");

        getContentPane().add(pan_title, BorderLayout.NORTH);
        getContentPane().add(pan_menu, BorderLayout.CENTER);
        getContentPane().add(pan_sideWest, BorderLayout.WEST);
        getContentPane().add(pan_sideEast, BorderLayout.EAST);
        getContentPane().add(pan_footer, BorderLayout.SOUTH);
        //FRAMESS

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == button_cancel){
            if (!prodField_name.getText().isBlank() || !prodField_price.getText().isBlank()
            || !prodField_desc.getText().isBlank() || prodType.getSelectedIndex() != -1){
                int confirmation_back = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back? Changes will not be saved", "", 
                JOptionPane.YES_NO_OPTION);
                switch (confirmation_back){
                    case JOptionPane.NO_OPTION:
                        return;
                    case JOptionPane.YES_OPTION:
                        this.dispose();
                        break;
                }
            }
            else 
                this.dispose();
        }
        else if (e.getSource() == button_add) {
            String productName = prodField_name.getText();
            String productDesc = prodField_desc.getText();
            String productPrice = prodField_price.getText();
            if (productName.isBlank()){
                JOptionPane.showMessageDialog(null,
                "Error: Please enter product name", "Error Message",
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (productPrice.isBlank() || Double.parseDouble(prodField_price.getText()) <= 0){
                JOptionPane.showMessageDialog(null,
                "Error: Please enter a price bigger than P0", "Error Message",
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (prodType.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null,
                "Error: Please select a product type", "Error Message",
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            String productType = prodType.getSelectedItem().toString();
            int confirmation_product = JOptionPane.showConfirmDialog(null, 
                        "Are the following information correct?\nProduct Name: " + productName + "\n" + 
                        "Product Type: " + productType + "\n" + "Produce Description: " + productDesc + "\n" +
                        "Product Price: P"  + String.format("%.2f", Double.parseDouble(productPrice)),
                        "", JOptionPane.YES_NO_OPTION);
            switch (confirmation_product) {
                case JOptionPane.YES_OPTION:
                    Product product = new Product(productPrice, productType, productDesc, confirmation_product);
                    this.dispose();
                    break;
                case JOptionPane.NO_OPTION:
                    return;
            }

        }
    }

    
}
