import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        boolean ans=f(n);
        String r=ans?"YES":"NO";
        System.out.println(r);
    }

    private static boolean f(int n){
        if(lucky(n))
            return true;

        ArrayList<Integer> list=gen(n);
        for (int i = 0; i < list.size(); i++) {
            if(n%list.get(i) == 0)
                return true;
        }
        return false;
    }
    private static ArrayList<Integer> gen(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(lucky(i))
                list.add(i);
        }
        return list;
    }

    private static boolean lucky(int n){
        while(n!=0){
            int r=n%10;
            if(r == 7 || r ==4)
                n/=10;
            else
                return false;
        }
        return true;
    }
}
