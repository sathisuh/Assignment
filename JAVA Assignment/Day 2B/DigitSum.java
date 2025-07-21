public class DigitSum {
    public static void print(int[] x, int n) {
        int sumSingle = 0, sumDouble = 0;
        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9)
                sumSingle += x[i];
            else if (x[i] >= 10 && x[i] <= 99)
                sumDouble += x[i];
        }
        System.out.println("Sum of single digits: " + sumSingle);
        System.out.println("Sum of double digits: " + sumDouble);
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 7, 25, 9, 1, 14, 8, 32, 5};
        print(arr, arr.length);
    }
}
