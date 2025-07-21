import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=f(arr);
        System.out.println(ans);
    }
    private static int f(int[][] arr){
        int s=0;
        for (int[] ints : arr) {
            int c = 0;
            for (int j = 0; j < 3; j++) {
                if (ints[j] == 1)
                    c++;
            }
            if (c >= 2) s++;
        }
        return s;
    }
}
