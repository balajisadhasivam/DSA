import java.util.Scanner;

public class SumPrimeIndices {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumPrimeIndices(int[] arr, int n) {
        if (arr == null || n <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size. Exiting.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = sumPrimeIndices(arr, n);
        System.out.println("Sum of numbers at prime indices: " + result);

        scanner.close();
    }
}
