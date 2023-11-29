import java.util.*;
public class revtripattern {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int st = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int k=0;k<st;k++){
                System.out.print("*");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}


