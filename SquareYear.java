import java.util.Scanner;

public class SquareYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str=sc.next();
            int[] ans=f(str);
            if(ans[0] == -1 && ans[1] == -1)
                System.out.println("-1");
            else
                System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
    private static int[] f(String str){
        int n=Integer.parseInt(str);
        char[] ch=str.toCharArray(); //[4,9,0,0]

        double sq=Math.sqrt(n);
        int ans[]={-1,-1};
        if(sq != (int)sq)
            return ans;

        ans[0]=0;
        ans[1]=(int)sq;

        return ans;
    }
}
