import java.util.*;

public class Sereja {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] narr=new int[n];
        for (int i = 0; i < n; i++) {
            narr[i]=sc.nextInt();
        }
        int[] marr=new int[m];
        for (int i = 0; i < m; i++) {
            marr[i] = sc.nextInt();
        }
        int[] suffixDistinct = preprocess(narr);
        System.out.println(Arrays.toString(suffixDistinct));

        for (int i = 0; i < m; i++) {
            System.out.println(suffixDistinct[marr[i]-1]);
        }
        sc.close();
    }
    private static int[] preprocess(int[]arr){
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        int[] ans=new int[n];

        int c=0;
        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}
