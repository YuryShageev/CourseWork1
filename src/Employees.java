import java.util.Objects;

public class Employees {

    private final EmployeeName employeeName;
    private int department;
    private int salary;

    private int id;
    public static int counter;

    public Employees(EmployeeName employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;

        id = counter++;
    }


    public EmployeeName getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employees employees = (Employees) obj;
        return Objects.equals(employeeName, employees.employeeName) && Objects.equals(department, employees.department) && Objects.equals(salary, employees.salary);
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + employeeName.toString() + " Из отдела " + department + " Получает зарплату: " + salary;
    }
}
