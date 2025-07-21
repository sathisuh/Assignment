public class FibonacciArray {
    public static void main(String[] args) {
        int[] fib = new int[30];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 30; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
