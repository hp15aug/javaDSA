import java.util.*;

public class Airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt(); // Multiple test cases
         int m=sc.nextInt();
         int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=solve(arr, n);
        System.out.println(ans[0]+ " "+ ans[1]);

        sc.close();
    }

    static int[] solve(int[] arr, int n) {
        return new int[]{-1,-1};
    }

}