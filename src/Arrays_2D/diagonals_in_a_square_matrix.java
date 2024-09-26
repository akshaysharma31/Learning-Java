package Arrays_2D;

public class diagonals_in_a_square_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;

        // Iterate through the matrix and print diagonals
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Condition to print the main diagonal or anti-diagonal
                if (i == j || i + j == m - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    // Print spaces to align the output
                    System.out.print("  ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
