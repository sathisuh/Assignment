package Employee;

class FullTimeEmployee extends Employee {
    double basicSalary;
    double bonus;

    public FullTimeEmployee(String name, int empId, double basicSalary, double bonus) {
        super(name, empId);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = basicSalary + bonus;
        System.out.println("Full-Time Employee Salary: ₹" + totalSalary);
    }
}
