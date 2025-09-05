/*Develop a Java program to illustrate the usage of toString() method.*/

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Product ID: " + id + ", Name: " + name;
    }
}

public class ToString {
    public static void main(String[] args) {
        Product p = new Product(101, "Laptop");
        System.out.println(p);  // calls toString()
    }
}