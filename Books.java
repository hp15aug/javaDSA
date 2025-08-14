import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        solve(arr, t);

        sc.close();
    }

    static void solve(int[] arr, int t) {
        int l=0;
        int r=0;
        int sum=0;
        int max=0;

        while (r<arr.length){
            sum+=arr[r];
            while (sum > t) {
                sum-=arr[l];
                l++;
            }
            max=Math.max(max, sum);
            r++;
        }
        System.out.println(max);
    }
}