package day25_CustomMethods_OverLoading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 4, 5, -1, 2, -3, 0};
        Arrays.sort(intArray);
        double[] doubleArray = {1.2, 2.3, 10.3, 11.5};
        Arrays.sort(doubleArray);
        char[] charArray = {'A', 'B', 'C', 'D'};
        Arrays.sort(charArray);
    }
    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1,num2) + num3;
    }
    public static char sumOfNumbers(char num1, char num2) {
        return (char) (num1 + num2);
    }
}
  /*
   Method Overloading: multiple different methods sharing same methods name
                       same method name, different parameters
   */