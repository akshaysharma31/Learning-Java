package Basic_Sorting_Algorithms;

public class transform_array {
    public static void PrintArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
                  // 3 ,0 ,5 ,2 ,6  ,4 ,1
        
        int n = arr.length;
        int x =  0;
        for(int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    minidx = j;
                }
            }
           arr[minidx] = x;
            x--;
        }
        for(int k = 0;k<n;k++){
            arr[k] *= (-1);
        }
        PrintArray(arr);
    }
}
