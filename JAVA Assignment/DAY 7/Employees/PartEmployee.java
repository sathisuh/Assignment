package Employees;

class PartEmployee implements Employees {
    private String name;
    private int employeeId;
    private int hoursWorked;
    private double hourlyRate;

    public PartEmployee(String name, int employeeId, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}
