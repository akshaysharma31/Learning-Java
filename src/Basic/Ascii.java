package Basic;

import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cheracter : ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
