package Arrays;

public class second_largest_element_of_array {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2};

        int max = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){

                max  = Math.max(max,arr[i]);
            }
        }

        int smax = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=max){

                smax  = Math.max(smax,arr[i]);
            }
        }
        System.out.println(smax);

    }
}
