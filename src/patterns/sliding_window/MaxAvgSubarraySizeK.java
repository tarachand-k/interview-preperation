package patterns.sliding_window;

public class MaxAvgSubarraySizeK {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(optimized(nums, 4));
    }

    public static double optimized(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        int start = 1;
        int end = k;
        while (end < nums.length) {
            windowSum = windowSum - nums[start - 1] + nums[end];
            if (windowSum > maxSum) maxSum = windowSum;
            start++;
            end++;
        }

        return maxSum / k;
    }
}
