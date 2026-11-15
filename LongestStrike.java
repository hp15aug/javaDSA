import java.util.*;
import java.io.*;

public class LongestStrike {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = nextInt(); // Uncomment for multiple test cases

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int n = nextInt();
        int k = nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextInt();
        }

        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= k) {
                set.add(entry.getKey());
            }
        }

        // 1 2 4 5 6
        int max = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int curr = 1;

                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    curr += 1;
                }

                if (curr > max) {
                    max = curr;
                    bestStart = num;
                    bestEnd = currNum;
                }
            }
        }

        if(max == 0)
            out.println("-1");
        else
            out.println(bestStart + " " + bestEnd);

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