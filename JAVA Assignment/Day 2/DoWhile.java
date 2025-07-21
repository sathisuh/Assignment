public class DoWhile {
    public static void main(String[] args) {
        String[] words = {"ZOHO", "CORP", "URAT", "IONS"};
        int i = 0;

        do {
            System.out.println(words[i]);
            i++;
        } while (i < words.length);
    }
}