import java.util.*;
import java.io.*;

public class Xsum {
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
        int m = nextInt();
        int n = nextInt();
        
        int[][] arr= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = f(arr, i, j);
                max = Math.max(max, temp);
            }
        }
        out.println(max);
    }
    
    static private int f(int[][] arr, int i, int j){
        int m = arr.length;
        int n = arr[0].length;

        int now = 0;

        int ci=i;
        int cj=j;

        while(ci>=0 && ci<m && cj>=0 && cj<n){
            now+=arr[ci][cj];
            ci--;
            cj--;
        }

        ci=i;
        cj=j;
        while(ci>=0 && ci<m && cj>=0 && cj<n){
            now+=arr[ci][cj];
            ci--;
            cj++;
        }

        ci=i;
        cj=j;
        while(ci>=0 && ci<m && cj>=0 && cj<n){
            now+=arr[ci][cj];
            ci++;
            cj++;
        }

        ci=i;
        cj=j;
        while(ci>=0 && ci<m && cj>=0 && cj<n){
            now+=arr[ci][cj];
            ci++;
            cj--;
        }

        now -= arr[i][j] * 3;
        return now;
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