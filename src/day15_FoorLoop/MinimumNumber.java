package day15_FoorLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       int min= 2147483647;// any number that user enter will be less than  2147483647
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
              int num = scan.nextInt();
              if(min>num){
                  min=num;
                  System.out.println("min = " + min);
              }

        }
        System.out.println("result :" + min);
    }
}
