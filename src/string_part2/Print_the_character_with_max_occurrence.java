package string_part2;

public class Print_the_character_with_max_occurrence {
    public static void main(String[] args) {
        String s = "crmmmnrr";

        int[] arr = new int[26];
        int m = arr.length;
        for(int i = 0;i<s.length();i++){
          char ch = s.charAt(i);
          int idx = (int)ch - 97;
          arr[idx]++;
        }

        int maxfreq = -1;
        for(int i =0;i<arr.length;i++){
            maxfreq = Math.max(arr[i],maxfreq);
        }
        for(int i =0;i< arr.length;i++){
            if(arr[i]==maxfreq){
                char ch = (char)(i+97);
                System.out.print(ch + " ");
            }
        }
    }
}
