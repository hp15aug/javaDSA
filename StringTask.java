import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String ans=f(str);
        System.out.println(ans);
    }

    private static String f(String str){
        int n=str.length();
        str=str.toLowerCase();
        StringBuilder ans= new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'o' || ch == 'y' || ch=='e' || ch=='i' || ch=='u')
                ans.append("");
            else
                ans.append(".").append(ch);
        }
        return ans.toString();
    }
}
