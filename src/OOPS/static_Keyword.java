package OOPS;

public class static_Keyword {

    public static class Student {
        String name;
        int roll;
        double marks;
        final String School_name = "GPSSS";  //{ final keyword is fix keyword we not change the value of final if we give value once}
        private static int numberofstudent;


        public  static   int getNumberofstudent() {
            return numberofstudent;
        }

        public Student() {

        }
        public  Student ( String name, int roll ,double marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
           numberofstudent++;
        }
    }


    public static void main(String[] args) {
        Student s3  = new Student("xyz" , 89 , 67);
        System.out.println(s3.getNumberofstudent());

        Student s4 = new Student("dfg" , 59,89);
        System.out.println(s4.getNumberofstudent());
        Student s5 = new Student("jkl" , 97,98);
        System.out.println(s5.getNumberofstudent());






    }
}
