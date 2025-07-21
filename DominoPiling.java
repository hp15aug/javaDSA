import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Multiple test cases
        int n = sc.nextInt(); // Multiple test cases

        int ans=solve(m,n);
        System.out.println(ans);

        sc.close();
    }

    static int solve(int m, int n) {
        int r=m/2;
        int ans=0;

        ans=(m%2 ==0)?r*n: (r*n)+(n/2);
        return ans;
    }
}