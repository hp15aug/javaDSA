import java.util.*;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(); int x=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n+1];
        arr[0]=x;
        for (int i = 1; i <= n; i++) {
            String str=sc.nextLine();
            arr[i]=value(str);
        }
//        System.out.println(Arrays.toString(arr));
        long[] ans=solve(arr);
        System.out.println(ans[0]+ " "+ ans[1]);
        sc.close();
    }

    static int value(String str) {
        int a = Integer.parseInt(str.replaceAll("\\s+", ""));
        return a;
    }

    static long[] solve(int[] arr){
        long[] ans={-1,-1};
        long x=arr[0];
        int c=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>0){
                x+=arr[i];
            }else{
                if(x >= Math.abs(arr[i])){
                    x+=arr[i];
                }else{
                    c++;
                }
            }
        }
        ans[0]=x;
        ans[1]=c;
        return ans;
    }
}