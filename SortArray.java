import java.util.*;
import java.io.*;

public class SortArray {
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
        int n = nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=nextInt();
        }

        int l=-1;
        int r=-1;

        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i+1]){
                l=i;
                break;
            }
        }

        if(l == -1){
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        for (int i = n-1; i >0 ; i--) {
            if(arr[i] < arr[i-1]){
                r=i;
                break;
            }
        }

        rev(arr, l, r);

        if(isSorted(arr)){
            System.out.println("yes");
            System.out.println((l+1)+ " "+ (r+1));
        }else{
            System.out.println("no");
        }
    }

    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    static void rev(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
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