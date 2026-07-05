import java.util.*;
import java.io.*;

public class ProductOfThreeNumber {
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
    int a, b, c;
    a=b=c=-1;

    for (int i = 2; i*i < n; i++) {
        if(n%i == 0){
            a=i;
            break;
        }
    }
    for (int i = a+1; i*i < n; i++) {
        if (a>0 && n % (a*i) == 0) {
            b=i;
            break;
        }
    }
    c=n/(a*b);
    c= (c== b) ? -1: c;
    if(a!= -1 && b!=-1 && c!=-1 && (a!=c) ){
        System.out.println("YES");
        System.out.println(a+ " "+ b+ " "+ c);
    }else {
        System.out.println("NO");
    }
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