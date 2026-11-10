import java.util.*;
import java.io.*;

public class EatingCandles {
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
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        int i =0 ;
        int j = n-1;

        int count = 0;
        int ls = arr[i];
        int rs = arr[j];
        int rini = n;
        int lini = -1;

        while(i<j){
            if(ls > rs){
                j--;
                rs+=arr[j];
            }else if(rs > ls){
                i++;
                ls+=arr[i];
            }else{
                count += (i - lini) + (rini - j);
                rini = j;
                lini = i;
                i++;
                j--;

                if(i<j){
                    ls += arr[i];
                    rs += arr[j];
                }
            }
        }
        out.println(count);
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