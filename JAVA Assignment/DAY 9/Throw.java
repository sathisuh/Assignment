/*Write a program to illustrate how to throw a ClassNotFoundException.*/


public class Throw {
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}