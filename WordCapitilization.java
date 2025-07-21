import java.util.*;

public class WordCapitilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        String ans=solve(s);
        System.out.println(ans);

        sc.close();
    }

    static String solve(String s) {
        String ans="";
        ans+=s.substring(0,1).toUpperCase();
        ans+=s.substring(1);
        return ans;
    }
}