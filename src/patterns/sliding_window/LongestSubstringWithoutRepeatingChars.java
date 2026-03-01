package patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println(optimized2("cadbzabcd"));
    }

    // O(2n)
    public static int optimized(String s) {
        int maxLength = 0;
        Map<Character, Integer> freq = new HashMap<>();

        int low = 0;
        int high = 0;

        while (high < s.length()) {
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.get(c) > 1) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) freq.remove(leftChar);

                low++;
            }

            maxLength = Math.max(maxLength, high - low + 1);
            high++;
        }

        return maxLength;
    }

    // O(n)
    public static int optimized2(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) > left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }

        return maxLength;
    }
}
