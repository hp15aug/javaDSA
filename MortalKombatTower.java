import java.util.*;
import java.io.*;

public class MortalKombatTower {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt(); // Uncomment for multiple test cases

        while(t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int n = nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=nextInt();
        }
        Integer[][] dp=new Integer[n+2][2];

        System.out.println(f(0, 0, arr, dp));
    }

    private static int f(int i, int turn, int[] arr, Integer[][] dp){
        if(i>= arr.length)
            return 0;

        if(dp[i][turn] != null){
            return dp[i][turn];
        }

        int res =0;
        if(turn == 0){
            res = arr[i] + f(i+1, 1, arr, dp);
            if(i+1 < arr.length){
                res = Math.min(res, arr[i]+arr[i+1] + f(i+2, 1, arr, dp));
            }
        }else{
            res = f(i + 1, 0, arr, dp);
            if(i+1 < arr.length){
                res = Math.min(res, f(i+2, 0, arr, dp));
            }
        }
        return dp[i][turn]=res;
    }

    // Fast I/O methods
    static String next() throws Exception {
        while(st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    static long nextLong() throws Exception {
        return Long.parseLong(next());
    }

    static double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }

    static String nextLine() throws Exception {
        return br.readLine();
    }
}