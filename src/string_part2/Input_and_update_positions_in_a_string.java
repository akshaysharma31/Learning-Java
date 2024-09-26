package string_part2;

public class Input_and_update_positions_in_a_string {
    public static void main(String[] args) {

        String s = "Physics wallah skills";
        String t = "";
        for(int i =0;i<s.length();i++) {
            if (i%2==0 ){
                t +="a";
            }else{
              t += s.charAt(i);
            }
        }
        System.out.println(t);  // ahasaca aaalahasaiala
    }
}

// Performance of String

// Poor Performance because of immutabilty