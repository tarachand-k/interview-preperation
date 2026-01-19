package beginner.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != arr[correctIdx])
                BubbleSort.swap(arr, i, arr[i] - 1);
            else
                i++;
        }
    }
}
