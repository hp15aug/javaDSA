import java.util.*;
import java.io.*;

public class Rumor {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = nextInt(); // Uncomment for multiple test cases

        while(t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int n = nextInt();
        int m = nextInt();

        int[] wt = new int[n+1];
        for (int i = 1; i < wt.length; i++) {
            wt[i] = nextInt();
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges = new int[m][2];
        for (int i = 0; i < edges.length; i++) {
            edges[i][0] = nextInt();
            edges[i][1] = nextInt();
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean [] visited= new boolean[n+1];
        visited[0]=true;

        long tot=0;
        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                min = (int)1e9;
                int c = dfs(i, adj, visited, wt);
                tot+=c;
            }
        }
        System.out.println(tot);
    }
        static int min=(int)1e9;
    private static int dfs(int node, List<List<Integer>> adj, boolean[] visited, int[] wt){

        visited[node] = true;
        min = Math.min(min, wt[node]);

        for(Integer nei: adj.get(node)){
            if(visited[nei])
                continue;

            dfs(nei, adj, visited, wt);
        }

        return min;
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