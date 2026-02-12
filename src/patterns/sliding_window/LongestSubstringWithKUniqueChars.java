package patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueChars {
    public static void main(String[] args) {
        System.out.println(optimized("aaaa", 2));
    }

    public static int optimized(String s, int k) {
        int maxLength = -1;

        // store frequency of chars
        Map<Character, Integer> freq = new HashMap<>();
        int low = 0;
        int high = 0;

        while (high < s.length()) {
            // increase the frequency of char at high
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // if number of distinct chars > k
            while (freq.size() > k) {
                // decrease the frequency of char at low
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);

                // remove the char at left if freq == 0 otherwise map will give wrong number of distinct chars
                if (freq.get(leftChar) == 0) freq.remove(leftChar);
                low++;
            }

            // if number of distinct chars == k
            if (freq.size() == k) {
                maxLength = Math.max(maxLength, high - low + 1);
            }

            // finally increase high
            high++;
        }

        return maxLength;
    }

}
