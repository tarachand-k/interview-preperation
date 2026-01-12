package beginner.arrays.problems;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};

        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // we are in decreasing part, the ans may be this or present  on left
                // that is why end != mid - 1
                end = mid;
            } else {
                // we are in ascending part
                start = mid + 1; // because mid+1 element > mid element so don't need to include the mid
            }
        }

        // in the end, start == end and pointing to the largest element in the array

        return start;
    }
}
