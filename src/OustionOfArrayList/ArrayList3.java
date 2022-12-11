package OustionOfArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.set(0, list1.get(4));
        list1.set(4, list1.get(0));
        System.out.println(list1);
    }
}
