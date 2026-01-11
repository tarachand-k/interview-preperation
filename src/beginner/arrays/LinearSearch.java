package beginner.arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {23, 5, 23, 43, 3, 52, 32, 3, 6, 46};

        System.out.println(max(numbers));
    }

    // search in the array
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }

        return -1;
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int idx = 0; idx < str.length(); idx++) {
            if (str.charAt(idx) == target) {
                return true;
            }
        }

        return false;
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int idx = start; idx <= end; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }

        return -1;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] < min) min = arr[idx];
        }

        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int idx = 1; idx < arr.length; idx++) {
            if (arr[idx] > max) max = arr[idx];
        }

        return max;
    }
}
