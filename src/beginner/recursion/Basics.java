package beginner.recursion;

public class Basics {
    public static void main(String[] args) {
//        System.out.println(fibonacciNumber(7));
        int[] arr = {3, 5, 6, 9, 13, 16};

        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
    }

    static int fibonacciNumber(int n) {
        if (n < 2) return n;

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        // Base condition
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, end, target);
    }
}
