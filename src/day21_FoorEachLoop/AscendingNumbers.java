package day21_FoorEachLoop;

import java.util.Arrays;

public class AscendingNumbers {
    public static void main(String[] args) {
        int[]scores= {80, 60, 65, 90, 85};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min scores= " + scores[0]);
        System.out.println("Max scores = " + scores[scores.length-1]);
        System.out.println("---------------------------------------------");
        String[] names= {"Zahd", "Akroba","Devid", "Alihanzo"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("-------------------------------------------------");
        String[] words= {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


    }
}
