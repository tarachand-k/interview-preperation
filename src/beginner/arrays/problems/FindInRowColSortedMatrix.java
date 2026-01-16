package beginner.arrays.problems;

import java.util.Arrays;

public class FindInRowColSortedMatrix {
    public static void main(String[] arg) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 30, 40},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };

        System.out.println(Arrays.toString(findInMatrix(matrix, 28)));
    }

    static int[] findInMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[row].length - 1;

        while (row < matrix.length && col >= 0) {
            int element = matrix[row][col];

            if (element == target) return new int[]{row, col};

            if (element < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
