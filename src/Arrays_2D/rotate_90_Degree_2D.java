package Arrays_2D;

public class rotate_90_Degree_2D {

    public static void printarr(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i =0 ;i<m;i++){
            for(int j =0;j<n;j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){

        int[][] arr = {{1,2,3},{4,5,6}};

        int m = arr.length;


        for(int i =0 ;i<m;i++){
            for(int j =0;j<i;j++){

             int temp = arr[i][j];
             arr[i][j] = arr[j][i];
             arr[j][i] = temp;

            }

        }
        printarr(arr);
        System.out.println();
//    for(int i =0;i<m;i++){
//        int a =0 , b = m-1;
//
//        while(a<b){
//            int temp = arr[i][a];
//            arr[i][a] = arr[i][b];
//            arr[i][b] = temp;
//            a++;
//            b--;
//        }
    }
//    printarr(arr);



}
