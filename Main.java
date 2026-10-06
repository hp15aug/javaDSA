import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt(); // Multiple test cases
        // while(t-- > 0) {
        solve(sc);
        // }

        sc.close();
    }

    static void solve(Scanner sc) {
        ArrayList<Integer> array = new ArrayList<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) break;
            array.add(n);
        }
        int len = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0 && i + 1 < array.size() && array.get(i + 1) % 2 != 0) {
                continue;
            }
            array.set(len++, array.get(i));
        }
        for (int i = 0; i < len; i++) {
            System.out.println(array.get(i));
        }
    }
}