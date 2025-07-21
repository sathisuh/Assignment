public class AgeGroup {
    public static void main(String[] args) {
        int[] ages = {12, 25, 17, 45, 61, 33, 70, 19, 16, 55};
        int less18 = 0, between18to60 = 0, above60 = 0;

        for (int age : ages) {
            if (age < 18)
                less18++;
            else if (age <= 60)
                between18to60++;
            else
                above60++;
        }

        System.out.println("<18: " + less18);
        System.out.println("18-60: " + between18to60);
        System.out.println(">60: " + above60);
    }
}
