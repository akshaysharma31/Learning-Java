package Stack;
import java.util.*;
public class Next_Greatest_Element {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // Using if statement instead of ternary operator
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
