package Stack;



public class Stock_Span_Problem {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[j] <= arr[i]) {
                    count++;
                } else {
                    break;
                }
            }
            ans[i] = count;
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
