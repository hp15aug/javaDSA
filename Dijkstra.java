import java.util.*;
import java.io.*;

class Edge{
    int to;
    long weight;
    Edge(int to, long weight){
        this.to=to;
        this.weight=weight;
    }
}

class Node implements Comparable<Node>{
    int id;
    long dist;

    Node(int id, long dist){
        this.id=id;
        this.dist=dist;
    }

    @Override
    public int compareTo(Node other){
        return Long.compare(this.dist, other.dist);
    }
}

public class Dijkstra {
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
    int m = nextInt();

    List<List<Edge>> adj=new ArrayList<>();
    for (int i = 0; i <= n; i++) {
        adj.add(new ArrayList<>());
    }

    for (int i = 0; i < m; i++) {
        int u=nextInt();
        int v=nextInt();
        long w=nextLong();
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }

    long[] dist=new long[n+1];
    Arrays.fill(dist, Long.MAX_VALUE);

    int[] parent=new int[n+1];
    Arrays.fill(parent, -1);

    PriorityQueue<Node> pq=new PriorityQueue<>();

    dist[1]=0;
    pq.add(new Node(1, 0));

    while (!pq.isEmpty()) {
        Node curr=pq.poll();
        int u=curr.id;
        long d=curr.dist;

        if(d> dist[u])
            continue;

        for (Edge edge: adj.get(u)){
            int v=edge.to;
            long weight=edge.weight;

            if(dist[u]+weight < dist[v]){
                dist[v]=dist[u]+weight;
                parent[v]=u;
                pq.add(new Node(v, dist[v]));
            }
        }
    }

    if(dist[n] == Long.MAX_VALUE)
        out.println("-1");
    else {
        List<Integer> path=new ArrayList<>();
        for(int curr=n; curr != -1; curr = parent[curr]){
            path.add(curr);
        }

        Collections.reverse(path);

        for (int i = 0; i < path.size(); i++) {
            out.print(path.get(i)+ (i==path.size() - 1 ? "": " "));
        }
        out.println();
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