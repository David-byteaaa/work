class PartTimeEmployee extends Employee {
    private double hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, double hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursWorked; // baseSalary 作为时薪
    }
}
