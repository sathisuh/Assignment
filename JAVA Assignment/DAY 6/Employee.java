/*Design a class Employee with private data members: employee ID, name, designation, department, and
monthly salary. Use proper getter and setter methods to access and update these fields. Add a method
to calculate and return the annual salary of the employee.*/

public class Employee {
    private int empId;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesignation() { return designation; }

    public void setDesignation(String designation) { this.designation = designation; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(2520);
        emp.setName("Sathish Kumar");
        emp.setDesignation("Software Engineer");
        emp.setDepartment("IT");
        emp.setMonthlySalary(75000);

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Monthly Salary: ₹" + emp.getMonthlySalary());
        System.out.println("Annual Salary: ₹" + emp.calculateAnnualSalary());
    }
}
