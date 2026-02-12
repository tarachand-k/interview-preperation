package patterns.two_pointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        System.out.println(optimized(nums, 1));
    }

    static int optimized(int[] nums, int target) {
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        int ansSum = -1;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == target) return sum;

                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    ansSum = sum;
                }

                if (sum < target) {
                    start++;
                    if (start < nums.length && nums[start] == nums[start - 1]) start++;
                } else {
                    end--;
                    if (end >= 0 && nums[end] == nums[end + 1]) end--;
                }
            }
        }

        return ansSum;
    }
}
