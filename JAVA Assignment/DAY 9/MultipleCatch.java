/*Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers,
and perform division, and catch the following exceptions: InputMismatchException,
 NumberFormatException, ArithmeticException and Exception.*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter second number: ");
            String str2 = scanner.nextLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int result = num1 / num2;

            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input type mismatch.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
