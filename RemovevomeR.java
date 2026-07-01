import java.util.*;
import java.io.*;

public class RemovevomeR {
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
    int n = nextInt();
    String s=next();
    
    int blocks=1;
    for (int i = 1; i < n; i++) {
        if(s.charAt(i) != s.charAt(i-1)){
            blocks++;
        }
    }
    if(blocks == 2)
        out.println(2);

    else
        out.println(1);
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