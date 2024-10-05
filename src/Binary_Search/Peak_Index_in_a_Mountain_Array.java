package Binary_Search;

public class Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1;
        int hi = n-2;
        while(lo<=hi){
            int mid = (lo+hi) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1] ) lo = mid + 1;
            else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1] ) hi = mid - 1;
        }
        return  0;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int x = peakIndexInMountainArray(arr);
        System.out.println(x);
    }
}
