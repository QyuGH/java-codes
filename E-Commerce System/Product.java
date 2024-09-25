class Product {
    protected int stock = 100;
    protected String name;
    protected String description;
    protected int price;

    public Product(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void viewStock(){
        System.out.println("Stock Available: " + stock);
    }

    public void updateStock(int quantity){
        stock -= quantity;
    }

    public void viewDetails(){
        System.out.println("Name: " + name);
        System.out.println("Product Description: " + description);
        System.out.println("Price: $" + price);
    }
}

class ElectronicProducts extends Product{
    private String brand;

    public ElectronicProducts(String name, String description, int price, String brand){
        super(name, description, price);
        this.brand = brand;
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Brand Name: " + brand);
    }
}

class ClothingProducts extends Product{
    private String size;

    public ClothingProducts(String name, String description, int price, String size){
        super(name, description, price);
        this.size = size;
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Size: " + size);
    }
}