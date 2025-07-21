import java.util.Scanner;

public class NotPalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for (int i = 0; i < z; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String str=sc.next();
            boolean ans=f(str, k);
            String r=ans?"YES":"NO";
            System.out.println(r);
        }

    }

    private static boolean f(String str,int k){
        int n=str.length();
        if(palin(str) && k==0)
            return false;
        if(palin(str) && k==n/2)
            return true;

        int good=0;
        int i=0;int j=n-1;
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                good++;
            }
            i++;
            j--;
        }
        int pairs=n/2;
        int bad=pairs-good;

            int r=k%2;
        if(pairs%2 == 1){
            if(r == bad%2)
                return false;
            else
                return true;
        }else{
            if(r == (bad%2))
                return true;
            else
                return false;
        }
    }
    private static boolean palin(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
