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
    private static int f(int[] arr){
        int c=0;
        for (int j : arr) {
            c += j;
        }
//        System.out.println(c);
        if(c%4 == 0){
            return c/4;
        }else{
            return (c/4)+1;
        }
    }
}
