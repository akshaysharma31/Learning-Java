package string_part2;

public class string_with_the_maximum_value_in_integer {
    public static void main(String[] args) {

        String[] arr = {"456", "0045", "678"};


        // -->> Method 2
        String maxS = arr[0];
        for(int i =0;i<arr.length;i++){
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);

    }


    public static String max(String a, String b) {

        String x = purify(a), y = purify(b);

        if (x.length() > y.length()) return a;
        if (x.length() < y.length()) return b;

        for (int i = 0; i < a.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) {
                if (x.length() > y.length()) return a;
                else return b;
            }
        }

        if (x.length() >= y.length()) return a;
        else return b;
    }


    public static String purify(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                return s.substring(i);
            }

        }
        return s;

    }

}

 //String[] arr = {"456", "0045", "678"};


// --->>     Method 1
//        int mx = Integer.MIN_VALUE;
//        for(int i =0 ;i<arr.length;i++){
//            int x = Integer.parseInt(arr[i]);
//
//            mx = Math.max(mx,x);
//        }
//
//        System.out.println(mx);

