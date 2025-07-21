public class PatternWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        int i = 1;

        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            int k = 1;
            while (k <= i) {
                System.out.print("w ");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}