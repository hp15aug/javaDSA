import java.util.*;
import java.io.*;

public class ThreeNumberOnBlackboard {
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
    int a = nextInt();
    int b = nextInt();
    int c = nextInt();

    // a<=b<=c
    int[] arr={a, b, c};
    Arrays.sort(arr);

    f(arr);

}
static void f(int[] arr){
     int a=arr[0];
     int b=arr[1];
     int c=arr[2];

     if(a+b < c){
         c=a+b;
         System.out.println(c-a);
         return;
     }

    System.out.println(c-a);

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