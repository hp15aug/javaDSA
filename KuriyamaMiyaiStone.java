import java.util.*;
import java.io.*;

public class KuriyamaMiyaiStone {
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

    static int[] arr;
    static int[] sortedArray;
static void solve() throws Exception {
    // Your solution here
    int n = nextInt();
    arr=new int[n];
    sortedArray=new int[n];

    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
        sortedArray[i]=arr[i];
    }

    Arrays.sort(sortedArray);
    long[] pre1=new long[n+1];
    long[] pre2=new long[n+1];

    for (int i = 1; i <= n; i++) {
        pre1[i]=pre1[i-1]+arr[i-1];
        pre2[i]=pre2[i-1]+sortedArray[i-1];
    }

    int m=nextInt();
    while(m-- > 0){
        int type=nextInt();
        int l=nextInt();
        int r=nextInt();

        if(type == 1)
            out.println(pre1[r] - pre1[l-1]);
        else
            out.println(pre2[r]- pre2[l-1]);
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