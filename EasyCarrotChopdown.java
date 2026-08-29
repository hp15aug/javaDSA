import java.util.*;
import java.io.*;

public class EasyCarrotChopdown {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        int m = nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        f(arr, m);
    }

    private static void f(int[] arr, int m) {
        int[] cnt = new int[m + 1];
        for (int val : arr) {
            cnt[val]++;
        }

        int[] pre = new int[m + 2];
        for (int i = m; i >= 1; i--) {
            pre[i] = pre[i + 1] + cnt[i];
        }

        int max = 0;
        for (int L = 1; L <= m; L++) {
            int curr = pre[L];
            if (2 * L <= m) {
                curr += cnt[2 * L];
            }
            if (curr > max) {
                max = curr;
            }
        }

        out.println(max);
    }


    // Fast I/O methods
    static String next() throws Exception {
        while (st == null || !st.hasMoreElements()) {
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