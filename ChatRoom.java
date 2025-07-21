import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.nextLine();
        boolean ans=f(str);
        String r=ans?"YES":"NO";
        System.out.println(r);
    }
    private static boolean f(String a){
        a = a.toLowerCase();
        String b="hello";
        int i=0, j=0;
        while(i< a.length() && j<b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j == b.length();
    }
}
