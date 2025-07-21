
public class PatternForLoop {
    public static void main(String[] args) {
        String[] patterns = {
                "1 1 R R R R",
                "1 1 R R",
                "1 R R R R",
                "1 1 R",
                "1 1 R"
        };

        for (int i = 0; i < patterns.length; i++) {
            System.out.println(patterns[i]);
        }
    }
}