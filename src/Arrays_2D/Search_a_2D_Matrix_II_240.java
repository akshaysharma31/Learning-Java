package Arrays_2D;

public class Search_a_2D_Matrix_II_240 {
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        // Start from the bottom-left corner for the search
        int i = m - 1;
        int j = 0;

        // Search the matrix
        while (i >= 0 && j < n) {
            if (arr[i][j] == target) {
                return true;  // Target found
            } else if (arr[i][j] > target) {
                i--;  // Move up
            } else {
                j++;  // Move right
            }
        }

        return false;  // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}
