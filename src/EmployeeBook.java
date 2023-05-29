public class EmployeeBook {
    private Employee[] employeeList = new Employee[]{
            new Employee("employee1", 1, 20000),
            new Employee("employee2", 2, 25000),
            new Employee("employee3", 3, 32452),
            new Employee("employee4", 4, 63242),
            new Employee("employee5", 5, 72421),
            new Employee("employee6", 1, 82344),
            new Employee("employee7", 2, 32245),
            new Employee("employee8", 3, 35323),
            new Employee("employee9", 4, 15653),
            new Employee("employee10", 5, 23245)
    };
    public void printAll() {
        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }
    public int checkSpending() {
        int sum = 0;
        for (Employee e : employeeList) {
            sum += e.getSalary();
        }
        return sum;
    }
    public Employee minSpending() {
        Employee minSpending = employeeList[0];
        for (Employee e : employeeList) {
            if (e.getSalary() < minSpending.getSalary()) {
                minSpending = e;
            }
        }
        return minSpending;
    }
    public Employee maxSpending() {
        Employee maxSpending = employeeList[0];
        for (Employee e: employeeList) {
            if (e.getSalary() > maxSpending.getSalary()) {
                maxSpending = e;
            }
        }
        return maxSpending;
    }
    public double averageSpending() {
        return (double) checkSpending() / employeeList.length;
    }
    public void printAllEmployees() {
        for (Employee e : employeeList) {
            System.out.println(e.getFullName());
        }
    }
    public void getSalaryAllEmployees(double percentage) {
        for (Employee employee : employeeList) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }
    public double checkSpendingInDepartment(int department) {
        double checkSpending = 0;
        for (Employee employee : employeeList) {
            if (employee != null && employee.getDepartment() == department) {
                checkSpending += employee.getSalary();
            }
        }
        return checkSpending;
    }
    public Employee getMaxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee e : employeeList) {
            if (e.getDepartment() == department
                    && (employeeWithMaxSalary == null || e.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }
    public Employee getMinSalaryInDepartment(int department) {
        Employee employeeWithMinSalary = null;
        for (Employee e : employeeList) {
            if (e.getDepartment() == department
                    && (employeeWithMinSalary == null || e.getSalary() < employeeWithMinSalary.getSalary())) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public double getAvgSalaryInDepartment(int department) {
        double totalSalary = checkSpendingInDepartment(department);
        int count = 0;
        for (Employee e: employeeList) {
            if (e != null && e.getDepartment() == department) {
                count++;
            }
        }
        return totalSalary / count;
    }
    public void getSalaryByDepartment(int department, double percentage) {
        for (Employee employee : employeeList) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }
    public void printEmployeesByDepartment(int department) {
        for (Employee employee : employeeList) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toString());
            }
        }
    }
    public void printEmployeesWithSalaryLessThan(double amount) {
        for (Employee employee : employeeList) {
            if (employee != null && employee.getSalary() < amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterThanEqual(double amount) {
        for (Employee employee : employeeList) {
            if (employee != null && employee.getSalary() >= amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
    public void printSeparator() {
        System.out.println("====================");
    }
}
