package OustionOfArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
        list1.add(i);
       }
        boolean result = list1.containsAll(Arrays.asList('a','c','D'));
        System.out.println(result);

    }
}
