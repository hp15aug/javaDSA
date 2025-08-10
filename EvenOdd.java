import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n=sc.nextLong();
        long t=sc.nextLong();

        long mid=(n+1)/2;

        if(t <= mid){
                System.out.println(2*t-1);
        }else{
                System.out.println(2*(t-mid));
        }
    }
}