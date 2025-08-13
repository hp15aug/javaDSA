import java.util.*;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int ans=f(n);
        System.out.println(ans);

        sc.close();
    }

    static int f(int n){
        if(n <= 1)
            return n;
        int pow=prevPowerOfTwo(n);

        int rem= (n^pow);
        return 1+f(rem);
    }

    static int prevPowerOfTwo(int n) {
        if (n < 1) return 0;  // No power of 2 for non-positive numbers
        int p = 1;
        while (p <= n) {
            p <<= 1;
        }
        return p >> 1;
    }
}