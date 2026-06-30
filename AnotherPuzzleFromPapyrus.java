import java.util.*;
import java.io.*;

public class AnotherPuzzleFromPapyrus {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
     t = nextInt(); // Uncomment for multiple test cases

    while(t-- > 0) {
        solve();
    }

    out.close();
}

static void solve() throws Exception {
    // Your solution here
    int n = nextInt();
    int c=nextInt();

    int[] a=new int[n];
    int[] b=new int[n];

    for (int i = 0; i < n; i++) {
        a[i]=nextInt();
    }
    for (int i = 0; i < n; i++) {
        b[i]=nextInt();
    }
    f(a, b, c);
}

static void f(int[] a, int[] b, int c){
    boolean sortingRequired=sortingRequired(a, b);
    if (sortingRequired) {
        Arrays.sort(a);
        Arrays.sort(b);
    }

    for (int i = 0; i < a.length; i++) {
        if (a[i] < b[i]) {
            System.out.println(-1);
            return;
        }
    }

    int tot=0;
    for (int i = 0; i < a.length; i++) {
        tot+=a[i]-b[i];
    }
    if(sortingRequired)
        System.out.println(tot+c);
    else
        System.out.println(tot);
}
static boolean sortingRequired(int[] a, int[] b){
    for (int i = 0; i < a.length; i++) {
        if(a[i]<b[i])
            return true;
    }
    return false;
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