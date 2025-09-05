import arithmetic.Calculator;
import stringutils.StringOperations;

public class MainClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Multiply: " + calc.multiply(4, 3));

        StringOperations strOps = new StringOperations();
        System.out.println("Concatenation: " + strOps.concatenate("Zoho", "Developer"));
        System.out.println("Reverse: " + strOps.reverse("Java"));
        System.out.println("Length: " + strOps.length("Assignment"));
    }
}