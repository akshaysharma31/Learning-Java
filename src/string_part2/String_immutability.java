package string_part2;

public class String_immutability {


    public static void main(String[] args) {
        // Strings are immutable for eg ->

        String s = "Hello";

        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);

        // s -> "Hello"
        // s -> "He"
        // s-> "He" + "y" = "Hey"
        // s-> "Heylo"  This cannot make new string but s point on "Heylo"
                // and "Hello" also present in memory
    }
}
