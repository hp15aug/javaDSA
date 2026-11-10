import java.util.*;
import java.io.*;

public class LetterStrings {
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

        long count = 0;

        // Check every pair (i, j) with i < j
        // for (int i = 0; i < n; i++) {
        //     char a0 = s[i].charAt(0);
        //     char a1 = s[i].charAt(1);

        //     for (int j = i + 1; j < n; j++) {
        //         char b0 = s[j].charAt(0);
        //         char b1 = s[j].charAt(1);

        //         // Exactly one character differs
        //         if ((a0 == b0 && a1 != b1) || (a0 != b0 && a1 == b1)) {
        //             count++;
        //         }
        //     }
        // }


        long[] firstCharCount = new long[26];
        long[] secondCharCount = new long[26];
        long[][] exactPairCount = new long[26][26];

        for (int i = 0; i < n; i++) {
            String s = next();
            int u = s.charAt(0) - 'a';
            int v = s.charAt(1) - 'a';

            count += (firstCharCount[u] - exactPairCount[u][v] );
            count += (secondCharCount[v] - exactPairCount[u][v]);

            firstCharCount[u]++;
            secondCharCount[v]++;
            exactPairCount[u][v]++;
        }

        out.println(count);
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