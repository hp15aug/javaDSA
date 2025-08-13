import java.util.*;

public class kthNotDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Choose which solution to use
//            long ans = solution1_optimal(n, k);
            // long ans = solution2_binary_search(n, k);
             long ans = solution3_iterative(n, k);
            // long ans = solution4_recursive(n, k);
            // long ans = solution5_mathematical_blocks(n, k);

            System.out.println(ans);
        }

        sc.close();
    }

    // Solution 1: Direct Mathematical Formula - O(1)
    static long solution1_optimal(int n, int k) {
        return k + (long)(k - 1) / (n - 1);
    }

    // Solution 2: Binary Search Approach - O(log k)
    static long solution2_binary_search(int n, int k) {
        long left = 1, right = (long)k * n;

        while (left < right) {
            long mid = left + (right - left) / 2;
            // Count how many numbers <= mid are NOT divisible by n
            long count = mid - mid / n;

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Solution 3: Iterative Approach - O(k/n) average case
    static long solution3_iterative(int n, int k) {
        long num = 0;
        int count = 0;

        while (count < k) {
            num++;
            if (num % n != 0) {
                count++;
            }
        }

        return num;
    }

    // Solution 4: Recursive Approach - O(log(k/n))
    static long solution4_recursive(int n, int k) {
        return recursiveHelper(n, k);
    }

    static long recursiveHelper(int n, long k) {
        if (k < n) {
            return k;
        }

        // How many complete blocks of (n-1) numbers?
        long blocks = k / (n - 1);
        long remainder = k % (n - 1);

        if (remainder == 0) {
            return blocks * n - 1;
        } else {
            return blocks * n + remainder;
        }
    }

    // Solution 5: Mathematical Block-based Approach - O(1)
    static long solution5_mathematical_blocks(int n, int k) {
        // Complete blocks of (n-1) valid numbers
        long completeBlocks = (k - 1) / (n - 1);

        // Position within the current block (0-indexed)
        long positionInBlock = (k - 1) % (n - 1);

        // Start of current block
        long blockStart = completeBlocks * n + 1;

        return blockStart + positionInBlock;
    }

    // Solution 6: Jump-based Approach - O(k/n)
    static long solution6_jump_based(int n, int k) {
        long result = k;
        long multiples = k / (n - 1);

        // Keep adjusting until we get the exact answer
        while (true) {
            long currentMultiples = (result - 1) / n;
            if (currentMultiples == multiples) {
                return result;
            }
            multiples = currentMultiples;
            result = k + multiples;
        }
    }

    // Solution 7: Pattern-based Approach - O(1)
    static long solution7_pattern_based(int n, int k) {
        // Every group of n numbers has (n-1) valid numbers
        // Pattern: 1,2,...,n-1, n+1,n+2,...,2n-1, 2n+1,...

        long groupIndex = (k - 1) / (n - 1);  // Which group (0-indexed)
        long posInGroup = (k - 1) % (n - 1);  // Position in group (0-indexed)

        // The group starts at groupIndex * n + 1
        // But we need to skip the multiple at position n in each group
        return groupIndex * n + posInGroup + 1;
    }

    // Solution 8: Inclusion-Exclusion Principle - O(1)
    static long solution8_inclusion_exclusion(int n, int k) {
        // Using inclusion-exclusion to count valid numbers
        // Numbers from 1 to x that are NOT divisible by n = x - floor(x/n)
        // We need to find x such that x - floor(x/n) = k

        long estimate = k + k / (n - 1);

        // Fine-tune the estimate
        while ((estimate - estimate / n) > k) {
            estimate--;
        }
        while ((estimate - estimate / n) < k) {
            estimate++;
        }

        return estimate;
    }
}