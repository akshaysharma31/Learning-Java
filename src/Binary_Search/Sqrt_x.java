package Binary_Search;

public class Sqrt_x {
    public static  int mySqrt(int x) {

        return (int) Math.sqrt(x);  // newton rapson method very fast code
    }
    public static int my2Sqrt(int x) {


        long lo = 0 ;
        long hi = x;

        while(lo<=hi){
            long mid = lo + (hi-lo) / 2; // (lo+hi) / 2
            if(mid*mid ==  x ) return (int) mid;

            else if(mid*mid > x) hi = mid -1;
            else if(mid*mid < x) lo = mid + 1;
        }

        return (int) hi;

    }
    public static void main(String[] args) {
        int x = 8;
//         int y = mySqrt(x);
//        System.out.println(y);

        int y = my2Sqrt(x);
        System.out.println(y);
    }
}
