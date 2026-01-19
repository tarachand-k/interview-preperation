package beginner.sorting.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 2, 4};
        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        // sort array
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

        // search for first missing index
        for (int idx = 0; idx < arr.length; idx++) {
            if (idx != arr[idx]) return idx;
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
