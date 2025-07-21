import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2020};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter graduation year: ");
        int key = sc.nextInt();

        int result = Arrays.binarySearch(years, key);
        if (result >= 0)
            System.out.println("Record exists");
        else
            System.out.println("Record does not exist");
    }
}
