import java.util.*;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean found = false;

            for (int mask = 0; mask < Math.pow(2, n); mask++) {
                List<Integer> indices = new ArrayList<>();
                StringBuilder p = new StringBuilder();
                StringBuilder x = new StringBuilder();

                for (int i = 0; i < n; i++) {
                    if ((mask & (int) Math.pow(2, i)) != 0) {
                        p.append(s.charAt(i));
                        indices.add(i + 1);
                    } else {
                        x.append(s.charAt(i));
                    }
                }

                if (isNonDecreasing(p.toString()) && isPalindrome(x.toString())) {
                    System.out.println(indices.size());
                    if (!indices.isEmpty()) {
                        for (int i = 0; i < indices.size(); i++) {
                            if (i > 0) System.out.print(" ");
                            System.out.print(indices.get(i));
                        }
                        System.out.println();
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        sc.close();
    }

    static boolean isNonDecreasing(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}