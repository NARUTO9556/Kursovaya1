public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printAll();
        employeeBook.printSeparator();
        System.out.println("Сумма затрат на зарплату в месяц = " + employeeBook.checkSpending());
        employeeBook.printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой = " + employeeBook.minSpending());
        employeeBook.printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой = " + employeeBook.maxSpending());
        employeeBook.printSeparator();
        System.out.println("Средняя зарплата = " + employeeBook.averageSpending());
        employeeBook.printSeparator();
        employeeBook.printAllEmployees();
        employeeBook.printSeparator();
        System.out.println("Изменение зарплаты на 10% для всех работников");
        employeeBook.getSalaryAllEmployees(10);
        System.out.println("Работники с обновленной зарплатой:");
        employeeBook.printAll();
        employeeBook.printSeparator();
        int department = 2;
        System.out.println("Максимальная зарплата в отделе " + department + " = " + employeeBook.getMaxSalaryInDepartment(department));
        System.out.println("Минимальная зарплата в отделе " + department + " = " + employeeBook.getMinSalaryInDepartment(department));
        System.out.println("Средняя зарплата в отделе " + department + " = " + employeeBook.getAvgSalaryInDepartment(department));
        System.out.println("Траты на отдел " + department + " = " + employeeBook.checkSpendingInDepartment(department));
        System.out.println("Изменение зарплаты на 5% для всех работников в отделе " + department);
        employeeBook.getSalaryByDepartment(department, 5);
        System.out.println("Все работники в отделе " + department + ":");
        employeeBook.printEmployeesByDepartment(department);
        employeeBook.printSeparator();
        double amount = 30000;
        System.out.println("Сотрудники с зарплатой ниже " + amount + ":");
        employeeBook.printEmployeesWithSalaryLessThan(amount);
        System.out.println("Сотрудники с зарплатой выше или равной " + amount + ":");
        employeeBook.printEmployeesWithSalaryGreaterThanEqual(amount);
    }
}