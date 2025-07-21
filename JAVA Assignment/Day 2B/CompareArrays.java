public class CompareArrays {
    public static void main(String[] args) {
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};
        boolean isEqual = true;

        if (X.length != Y.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual)
            System.out.println("Arrays are identical.");
        else
            System.out.println("Arrays are not identical.");
    }
}
