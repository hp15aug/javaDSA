import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(f(arr));
    }
    public static int f(int[] arr){
        Arrays.sort(arr);
        int i=0; int j=arr.length-1;
        int c=0;
        if(j==0) return 1; // Fixed: when there's only one group

        while(i<=j){
            int cap=4;
            if(cap >= arr[j]){
                cap-=arr[j];
                j--;
            }
            while(i<=j && cap>=arr[i]){
                cap-=arr[i];
                i++;
            }
            c++;
        }
        return c;
    }
}