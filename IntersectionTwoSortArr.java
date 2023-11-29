import java.util.*;
import java.util.ArrayList;
public class IntersectionTwoSortArr {
    public static ArrayList<Integer> FindIntersect(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j] = sc.nextInt();
        }
        ArrayList<Integer> res = FindIntersect(arr1,arr2,n,m);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}
