public class Count {
    public static int countSegments(String s) {
        String[] parts = s.trim().split("\\s+");
        return s.trim().isEmpty() ? 0 : parts.length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John")); // 5
        System.out.println(countSegments("Hello"));                  // 1
    }
}