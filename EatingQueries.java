import java.util.*;
import java.io.*;

public class EatingQueries {
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
        int q = nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextInt();
        }

        Arrays.sort(arr);
        // 1 1 3 3 4 4 5 9

        int[] sum = new int[n];
        int temp = 0;
        for (int i = n-1; i >= 0; i--) {
            temp+=arr[i];
            sum[i] = temp;
        }
        
        for (int i = 0; i < q; i++) {
            int t = nextInt();
            int te = bs(sum, t);
            int ans = te == -1?  -1 : n- te;
            out.println(ans);
        }
    }

    static int bs(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == target){
                return m;
            }
            if(arr[m] > target){
                ans = m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
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