import java.util.*;
import java.io.*;

public class NotPrint {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt(); // Uncomment for multiple test cases

        // 122223
        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        String s = next();

        Deque<Integer> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int num = i + 1;

            if (ch == '1') {
                q.addFirst(num);
            } else if (ch == '2') {
                if (!q.isEmpty()) {
                    q.removeFirst();
                    list.add(num);
                }
            }
        }

        for (int it : q) {
            list.add(it);
        }
        Collections.sort(list);

        out.println(list.size());

        for (Integer integer : list) {
            out.print(integer + " ");
        }
        out.println();
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