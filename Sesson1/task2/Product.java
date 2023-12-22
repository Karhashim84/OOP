package task2;

public class Product {
    private String name;
    private Double price;
    private int quantity;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private Double calculateTotalPrice(Double price, int quantity) {
        return price + quantity;
    }
    public static void displayProductInfo(Product product) {
        System.out.println("название товара: " + product.getName() + "\nЦена товара: " + product.getPrice() + "\nКоличество товара: " + product.getQuantity());
    }
}