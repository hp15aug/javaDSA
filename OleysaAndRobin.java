import java.util.*;
import java.io.*;

public class OleysaAndRobin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = nextInt(); // Uncomment for multiple test cases

        while(t-- > 0) {
            solve();
        }

        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int n = nextInt();
        int t = nextInt();

        StringBuilder sb=new StringBuilder();

        if(n == 1 && t == 10){
            System.out.println("-1");
            return;
        }

        if(t!= 10) {
            for (int i = 0; i < n; i++) {
                sb.append(t);
            }
        }else{
            sb.append(1);
            for (int i = 0; i < n - 1; i++) {
                sb.append(0);
            }
        }
        System.out.println(sb.toString());

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