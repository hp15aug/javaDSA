import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        String ans=solve(s);
        System.out.println(ans);
    }

    static String solve(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            list.add(s.charAt(i) - '0');
            i+=2;
        }
        Collections.sort(list);
//        System.out.println(Arrays.toString(list.toArray()));
        String ans="";
        for (int j = 0; j < list.size(); j++) {
            ans+=list.get(j)+ "+";
        }
        ans=ans.substring(0,ans.length()-1);
        return ans;
    }

}