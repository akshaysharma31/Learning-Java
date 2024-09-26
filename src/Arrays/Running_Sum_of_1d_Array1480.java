package Arrays;
import java.util.*;
public class Running_Sum_of_1d_Array1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        runningSum(arr);
        for(int i =0 ;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }


    }
    public static int[] runningSum(int[] arr) {

        for(int i =1 ;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
