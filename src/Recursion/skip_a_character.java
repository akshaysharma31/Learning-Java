package Recursion;

public class skip_a_character {

//    public static void printstr(int i , String str){
//        if(i==str.length()) return;
//
//        System.out.print(str.charAt(i));
//        printstr(i+1,str);
//
//    }
//    public static void main(String[] args) {
//        String str = "Akshay Sharma";
//        printstr(0,str);
//    }



    public static void printstr(int i , String str ,String s){
        if(i==str.length()) {
            System.out.println(s);
            return;
        }
        if(str.charAt(i) != 'a')  s += str.charAt(i);
        printstr(i+1,str,s);

    }
    public static void main(String[] args) {
        String str = "Lkshay Sharma";
        printstr(0,str," ");
    }
}
