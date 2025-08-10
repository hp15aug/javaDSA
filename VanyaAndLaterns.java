import java.util.*;

public class VanyaAndLaterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int l=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        double ans=f(arr, l);
        System.out.println(ans);
        sc.close();
    }

    private static double f(int[]arr, int n){
        Arrays.sort(arr);
        double max=Math.max(arr[0], n-arr[arr.length-1] );

        for (int i = 0; i < arr.length-1; i++) {
            double d=arr[i+1]-arr[i];
            max=Math.max(max, d/2);
        }
        return max;
    }
}