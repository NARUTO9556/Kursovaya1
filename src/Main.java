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
        System.out.println("employeeBook.getMaxSalaryInDepartment(2) = " + employeeBook.getMaxSalaryInDepartment(2));
        System.out.println("employeeBook.getMinSalaryInDepartment(2) = " + employeeBook.getMinSalaryInDepartment(2));
        employeeBook.printSeparator();
    }
}