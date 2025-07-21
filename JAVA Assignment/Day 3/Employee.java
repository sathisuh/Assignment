public class Employee {
    String name, designation;
    int id;
    double salary;

    // No-arg constructor
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.designation = "Intern";
        this.salary = 10000;
    }

    // Parametrized constructor
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy constructor
    Employee(Employee e) {
        this.name = e.name;
        this.id = e.id;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Arun", 201, "Manager", 50000);
        Employee e3 = new Employee(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}