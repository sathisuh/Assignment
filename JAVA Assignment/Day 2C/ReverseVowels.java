public class ReverseVowels {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && !vowels.contains(arr[i] + "")) i++;
            while (i < j && !vowels.contains(arr[j] + "")) j--;
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));     // holle
        System.out.println(reverseVowels("leetcode"));  // leotcede
    }
}