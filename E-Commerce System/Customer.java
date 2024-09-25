class Customer {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private Cart cart;

    public Customer(String name, String phoneNumber, String email, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.cart = new Cart(this);
    }

    public void addCart(Product product, int quantity){
        cart.addItem(product, quantity);
        System.out.println(quantity + " " + product.name + "(s) added to cart.");
    }

    public void placeOrder(){
        Order order = new Order(this, cart.getProducts(), cart.getQuantities());
        order.viewOrderInfo();
    }

    public void viewInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
