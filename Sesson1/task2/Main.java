package task2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Товар 1", 4.3, 34);
        Product product2 = new Product("Товар 2", 4.1, 21);
        Product product3 = new Product("Товар 3", 4.5);

        product1.displayProductInfo(product1);
        product2.displayProductInfo(product2);
        product3.displayProductInfo(product3);
    }
}
