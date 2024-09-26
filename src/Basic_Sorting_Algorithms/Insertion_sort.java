package Basic_Sorting_Algorithms;

public class Insertion_sort {
    public static void PrintArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={2,1,4,3,5};

        int n = arr.length;
        for(int i =1;i<n;i++){
            for(int j = i; j>=1 ;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                } else break;

            }

        }
        PrintArray(arr);
    }
}
