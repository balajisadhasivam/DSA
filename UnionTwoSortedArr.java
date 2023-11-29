import java.util.*;
import java.util.ArrayList;
public class UnionTwoSortedArr {
    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i<n && j<m) {
            if(arr1[i]<=arr2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(Union.size()==0 || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(Union.get(Union.size()-1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
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
        ArrayList<Integer> union = FindUnion(arr1,arr2,n,m);
        for(int val : union){
            System.out.print(val + " ");
        }
    }
}
