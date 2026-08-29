import java.util.*;
import java.io.*;

public class DominoTiles {
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

    //s="??"

    System.out.println(f(n-1, s));

//    System.out.println(isValid(s));
}
private static int f(int ind, String s){
    if(ind == 0){
        if(isValid(s))
            return 1;
        else
            return 0;
    }

    char ch=s.charAt(ind);

    return 0;

}

static boolean isValid(String s){
    int n=s.length();
    int prev=(s.charAt(0)-'0')+(s.charAt(1)-'0');
    int curr;

    for (int i = 1; i < n-1 ; i++) {
        curr=(s.charAt(i)-'0')+(s.charAt(i+1)-'0');

        if(prev == curr){
            return false;
        }
        prev=curr;
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