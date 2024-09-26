package Arrays;

public class reverse_array {
    public static void swap(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
    }

    public static void printarr(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
       printarr(arr);
        System.out.println();
      swap(arr,0,n-1);

     printarr(arr);


    }



}