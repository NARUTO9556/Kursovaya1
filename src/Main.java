public class Main {
    public static Employee[] employeeList = new Employee[10];
    public static void main(String[] args) {
        employeeList[0] = new Employee("Иванов Иван Иванович", 1, 25000, 1);
        System.out.println(employeeList[0]);
        employeeList[1] = new Employee("Степанов Борис Андреевич", 2, 27000, 2);
        System.out.println(employeeList[1]);
        printSeparator();


    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}