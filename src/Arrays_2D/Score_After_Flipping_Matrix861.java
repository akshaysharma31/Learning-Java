package Arrays_2D;

public class Score_After_Flipping_Matrix861 {

    public static int matrixScore(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        // Replace 0 with 1 at every position of the row if the first element is 0
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == 0) arr[i][j] = 1;

                    else arr[i][j] = 0;
                }
            }
        }

        // Flip columns if the number of 0's is greater than the number of 1's
        for (int j = 1; j < n; j++) {
            int numofz = 0;
            int numofo = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0) numofz++;
                else numofo++;
            }
            if (numofz > numofo) {
                for (int i = 0; i < m; i++) {
                    if(arr[i][j] == 0) arr[i][j] = 1;

                    else arr[i][j] = 0;
                }
            }
        }

        // Calculate the score
        int score = 0;
        int x = 1;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }
        return score;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                // 2^3  2^2 2^1 2^0
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };

        int result = matrixScore(matrix);
        System.out.println("Matrix Score: " + result);
    }
}



