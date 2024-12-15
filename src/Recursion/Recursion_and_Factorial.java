package Recursion;

public class Recursion_and_Factorial {
    public static void mango() {
        System.out.println("Hi , I am in mango");

    }
    public static void banana() {
        System.out.println("Hi , I am in banana");
        mango();
    }
    public static void apple() {
        System.out.println("Hi , I am in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("Hi , I am in main");
        apple();
    }

}
