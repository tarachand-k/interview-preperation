package patterns.sliding_window;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(optimized("ABAB", 0));
    }

    public static int optimized(String s, int k) {
        int maxLength = 0;
        int[] freq = new int[256];
        int low = 0;
        int high = 0;
        while (high < s.length()) {
            freq[s.charAt(high)]++;
            int length = high - low + 1;
            int diff = length - max(freq);

            while (diff > k) {
                freq[s.charAt(low)]--;
                low++;
                length = high - low + 1;
                diff = length - max(freq);
            }

            maxLength = Math.max(maxLength, high - low + 1);

            high++;
        }

        return maxLength;
    }

    private static int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }
}
