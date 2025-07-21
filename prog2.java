import java.util.*;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
//        String n="10000000";
        boolean ans=dan(n);
        if(ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    private static boolean dan(String str){
        int n=str.length();
        if (n < 7) {
            return false;
        }
        for (int i = 0; i <=n-7; i++) {
            char ch=str.charAt(i);
                int c=0;
            for (int j = 0; j < 7; j++) {
                if(str.charAt(i+j) == ch ){
                    c++;
                }else{
                    break;
                }
            }
            if(c >= 7)
                return true;
        }
        return false;
    }
}
