package day25_CustomMethods_OverLoading;

public class AddElements_Overloading {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6};
         numbers= addElements(numbers,7);
        char[] chars= {'A','B', 'C', 'D'};
        String[] names ={"Alka", "Alsa", "Alna", "Alfa"};
        double[]  even= {2.2, 2.4,2.6,2.8,};
    }
   //1. create return method called addInteger that can add Integer after the last index of  an integer array.
   public static int[] addElements(int[] array, int element){
       int[]  result = new int[array.length+1];

       int i = 0;
       for (int each: array){
           result[i++]=each;
       }
       result[i]=element;
       return result;
   }

    //2. create return method called addDouble that can add Integer after the last index of  a double array.
    public static double[]  addElements(double[] array, double element){
        double[] result = new double[array.length+1];
        int i=0;
        for(double each : array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    //3. create return method called addString that can add Integer after the last index of  a String array.
    public static String[]  addElements(String[] array, String element){
        String[] result = new String[array.length+1];
        int i=0;
        for(String each : array){
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;
    }

    //4. create return method called addChar that can add Integer after the last index of  a char array.
    public static char[]  addElements(char[] array, char element){
        char[] result = new char[array.length+1];
        int i=0;
        for(char each : array){
            result[i++]=each;
        }
        result[result.length-1]=element;
        return result;
    }
}
