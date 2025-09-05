package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        // Runtime polymorphism using abstract class reference
        Employee emp1 = new FullTimeEmployee("Sathish", 101, 30000.0);
        Employee emp2 = new PartTimeEmployee("Kumar", 102, 80, 200.0);

        // Display details and salary
        emp1.displayDetails();
        System.out.println("Salary: ₹" + emp1.calculateSalary());
        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: ₹" + emp2.calculateSalary());
    }
}