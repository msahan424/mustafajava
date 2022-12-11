package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5F;
        byte num1 = (byte) averageScore; // explicit casting
        short num2 = (short) averageScore; // explicit casting
        float num3 = averageScore; // no casting
        double num4 = averageScore; // implicit casting
        long num5 = (long) averageScore; // explicit casting
        int num6 = (int) averageScore;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
    /*  implicit casting: casting smaller type to larger
        explicit casting  : casting the larger type  to smaller

     */
}
