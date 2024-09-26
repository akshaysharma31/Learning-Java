package Arrays_2D;

import java.util.*;
public class  Pascals_Triangle_arraylist {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(l);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5; // Set n to the desired number of rows for Pascal's Triangle
        List<List<Integer>> result = generate(n);

        // Print the generated Pascal's Triangle using a standard for loop
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i)); // Print each row
        }
    }

}
