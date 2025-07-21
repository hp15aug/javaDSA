import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        int ans=solve(s);
        if(ans == 1)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }

    static int solve(String s) {
        s=s.toLowerCase();
        int[] ch =new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            ch[c-'a']=1;
        }
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==1)
                count++;
        }

        if(count %2 == 0)
            return 1;
        else
            return -1;
    }
}