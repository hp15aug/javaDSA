import java.util.*;
import java.io.*;

public class MinMaxGame {
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
    int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
    }
    int countOnes=0;
    int countZeros=0;
    for (int i = 0; i < n; i++) {
        if(arr[i] == 1)
            countOnes++;
    }
    countZeros=n-countOnes;

    if(countOnes >= countZeros){
        System.out.println("Bessie");
    }else{
        System.out.println("Elsie");
    }
//    out.close();
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