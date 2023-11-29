import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {

    public static void rearrangeArray(int[] arr, int m) {
        if (arr == null || m <= 0) {
            return;
        }

        Arrays.sort(arr);

        int[] rearrangedArr = new int[m];
        int left = 0, right = m - 1;
        boolean isLeft = true;

        for (int i = 0; i < m; i++) {
            if (isLeft) {
                rearrangedArr[i] = arr[left++];
            } else {
                rearrangedArr[i] = arr[right--];
            }
            isLeft = !isLeft;
        }
        for(int i=0;i<m;i++){
            System.out.print(rearrangedArr[i]+" ");
        }
    }
        

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array (m): ");
        int m = scanner.nextInt();

        if (m <= 0) {
            System.out.println("Invalid array length. Exiting.");
            return;
        }

        int[] arr = new int[m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrangeArray(arr, m);

        scanner.close();
    }
}
