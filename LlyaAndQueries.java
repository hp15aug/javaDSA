import java.util.*;
import java.io.*;

public class LlyaAndQueries {
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
        String str= next();

        int n=str.length();
        int[] arr=new int[n];
        int[] pre=new int[n];
        int curr=0;
        for (int i = 1; i < n; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                arr[i]=1;
            }
            curr+=arr[i];
            pre[i]=curr;
        }
//            System.out.println(Arrays.toString(pre));


        int nn=nextInt();
        for (int i = 0; i < nn; i++) {
            int a=nextInt();
            int b=nextInt();
            System.out.println(pre[b-1]-pre[a-1]);
        }
    }

    static int f(String s){
        int c=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)== s.charAt(i+1))
                c++;
        }
        return c;
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