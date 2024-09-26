package strings;



public class indexOf_and_compareTo {
    public static void main(String[] args) {
        String str = "Akshay Sharma";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        String a = "abc";// exta value print in + eg ggg =1+1+1 = 3
        String b = "acd"; // exta value print in - eg ggg =1-1-1  = 4
        System.out.println(a.compareTo(b)); //  b-c = 98-99 = -1
    }



}
