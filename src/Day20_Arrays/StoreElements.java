package Day20_Arrays;

import java.util.Arrays;

public class StoreElements {
    public static void main(String[] args) {
        //store the elements: 10, 20, 50,70
        int[] number = {10, 20, 50, 70}; //size:4
        System.out.println(Arrays.toString(number));
        System.out.println("----------------------------------------------------------------------------");
        // create a variable that can contain 5 scores
        int[] scores= new int[5];
        scores[0]= 20;
        scores[1]= 50;
        scores[2]= 70;
        scores[3]= 0;
        scores[scores.length-1]= 90;
        System.out.println(Arrays.toString(scores));
    }
}
