class SalesEmployee extends Employee {
    private double salesAmount;

    public SalesEmployee(int id, String name, double baseSalary, double salesAmount) {
        super(id, name, baseSalary);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + salesAmount * 0.05; // 提成5%
    }
}
