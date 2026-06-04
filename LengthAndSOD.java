import java.util.*;
import java.io.*;

public class LengthAndSOD {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = nextInt(); // Uncomment for multiple test cases

        while(t-- > 0) {
            solve();
        }

        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int m = nextInt();
        int s = nextInt();

        findMin(m, s);
        findMax(m, s);
    }

    static void findMax(int m, int n){
        if((n==0 && m>1) || n>9*m){
            System.out.print("-1 ");
            return;
        }

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < m; i++) {
            int digit=Math.min(9, n);
            sb.append(digit);
            n-=digit;
        }
        System.out.println(sb);
    }

    static void findMin(int m, int n){
        if((n==0 && m>1) || n>9*m){
            System.out.print("-1 ");
            return;
        }

        if(n==0 && m==1){
            System.out.print("0 ");
            return;
        }

        int[] digits=new int[m];
        n--;

        for (int i=m-1; i> 0 ; i--){
            digits[i]=Math.min(9,n);
            n-=digits[i];
        }

        digits[0]=n+1;

        StringBuilder min = new StringBuilder();
        for (int d : digits) {
            min.append(d);
        }
        System.out.print(min+ " ");
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