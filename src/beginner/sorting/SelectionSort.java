package beginner.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.printf(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;

            // find max element in array
            int maxIndex = findMaxIndex(arr, 0, lastIndex);

            // swap max with last element
            BubbleSort.swap(arr, maxIndex, lastIndex);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int maxIdx = start;
        for (int j = 0; j <= end; j++) {
            if (arr[j] > arr[maxIdx]) maxIdx = j;
        }

        return maxIdx;
    }
}
