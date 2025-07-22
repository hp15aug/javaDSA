import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        int avg=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.println(solve(arr, avg));

        sc.close();
    }
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static int solve(int[] arr, int avg) {

        avg=avg/2;
//        System.out.println(avg);
        int c=1;
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
            if(s<= avg){
                c++;
            }else{
                break;
            }
        }
//        System.out.println(s);

        return c;
    }
}