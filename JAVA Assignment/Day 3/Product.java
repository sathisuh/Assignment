class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price + ", Qty: " + quantity);
    }
}

class Store {
    static String storeName;
    static String storeLocation;
    static Product[] products = new Product[10];
    static int count = 0;

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store: " + storeName + ", Location: " + storeLocation);
    }

    static void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        }
    }

    static void displayAllProducts() {
        for (int i = 0; i < count; i++) {
            products[i].displayProduct();
        }
    }

    public static void main(String[] args) {
        setStoreDetails("ZSGS", "Chennai");

        Product p1 = new Product(101, "Pen", 10, 100);
        Product p2 = new Product(102, "Notebook", 50, 50);
        Product p3 = new Product(103, "Bag", 700, 20);

        addProduct(p1);
        addProduct(p2);
        addProduct(p3);

        displayStoreDetails();
        displayAllProducts();
    }
}
