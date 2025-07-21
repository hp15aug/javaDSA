import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String out=f(str);
        System.out.println(out);
    }
    private static String f(String str){
        String ans="";

        if(isAllCaps(str))
            return str.toLowerCase();

        if(isFirstCap(str)){
            str=str.toLowerCase().substring(1);
            ans=""+Character.toUpperCase(str.charAt(0));
            System.out.println(ans);
            ans+=str;
            return ans;
        }
        return str;
    }
    private static boolean isAllCaps(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if(ch >= 'a' && ch <= 'z' ){
                return false;
            }
        }
        return true;
    }

    private static boolean isFirstCap(String str){
        char fi=str.charAt(0);
        if(fi>='A' && fi<='Z')
            return false;

        for (int i = 1; i < str.length();i++) {
            char ch= str.charAt(i);
            if(ch >= 'a' && ch <= 'z' ){
                return false;
            }
        }
        return true;
    }
}
