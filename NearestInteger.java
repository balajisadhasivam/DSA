import java.util.Scanner;

public class NearestInteger {

    public static int nearestInteger(int num, int m) {
        int lowerBound = (num / m) * m;
        int upperBound = lowerBound + m;

        if (num - lowerBound <= upperBound - num) {
            return lowerBound;
        } else {
            return upperBound;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (num): ");
        int num = scanner.nextInt();

        System.out.print("Enter another number (m): ");
        int m = scanner.nextInt();

        int result = nearestInteger(num, m);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
