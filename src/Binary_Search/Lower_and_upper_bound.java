package Binary_Search;

public class Lower_and_upper_bound {
    public static void main(String[] args) {

        // LOWER BOND
        int[] arr = {10, 20, 30, 30, 40, 50, 60, 70};
        int x = 55;
        int n = arr.length;
        int lb = n;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] >= x) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else lo = mid + 1;


        }
        System.out.println(lb);

    }
        // UPPER BOND
//        int[] arr = {10,20,30,30,40,50,60,70};
//        int x = 30;
//        int n = arr.length;
//       int ub = n;
//        int lo = 0;
//        int hi = n-1;
//        while (lo<=hi){
//            int mid = (lo+hi)/2;
//            if(arr[mid]>x) {
//                ub = Math.min(ub,mid);
//                hi = mid-1;
//            }
//
//            else lo = mid + 1;
//
//
//        }
//        System.out.println(ub);
//    }
    }
