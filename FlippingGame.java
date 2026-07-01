import java.util.*;
import java.io.*;

public class FlippingGame {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
    // t = nextInt(); // Uncomment for multiple test cases

    while(t-- > 0) {
        solve();
    }
    out.flush();
    out.close();
}

static void solve() throws Exception {
    // Your solution here
    int n = nextInt();
    int[] arr=new int[n];

    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
    }

    int c=ff(arr);
    out.println(c);
}

private static int ff(int[] arr){
    int ones=0;
    for(int num: arr){
        if(num == 1)
            ones++;
    }

    int curr=0;
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        int cost=(arr[i] == 0) ? 1 : -1;
        curr+=cost;
        max=Math.max(max, curr);

        if(curr < 0)
            curr=0;
    }
    return ones+max;
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