package day21_FoorEachLoop;

import java.util.Arrays;

public class CopyOfArrayUtility {
    public static void main(String[] args) {
        String[] students = {"Sam", "Cem", "David", "Yussuf", "Cleiton", "Alex", "Aaron", "Daniel", "James", "Roman"};
        String[]  BClass = Arrays.copyOf(students,13);
        System.out.println(Arrays.toString(BClass));
        System.out.println("-------------------------------------------------------------------------------------");
        char[] ch1= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[]  ch2= Arrays.copyOfRange(ch1,2, 5);
        System.out.println(Arrays.toString(ch2));
    }
}
