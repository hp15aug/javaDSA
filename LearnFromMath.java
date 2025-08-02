import java.util.*;

public class LearnFromMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        solve(n);

        sc.close();
    }

    static void solve(int n) {
        if(n%4 ==0){
            System.out.println((n/2)+ " "+ (n/2));
            return;
        }
        for (int i = 4; i < n; i++) {
            if(isPrime(i) || isPrime(n-i))
                continue;
            else{
                System.out.println(i+ " "+ (n-i));
                break;
            }
        }
    }
    static boolean isPrime(int n){
        if(n <= 1)
            return false;

        for (int i = 2; i*i <= n; i++) {
            if(n% i == 0)
                return false;
        }
        return true;
    }
}