import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Shoes", 99.99));
        products.add(new Product(2, "Bag", 103.89));
        products.add(new Product(3, "Shirt", 49.98));
        products.add(new Product(4, "Pants", 89.72));
        products.add(new Product(5, "T-shirt", 97.35));

        System.out.print("Enter the Id: ");
        int id = input.nextInt();

        Product found = Product.checker(products, id);
        if(found != null){
            System.out.println(found.toString());
        } else {
            System.out.println("Product not found!");
        }

        input.close();
    }
}