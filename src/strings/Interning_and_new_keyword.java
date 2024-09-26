package strings;

public class Interning_and_new_keyword {
    public static void main(String[] args) {
        String s = "Akshay";
        String R = "Akshay"; // both s and r pointing "Akshay"

        String x = new String("Akshay");  // this made new string in memory
    }
}
