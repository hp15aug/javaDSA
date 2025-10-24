import java.util.*;

public class PizzaTime {
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
//        System.out.println(n);
        if(n%2 == 0)
            System.out.println((n/2) -1);
        else
            System.out.println((n-1)/2);
    }
}