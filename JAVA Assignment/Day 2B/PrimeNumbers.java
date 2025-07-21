public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 14, 3, 7, 6, 2, 9, 10};
        System.out.print("Prime numbers: ");
        for (int n : arr) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
