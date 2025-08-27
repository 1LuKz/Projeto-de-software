import java.util.ArrayList;

public class Product{
    private final int id;
    private String name;
    private double price;


    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public static Product checker(ArrayList<Product> products, int id){
        for(Product product : products){
            if(id == product.getId()){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "Id: " + id + " Name: " + name + " $" + price;
    }
}