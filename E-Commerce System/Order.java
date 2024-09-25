import java.util.*;

class Order {
    private Customer customer;
    private List<Product> products;
    private List<Integer> quantities;
    private double totalAmount;
    private Date orderDate;

    // Constructor to initialize the Order
    public Order(Customer customer, List<Product> products, List<Integer> quantities) {
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).price * quantities.get(i);
        }
        return total;
    }

    // View order information
    public void viewOrderInfo() {
        customer.viewInfo();
        System.out.println("Products Ordered:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities.get(i);
            System.out.println(" - " + product.name + " (Quantity: " + quantity + ", Price: $" + product.price + ")");
            product.updateStock(quantity);  
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
