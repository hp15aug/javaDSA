import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=(chew(n));
        System.out.println(ans);
    }
    private static long chew(long n){
        long ans=0;
        long c=0;
        n=rev(n);
        while(n!=0){
            if(c == 0 && n%10 == 9){
                c++;
                ans=9;
                n=n/10;
                continue;
            }
            long r=n%10;
            if(r>=5){
                ans=ans*10+(9-r);
            }else{
                ans=ans*10+r;
            }
            c++;
            n/=10;
        }
        return ans;
    }
    private static long rev(long n){
        long ans=0;
        while(n!=0){
            long r=n%10;
            ans=ans*10+r;
            n/=10;
        }
        return ans;
    }
}
