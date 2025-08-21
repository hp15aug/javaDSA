import java.util.*;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int t = sc.nextInt(); // Multiple test cases
         while(t-- > 0) {
        solve(sc);
         }

        sc.close();
    }

    static void solve(Scanner sc) {
        long n=sc.nextLong();
        long c=0;
        ArrayList<Long> ans=new ArrayList<>();

        long pow = 10;
        for (int i = 1; i <= 18; i++) {
            long divisor = 1 + pow;
            if (n % divisor == 0) {
                c++;
                ans.add(n / divisor);
            }
            pow *= 10;
        }
        Collections.sort(ans);

        System.out.println(c);
        if(c>0){
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
                System.out.println();
        }
    }
}