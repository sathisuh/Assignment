public class MyString {
    private final char[] value;

    // Constructor - From String
    public MyString(String input) {
        value = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            value[i] = input.charAt(i);
        }
    }

    // Constructor - From char array
    public MyString(char[] input) {
        value = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            value[i] = input[i];
        }
    }

    // 1. length
    public int length() {
        return value.length;
    }

    // 2. charAt without throw
    public char charAt(int index) {
        if (index < 0 || index >= value.length) {
            return '\0'; // return null character if invalid
        }
        return value[index];
    }

    // 3. equals
    public boolean equals(MyString other) {
        if (other == null || this.length() != other.length()) return false;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != other.value[i]) return false;
        }
        return true;
    }

    // 4. toUpperCase
    public MyString toUpperCase() {
        char[] upper = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            upper[i] = (value[i] >= 'a' && value[i] <= 'z') ? (char)(value[i] - 32) : value[i];
        }
        return new MyString(upper);
    }

    // 5. toLowerCase
    public MyString toLowerCase() {
        char[] lower = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            lower[i] = (value[i] >= 'A' && value[i] <= 'Z') ? (char)(value[i] + 32) : value[i];
        }
        return new MyString(lower);
    }

    // 6. substring (invalid range = return null)
    public MyString substring(int start, int end) {
        if (start < 0 || end > value.length || start > end) {
            return null;
        }
        char[] sub = new char[end - start];
        for (int i = start; i < end; i++) {
            sub[i - start] = value[i];
        }
        return new MyString(sub);
    }

    // 7. concat
    public MyString concat(MyString other) {
        if (other == null) return new MyString(this.value);
        char[] combined = new char[this.length() + other.length()];
        for (int i = 0; i < this.length(); i++) combined[i] = this.value[i];
        for (int i = 0; i < other.length(); i++) combined[this.length() + i] = other.value[i];
        return new MyString(combined);
    }

    // 8. contains
    public boolean contains(MyString sub) {
        if (sub == null || sub.length() > this.length()) return false;
        for (int i = 0; i <= this.length() - sub.length(); i++) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (this.value[i + j] != sub.value[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }

    // 9. indexOf
    public int indexOf(char ch) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == ch) return i;
        }
        return -1;
    }

    // 10. replace
    public MyString replace(char oldChar, char newChar) {
        char[] result = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            result[i] = (value[i] == oldChar) ? newChar : value[i];
        }
        return new MyString(result);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : value) sb.append(c);
        return sb.toString();
    }

    // Demo main
    public static void main(String[] args) {
        MyString a = new MyString("Hello");
        MyString b = new MyString("World");
        MyString c = new MyString("ell");

        System.out.println("a: " + a);
        System.out.println("Length: " + a.length());
        System.out.println("Char at 2: " + a.charAt(2));
        System.out.println("Char at -1: " + a.charAt(-1)); // safe
        System.out.println("Equals 'Hello': " + a.equals(new MyString("Hello")));
        System.out.println("Upper: " + a.toUpperCase());
        System.out.println("Lower: " + a.toLowerCase());
        System.out.println("Substring(1,4): " + a.substring(1, 4));
        System.out.println("Invalid Substring: " + a.substring(3, 10)); // null
        System.out.println("Concat with b: " + a.concat(b));
        System.out.println("Contains 'ell': " + a.contains(c));
        System.out.println("Index of 'l': " + a.indexOf('l'));
        System.out.println("Replace 'l' with '*': " + a.replace('l', '*'));
    }
}
