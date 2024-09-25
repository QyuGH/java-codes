import java.util.*;

class Cart {
    private List<Product> products;
    private List<Integer> quantities;
    private Customer customer;

    public Cart(Customer customer) {
        this.products = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.customer = customer;
    }

    public void addItem(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

}
