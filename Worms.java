import java.util.*;
public class Worms {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int s=0;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            s+=x;
            arr[i]=s;
        }
//        System.out.println(Arrays.toString(arr));
        int x=sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a=sc.nextInt();
            solve(arr, a);
        }
    }
    public static void solve(int[] arr, int k){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid=(s+e)/2;

            if(k <= arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        System.out.println(s+1);
    }
}
