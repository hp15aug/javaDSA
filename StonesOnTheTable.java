import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(solve(s));
    }

    static int solve(String s) {
        int c=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1))
                c++;
        }
        return c;
    }
}