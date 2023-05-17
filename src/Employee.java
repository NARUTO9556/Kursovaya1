public class Employee {
    private String employeeFirstName;
    private String employeeMiddleName;
    private String employeeLastName;
    private int salary;
    static int counter = 1;
    int id = counter++;
        public Employee(String employeeLastName, String employeeFirstName, String employeeMiddleName) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Сотрудник = '"+ employeeLastName + ' ' + employeeFirstName + ' ' + employeeMiddleName + '\'';
    }

}
