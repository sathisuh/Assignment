
public class FindDiff {
    public static char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()) result ^= c;
        for (char c : t.toCharArray()) result ^= c;
        return (char) result;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde")); // e
        System.out.println(findTheDifference("", "y"));         // y
    }
}