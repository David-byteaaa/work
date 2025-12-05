public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new FullTimeEmployee(1, "Alice", 5000, 1000));
        company.addEmployee(new PartTimeEmployee(2, "Bob", 50, 120));
        company.addEmployee(new SalesEmployee(3, "Charlie", 3000, 20000));
        company.addEmployee(new FullTimeEmployee(4, "David", 6000, 500));
        System.out.println("所有员工信息（原始顺序）：");
        company.displayAllEmployees();
        System.out.println("\n按工资升序排序：");
        company.sortEmployees();
        company.displayAllEmployees();
        System.out.println("\n总工资：" + company.calculateTotalSalary());
        company.displayHighestAndLowestSalary();
    }
}
