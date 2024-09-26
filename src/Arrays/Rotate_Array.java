package Arrays;

public class Rotate_Array {
    public static void rotate(int[] arr , int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void printarr(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};

        int n = nums.length;
        int k = 3;
        k = k%n;
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
        printarr(nums);

    }
}
