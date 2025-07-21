import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=f(a, b, c);
        System.out.println(ans);
    }
    private static int f(int a, int b, int c){
        int s1=a*b*c;
        int s2=a+b+c;
        int s3=a+b*c;
        int s4=a*b+c;
        int s5=(a+b)*c;
        int s6=a*(b+c);

        return Math.max(s1, Math.max(s2, Math.max(s3, Math.max(s4, Math.max(s5, s6)))));
    }
}
