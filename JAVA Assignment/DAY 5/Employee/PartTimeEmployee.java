package Employee;

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double hourlyRate) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: ₹" + totalSalary);
    }
}
