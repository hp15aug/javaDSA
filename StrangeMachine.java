import java.util.*;

public class StrangeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            System.out.println(simulate(a, s));
        }
    }

    private static int simulate(int a, String s) {
        int n = s.length();
        int seconds = 0;
        int pos = 0;

        while(a != 0) {
            char machine = s.charAt(pos);
            if(machine == 'A') {
                a--;
            } else { // machine == 'B'
                a = a / 2;
            }
            pos = (pos + 1) % n;
            seconds++;
        }

        return seconds;
    }
}