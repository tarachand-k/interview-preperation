package beginner.arrays.problems;

public class FindInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 12},
                {13, 15, 16, 18, 19},
        };

        System.out.println(find(matrix, 11));
    }

    static boolean find(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) return true;

            if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
