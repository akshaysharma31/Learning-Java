package Arrays_2D;

public class Set_Matrix_Zeroes_73_method_1 {



        public static void setZeroes(int[][] arr) {
            int m = arr.length;
            int n = arr[0].length;

            int[][] helper = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    helper[i][j] = arr[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // set ith row and jth col to zero in the matrix
                    if (helper[i][j] == 0) {
                        for (int b = 0; b < n; b++) {
                            arr[i][b] = 0;
                        }
                        for (int a = 0; a < m; a++) {
                            arr[a][j] = 0;
                        }
                    }
                }
            }
        }

        // Test the function
        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 0, 6},
                    {7, 8, 9}
            };


            setZeroes(arr);

            System.out.println("After setting zeroes:");
            for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr[0].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


