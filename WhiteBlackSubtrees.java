import java.util.*;
import java.io.*;

public class WhiteBlackSubtrees {
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
        // Your solution here
        int n = nextInt(); // 7
        int[] parent = new int[n+1];
        for (int i = 2; i < parent.length; i++) {
            parent[i] = nextInt();
        }
        String s = next();

        int[] bal = new int[parent.length];
        for (int i = 1; i <= s.length(); i++) {
            bal[i]= s.charAt(i-1) == 'W'? 1:-1;
        }
        // out.println(Arrays.toString(bal));

        for (int i = bal.length-1; i >= 1; i--) {
            bal[parent[i]] += bal[i];
        }

        int cnt=0;
        for (int i = 1; i < bal.length; i++) {
            if(bal[i] == 0){
                cnt++;
            }
        }

        out.println(cnt);
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