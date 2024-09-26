package string_part2;

public class insert_and_delete_charAt {
    public static void main(String[] args) {
        // deleteCharAt() -> you give index, that paticular character is remove from string
        // insert()  -> insert a char , int , string at paticular index and shift the rest of element
        StringBuilder  s = new StringBuilder("abcxyz");
//        s.deleteCharAt(2);

        s.delete(2,5);
        System.out.println(s);// abz
        s.insert(2,"pqr");
        System.out.println(s);// abpqrz
    }
}

