package beginner.arrays.problems;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 9, 13, 14, 16, 18};

        System.out.println(floorOfNumber(nums, 6));
    }

    static int ceilingOfNumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return target;

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }

    static int floorOfNumber(int[] arr, int target) {
        if (target < arr[0]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return target;

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (end < 0) return -1;

        return arr[end];
    }
}
