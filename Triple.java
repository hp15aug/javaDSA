import java.util.*;
import java.io.*;

public class Triple  {
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
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=nextInt();
        }

        if(n<=2){
            out.println("-1");
            return;
        }

        Map<Integer, Integer> hm = new HashMap<>();

        for (int a: arr) {
            hm.put(a, hm.getOrDefault(a, 0)+1);
        }

        for (int num : hm.keySet()) {
            if(hm.get(num) >= 3){
                out.println(num);
                return;
            }
        }
        out.println(-1);
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