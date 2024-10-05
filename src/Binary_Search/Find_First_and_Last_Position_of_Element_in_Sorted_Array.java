package Binary_Search;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public static  int[] searchRange(int[] arr, int x) {

        int[] ans = {-1,-1};
        int n  = arr.length;
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if( arr[mid] == x){
                flag = true;
                break;
            }
            else if (arr[mid] > x)   hi = mid -1;

            else if (arr[mid] < x)  lo = mid + 1;




        }
        if(flag==false) return ans;

        lo = 0;
        hi = n-1;
        int lb = n;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=x) {
                lb = Math.min(lb,mid);
                hi = mid-1;
            }

            else lo = mid + 1;


        }
        ans[0] = lb;

        lo = 0;
        hi = n-1;
        int ub = n;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>x) {
                ub = Math.min(ub,mid);
                hi = mid-1;
            }

            else lo = mid + 1;


        }
        ans[1] = ub -1;


        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(arr, target);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
}
