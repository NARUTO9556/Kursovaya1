public class Main {
    public static Employee[] employeeList = new Employee[10];
    public static void main(String[] args) {
        employeeList[0] = new Employee(1, "Иванов Иван Иванович", 25000, 1);
        System.out.println(employeeList[0]);
        employeeList[1] = new Employee(2, "Степанов Борис Андреевич", 27000, 2);
        System.out.println(employeeList[1]);
        printSeparator();


    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}