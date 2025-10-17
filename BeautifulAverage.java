import java.util.*;

public class BeautifulAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt(); // Multiple test cases
         while(t-- > 0) {
        solve(sc);
         }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        f(arr);
    }
    static void f(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i], max);
        }
        System.out.println(max);
    }
}