/*int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/

public class HandleException {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try {
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient: " + quotient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}
