package Arrays;
import java.util.Scanner;
public class roll_no {
    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        int[] arr = {34,56,78,90,56,70,23,32,31};


        for(int i =0;i<arr.length;i++){
          if(arr[i]<35){
              System.out.print(i + " ");
          }
        }

    }
}
