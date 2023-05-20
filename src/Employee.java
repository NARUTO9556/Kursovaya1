public class Employee {
    private final String FullName;
    private int department;
    private int salary;
    private static int counter = 1;
    private final int id;

    public Employee(String FullName, int department, int salary) {
        this.FullName = FullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return FullName;
    }

    public int getDepartment() {
        return department;
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
                ", ФИО сотрудника ='" + FullName + '\'' +
                ", зарплата = " + salary +
                ", Отдел = " + department;
    }
}
