import java.util.*;
import java.io.*;

public class MaxOneMEX {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt();

        while(t-- > 0) {
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

        int max_val = -1;
        int best_a = -1, best_b = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                int limit = n - k;
                int mex = 0;
                boolean[] seen = new boolean[n + 1];

                for (int x = 0; x <= limit; x++) {
                    if (arr[x] <= n) {
                        seen[arr[x]] = true;
                    }
                    while (seen[mex]) {
                        mex++;
                    }
                }

                if (mex > max_val) {
                    max_val = mex;
                    best_a = i;
                    best_b = j;
                }

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (best_a == best_b) {
            out.println("-1");
        } else {
            out.println((best_a + 1) + " " + (best_b + 1));
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
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