public class Main {
    public static Employee[] employeeList = new Employee[10];
    public static void main(String[] args) {
        employeeList[0] = new Employee(1, "Иванов Иван Иванович", 1, 25000);
        System.out.println(employeeList[0]);
        employeeList[1] = new Employee(2, "Степанов Борис Андреевич", 2, 27000);
        System.out.println(employeeList[1]);
        employeeList[2] = new Employee(3, "Семенов Семен Семенович", 3, 30000);
        System.out.println(employeeList[2]);
        printSeparator();


    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}