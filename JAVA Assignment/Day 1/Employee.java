public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println(empId + " " + name + " " + department + " " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sathish", "IT", 500000);
        emp.display();
    }
}