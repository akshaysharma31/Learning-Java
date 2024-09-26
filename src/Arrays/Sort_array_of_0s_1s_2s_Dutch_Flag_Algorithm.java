package Arrays;

public class Sort_array_of_0s_1s_2s_Dutch_Flag_Algorithm {
    public static void swap(int[] arr ,int mid , int lo) {
        int temp = arr[lo];
        arr[lo] = arr[mid];
        arr[mid] = arr[lo];
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 1, 1, 2, 2, 0, 0};
        int n = arr.length;
        int numofzero = 0;
        int numofone = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) numofzero++;
            if (arr[i] == 1) numofone++;
        }


        for (int i = 0; i < n; i++) {
            if (i < numofzero) {
                arr[i] = 0;
            } else if (i < numofzero + numofone) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }
}

