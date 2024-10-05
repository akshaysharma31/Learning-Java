package Binary_Search;

public class Capacity_To_Ship_Packages_Within_D_Days {

    public static   boolean isPossible(int c ,int[] arr , int d){
        int n = arr.length;
        int load = 0;
        int days = 1;
        for(int i =0 ;i<n;i++){
            if(load+arr[i] <= c){
                load += arr[i];

            }else {
                load = arr[i];
                days++;
            }
        }
        if(days>d) return false;
        else return true;
    }
    public static  int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0 ;i<n;i++){
            max = Math.max(max,arr[i]);
            sum += arr[i];
        }


        int lo = max;
        int hi = sum;
        int minC = 0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid,arr,d) == true){
                minC = mid;
                hi = mid - 1;

            } else {
                lo = mid +1;
            }
        }

        return minC;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,10};
       int d = 5;
       int x = shipWithinDays(arr,d);
        System.out.println(x);
    }
}

// 15