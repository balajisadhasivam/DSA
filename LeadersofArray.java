import java.util.*;
public class LeadersofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=-999;
        for(int i=n-1;i>0;i--){
            if(max<arr[i]){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
            // int c=0;
            // for(int j=i+1;j<n;j++){
            //     if(arr[j]>arr[i]){
            //         c=1;
            //         break;
            //     }
            // }

            // if(c==0){
            //     System.out.print(arr[i]+" ");
            // }
        }
    }
}
