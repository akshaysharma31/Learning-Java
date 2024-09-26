package Basic_Sorting_Algorithms;

public class Selection_Sort {
    public static void PrintArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        // In every pass , we fint kth smallest element and put it in its right place

           int[] arr = {10,-4,20,1,-6,8};
           int n = arr.length;

            PrintArray(arr);

            for(int i =0;i<n-1;i++){
                int min = Integer.MAX_VALUE;
                int minidx = -1;
                for(int j =i;j<n; j++){
                    if(arr[j] <min){
                        min  = arr[j];
                        minidx = j;

                    }
                }
                int temp = arr[i];
                arr[i]  = arr[minidx];
                arr[minidx] = temp;

            }


  PrintArray(arr);
    }
}
