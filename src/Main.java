public class Main {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[]{
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
        printAll(employeeList);
        printSeparator();
        System.out.println("Сумма затрат на зарплату в месяц = " + checkSpending(employeeList));
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой = " + minSpending(employeeList));
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой = " + maxSpending(employeeList));
        printSeparator();
        System.out.println("Средняя зарплата = " + averageSpending(employeeList));
        printSeparator();
        printAllEmployees(employeeList);
    }

    public static void printAll(Employee[] employeeList) {
        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }


    public static int checkSpending(Employee[] employeeList) {
        int sum = 0;
        for (Employee e : employeeList) {
            sum += e.getSalary();
        }
        return sum;
    }
    public static Employee minSpending(Employee[] employeeList) {
        Employee minSpending = employeeList[0];
        for (Employee e : employeeList) {
            if (e.getSalary() < minSpending.getSalary()) {
                minSpending = e;
            }
        }
        return minSpending;
    }
    public static Employee maxSpending(Employee[] employeeList) {
        Employee maxSpending = employeeList[0];
        for (Employee e: employeeList) {
            if (e.getSalary() > maxSpending.getSalary()) {
                maxSpending = e;
            }
        }
        return maxSpending;
    }
    public static double averageSpending(Employee[] employeeList) {
        return (double) checkSpending(employeeList) / employeeList.length;
    }

    public static void printAllEmployees(Employee[] employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e.getFullName());
        }
    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}