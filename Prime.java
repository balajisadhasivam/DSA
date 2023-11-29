import java.util.*;
public class Prime {
    static void isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return;
            }
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        isPrime(i);
    }
}
