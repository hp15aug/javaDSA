import java.util.*;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str=sc.next();
        String ans="";
        int n=str.length();
        for (int i = 0; i < n; i++) {
            if( i+1 <n && str.charAt(i) == '-' && str.charAt(i+1) == '-'){
                ans+="2";i++;
            }else if(i+1 <n && str.charAt(i) == '-' && str.charAt(i+1) == '.') {
                ans += "1";i++;
            }else if(str.charAt(i) == '.')
                ans+="0";
        }
        System.out.println(ans);

        sc.close();
    }
}