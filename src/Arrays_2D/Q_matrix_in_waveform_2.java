package Arrays_2D;

public class Q_matrix_in_waveform_2 {
    public static void printarr(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;

        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            if (transpose[i][0] % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(transpose[i][j] + " ");
                }

                }else{
                 for(int j =n-1;j>=0;j--){
                     System.out.print(transpose[i][j] + " ");
                 }
            }
        }
    }
}
