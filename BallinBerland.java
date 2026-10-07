import java.util.*;
import java.io.*;

public class BallinBerland {
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
        int a = nextInt();
        int b = nextInt();
        int k = nextInt();

        int[] x = new int[k];
        int[] y = new int[k];

        int[] cntBoy = new int[a + 1];
        int[] cntGirl = new int[b + 1];

        for (int i = 0; i < k; i++) {
            x[i] = nextInt();
            cntBoy[x[i]]++; 
        }

        for (int i = 0; i < k; i++) {
            y[i] = nextInt();
            cntGirl[y[i]]++;
        }

        long total = 0;
        for (int i = 0; i < k; i++) {
            total += k - cntBoy[x[i]] - cntGirl[y[i]] + 1;
        }
        out.println(total / 2);
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