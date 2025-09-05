/*Write a Java program to append a text read from the user to an existing file without overwriting
the original content.
 */

import java.io.*;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to append: ");
        String text = sc.nextLine();
        FileWriter fw = new FileWriter("sample.txt", true);
        fw.write("\n" + text);
        fw.close();
        System.out.println("Appended successfully.");
    }
}