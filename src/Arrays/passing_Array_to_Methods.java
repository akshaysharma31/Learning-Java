package Arrays;

public class passing_Array_to_Methods {


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr) {
          arr[0] = 10;

    }
}
