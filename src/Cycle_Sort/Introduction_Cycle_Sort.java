package Cycle_Sort;

public class Introduction_Cycle_Sort {
    public  static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void  cycleshort(int[] nums) {
        int n = nums.length;
        int i =0;
        while(i<n){
            if(nums[i] == i || nums[i] == n) i++;
            else{
                swap(i,nums[i] , nums);
            }
        }

    }

    public static void main(String[] args) {
      int[] arr = {0,2,1,3,5,4};
      cycleshort(arr);
      print(arr);
    }
}



