import java.util.*;
import java.io.*;

public class OddEvenIncrements {
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

        boolean oddOne, evenOne, oddTwo, evenTwo;
        oddOne = evenOne =  oddTwo = evenTwo = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextInt();
            if(i%2 == 1){
                if(arr[i] % 2 == 0){
                    evenOne = true;
                }else{
                    oddOne = true;
                }
            }else{
                if(arr[i] % 2 == 0){
                    evenTwo = true;
                }else{
                    oddTwo = true;
                }
            }
        }
        if((oddOne && evenOne) || (oddTwo && evenTwo)){
            out.println("NO");
        }else{
            out.println("YES");
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