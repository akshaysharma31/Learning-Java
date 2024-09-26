package Arrays;

public class print_max_of_given_arr {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2};

        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){

                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
