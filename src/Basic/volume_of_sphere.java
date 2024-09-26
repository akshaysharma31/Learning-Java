package Basic;

import java.util.Scanner;

public class volume_of_sphere {

    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);

//
        double r = sc.nextDouble();

        double pie=3.14285714286;
        double volume=(4.0/3.0)*pie*(r*r*r);
        System.out.println("Volume of the sphere="+volume);



    }
}
