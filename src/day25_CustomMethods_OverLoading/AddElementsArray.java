package day25_CustomMethods_OverLoading;

import java.util.Arrays;


public class AddElementsArray {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,};
       arr= addInteger(arr,6);
        System.out.println(Arrays.toString(arr));
        double[] arr2 = {1.5,2.4,3.6,4,5.6,6.7,};
        arr2=addDouble(arr2,8.8);
        System.out.println(Arrays.toString(arr2));
        String [] arr3={"al", "ab", "ad,", "ad"};

        arr3= addString(arr3, "ak");
        System.out.println(Arrays.toString(arr3));
        char[]  arr4= {'a','b','c','d'};
        arr4= addChar(arr4,'e');
        System.out.println(Arrays.toString(arr4));
    }
    public static int[] addInteger(int[] array, int element){
        int[]  result = new int[array.length+1];

        int i = 0;
        for (int each: array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
    public static double[]  addDouble(double[] array, double element){
        double[] result = new double[array.length+1];
        int i=0;
        for(double each : array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
    public static String[]  addString(String[] array, String element){
        String[] result = new String[array.length+1];
        int i=0;
        for(String each : array){
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;
    }
    public static char[]  addChar(char[] array, char element){
        char[] result = new char[array.length+1];
        int i=0;
        for(char each : array){
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;
    }

}
  /*  Task2.
  1. create a return method call addInteger that can add in Integer after the last index of integer array
            {1,2,3,4},5
            new Array===> {1,2,3,4,5,}
  2 . create a return method called addDouble that can add double after the last index ofr a double array

  3. create a return method called addString that can addString can add a string the last index of a string array.

   4. create a return method call addChar that can addChar can add a char the last index of a char array.
   */