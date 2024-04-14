package products;

public class Product {
    private double p_price;
    private String p_description, p_name, p_type;

    public Product(String cP_name, String cP_type, String cP_desc, double cP_price){
        p_name = cP_name;
        p_type = cP_type;
        p_description = cP_desc;
        p_price = cP_price;
    }

    public String getName(){
        return p_name;
    }
    public String getType(){
        return p_type;
    }
    public String getDescription(){
        return p_description;
    }
    public double getPrice(){
        return p_price;
    }

}
