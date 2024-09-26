package Arrays_2D;

public class Add_of_2_matrix {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6}};
        int[][] arr2 ={{1,2,3},{4,5,6}};
        int m = arr1.length;
        int n = arr1[0].length;
        int[][] result = new int[m][n];


        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
