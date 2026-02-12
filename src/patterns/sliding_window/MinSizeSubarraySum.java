package patterns.sliding_window;

public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(optimized(2, nums));
    }

    public static int optimized(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        int start = 0, end = 0;
        int windowSum = nums[start];

        // 1,1,1,1,1,1,1,1
        while (end < nums.length) {
            if (windowSum >= target) {
                minLength = Math.min(minLength, end - start + 1);

                windowSum = windowSum - nums[start];
                start++;

                // This can reduce few steps
//                if (start == end) {
//                    start++;
//                    end++;
//                    if (end < nums.length) windowSum = nums[end];
//                } else {
//                    windowSum = windowSum - nums[start];
//                    start++;
//                }
            } else {
                end++;
                if (end < nums.length) windowSum = windowSum + nums[end];
            }
        }

        return minLength < Integer.MAX_VALUE ? minLength : 0;
    }
}
