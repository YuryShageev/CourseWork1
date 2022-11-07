public class Main {

    public static void main(String[] args) {

        Employees[] employee = new Employees[10];
        employee[0] = new Employees(new EmployeeName("Пух", "Винни", "Аланович"), 1, 80678);
        employee[1] = new Employees(new EmployeeName("Линдгред", "Карлсон", "Астридович"), 5, 103875);
        employee[2] = new Employees(new EmployeeName("Леопольд", "Кот", "Аркадьевич"), 3, 67942);
        employee[3] = new Employees(new EmployeeName("Стёпа", "Дядя", "Великанович"), 4, 69832);
        employee[4] = new Employees(new EmployeeName("Фон", "Ай", "Эпплович"), 2, 137584);
        employee[5] = new Employees(new EmployeeName("Хонор", "Хаувэй", "Китаевич"), 3, 456352);
        employee[6] = new Employees(new EmployeeName("Андерсон", "Ганс", "Кристиан"), 2, 45673);
        employee[7] = new Employees(new EmployeeName("Смит", "Иии", "Вессон"), 1, 99374);
        employee[8] = new Employees(new EmployeeName("Пистолет", "Пулемёт", "Шпагина"), 5, 70437);
        employee[9] = new Employees(new EmployeeName("Grand", "Theft", "Auto"), 4, 59673);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());

        }

        int totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            totalSalary += employee[i].getSalary();
        }
        System.out.println(totalSalary);

        int minEmployeeSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (minEmployeeSalary > employee[i].getSalary()) {
                minEmployeeSalary = employee[i].getSalary();
            }
        }
        System.out.println(minEmployeeSalary);

        int maxEmployeeSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (maxEmployeeSalary < employee[i].getSalary()) {
                maxEmployeeSalary = employee[i].getSalary();
            }
        }
        System.out.println(maxEmployeeSalary);

        double averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            averageSalary += employee[i].getSalary() / employee.length;
        }
        System.out.println(averageSalary);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getEmployeeName());

        }
    }


}