/*7. Design a calculator application using Java Inheritance.
Create the following class hierarchy:
 --->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)

 --->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)

--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:

--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator
and calling methods from all three levels of the class hierarchy.
 * Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    public double power(int base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return result;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
    public double log(double value) {
        return Math.log(value);
    }
    public double exp(double value) {
        return Math.exp(value);
    }

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println("Add: " + sc.add(10, 7));
        System.out.println("Divide: " + sc.divide(18, 2));
        System.out.println("Power: " + sc.power(2, 4));
        System.out.println("Square Root: " + sc.squareRoot(5));
        System.out.println("Sin(30°): " + sc.sin(45));
        System.out.println("Cos(60°): " + sc.cos(60));
        System.out.println("Log(10): " + sc.log(15));
        System.out.println("Exp(1): " + sc.exp(2));
    }
}