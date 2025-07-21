import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3]; // Example size 3x3
        int m = 3, n = 3;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input elements");
            System.out.println("2. Display elements");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < m; i++)
                        for (int j = 0; j < n; j++)
                            A[i][j] = sc.nextInt();
                    break;

                case 2:
                    for (int[] row : A) {
                        for (int val : row)
                            System.out.print(val + " ");
                        System.out.println();
                    }
                    break;

                case 3:
                    int total = 0;
                    for (int[] row : A)
                        for (int val : row)
                            total += val;
                    System.out.println("Total: " + total);
                    break;

                case 4:
                    for (int i = 0; i < m; i++) {
                        int rowSum = 0;
                        for (int j = 0; j < n; j++)
                            rowSum += A[i][j];
                        System.out.println("Row " + i + ": " + rowSum);
                    }
                    break;

                case 5:
                    for (int j = 0; j < n; j++) {
                        int colSum = 0;
                        for (int i = 0; i < m; i++)
                            colSum += A[i][j];
                        System.out.println("Column " + j + ": " + colSum);
                    }
                    break;

                case 6:
                    for (int j = 0; j < n; j++) {
                        for (int i = 0; i < m; i++)
                            System.out.print(A[i][j] + " ");
                        System.out.println();
                    }
                    break;

                case 0:
                    return;
            }
        }
    }
}
