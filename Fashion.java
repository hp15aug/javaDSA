import java.util.Arrays;
import java.util.Scanner;

public class Fashion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        for (int z = 0; z < k; z++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans1 = fas1(arr);
            int ans2 = fas2(arr);
            System.out.println(Math.min(ans1, ans2));
        }
    }
    private static int fas1(int[] arr){
        int n=arr.length;
        int max=arr[n-1];
        int min=arr[0];

        if((min+max) %2 ==0)
            return 0;

        int c=1;
        int r=min%2;
        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 == r) {
                c++;
            }else{
                break;
            }
        }
        return c;
    }
    private static int fas2(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return fas1(arr);
    }
}
