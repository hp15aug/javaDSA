import java.util.*;

public class BersuBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        if(n > m)
            System.out.println(solve(b, a));
        else
            System.out.println(solve(a,b));

        sc.close();
    }
    private static int solve(int[] a, int[] b){
        int c=0;
        boolean []used=new boolean[b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(!used[j] && Math.abs(a[i]-b[j]) <= 1){
                    c++;
                    used[j]=true;
                    break;
                }
            }
        }
        return c;
    }
}