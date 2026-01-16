package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean isSwaped;

        // run for n - 1 step
        for (int i = 0; i < arr.length; i++) {
            isSwaped = false;
            // after each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwaped = true;
                }
            }

            // if it did not swap after each step, then the array is sorted hence stop the loop
            if (!isSwaped) break;
        }
    }
}
