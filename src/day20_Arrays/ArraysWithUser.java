package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWithUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would like to enter:");
        int length= scan.nextInt();
        if (length<= 0){
            System.err.println("Invalid entry try again please");
            length=scan.nextInt();

        }
        int[] numbers= new int[length];//array needs to have enough capacity to contain all the elements user going to enter
        for (int i = 0; i < length; i++) {
            System.out.println("you did well " + i);
            numbers[i]= scan.nextInt();// each input user provided during each execution of the loop, will be assigned to the indexes of

        }
        System.out.println(Arrays.toString(numbers));
    }
}
