package OOPS;

public class StudentClass {




    public static void fun(Student x){
        System.out.println(x.name);

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anu";
        s1.roll = 123;
        s1. marks = 90.8;

        System.out.println(s1.name);
        s1.name = "Abc";
        System.out.println(s1.name);




        // System.out.println(s2.marks+5);
       // fun(s1);

    }
    
}
