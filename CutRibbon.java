import java.util.*;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(solve(n, a, b, c, dp));

        sc.close();
    }

    static int solve(int n, int a, int b, int c, int[] dp) {
        if( n == 0)
            return 0;
        if( n < 0)
            return Integer.MIN_VALUE;

        if(dp[n] != -1)    return dp[n];

        int cutA=solve(n-a, a, b, c, dp);
        int cutB=solve(n-b, a, b, c, dp);
        int cutC=solve(n-c, a, b, c, dp);

        int max=Math.max(cutA, Math.max(cutB, cutC));

        if(dp[n] == Integer.MIN_VALUE)
            return dp[n]=Integer.MIN_VALUE;
        else
            return dp[n]=max+1;
    }
}