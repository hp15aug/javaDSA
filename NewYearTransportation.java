import java.util.*;

public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 1; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        solve(arr, t);

        sc.close();
    }

    static void solve(int[] arr, int t) {

        int c=1;
        int i=1;
        while (i<arr.length){
            if(t == i){
                System.out.println("YES");
                return;
            }
            i+=arr[i];
        }
        if(i == t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}