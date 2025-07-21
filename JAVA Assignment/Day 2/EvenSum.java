public class EvenSum {
    public static int sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) continue;
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of even numbers: " + sumEven(15));
    }
}
