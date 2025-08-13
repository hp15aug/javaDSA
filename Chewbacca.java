import java.util.*;

public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // Works for numbers that fit in long

        long ans = 0;
        long place = 1;

        // Save the first digit separately (we'll process last)
        long temp = n;
        while (temp >= 10) {
            long digit = temp % 10;
            if (digit > 4) {
                digit = 9 - digit;
            }
            ans += digit * place;
            place *= 10;
            temp /= 10;
        }

        // Now temp is the first digit
        if (temp != 9 && temp > 4) {
            temp = 9 - temp;
        }
        ans += temp * place;

        System.out.println(ans);
    }
}
