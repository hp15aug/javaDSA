import java.util.*;

public class BachGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(n/2);
        solve(n);
    }
    public static void solve(int n){
        int noOfTwo=(n%2 == 0)? n/2: (n/2) -1;
            for (int i = 0; i < noOfTwo; i++) {
                System.out.print("2"+ " ");
            }
            if(n%2 == 1)
                System.out.print("3");
    }
}