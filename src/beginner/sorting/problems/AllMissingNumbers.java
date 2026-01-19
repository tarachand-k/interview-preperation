package beginner.sorting.problems;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(findAllMissingNumbers(arr));
    }

    static List<Integer> findAllMissingNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                MissingNumber.swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        List<Integer> missingNumbs = new ArrayList<>();

        // find all missing numbers
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                missingNumbs.add(idx + 1);
            }
        }

        return missingNumbs;
    }
}
