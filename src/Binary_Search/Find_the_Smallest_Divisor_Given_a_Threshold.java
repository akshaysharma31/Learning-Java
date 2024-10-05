package Binary_Search;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static  int smallestDivisor(int[] arr, int t) {


        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        int  lo = 1;
        int  hi = max;
        int d = 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int sum = 0;
            for(int i = 0;i<n;i++){

                if(arr[i]%mid==0) {
                    sum += (arr[i]/mid);
                } else{
                    sum += (arr[i]/mid)+1;
                }
            }
            if(sum<=t) {
                d = mid;
                hi = mid -1;
            } else {
                lo = mid + 1;

            }

        }
        return d;
    }
    public static void main(String[] args) {
      int[] arr = {1,2,5,9};
      int t = 6;
      int x = smallestDivisor(arr,t);
        System.out.println(x);
    }
}
