import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if((double) a <= (double) b/m){
            System.out.println(n*a);
        }else{
            int x=(n/m); //2
            int p1=x*b;
            int ans1= (n - (x*m))*a+p1;
            int ans2= ((n/m)+1)*b;
//            System.out.println(ans1+ " "+ ans2);
            int ans=Math.min(ans1, ans2);
            System.out.println(ans);
        }
    }
}
