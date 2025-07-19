public class CheckEqual {
    public static void main(String[] args) {
        int a = 10, b = 10;
        int result = Math.abs(a - b);


        switch (result) {
            case 0:
                System.out.println("Equal");
                break;
            default:
                System.out.println("Not Equal");
        }
    }
}
