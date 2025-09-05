/*Create a program where try block contains a return statement. Ensure that finally
block executes before the method returns. Show this with output.*/


public class Finally {
    public static int getValue() {
        try {
            System.out.println("Inside try block.");
            return 10;
        } finally {
            System.out.println("Inside finally block.");
        }
    }

    public static void main(String[] args) {
        int result = getValue();
        System.out.println("Returned value: " + result);
    }
}