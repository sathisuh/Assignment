public class PatternWhileLoop{
    public static void main(String[] args) {
        int n = 3; // Peak row with 3 W's

        // Upper half (1 to 3)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("W ");
            }
            System.out.println();
        }

        // Lower half (2 to 1)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("W ");
            }
            System.out.println();
        }
    }
}
