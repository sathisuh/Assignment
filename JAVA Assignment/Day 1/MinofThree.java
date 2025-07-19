public class MinofThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int min;
        if (a < b && a < c)
            min = a;
        else if (b < c)
            min = b;
        else min = c;
        System.out.println("Minimum is:" + min);
    }
}
