import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(solve(a,b));

        sc.close();
    }

    static int solve(int a, int b) {
        int c=0;
        while(a<=b){
            a=a*3;
            b=b*2;
            c++;
        }
        return c;
    }
}