import java.util.*;
import java.io.*;

public class Morning {
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
        String s= next();
        char[] arr = s.toCharArray(); // 8 5 4 3 

        int count = 0;
        int curr = 1;

        int i=0;
        while(i< arr.length){
            int digit =arr[i] - '0';

            if( digit == curr){
                if(digit == 0){
                    count++;
                    curr = 10;
                    i++;
                }else{
                    count++;
                    i++;
                }
            }else{
                count += (digit == 0) ? 10 - curr : Math.abs(digit - curr);
                curr = digit;
            }
        }

        System.out.println(count);
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