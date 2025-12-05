import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public double calculateTotalSalary() {
        return employees.stream().mapToDouble(Employee::calculateSalary).sum();
    }

    public void sortEmployees() {
        Collections.sort(employees);
    }

    public void displayAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e.getEmployeeInfo());
        }
    }

    public void displayHighestAndLowestSalary() {
        if (employees.isEmpty()) return;

        Employee max = Collections.max(employees);
        Employee min = Collections.min(employees);

        System.out.println("工资最高员工：" + max.getEmployeeInfo());
        System.out.println("工资最低员工：" + min.getEmployeeInfo());
    }
}
