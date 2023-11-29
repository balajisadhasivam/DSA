import java.util.*;
public class FindMissingNum {
    public static int missingNum(int[] arr, int N){
        // int exsum = arr.length * (arr.length + 1) / 2;
        // int actsum = 0;
        // for(int num : arr){
        //     actsum += num;
        // }
        // return exsum - actsum;
        int xor1 = 0, xor2 = 0;
        int n = N-1;
        for(int i=0;i<n;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNum(arr, n));
    }
}
