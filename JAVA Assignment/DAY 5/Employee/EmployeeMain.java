package Employee;

/*3. Create a Java application to manage employees in a company. Define a base class Employee with
  a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that
override calculateSalary() method based on their working type.*/

public class EmployeeMain {
    public static void main(String[] args) {
        // Full-time employee
        FullTimeEmployee fte = new FullTimeEmployee("Sathish", 101, 30000, 5000);
        fte.displayDetails();
        fte.calculateSalary();

        System.out.println();

        // Part-time employee
        PartTimeEmployee pte = new PartTimeEmployee("Ravi", 102, 120, 200);
        pte.displayDetails();
        pte.calculateSalary();
    }
}