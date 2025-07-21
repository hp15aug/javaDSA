import java.io.*;
import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);

        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }

        int ans = solve(n, k, arr);
        System.out.println(ans);
    }

    public static int solve(int n, int k, int[] arr) {
        k = k - 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[k] && arr[i] > 0)
                count++;
        }

        return count;
    }
}