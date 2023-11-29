import java.util.*;
public class slsm {
    static void slargest(int n, int a[]){
        int largest=a[0];
        int slargest=-1;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest&&a[i]>slargest){
                slargest=a[i];
            }
        }
        System.out.print(slargest);
    }
    static void ssmallest(int n, int a[]){
        int smallest=Integer.MAX_VALUE;
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if (a[i]<smallest) {
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest&&a[i]<ssmallest){
                ssmallest=a[i];
            }
        }
        System.out.println(ssmallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        //slargest(n,a);
        ssmallest(n,a);
    }
}
