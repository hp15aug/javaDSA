import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Pair> list=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        list.sort(Comparator.comparingInt(m -> m.f));

        for(Pair pair: list){
            if(pair.f < s){
                s+=pair.s;
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

class Pair{
    int f; int s;
    Pair(int f, int s){
        this.f=f;
        this.s=s;
    }
}