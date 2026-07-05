import java.util.*;
import java.io.*;

public class SumOfOddIntegers {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
     t = nextInt(); // Uncomment for multiple test cases

    while(t-- > 0) {
        int ans=solve();
        System.out.println(ans == -1 ? "NO":"YES");
    }

    out.flush();
    out.close();
}

static int solve() throws Exception {
    // Your solution here
    long n = nextLong();
    long k = nextLong();

    if(n < k*k){
        return -1;
    }

    if((n%2) != (k%2)){
        return -1;
    }
    return 1;
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