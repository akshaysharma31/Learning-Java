package Time_And_Space_Complexity;

public class arrays_and_nested_loops {
    public static void main(String[] args) {

//     for(int i = 0 ;i<n;i++){
//            for(int j =0;i<m;j++){
//                System.out.println("*");
//            }
//        }
         // T.N.O = n*m
        // T.C = O(n*m)

        // O(n) > O(n*m) = O(n) is faster



//     for(int i = 0 ;i<n;i++){                i=0  j= not run
//            for(int j =0;i<i;j++){           i=1   j=0       1 time
//                System.out.println("*");     i=2   j=0,1     2 times
//            }                                i=3   j=0,1,2   3 times
//        }

     // T.N.O = 0+1+2+3-----n-1;
        // n*(n-1)/2 --> n²/2 * n/2 = O(n²)

    }
}
