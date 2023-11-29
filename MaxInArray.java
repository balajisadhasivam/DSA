import java.util.*;

public class MaxInArray {

    static void maxInArray(int[] arr, int length) {
        if (length == 0) {
            return;
        }

        int maxi = 0;
        int maxe = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] > maxe) {
                maxe = arr[i];
                maxi = i;
            }
        }

        System.out.println(maxe);
        System.out.println(maxi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        maxInArray(arr, length);
    }
}
