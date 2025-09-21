import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        int n = input.nextInt();

        Product products = new Product();

        for(int i = 0; i < n; i++){
            System.out.print("Enter the product value: ");
            double productValue = input.nextDouble();
            products.addProduct(productValue);
        }

        double total = products.totalValue();
        System.out.printf("Total value of products: %.2f", total);

        input.close();
    }
}