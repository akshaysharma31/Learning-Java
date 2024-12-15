package Merge_and_Quick_Sorting;

public class Inversion_count_problem {
  static int count;

  public static void inversion(int[] a , int[] b){
      int i =0;
      int j = 0 ;
      while(i< a.length && j< b.length){
          if(a[i]>b[j]){
              count += (a.length-i);
              j++;
          }else{
              i++;
          }
      }
  }
    public static void mergesort(int[] a , int[] b , int[] c){
      int i = 0;
      int j = 0;
      int k = 0;
      while(i<a.length && j<b.length) {
          if (a[i] <= b[j]) {
              c[k] = a[i];
              i++;
              k++;
          }
          else {
              c[k] = b[j];
              j++;
              k++;

          }
      }
      while(i<a.length){
          c[k] = a[i];
          i++;
          k++;
      }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }

    public static void divide(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i = 0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i = 0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        divide(a);
        divide(b);
        inversion(a,b);
        mergesort(a,b,arr);
    }

    public  static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Brute Force
//        int[]  arr = {8,2,5,3,1,4};
//        int n = arr.length;
//        int count = 0;
//        for(int i = 0 ;i<n-1;i++){
//            for(int j = i+1 ;j<n;j++){
//                if(arr[i] > arr[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.print(count);





        int[]  arr = {8,2,5,3,1,4};
        print(arr);
        divide(arr);
        print(arr);
        System.out.println(count);


    }
}
