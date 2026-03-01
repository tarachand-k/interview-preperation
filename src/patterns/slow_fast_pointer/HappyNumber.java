package patterns.slow_fast_pointer;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(optimized(19));
    }

    public static boolean better(int n) {
        Set<Integer> calculatedSums = new HashSet<>();

        while (n != 1) {
            n = sumSquareDigits(n);

            if (calculatedSums.contains(n) && n != 1) {
                return false;
            }

            calculatedSums.add(n);
        }

        return true;
    }

    public static boolean optimized(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = sumSquareDigits(slow);
            fast = sumSquareDigits(sumSquareDigits(fast));

            if (slow == fast && fast != 1) {
                return false;
            }
        }

        return true;
    }

    public static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit * digit;
        }

        return sum;
    }
}
