
import java.util.Scanner;

public class RoutineProblem {

    // Calculates GCD to simplify the fraction.
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        long screenVal=a*d;
        long movieVal=b*c;

        long num, den;
        if (screenVal > movieVal) {
            num=screenVal-movieVal;
            den=screenVal;
        } else if (screenVal < movieVal) {
            num=movieVal-screenVal;
            den=movieVal;
        }else{
            System.out.println("0/1");
            return;
        }
        long common=gcd(num, den);
        System.out.println((num/common)+ "/" + (den/common));
    }
}