package string_part2;

public class append {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("abc");
      sb.append("xyz");
        System.out.println(sb);
        StringBuilder s = new StringBuilder("pqr");
        sb.append(s);
        System.out.println(sb);
    }
}
