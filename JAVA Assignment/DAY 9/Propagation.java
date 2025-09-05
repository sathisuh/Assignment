/*Write a Java program that shows exception propagation across multiple
method1 calls method2 calls method3, which throws the exception). Handle the exception in
 method1.*/

public class Propagation {
    public static void method3() throws ArithmeticException {
        int x = 5 / 0;
    }

    public static void method2() {
        method3();
    }

    public static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled in method1: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        method1();
    }
}