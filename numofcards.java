import java.util.Scanner;

public class numofcards {
    public static int cards(int n){
        if(n==0)
           return 0;
        if(n==1)
            return 2;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 2;
        for(int i=2;i<=n;i++){
              arr[i] = ((2*i)+i-1+arr[i-1])%1000007;
        }
        return arr[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int tot = cards(row);
        System.out.println(tot);
    }
}
