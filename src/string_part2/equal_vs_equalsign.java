package string_part2;

public class equal_vs_equalsign {

    public static void main(String[] args) {
        // important a==b means comparision
        // important a=b assignment , a has now the value of b
        String a = "abcxyz";
        String b = "abc";
        b = b + "xyz";
       String c = new String();
       c = "abcxyz";
        System.out.println(a==b); // This == sign compare address in string
        System.out.println(a.equals(c)); // This equals() compare String character wise


    }


}
