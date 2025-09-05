/*Write a Menu driven Java program a) to read content from the user and write it into another file and b)
from the file to another file c) to modify the content of a file d) to search for a particular word in a file
 and display how many times it appears e) read the content(List of Electronic Products) of a .txt file and
  copy them to the .csv file.
 */

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileMenuDriven {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- File Menu ---");
            System.out.println("1. Write content to a file");
            System.out.println("2. Copy content from one file to another");
            System.out.println("3. Modify content of a file");
            System.out.println("4. Search for a word and count its occurrences");
            System.out.println("5. Copy .txt file to .csv file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1: // Write to file
                    System.out.print("Enter content to write: ");
                    String content = sc.nextLine();
                    try (FileWriter fw = new FileWriter("output.txt")) {
                        fw.write(content);
                        System.out.println("Content written to output.txt");
                    }
                    break;

                case 2: // Copy file
                    try {
                        Files.copy(
                                new File("output.txt").toPath(),
                                new File("copy.txt").toPath(),
                                StandardCopyOption.REPLACE_EXISTING
                        );
                        System.out.println("Content copied to copy.txt");
                    } catch (IOException e) {
                        System.out.println("Error copying file: " + e.getMessage());
                    }
                    break;

                case 3: // Modify file
                    System.out.print("Enter new content to modify in output.txt: ");
                    String modified = sc.nextLine();
                    try (FileWriter fw = new FileWriter("output.txt")) {
                        fw.write(modified);
                        System.out.println("File content modified.");
                    }
                    break;

                case 4: // Search word in file
                    System.out.print("Enter word to search in output.txt: ");
                    String word = sc.nextLine();
                    int count = 0;
                    try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] words = line.split("\\s+");
                            for (String w : words) {
                                if (w.equals(word)) {
                                    count++;
                                }
                            }
                        }
                        System.out.println("The word \"" + word + "\" appears " + count + " times.");
                    }
                    break;

                case 5: // Copy .txt to .csv
                    try (BufferedReader br = new BufferedReader(new FileReader("products.txt"));
                         BufferedWriter bw = new BufferedWriter(new FileWriter("products.csv"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            // Replace spaces with commas (basic conversion)
                            bw.write(line.replace(" ", ","));
                            bw.newLine();
                        }
                        System.out.println("products.txt copied to products.csv");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}