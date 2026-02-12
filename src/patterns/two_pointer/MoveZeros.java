package patterns.two_pointer;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        optimized2(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void optimized2(int[] nums) {
        int zeroIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIdx = i;
                break;
            }
        }

        if (zeroIdx == -1) return;

        for (int j = zeroIdx + 1; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(nums, zeroIdx, j);
                zeroIdx++;
            }
        }
    }

    static void optimized(int[] nums) {
        int start = 0;
        int end = start + 1;
        while (end < nums.length) {
            if (nums[start] == 0 && nums[end] != 0) {
                swap(nums, start, end);
                start++;
                end++;
            } else if (nums[start] == 0 && nums[end] == 0) {
                end++;
            } else {
                start++;
                end++;
            }
        }
    }

    static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
