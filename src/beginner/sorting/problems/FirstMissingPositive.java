package beginner.sorting.problems;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println(findFirstMissingPositive(arr));
    }

    static int findFirstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= 0 || arr[i] > arr.length) {
                i++;
                continue;
            }

            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                MissingNumber.swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                return idx + 1;
            }
        }

        return arr.length + 1;
    }
}
