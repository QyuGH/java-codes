public class Main {
    public static void main(String[] args) {
        Product laptop = new ElectronicProducts("Laptop", "Blue", 1000, "Lenovo");
        Product shirt = new ClothingProducts("T-Shirt", "White", 50, "Large");
        Customer customer1 = new Customer("Rovel", "12345", "rovel@email.com", "Tigbauan");

        customer1.addCart(shirt, 3);
        customer1.addCart(laptop, 5);
        customer1.placeOrder();
        System.out.println();
    }
}
