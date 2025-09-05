/*Get some strings through the command-line prompt and use an array to store and display them.*/
public class CommandLine {
    public static void main(String[] args) {
        System.out.println("Strings from command line:");
        for (String str : args) {
            System.out.println(str);
        }
    }
}