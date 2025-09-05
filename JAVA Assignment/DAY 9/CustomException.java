/*Write a method to parse a string to an integer. Throw an exception if the string is not a
valid number. Handle it using try-catch.*/


public class CustomException {
    public static int parseInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        try {
            int num = parseInt("123a");
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}