package Arrays;

import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        System.out.print("Enter size of arr : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter arr element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag = true;
                break;
            }

        }

        if(flag==true){
            System.out.println("Element Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
