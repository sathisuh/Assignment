public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 19;
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println("Binary: " + binary);
    }
}
