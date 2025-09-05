/*Design a Java application to manage a product inventory system using file handling and object serialization.

Create a class Product with the following attributes:
        --->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
        --->Add a Product: Accept product details from the user and write the object to a file (products.dat).
        --->View All Products: Read all product objects from the file and display them.
        --->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity,
 save the changes back to the file.
        --->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
        --->Use proper exception handling and ensure that object serialization and deserialization
        are handled safely and efficiently.*/

import java.io.*;
import java.util.*;

class Product implements Serializable {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int qty) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.quantity = qty;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class InventoryManager {
    static final String FILE_NAME = "products.dat";

    public static void addProduct(Product p) throws IOException {
        List<Product> list = getAllProducts();
        list.add(p);
        saveAllProducts(list);
    }

    public static List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (List<Product>) ois.readObject();
        } catch (Exception ignored) {}
        return list;
    }

    public static void saveAllProducts(List<Product> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(list);
        oos.close();
    }

    public static void viewAllProducts() {
        List<Product> list = getAllProducts();
        if (list.isEmpty()) System.out.println("No products found.");
        for (Product p : list)
            System.out.println(p);
    }

    public static void searchById(int id) {
        for (Product p : getAllProducts()) {
            if (p.productId == id) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void updateProduct(int id, double price, int qty) throws IOException {
        List<Product> list = getAllProducts();
        for (Product p : list) {
            if (p.productId == id) {
                p.price = price;
                p.quantity = qty;
                saveAllProducts(list);
                System.out.println("Updated.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void deleteProduct(int id) throws IOException {
        List<Product> list = getAllProducts();
        list.removeIf(p -> p.productId == id);
        saveAllProducts(list);
        System.out.println("Deleted if existed.");
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add\n2.View All\n3.Search\n4.Update\n5.Delete\n6.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt();
                    System.out.print("Name: "); sc.nextLine(); String name = sc.nextLine();
                    System.out.print("Price: "); double price = sc.nextDouble();
                    System.out.print("Quantity: "); int qty = sc.nextInt();
                    addProduct(new Product(id, name, price, qty));
                    break;
                case 2:
                    viewAllProducts(); break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    searchById(sc.nextInt()); break;
                case 4:
                    System.out.print("ID: "); int upId = sc.nextInt();
                    System.out.print("New Price: "); double newPrice = sc.nextDouble();
                    System.out.print("New Qty: "); int newQty = sc.nextInt();
                    updateProduct(upId, newPrice, newQty); break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    deleteProduct(sc.nextInt()); break;
                case 6:
                    return;
            }
        }
    }
}