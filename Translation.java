import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        String t=sc.next();

        if(reverse(s).equals(t))
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }

    static String reverse(String s) {
        String ans="";
        for(int i=s.length()-1; i>=0; i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
}