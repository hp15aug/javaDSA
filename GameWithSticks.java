import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int min=Math.min(n,m);

        if(min%2 == 0)
            System.out.println("Malvika");
        else
            System.out.println("Akshat");

        sc.close();
    }
}