package patterns.two_pointer;

import java.util.Arrays;

// Yesterday I learned & solved
// Square sorted array
// Three sum
// Three Sum Closest

// Today I learned & solved
// Triplets Smaller Sum
// Sort Colors (dutch flag) that took me time to understand

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(optimized(nums)));
    }

    static int[] better(int[] nums) {
        int smallestPosIdx = 0;
        while (smallestPosIdx < nums.length - 1) {
            if (nums[smallestPosIdx] >= 0) {
                break;
            }
            smallestPosIdx++;
        }

        int i = smallestPosIdx - 1;
        int j = smallestPosIdx + 1;
        int[] ans = new int[nums.length];

        ans[0] = nums[smallestPosIdx] * nums[smallestPosIdx];
        int ansIdx = 0;

        while (i >= 0 && j < nums.length) {
            int sqI = nums[i] * nums[i];
            int sqJ = nums[j] * nums[j];

            if (sqI < sqJ) {
                ans[++ansIdx] = sqI;
                i--;
            } else {
                ans[++ansIdx] = sqJ;
                j++;
            }
        }

        while (i >= 0) {
            ans[++ansIdx] = nums[i] * nums[i];
            i--;
        }

        while (j < nums.length) {
            ans[++ansIdx] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }

    static int[] optimized(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int idx = j;

        int[] ans = new int[arr.length];

        while (i <= j) {
            int sqI = arr[i] * arr[i];
            int sqJ = arr[j] * arr[j];

            if (sqI > sqJ) {
                ans[idx] = sqI;
                i++;
            } else {
                ans[idx] = sqJ;
                j--;
            }
            idx--;
        }

        return ans
                ;
    }
}
