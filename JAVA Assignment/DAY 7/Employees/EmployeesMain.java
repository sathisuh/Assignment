/*Create a Java application to manage employees in a company. Define an Interface Employee
with a method calculateSalary(). Then create two subclasses FullTimeEmployee and
PartTimeEmployee that override calculateSalary() method based on their working type.
Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees
using the Employee reference.*/

        package Employees;
public class EmployeesMain {
    public static void main(String[] args) {

        Employees emp1 = new FullEmployee("Sathish", 201, 32000);
        Employees emp2 = new PartEmployee("Kumar", 202, 100, 150.0);


        emp1.displayDetails();
        System.out.println("Salary: ₹" + emp1.calculateSalary());
        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: ₹" + emp2.calculateSalary());
  }
}