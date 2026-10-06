import java.util.*;
import java.io.*;

public class MinMatrices {
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
        int n = nextInt();
        int t = nextInt();

        int min = n;
        int max = 2 * n - 1;

        if (t < min || t > max) {
            out.println(-1);
            return;
        }

        Integer[][] matrix = new Integer[n][n];
        int k = 0;
        for (int i = 0; i < (t - n + 1); i++) {
            matrix[0][i] = ++k;
        }

        int rem = n - k;
        int lastIdx = n - 1;
        while (rem != 0) {
            matrix[lastIdx][lastIdx] = ++k;
            rem--;
            lastIdx--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = ++k;
                }
            }
        }

        // Fixed: using 'out' and adding spaces between elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
            }
            out.println();
        }
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