package patterns.sliding_window;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(optimized("a", "aa"));
    }

    public static String optimized(String s, String t) {
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int[] targetFreq = new int[256];
        for (int i = 0; i < t.length(); i++) {
            targetFreq[t.charAt(i)]++;
        }

        int low = 0;
        int high = 0;
        int[] windowFreq = new int[256];
        while (high < s.length()) {
            windowFreq[s.charAt(high)]++;

            while (charsContain(windowFreq, targetFreq)) {
                int length = high - low + 1;
                if (length < minLength) {
                    minLength = length;
                    start = low;
                }
                windowFreq[s.charAt(low)]--;
                low++;
            }
            high++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static boolean charsContain(int[] windowFreq, int[] targetFreq) {
        for (int i = 0; i < targetFreq.length; i++) {
            if (windowFreq[i] < targetFreq[i]) {
                return false;
            }
        }

        return true;
    }
}
