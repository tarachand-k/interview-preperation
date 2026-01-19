package beginner.sorting.problems;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                MissingNumber.swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                return new int[]{arr[idx], idx + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
