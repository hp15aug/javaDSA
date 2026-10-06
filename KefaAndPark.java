import java.util.*;
import java.io.*;

public class KefaAndPark {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = nextInt(); // Uncomment for multiple test cases

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        int m = nextInt();

        int[] cats = new int[n];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = nextInt();
        }

        int[][] edges = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            edges[i][0] = nextInt();
            edges[i][1] = nextInt();
        }

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(new Pair(v, cats[v - 1]));
            adj.get(v).add(new Pair(u, cats[u - 1]));
        }

        Queue<int[]> q = new LinkedList<>(); // node, consecutive cats
        q.add(new int[] { 1, cats[0] });

        boolean[] vis = new boolean[n + 1];
        vis[1] = true;

        int ans = 0;

        while (!q.isEmpty()) {
            int[] p = q.poll();
            int node = p[0];
            int cons = p[1];

            if (node != 1 && adj.get(node).size() == 1) {
                ans++;
            }

            for (Pair nei : adj.get(node)) {
                int adjNode = nei.f;
                int isCat = nei.s;

                if (vis[adjNode])
                    continue;

                if (isCat == 1 && isCat + cons <= m) {
                    vis[adjNode] = true;
                    q.add(new int[] { adjNode, isCat + cons });
                } else if (isCat == 0) { // FIX: only reset when no cat
                    vis[adjNode] = true;
                    q.add(new int[] { adjNode, 0 });
                }
            }
        }

        System.out.println(ans);
    }

    static class Pair {
        int f, s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }

    // Fast I/O methods
    static String next() throws Exception {
        while (st == null || !st.hasMoreElements()) {
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