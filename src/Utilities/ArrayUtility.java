package Utilities;

import java.util.Arrays;

public class ArrayUtility {
    // prints each integer of an integer array in separate lines
    public  static void printEachElements(int[] array){
        for(int each: array){
            System.out.println(each);
        }
    }
    // prints each double of a double array in separate lines
    public  static void printEachElements(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }
   // prints each char of char array in separate lines
    public  static void printEachElements(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }
    // prints each string of a string  array in separate lines
    public  static void printEachElements(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //return the maximum number for double array;
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    //return the minimum numbers for double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
         return numbers[0];
    }
}
