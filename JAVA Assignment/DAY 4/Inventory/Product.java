package Inventory;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = qty;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: ₹" + price + ", Qty: " + quantity);
    }
}

