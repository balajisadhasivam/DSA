import java.util.Scanner;

public class WaterOverflow {

    public static float findWater(int i, int j, float val) {
        float[][] glasses = new float[i + 1][i + 1];
        glasses[1][1] = val;

        for (int row = 1; row <= i; row++) {
            for (int col = 1; col <= row; col++) {
                float overflow = (glasses[row][col] - 1) / 2.0f;
                if (overflow > 0) {
                    glasses[row + 1][col] += overflow;
                    glasses[row + 1][col + 1] += overflow;
                }
            }
        }

        if (j > i || j <= 0 || j > i+1) {
            return 0.0f;  // Invalid column index
        }

        return Math.min(1.0f, glasses[i][j]); // Limit to 1 litre
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row (i): ");
        int i = scanner.nextInt();

        System.out.print("Enter the column (j): ");
        int j = scanner.nextInt();

        System.out.print("Enter the amount of water poured (val): ");
        float val = scanner.nextFloat();

        float result = findWater(i, j, val);
        System.out.println("Amount of water in " + i + "^" + j + " glass: " + result);

        scanner.close();
    }
}
