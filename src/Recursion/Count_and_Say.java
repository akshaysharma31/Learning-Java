package Recursion;

public class Count_and_Say {

    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n - 1) + "@";

        String ans = "";

        int i =0, j = 0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j) ) j++;

            else {
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        //   int len = j-i;
        //         ans += len;
        //         ans += s.charAt(i);
        //         i = j;
        return ans;
    }
    public static void main(String[] args) {
      int n = 4;
        System.out.println( countAndSay(n));
    }
}
// LeetCode 38