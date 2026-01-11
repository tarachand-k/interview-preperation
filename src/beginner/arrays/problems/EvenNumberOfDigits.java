package beginner.arrays.problems;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {1, 234, 43, 23, 32323};

        System.out.println(findNumbers(nums));
    }

    // Given an array of integers, return how many of them contain an even number of digits.
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) count++;
        }

        return count;
    }

    // Function to check whether a number contains even number of digits
    static boolean hasEvenDigits(int num) {
        return countDigitsOptimized(num) % 2 == 0;
    }

    // Number of digits in an integer
    static int countDigits(int num) {
        if (num == 0) return 1;

        if (num < 0) num *= -1;


        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static int countDigitsOptimized(int num) {
        if (num == 0) return 1;

        if (num < 0) num *= -1;

        return (int) (Math.log10(num)) + 1;
    }
}
