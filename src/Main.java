public class Main {

    public static void main(String[] args) {

        Employees[] employee = new Employees[10];
        employee[0] = new Employees(new EmployeeName("Винни", "Пух", "Аланович"), 1, 80678);
        employee[1] = new Employees(new EmployeeName("Линдгред", "Карлсон", "Астридович"), 5, 103875);
        employee[2] = new Employees(new EmployeeName("Леопольд", "Кот", "Аркадьевич"), 9, 67942);

        for (int i = 0; i < employee.length; i++) {
            if (employee.length - 1 != null) {

                System.out.println(employee[i].toString());
            } else {
                System.out.println();
            }
        }

        int maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            maxSalary += employee[i].getSalary();
        }
        System.out.println(maxSalary);
    }


}