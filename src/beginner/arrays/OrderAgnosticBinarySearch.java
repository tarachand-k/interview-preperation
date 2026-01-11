package beginner.arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {53, 43, 32, 29, 17, 6, 0, -2};

        System.out.println(orderAgnosticBinarySearch(nums, -1));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // whether the array is sorted in ascending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc ? target > arr[mid] : target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
