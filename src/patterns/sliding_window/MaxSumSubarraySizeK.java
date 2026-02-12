package patterns.sliding_window;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] nums = {9479, 488, 2374, 1583, 5863, 7811, 6916, 1685, 3960};
        int k = 5;
        System.out.println(optimized(nums, k));
    }

    static int optimized(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        int start = 1;
        int end = start + k - 1;
        while (end < arr.length) {
            windowSum = windowSum - arr[start - 1] + arr[end];
            if (windowSum > maxSum) maxSum = windowSum;
            start++;
            end++;
        }

        return maxSum;
    }
}
