import java.util.*;
public class SingleNum {
    public static int single(int[] arr){
        int xor = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(single(arr));
    }
}
