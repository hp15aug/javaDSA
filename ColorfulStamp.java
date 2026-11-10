import java.util.*;
import java.io.*;

public class ColorfulStamp {
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
        int n = nextInt();
        String s = nextLine();

        if(s.equals("W") || s.equals("WW")){
            out.println("YES");
            return;
        }

        if (n <= 1) {
            out.println("NO");
            return;
        }

        if (n == 2) {
            out.println((s.equals("BR") || s.equals("RB")) ? "YES" : "NO");
            return;
        }

        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'W') {
                if (!isValid(s.substring(start, i))) {
                    out.println("NO");
                    return;
                }
                start = i;
            }
        }
        if (!isValid(s.substring(start, n))) {
            out.println("NO");
            return;
        }
        out.println("YES");
    }

    private static boolean isValid(String s) {
        int a = 0;
        int b = 0;
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == 'B') {
                a++;
            } else if (ch == 'R') {
                b++;
            }
        }

        if ((a > 0 && b == 0) || (b > 0 && a == 0)) {
            return false;
        }
        // out.println("DEBUG: " + a + " " + b);
        return true;
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