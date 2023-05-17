import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        printSeparator();
        String[] Employees = new String[10];
        Employees[0] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[1] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[2] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[3] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[4] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[5] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[6] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[7] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[8] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        Employees[9] = String.valueOf(new Employee("Иванов", "Иван", "Иванович"));
        System.out.println(Arrays.toString(Employees));
        printSeparator();


    }
    public static void printSeparator() {
        System.out.println("====================");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50_000) + 50_000;
        }
        return arr;
    }
}