package Merge_and_Quick_Sorting;

public class Merge_Sort_2_arr {

    public static void mergshortarr(int[] a , int[] b , int[] c){
       int i = 0;
       int j = 0;
       int k = 0;

       while(i<a.length  &&  j<b.length){
           if(a[i] <= b[j]){
               c[k] = a[i];
               i++;
               k++;
           }
           else{
               c[k] = b[j];
               j++;
               k++;
           }
       }
       while(i<a.length) {
           c[k] = a[i];
           i++;
           k++;
       }
        while(j<b.length) {
            c[k] = b[j];
            j++;
            k++;
        }


    }

    public  static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] a ={10,20,30,40,50,60,70};
        int[] b = {21,42,56,68};
        int[] c = new int[a.length+ b.length];
       mergshortarr(a,b,c);
       print(c);
    }
}
