import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HypercarpAndControlPanel {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int TestsNumT = 1;
        TestsNumT = nextInt();
        while(TestsNumT-- > 0) {
            solve();
        }
        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        int ans = f(arr);
        out.println(ans);
    }

    static int f(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                int b1 = (i > 0 && arr[i - 1] == arr[i]) ? 1 : 0;
                int b3 = (i + 2 < n && arr[i + 1] == arr[i + 2]) ? 1 : 0;

                int a1 = (i > 0 && arr[i - 1] == arr[i + 1]) ? 1 : 0;
                int a3 = (i + 2 < n && arr[i] == arr[i + 2]) ? 1 : 0;

                int x = b1 + b3 - a1 - a3;
                if (x > max) {
                    max = x;
                }
            }
        }

        return n - count + max;
    }

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