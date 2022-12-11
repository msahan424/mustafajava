package Day20_Arrays;

import java.util.Arrays;

public class Letters {
    public static void main(String[] args) {
        char[] letter = new char[26];
        /*
        letter[0] = 'A';
        letter[1] =  'B';
        ........
         */
        for (char i = 'A', j=0; i <='Z' && j<letter.length; i++, j++) {
            letter[j]=i;

        }
        System.out.println(Arrays.toString(letter));
    }
}
