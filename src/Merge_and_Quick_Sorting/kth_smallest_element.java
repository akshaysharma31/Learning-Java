package Merge_and_Quick_Sorting;

public class kth_smallest_element {
    static int ans;
    public static  void print(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }

    public static int  partion(int[] arr , int lo , int hi ){
        int pivot = arr[lo] , pivotIDX = lo;
        int smallcount = 0;
        for(int i = lo+1 ; i<=hi;i++){
            if(arr[i]<=pivot) smallcount++;
        }

        int correctIDX = pivotIDX + smallcount;
        swap(arr,pivotIDX,correctIDX);

        int i = lo;
        int j = hi;
        while(i<correctIDX && j>correctIDX){
            if(arr[i]<=pivot) i++;
            else if (arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIDX;
    }

    public static void quickshort(int[] arr , int lo , int hi , int k){
        if(lo>hi) return;
        if(lo==hi) {
            if (lo == k - 1) {
                ans = arr[lo];
                return;
            }
        }
        int idx =  partion(arr,lo,hi);

        if(idx==k-1){
            ans = arr[idx];
            return;
        }

       if(k-1 < idx) {
           quickshort(arr, lo, idx - 1, k);
       } else {
           quickshort(arr, idx + 1, hi, k);
       }
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k = 2;
         ans = -1;


        quickshort(arr,0,n-1 , n);

        System.out.print(ans);

    }
}
