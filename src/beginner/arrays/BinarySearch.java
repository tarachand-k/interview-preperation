package beginner.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 9, 22, 54};
        System.out.println(binarySearch(nums, 66));
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2; // might be possible that (start + end) exceed max int value
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
