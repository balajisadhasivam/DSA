import java.util.Stack;
import java.util.*;
public class findnearestsmall {
    static void helper(int n, int[] arr) {
        Stack<Integer> s = new Stack<>();

        s.push(arr[n - 1]);
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int x = arr[i];

            while (!s.isEmpty() && x < s.peek()) {
                s.pop();
            }

            if (s.isEmpty())
                arr[i] = -1;
            else
                arr[i] = s.peek();

            s.push(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int n = array.length;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        helper(size, array);
        printArray(array);
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


