import java.util.*;
public class rotateArray {
    public static void rotArray(int n, int[] arr){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotArray(n, arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }       
    }
}
