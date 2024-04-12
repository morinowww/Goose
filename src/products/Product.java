package products;

public class Product {
    private int p_price;
    private String p_description, p_name;

    public Product(String cP_name, String cP_desc, int cP_price){
        p_name = cP_name;
        p_description = cP_desc;
        p_price = cP_price;
    }

    public String getName(){
        return p_name;
    }
    public String getDescription(){
        return p_description;
    }
    public int getPrice(){
        return p_price;
    }

}
