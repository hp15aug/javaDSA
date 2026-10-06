import java.util.*;
import java.io.*;

public class FloorOfMEX {
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

        long[] arr = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = nextLong();
        }

        int[] diff = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            long left = arr[i] * (long) i;
            long right = (arr[i] + 1) * (long) i - 1;

            if (left >= n)
                continue;

            right = Math.min(right, n - 1);

            if (left <= right) {
                diff[(int)left]++;
                diff[(int)right + 1]--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            if (curr == 0) {
                ans.add(i);
            }
        }

        out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            out.print(ans.get(i) + (i == ans.size() - 1 ? "" : " "));
        }
        out.println();
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