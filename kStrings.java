import java.util.*;

public class kStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();

        solve(s, n);

        sc.close();
    }

    static void solve(String s, int n) {
        int[] ch=new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
        }
//        System.out.println(Arrays.toString(ch));
        String ans="";
        for (int i = 0; i < 26; i++) {
            if(ch[i]> 0){
                if(ch[i]%n == 0){
                    for (int j = 0; j < ch[i] / n; j++) {
                        ans += (char) (i + 97);
                    }
                        ch[i]--;
                }else{
                    System.out.println("-1");
                    return;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans);
        }

    }
}