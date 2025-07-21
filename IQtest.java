import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=f(arr);
        System.out.println(ans);
    }
    private static int f(int [] arr){
        int n=arr.length;
        int r=arr[0]%2;
        int ind=-1, c=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]%2 != r){
                c++;
                ind=i;
            }
        }
        if(c>1)
            return 1;
        else
            return ind+1;
    }
}
