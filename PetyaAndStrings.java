import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        int ans=solve(a, b);
        System.out.println(ans);

        sc.close();
    }

    static int solve(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();

        int i=0;
        while(i<a.length()){
            int first=a.charAt(i);
            int second=b.charAt(i);

            if(first>second)
                return 1;
            else if(first <second)
                return -1;
            i++;
        }
        return 0;
    }
}