public class Employee {
    private final String employeeFullName;
    private int department;
    private int salary;
    private static int counter = 1;
    private final int id;

    public Employee( int id, String employeeFullName, int department, int salary) {
        this.employeeFullName = employeeFullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public int getDepartment() {
        return department;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", ФИО сотрудника ='" + employeeFullName + '\'' +
                ", Отдел = " + department +
                ", зарплата = " + salary;
    }
}
