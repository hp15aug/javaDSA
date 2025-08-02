import java.util.*;

public class Panoramix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int i=sc.nextInt();
         int n=sc.nextInt();

         if(!isPrime(i) ||  !isPrime(n)) {
             System.out.println("NO");
             return;
         }

         ArrayList<Integer> res=getPrimes(i, n);

         if(res.size() == 2 && res.getFirst() == i)
             System.out.println("YES");
         else
             System.out.println("NO");
        sc.close();
    }

    static ArrayList<Integer> getPrimes(int i, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num = i; num <= n; num++) {
            if (isPrime(num)) {
                list.add(num);
            }
        }
//        System.out.println(list);
        return list;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0)
                return false;
        }

        return true;
    }
}