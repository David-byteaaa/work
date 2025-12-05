import java.util.Objects;

abstract class Employee implements Comparable<Employee> {
    protected int id;
    protected String name;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // 抽象方法：计算实际工资
    public abstract double calculateSalary();

    // 获取员工信息
    public String getEmployeeInfo() {
        return String.format("ID:%d 姓名:%s 工资:%.2f", id, name, calculateSalary());
    }

    // 实现排序：按工资升序
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.calculateSalary(), other.calculateSalary());
    }

    // 重写 equals 和 hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
