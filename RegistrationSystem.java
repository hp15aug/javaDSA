import java.util.*;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        solve(sc, n);
        sc.close();
    }

    static void solve(Scanner sc, int n) {
        HashMap<String, Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            int c=0;
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
                System.out.println(s+hm.get(s));
            }else{
                hm.put(s, 0);
                System.out.println("OK");
            }
        }
    }
}