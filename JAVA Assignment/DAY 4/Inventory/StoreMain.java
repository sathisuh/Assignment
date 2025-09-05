/*Design a simple inventory system in Java using object-oriented principles that demonstrates the
use of static variables and object containment.
Create two classes:
        ---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
        b. A static method setStoreDetails(String name, String location) to initialize the static variables.
        c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
        a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.*/

package Inventory;

public class StoreMain {
    public static void main(String[] args) {
        Store.setStoreDetails("Zohomart", "Tenkasi");

        Product p1 = new Product(1, "Pen", 12, 100);
        Product p2 = new Product(2, "Notebook", 45, 200);
        Product p3 = new Product(3, "Notepad", 25, 50);

        Store s = new Store();
        s.addProduct(p1);
        s.addProduct(p2);
        s.addProduct(p3);

        Store.displayStoreDetails();
        s.displayAllProducts();
   }
}