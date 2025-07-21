public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5, i = 0;

        do {
            int num = 1, j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < rows - i);

            int k = 0;
            do {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
                k++;
            } while (k <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }
}