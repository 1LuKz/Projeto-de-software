public class Main {
    public static void main(String[] args){
        Product product = new Product("Mouse", 150, 15);
        System.out.println(product.toString());

        System.out.println();

        product.sellProduct(10);
        System.out.println(product.toString());

        System.out.println();

        product.sellProduct(15);
        product.replenishStock(20);

        System.out.println();

        System.out.println(product.toString());
    }
}