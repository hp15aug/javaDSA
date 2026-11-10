import java.util.*;
import java.io.*;

public class FallDown {
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
        int m = nextInt();
        int n = nextInt();

        String[] temp = new String[m];

        for (int i = 0; i < m; i++) {
            temp[i] = next();
        }

        char[][] grid = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[j][i] = temp[i].charAt(j);
            }
        }

        f(grid);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out.print(grid[j][i]);
            }
            out.println();
        }

    }
    private static void f(char[][] grid){
        int n = grid[0].length - 1;
        int l = n; 
        int r = n;
        for (int i = 0; i < grid.length; i++) {
            r = n;
            l = n;
            while(r>=0 && l>=0){
                if(grid[i][l] == 'o'){
                    l--;
                    r=l;
                }else if(grid[i][l] == '.'){
                    l--;
                }else if(grid[i][l] == '*'){
                    swap(grid[i], l, r);
                    r--;
                    l--;
                }
            }
        }
    }
    private static void swap(char[] arr, int l, int r){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
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