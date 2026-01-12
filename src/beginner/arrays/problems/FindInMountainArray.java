package beginner.arrays.problems;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    static int findInMountain(int[] arr, int target) {
        int peakIndex = findPeak(arr);

        int start = 0;
        int end = arr.length - 1;

        int ans = binarySearch(arr, target, start, peakIndex);

        if (ans != -1) return ans;

        return binarySearch(arr, target, peakIndex + 1, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (isAsc ? target < arr[mid] : target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
