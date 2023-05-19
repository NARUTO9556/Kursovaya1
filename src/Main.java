import java.util.Arrays;

public class Main {
    public static Employee[] employeeList = new Employee[10];
    public static void main(String[] args) {
        int [] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        employeeList[0] = new Employee(1, "Иванов Иван Иванович", 1, arr[0]);
        System.out.println(employeeList[0]);
        employeeList[1] = new Employee(2, "Степанов Борис Андреевич", 2, arr[1]);
        System.out.println(employeeList[1]);
        employeeList[2] = new Employee(3, "Семенов Семен Семенович", 3, arr[2]);
        System.out.println(employeeList[2]);
        System.out.println(Arrays.toString(arr));
        checkSpending();
        printSeparator();
        minMaxSpending();
        printSeparator();
        averageSpending();
        printSeparator();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30_000) + 40_000;
        }
        return arr;
    }
    private static void checkSpending() {
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int element:arr) {
            sum += element;
        }
        System.out.println(String.format("Сумма трат за месяц составила %s рублей", sum));
    }
    private static void minMaxSpending() {
        int[] arr = generateRandomArray();
        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int i: arr) {
            if (i<minSpending){
                minSpending = i;
            } if (i>maxSpending){
                maxSpending = i;
            }
        }
        System.out.println(String.format("Минимальная сумма зарплаты составила %s рублей. Максимальная зарплата составила %s рублей", minSpending, maxSpending));
    }

    private static void averageSpending() {
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        int salary = arr.length;
        double averageSpending = (double) sum / salary;
        System.out.println(String.format("Средняя зарплата составила %s рублей", averageSpending));
    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}