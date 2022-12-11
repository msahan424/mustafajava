package day11_Switcher_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
       int num1= input.nextInt();
       double num2= input.nextDouble();
       float num3= input.nextFloat();
       input.close();// closes the scanner , after this scanner can not be used anymore
       double result = num1 +num2 * num3;
        System.out.println(result);

    }
}
