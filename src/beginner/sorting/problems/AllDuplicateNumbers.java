package beginner.sorting.problems;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findAllDuplicateNumber(arr));
    }

    static List<Integer> findAllDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                MissingNumber.swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        List<Integer> duplicateNumbs = new ArrayList<>();

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                duplicateNumbs.add(arr[idx]);
            }
        }

        return duplicateNumbs;
    }
}
