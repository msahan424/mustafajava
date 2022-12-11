package OustionOfArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("red");
        colors.add("yellow");
        colors.add(3, "cyan");
        System.out.println(colors);
    }
}
