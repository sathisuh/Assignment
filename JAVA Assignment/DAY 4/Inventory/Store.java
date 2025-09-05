package Inventory;

import java.util.ArrayList;

class Store {
    static String storeName;
    static String storeLocation;
    static ArrayList<Product> productList = new ArrayList<>();

    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() {
        System.out.println("Store: " + storeName + ", Location: " + storeLocation);
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void displayAllProducts() {
        for (Product p : productList)
            p.displayProduct();
    }
}
