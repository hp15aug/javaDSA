import java.util.*;

public class Tprimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt(); // Multiple test cases
         while(t-- > 0) {
        solve(sc);
         }

        sc.close();
    }

    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long sq= (long) Math.sqrt(n);
        if (sq * sq != n) {
            System.out.println("NO");
            return;
        }

        if(isPrime(sq)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    static boolean isPrime(long n){
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i*i <= n; i+=2) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

}