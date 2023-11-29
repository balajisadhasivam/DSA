import java.util.*;
public class LinearSearch {
    public static int search(int[] arr, int n, int num){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(search(arr, n, num));

    }
}
