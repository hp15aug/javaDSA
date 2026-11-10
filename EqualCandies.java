import java.io.*;
import java.util.*;

public class EqualCandies {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static int nextInt() throws IOException { return Integer.parseInt(next()); }
    static long nextLong() throws IOException { return Long.parseLong(next()); }

    static void solve() throws IOException {
        int n = nextInt();
        int[] arr = new int[n];
        int tot=0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = nextInt();
            min = Math.min(min, arr[i]);
        }

        for(int i=0; i<n; i++){
            tot+=arr[i]-min;
        }
        out.println(tot);
    }

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        while (t-- > 0) solve();
        out.flush();
    }
}
