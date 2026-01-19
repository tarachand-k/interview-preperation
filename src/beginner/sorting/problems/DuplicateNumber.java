package beginner.sorting.problems;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};

        System.out.println(findDuplicateNumber(arr));
    }

    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIdx = arr[i] - 1;
                if (arr[i] != arr[correctIdx]) {
                    MissingNumber.swap(arr, i, correctIdx);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }
}
