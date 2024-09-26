package string_part2;

public class String_compression {
    public static void main(String[] args) {
        String str  = "aaaabbbcdd";

        char[] arr = str.toCharArray();

        StringBuilder ans = new StringBuilder();

        int i =0;
        int j =0;
        while(j< arr.length){

            if(arr[j] == arr[i]) j++;
            else{
                ans.append(arr[i]);

                int len = j-i;
                if(len>1) ans.append(len);
                i = j;
            }
        }
        ans.append(arr[i]);

        int len = j-i;
        if(len>1) ans.append(len);
        System.out.println(ans);

    }
}
