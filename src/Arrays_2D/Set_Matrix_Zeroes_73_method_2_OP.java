package Arrays_2D;

public class Set_Matrix_Zeroes_73_method_2_OP {
    public static void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean zthrow = false;
        boolean zthcol = false;
        for(int j = 0;j<n;j++){
            if(arr[0][j]==0){
                zthrow = true;
                break;
            }
        }
        for(int i = 0;i<m;i++){
            if(arr[i][0]==0){
                zthcol = true;
                break;
            }
        }



        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }


        for(int j = 1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=1;i<m;i++){
                    arr[i][j] =0;
                }
            }
        }

        for(int i = 1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=1;j<n;j++){
                    arr[i][j] =0;
                }
            }
        }


        if(zthrow==true){
            for(int j = 0;j<n;j++){
                arr[0][j] =0;
            }
        }
        if(zthcol==true){
            for(int i = 0;i<m;i++){
                arr[i][0] =0;
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr = {
                {0, 2, 0},
                {4, 5, 6},
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
