package Stack;
import java.util.*;
public class Previous_Greater_element {


    public static void PreviousGreaterelement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(arr[0]);
       ans[0] = -1;

        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
                if (st.isEmpty()) {
                   ans[i] = -1;
                }else {
                 ans[i] = st.peek();
                }
                st.push(arr[i]);
            }


        for (int num : ans) {
            System.out.print(num + " ");
        }
        }




    public static void main(String[] args) {
        int[] arr = {10,4,2,20,40,12,30};
        int n = arr.length;
        PreviousGreaterelement(arr,n);

//        int n = arr.length;
//        int[] ans = new int[n];
//        for(int i =0 ; i<n;i++){
//            ans[i] = -1;
//        }
//
//       for(int i = 1 ; i<n; i++){
//           for(int j = i-1 ; j>=0 ; j--){
//               if(arr[i] < arr[j]){
//                   ans[i] = arr[j];
//                   break;
//               }
//           }
//       }
//
//       for(int i = 0 ; i<ans.length;i++){
//           System.out.print(ans[i] + " ");
//       }


    }
}
