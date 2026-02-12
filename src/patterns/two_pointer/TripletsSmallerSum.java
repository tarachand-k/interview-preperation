package patterns.two_pointer;

import java.util.Arrays;

public class TripletsSmallerSum {
    public static void main(String[] args) {
        long[] arr = {30, 8, 23, 6, 10, 9, 31, 7, 19, 20, 1, 33, 21, 27, 28, 3, 25, 26};
        System.out.println(optimized(18, 86, arr));
    }

    static long optimized(int n, int sum, long[] arr) {
        long count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                long tripletSum = arr[i] + arr[start] + arr[end];

                if (tripletSum >= sum) end--;
                else {
                    count += end - start;
                    start++;
                }
            }
        }

        return count;
    }
}
