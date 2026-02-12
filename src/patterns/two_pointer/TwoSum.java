package patterns.two_pointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(optimized(nums, 26)));
    }

    // O(n*log(n))
    static int[] optimized(int[] nums, int target) {
        // TODO: Implement this on own after learning sorting
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) {
                return new int[]{start, end};
            }

            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }
}
