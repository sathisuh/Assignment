/*Create a Java application to manage employees in a company. Define an abstract class
Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and
PartTimeEmployee that override calculateSalary() method based on their working type.
Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees
using the Employee reference.*/
package Employee;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}
