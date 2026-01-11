package beginner.arrays.problems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};

        System.out.println(Arrays.toString(firstAndLastPosition(nums, 8)));
    }

    static int[] firstAndLastPosition(int[] nums, int target) {
        int firstPosition = binarySearch(nums, target, true);
        int lastPosition = binarySearch(nums, target, false);

        return new int[]{firstPosition, lastPosition};
    }

    static int binarySearch(int[] nums, int target, boolean findFirstPosition) {
        int position = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                position = mid;
                if (findFirstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return position;
    }
}
