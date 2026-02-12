package patterns.two_pointer;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(optimized(nums)));
    }

    // O(n)
    static int[] optimized(int[] nums) {
        int i = 0;
        int j = i + 1;
        while (j < nums.length) {
            if (nums[i] < nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return nums;
    }
}
