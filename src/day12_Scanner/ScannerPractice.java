package day12_Scanner;
// Import Java.util.   wild import: imports everything from the package
import java.util.Scanner; // regular imports: imports one class

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 1 to 7:");
       int num1=  scan.nextInt();
        long num2 = scan.nextLong();
        double num3= scan.nextDouble();
        float num4 = scan.nextFloat();
        int result = (int) (num1 + num2 + num3 +num4);
        String result1 = "";
       if(num1>= 1 && num1 <= 7){

       }else{
           result1= "invalid Number";
       }
    }
}
/*
Scanner Class : used for getting user inputs from user
   needs to be imported from "java.util2
   syntax of import statement:
   import package.class:
   import java.util.scanner:
   declare:
   Scanner variableName = new Scanner(System.in)
 */