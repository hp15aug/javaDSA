import java.util.*;

public class SameDifferences {
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
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Long> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key=arr[i]-(i+1);
            hm.put(key, hm.getOrDefault(key, 0L)+1);
        }
        long c=0;
        for(long i: hm.values()){
            c+=i*(i-1)/2;
        }
        System.out.println(c);
    }
}