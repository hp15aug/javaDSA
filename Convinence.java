import java.util.*;
import java.io.*;

public class Convinence {
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
        int x = nextInt();
        int y = nextInt();
        int r = nextInt();

        int square = r*r;
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            set.add(i*i);
        }

        for (int i = square-1; i >= 0; i--) {
            if(set.contains(i) && set.contains(square - i)){
                int a= (int)Math.sqrt(i);
                int b = (int)Math.sqrt(square- i);
                System.out.println((x-a) + " "+ (y-b));
                return;
            }
        }
        System.out.println("erorr");
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