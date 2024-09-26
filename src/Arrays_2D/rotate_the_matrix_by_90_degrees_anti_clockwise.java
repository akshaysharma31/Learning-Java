package Arrays_2D;

public class rotate_the_matrix_by_90_degrees_anti_clockwise {
    public static void main(String []args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;

        int[][] transpose = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int r = transpose.length;
        int c = transpose[0].length;

        for(int i =r-1; i>=0;i--){
            for(int j=0;j<c;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
