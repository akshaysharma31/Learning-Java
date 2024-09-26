package strings;

import java.util.Scanner;

public class Total_number_of_digits_without_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
//        String s = " " + x ;
//
//        System.out.println(s);
//        System.out.print(s.length());
        String s = Integer.toString(x);
        System.out.println(s);
        System.out.print(s.length());
    }
}
