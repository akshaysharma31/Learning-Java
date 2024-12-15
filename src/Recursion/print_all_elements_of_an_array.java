package Recursion;

public class print_all_elements_of_an_array {

    public static void printarr(int i , int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i] + " ");
        printarr(i+1,arr);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7};
        printarr(0,arr);
    }
}
