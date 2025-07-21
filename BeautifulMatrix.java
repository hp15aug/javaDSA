import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

//        int[][] matrix = {
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 1, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0}
//        };

        int ans=solve(arr);
        System.out.println(ans);
    }

    static int solve(int[][] arr) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] ==1){
                    int m=Math.abs(2-i);
                    int n=Math.abs(2-j);
                    return m+n;
                }
            }
        }
        return 0;
    }
}