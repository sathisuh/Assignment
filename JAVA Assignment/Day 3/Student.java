public class Student {
    String name;
    int roll_no;
    int phone_no;
    String address;

    Student(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no + ", Phone: " + phone_no + ", Address: " + address);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sam", 101, 987654321, "Tenkasi");
        Student s2 = new Student("John", 102, 876543210, "Tirunelveli");

        s1.display();
        s2.display();
    }
}