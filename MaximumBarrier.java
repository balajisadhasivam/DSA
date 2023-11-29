import java.util.Scanner;

public class MaximumBarrier {

    public static int maximumBarrier(int n, int[][] arr) {
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = 0;
            points[i][1] = 0;
        }

        for (int i = 0; i < n; i++) {
            points[i][0] = arr[i][0];
            points[i][1] = arr[i][0] + arr[i][2];
        }

        int totalPeopleBlocked = 0;

        int startx = points[0][0];
        int endx = points[0][1];

        for (int i = 1; i < n; i++) {
            if (points[i][0] <= points[i - 1][1]) {
                endx = points[i][1];
            } else {
                totalPeopleBlocked += endx - startx + 1;
                startx = points[i][0];
                endx = points[i][1];
            }
        }

        totalPeopleBlocked += endx - startx + 1;

        return totalPeopleBlocked;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int result = maximumBarrier(n, arr);
        System.out.println(result);

        scanner.close();
    }
}
