import java.util.*;
public class primeulll {
    static void isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return;
            }
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int ll, ul;
        Scanner sc = new Scanner(System.in);
        ll=sc.nextInt();
        ul=sc.nextInt();
        for(int i=ll;i<ul;i++)
        isPrime(i);
    }
}
