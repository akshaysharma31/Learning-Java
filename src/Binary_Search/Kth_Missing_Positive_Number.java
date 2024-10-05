package Binary_Search;

public class Kth_Missing_Positive_Number {

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int missed = arr[mid] - (mid+1);
            if(missed<k)  lo = mid + 1;
            else  hi = mid -1;



        }
        return k + lo;


        // kth missing number = arr[hi] + extra;
        //                    = arr[hi] + k - (arr[hi] -  (hi + 1));
        //                    = k + (hi+1);
        //                    =  k + lo;
    }
    public static void main(String[] args) {
   int[] arr = {2,3,4,7,11};
   int k = 5;
   int a = findKthPositive(arr,k);
        System.out.println(a);
    }
}
