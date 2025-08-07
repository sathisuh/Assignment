public class Powerof2Check {
    public static void main(String[] args) {
        int n = 128;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is NOT a power of 2");
        }
    }
}



