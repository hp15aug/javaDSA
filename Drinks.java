import java.util.*;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        double ans=0;
        for (int i = 0; i < n; i++) {
            double p=sc.nextDouble();
            ans+=p;
        }
        System.out.println(ans/n);

        sc.close();
    }
}