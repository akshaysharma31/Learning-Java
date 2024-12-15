package Merge_and_Quick_Sorting;

public class Merge_Sort_Algorithm {
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
        System.out.println();
    }

    public static void dividearr(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i = 0 ;i<n/2;i++){
            a[i] =  arr[i];
        }
        for(int i = 0 ;i<n-n/2;i++){
            b[i] =  arr[i+n/2];
        }
        dividearr(a);
        dividearr(b);
        mergshortarr(a,b,arr);
    }

    public static void main(String[] args) {
        int[] arr ={10,67,30,40,89,60,70};

        print(arr);
        dividearr(arr);
        print(arr);



    }
}
