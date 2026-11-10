import java.util.*;
import java.io.*;

public class MaximalAND {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt(); // Uncomment for multiple test cases

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        int k = nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        int ans = 0;

        for (int bit = 30; bit >= 0; bit--) {
            int zeros = 0;

            for (int i = 0; i < n; i++) {
                boolean isZero = ((arr[i] >> bit) & 1) == 0;
                if (isZero) {
                    zeros++;
                }
            }

            if (zeros <= k) {
                k -= zeros;
                ans += (1 << bit); // Add 2^bit to the final answer
            }
        }

        out.println(ans);
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