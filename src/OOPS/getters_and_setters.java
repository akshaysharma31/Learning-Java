package OOPS;

public class getters_and_setters {
    public static class Student {
        String name;
       private   int roll;
        double marks;

        public int getRoll(){
            return roll;
        }
        public void setRoll(int roll){
            this.roll = roll;
        }
    }

    public static void main(String[] args) {
        Student s2 = new Student();
        s2.name = "Abc";

        s2. marks = 90.9;
        s2.setRoll(34);
        System.out.println(s2.getRoll());



    }
}
