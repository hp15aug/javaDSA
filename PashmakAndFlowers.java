import java.util.*;
import java.io.*;

public class PashmakAndFlowers {
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

    f(arr);
//    out.println(a);
}
static void f(int[] arr){
    long min=Integer.MAX_VALUE;
    long max=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length;i++) {
        min=Math.min(min, arr[i]);
        max=Math.max(max, arr[i]);
    }

    int maxCount=0;
    int minCount=0;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == (int) max)
            maxCount++;
        if(arr[i] == (int) min)
            minCount++;
    }

    long ways;
    if (min == max) {
        ways=(long) arr.length* (arr.length-1)/2;
    }else{
        ways=(long)minCount*maxCount;
    }
    out.println((max-min)+ " " +ways);

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