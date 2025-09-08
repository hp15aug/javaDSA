import java.io.*;
import java.util.*;

public class CollatzConjecture {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int k = fs.nextInt();
            long x = fs.nextLong();
            long ans = x;
            for (int i = 0; i < k; i++) ans *= 2; // multiply by 2^k
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }

    // Simple fast scanner
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
