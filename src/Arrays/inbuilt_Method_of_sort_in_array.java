package Arrays;

import java.util.Arrays;

public class inbuilt_Method_of_sort_in_array {
    public static void main(String[] args) {



                int[] arr = {23, 78, 9, 7, 90, 80};
                // for each loop
                for (int ele : arr) {
                    System.out.print(ele + " ");
                }
                Arrays.sort(arr);
                System.out.println();
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    