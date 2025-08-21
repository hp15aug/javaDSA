import java.util.*;

public class Homework {
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
        String a=sc.next();
        int m=sc.nextInt();
        String b=sc.next();
        String c=sc.next();

        for (int i = 0; i < m; i++) {
            if (c.charAt(i) == 'D') {
                a = a + b.charAt(i);
            } else
                a = b.charAt(i) + a;
        }
        System.out.println(a);
    }
}