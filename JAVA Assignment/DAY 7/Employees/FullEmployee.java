package Employees;


    class FullEmployee implements Employees {
        private String name;
        private int employeeId;
        private double monthlySalary;

        public FullEmployee(String name, int employeeId, double monthlySalary) {
            this.name = name;
            this.employeeId = employeeId;
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }

        @Override
        public void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + name);
        }
    }


