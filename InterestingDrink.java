import java.util.*;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int q=sc.nextInt();
        int []b=new int[q];
        for (int i = 0; i < q; i++) {
            b[i]=sc.nextInt();
        }
        solve(arr, b);
        sc.close();
    }

    static int bs(int[] arr, int n){
        int s=0;
        int e=arr.length;

        while (s<e){
            int mid=(s+e)/2;
            if(arr[mid] <= n)
                s=mid+1;
            else
                e=mid;
        }
        return s-1;
    }

    static void solve(int[] a, int[] b) {
        int ans[]=new int[b.length];

        for (int i = 0; i < b.length; i++) {
            System.out.println(bs(a, b[i] )+1);
        }

        return;
    }
}