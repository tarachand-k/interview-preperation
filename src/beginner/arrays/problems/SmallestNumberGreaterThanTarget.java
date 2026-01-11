package beginner.arrays.problems;

// HINT: binary search -> ceiling of a number in an array
public class SmallestNumberGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};

        System.out.println(nextGreatestLetter(arr, 'i'));
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[(arr.length - 1) % start];
    }
}
