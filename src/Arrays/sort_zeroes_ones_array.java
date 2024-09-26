package Arrays;

public class sort_zeroes_ones_array {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,0,0,1,0};

        int n = arr.length;
        // Method 1
//        int numofzeroes =0;
//        for(int i =0;i<n;i++){
//            if(arr[i]==0){
//                numofzeroes++;
//            }
//
//        }
//        for(int i = 0;i<n;i++){
//            if(i<numofzeroes){
//                arr[i] = 0;
//            }else{
//                arr[i] = 1;
//
//            }
//
//        }
// Method 2
        int i =0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;

             else if(arr[i]==1 && arr[j] ==0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
           for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
