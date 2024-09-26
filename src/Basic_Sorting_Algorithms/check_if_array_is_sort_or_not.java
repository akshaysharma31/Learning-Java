package Basic_Sorting_Algorithms;

import java.util.*;
public class check_if_array_is_sort_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
      boolean flag = true;
      for(int i =0;i<arr.length-1;i++){
          if(arr[i]>arr[i+1]) {
              flag = false;
              break;
          }
      }
      if(flag==true){
          System.out.println("Sorted");
      } else{
          System.out.println("Unsorted");
      }
    }
}
