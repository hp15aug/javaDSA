import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();

        long ans=f(n, m , a);
        System.out.println(ans);
    }

    private static long f(long n, long m, long a){
        long r= n%a == 0? n/a: (n/a)+1;
        long c= m%a == 0? m/a: (m/a)+1;

        return r*c;
    }
}
