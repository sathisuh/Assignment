public class OddNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 14, 3, 7, 6, 2, 9, 10};
        int sum = 0;
        System.out.print("Odd numbers: ");
        for (int n : arr) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
                sum += n;
            }
        }
        System.out.println("\nSum of odd numbers: " + sum);
    }
}