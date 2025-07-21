import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[][] arr=new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        boolean ans=f(arr);
        String r=ans?"YES":"NO";
        System.out.println(r);
    }
    private static boolean f(int[][] arr){
        int n= arr.length;
            int x, y, z;
            x=y=z=0;
        for (int i = 0; i < n; i++) {
            x+=arr[i][0];
            y+=arr[i][1];
            z+=arr[i][2];
        }
        return x == 0 && y == 0 && z == 0;
    }
}
