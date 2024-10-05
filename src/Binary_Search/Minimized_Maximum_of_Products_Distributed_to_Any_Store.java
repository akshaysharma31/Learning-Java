package Binary_Search;

public class Minimized_Maximum_of_Products_Distributed_to_Any_Store {
    public static boolean isPosible(int mid , int n , int[] arr){
        int store = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]%mid == 0 ){
                store += arr[i]/mid ;

            }
            else {
                store += arr[i]/mid + 1;

            }
        }
        if(store>n) return false;
        return true;
    }
    public static int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<m;i++){
            max = Math.max(max,arr[i]);
        }

        int lo = 1;
        int hi = max;
        int ans = 0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;


            if(isPosible(mid,n,arr)==true){
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid +1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
    int[] arr = {15,10,10};
     int n = 7 ;
     int x = minimizedMaximum(n,arr);
        System.out.println(x);


    }
}
