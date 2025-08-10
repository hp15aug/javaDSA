import java.util.*;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(solve(arr, n));

        sc.close();
    }

    static long solve(int[] arr, int n) {
        long c=arr[0] - 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                c+=(n-arr[i-1]+ arr[i]);
            }else if(arr[i] > arr[i-1])
                c+=arr[i]-arr[i-1];
        }
        return c;
    }
}