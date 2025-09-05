/*Write a Java program that reads a file and prints the number of lines, words, and characters.*/

import java.io.*;

public class FileStats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int lines = 0, words = 0, chars = 0;
        while ((line = br.readLine()) != null) {
            lines++;
            words += line.split("\\s+").length;
            chars += line.length();
        }
        br.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
