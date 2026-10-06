import java.util.*;
import java.io.*;

public class SwapAndDelete {
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
        String s = next();
        int n=s.length();

        int a=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                a++;
            }
        }
        int b=n-a;
        
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '0'){
                if(b == 0){
                    System.out.println(n- i);
                    return;
                }
                b--;
            }else{
                if(a == 0){
                    System.out.println(n-i);
                    return;
                }
                a--;
            }
        }
        System.out.println(0);
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