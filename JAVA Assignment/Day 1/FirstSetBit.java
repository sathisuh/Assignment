public class FirstSetBit {
    public static void main(String[] args) {
        int n = 35;

        
        int position = 1;

        for (int i = 1; i <= n; i <<= 1) {
            if ((n & i) != 0) {
                System.out.println("First set bit at position: " + position);
                break;
            }
            position++;
        }
    }
}

