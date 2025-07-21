public class GStudent {
    String name;
    int roll_no;

    public static void main(String[] args) {
        GStudent s1 = new GStudent();
        s1.name = "John";
        s1.roll_no = 2;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.roll_no);
    }
}
