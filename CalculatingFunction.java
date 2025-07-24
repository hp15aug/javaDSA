import java.util.*;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         long n = sc.nextLong(); // Multiple test cases
        System.out.println(solve(n));
        // }

        sc.close();
    }

    static long solve(long n) {

        if(n%2 ==0)
            return n/2;
        else
            return -(n+1)/2;
    }
}