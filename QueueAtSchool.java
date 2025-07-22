import java.util.*;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();

        String s=sc.next();


        System.out.println(solve(s, t));

        sc.close();
    }

    static String solve(String s, int t) {
        int n=s.length();
        char ch[]=s.toCharArray();
        while(t-- >0){
            for (int i = 0; i < n-1; i++) {
                if(ch[i] == 'B' && ch[i+1] == 'G'){
                    swap(ch, i, i+1);
                    i++;
                }
            }
        }
        return new String(ch);
    }
    static void swap(char[] ch, int i, int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}