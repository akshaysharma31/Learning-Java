package Basic_Sorting_Algorithms;

public class Bubble_Sort {
    public static void PrintArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr = {5,8,1,-3,8,10};
       int n = arr.length;
        PrintArray(arr);







       //  Bubble_Sort ---> 1 mathod
//       for(int x =0 ;x<n-1;x++) {
//           for (int i = 0; i < n - 1; i++) {
//               if (arr[i] > arr[i + 1]) {
//                   int temp = arr[i];
//                   arr[i] = arr[i + 1];
//                   arr[i + 1] = temp;
//               }
//           }
//       }






    //  Bubble_Sort ---> 2 mathod
//        for(int x =0 ;x<n-1;x++) {
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }




        //  Bubble_Sort ---> Optimised

         for(int x =0;x<n-1;x++){
             boolean flag = true;
             for(int i =0 ;i<n-1-x ; i++){
                 if(arr[i] > arr[i+1]){
                     int temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;
                     flag = false;
                 }

             }
             if(flag==true) break;
         }
        PrintArray(arr);





    }


}
