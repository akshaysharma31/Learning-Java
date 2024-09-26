package Arrays;

public class copy_of_array {
    public static void main(String[] args) {
        int[] arr = {23, 78, 9, 7, 90, 80};
            for(int ele : arr){
                System.out.print(ele + " ");
            }
        System.out.println();
          //   Shallow copy
//            int[] copy = arr;
//            for(int i =0 ;i<copy.length;i++){
//                copy[0] = 30;
//                System.out.print(arr[i] + " ");
//            }
        System.out.println();
           // deep copy
//            int[] brr = Arrays.copyOf(arr,arr.length); // 1 way deep copy
//                  brr[0] = 70   ;
//                System.out.print(arr[0]);
//            }

      int[] drr = new int[arr.length];
       for(int i = 0;i<arr.length;i++){
         drr[i] = arr[i];

      }
        drr[0] = 100;
     System.out.print(arr[0]);
    }
}
