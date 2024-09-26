package Arrays_2D;

public class Find_max_ele_in_2D_Arrays {
    public static void main(String [] args){
        int[][] arr ={{1,2,3},{4,9,6},{89,46,50}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
            mx = Math.max(mx,arr[i][j]);
            }

        }
        System.out.println(mx);
    }
}
