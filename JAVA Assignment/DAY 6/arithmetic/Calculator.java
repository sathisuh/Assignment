package arithmetic;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) { return b != 0 ? (double)a / b : 0; }
    public int modulo(int a, int b) { return a % b; }
}