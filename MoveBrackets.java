import java.util.*;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt(); // Multiple test cases
         while(t-- > 0) {
            solve(sc);
         }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s=sc.next();

        int c=0;
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')')
                c--;
            else
                c++;

            if(c < 0){
                ans++;
                c=0;
            }
        }
        System.out.println(ans);
    }
}