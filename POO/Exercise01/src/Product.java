import java.util.List;
import java.util.ArrayList;

public class Product {
    private List<Double> products;

    public Product() {
        this.products = new ArrayList<>();
    }

    public void addProduct(double product) {
        products.add(product);
    }

    public double totalValue() {
        double total = 0;
        for (double value : products) {
            total += value;
        }
        return total;
    }
}
