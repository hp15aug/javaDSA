import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        HashMap<String, Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        int max=0;
        String maxKey=null;
        for(Map.Entry<String, Integer> map: hm.entrySet()){
            if(max < map.getValue()) {
                max = map.getValue();
                maxKey = map.getKey();
            }
        }
        System.out.println(maxKey);

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        System.out.println(n);
    }
}