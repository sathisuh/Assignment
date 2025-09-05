/*Create a method to read a file from disk. Handle FileNotFoundException
 and IOException using try-catch-finally.*/

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            File file = new File("sample.txt");
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}