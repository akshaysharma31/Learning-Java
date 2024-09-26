package Time_And_Space_Complexity;

public class calculating_the_time_complexity_of_loops {
    public static void main(String[] args) {
        // Approximation

        // O(kn)~ O(n)
        // O(n +or- k)~ O(n)
        // O(5n + 4) ~ O(n)

        // 1-->Power of n are important
        // O(n²+5) ~ O(n²)
        // O(100√ n + 2) ~ O(√ n )

        // 2--> Highest power of n is considered
        //  O(n³+5n²+2n) ~ O(n³)
        // O(n^1/3 + n^1/2) ~ O(n^1/2)

        // 3--> if there are other variables like m , they are separable
        // O(n+10m) ~ O(n+m)


        // Constant time complexcity
        // for(int i =0 ;i<=200;i++){
        //   sout("Hello");
        // }
        // T.n.O (total number of opration) = 200
        // T.C (Time comlexcity) = O(200) ~ O(1)


       // O(n) > O(n²) = O(n) is faster
        // O(n) > O(n*m) = O(n) is faster

    }
}
