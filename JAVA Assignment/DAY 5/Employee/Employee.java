package Employee;

class Employee {
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void calculateSalary() {
        System.out.println("Salary calculation depends on employee type.");
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}
