import java.util.*;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Multiple test cases
        ArrayList<Pair> pairs=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        pairs.sort(Comparator.comparingInt(a -> a.f));

        for (int i = 0; i < n-1; i++) {
            int cur=pairs.get(i).s;
            int next=pairs.get(i+1).s;

            if(cur > next){
        System.out.println("Happy Alex");
                return;
            }
        }

                System.out.println("Poor Alex");

        sc.close();
    }
}

class Pair{
    int f; int s;
    Pair(int f, int s){
        this.f=f;
        this.s=s;
    }
}