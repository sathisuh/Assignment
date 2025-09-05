/*Develop a Java program to illustrate pass-by-value.*/


public class PassByValue {
    public static void changeValue(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 50;
        changeValue(a);
        System.out.println(a);  // Output: 50 (original not changed)
    }
}