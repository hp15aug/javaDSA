import java.util.*;
import java.io.*;

public class SameParitySummands {
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
    long n=nextLong();
    long k=nextLong();

    boolean isN=(n%2) == 1;
    boolean isK=(k%2) == 1;

    // EVEN ODD
    if(!isN && isK && n<(2*k)){
        out.println("NO");
    }else if(!isN && isK && n>=(2*k)){
        out.println("YES");
        long s=0;
        for (int i = 0; i < k - 1; i++) {
            s+=2;
            out.print("2 ");
        }
        out.print(n-s + " \n");
    }

    // ODD ODD or EVEN EVEN
    if((isN && isK) && (n<k) || (!isN && !isK) && (n<k)){
        out.println("NO");
    }else if((isN && isK) || (!isN && !isK)){
        out.println("YES");
        long s=0;
        for (int i = 0; i < k - 1; i++) {
            s+=1;
            out.print("1 ");
        }
        out.print(n-s + " \n");
    }

    //ODD EVEN
    if((isN && !isK)){
        out.println("NO");
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
