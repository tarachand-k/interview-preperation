package patterns.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        System.out.println(optimized(nums).toString());
    }

    static List<List<Integer>> optimized(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if ((nums[start] + nums[end]) == (-1 * nums[i])) {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    while (start < nums.length && nums[start] == nums[start - 1]) start++;
                    while (end >= 0 && nums[end] == nums[end + 1]) end--;
                } else if (nums[start] + nums[end] < (-nums[i])) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return ans;
    }
}
