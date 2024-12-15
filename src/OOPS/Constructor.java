package OOPS;



public class Constructor {
    public static class Student {
        String name;
        int roll;
        double marks;
        final String School_name = "GPSSS";  //{ final keyword is fix keyword we not change the value of final if we give value once}

        public Student() {

        }
        public  Student ( String name, int roll ,double marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;

        }
    }


    public static void main(String[] args) {
      Student s3  = new Student("xyz" , 89 , 67);
        System.out.println(s3.name);
        System.out.println(s3.roll);
        System.out.println(s3.marks);
        System.out.println(s3.School_name);

        Student s4 = new Student();
        s4.name = "tyu";
        s4.roll = 66;
        s4.marks = 68;
        System.out.println(s4.name);
        System.out.println(s4.roll);
        System.out.println(s4.marks);


    }
}
