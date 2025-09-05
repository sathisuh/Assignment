/* Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the
 following conditions:
--->It must be exactly 4 digits long.
 --->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit ATM PIN: ");
        String pin = scanner.nextLine();

        if (pin.matches("[1-9][0-9]{3}")) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }
}