import java.util.*;

public class TwoButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=f(n, m);
        System.out.println(ans);

        sc.close();
    }

    static int f(int n, int m){
        int c=0;
        while(m>n){
            if(m%2 == 0)
                m/=2;
            else
                m+=1;
            c++;
        }
        c+=(n-m);
        return c;
    }
}