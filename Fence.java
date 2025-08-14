import java.util.*;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] h=new int[n];
        for (int i = 0; i < n; i++) {
            h[i]=sc.nextInt();
        }

        solve(h, k);

        sc.close();
    }

    private static void solve(int[] arr, int k){
        int sum=0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int min=sum;
        int minIndex=0;

        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            if(sum < min){
                min=sum;
                minIndex=i-k+1;
            }
        }
        System.out.println(minIndex+1);
    }
}