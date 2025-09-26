public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock){
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void replenishStock(int quantity){
        quantityInStock += quantity;
    }

    public void sellProduct(int quantity){
        if(quantity <= quantityInStock){
            quantityInStock -= quantity;
        } else {
            System.out.println("Quantidade insuficiente no estoque!");
        }
    }

    @Override
    public String toString(){
        return "Produto: " + name + "\nPreço: R$" + price + "\nQuantidade no estoque: " + quantityInStock;
    }
}
