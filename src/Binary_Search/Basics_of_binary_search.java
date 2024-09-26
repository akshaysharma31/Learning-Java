package Binary_Search;

public class Basics_of_binary_search {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int targete = 1;
        int n  = arr.length;
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if( arr[mid] == targete){
                flag = true;
                break;
            }
            else if (arr[mid] > targete)   hi = mid -1;
                
            else if (arr[mid] < targete)  lo = mid + 1;




        }
        if(flag==true){
            System.out.println("Element find");
        }else{
            System.out.println("Element not  find");
        }

    }
}
