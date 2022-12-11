package day25_CustomMethods_OverLoading;

import Utilities.ArrayUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,};
       ArrayUtility.printEachElements(array);
        System.out.println("--------------------------------------------------");
       double[] array1= {1.2, 1.3,1.4};
       ArrayUtility.printEachElements(array1);
        System.out.println("----------------------------------------------------");
      char[] array2 = {'a','b','d','e' };
      ArrayUtility.printEachElements(array2);
        System.out.println("-----------------------------------------------------");

        String[] array3 ={"Gulerma",  "Alex", "Alenzinho", "Hagi"};
        ArrayUtility.printEachElements(array3);
        System.out.println("-----------------------------------------------------");
        double[] numbers= {2.1, 2.2, 2.3, 2.4};
        double result = ArrayUtility.max(numbers);
        System.out.println(result);
        System.out.println("----------------------------------------------------");
        double[] minNumbers = {4.0,5.0,2.3,1.2,0.6};
       double result1=  ArrayUtility.min(minNumbers);
        System.out.println(result1);
    }
}
