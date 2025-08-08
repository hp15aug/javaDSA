import java.util.*;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        if(n%2== 1) {
            System.out.println("-1");
            return;
        }

        for(int i=1; i<=n; i+=2){
            System.out.print((i+1)+ " "+ (i)+ " ");
        }


        sc.close();
    }
}