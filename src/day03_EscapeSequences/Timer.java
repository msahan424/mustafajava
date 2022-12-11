package day03_EscapeSequences;

import java.util.Scanner;

public class Timer {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the number of minute");
        int min = scan.nextInt();
        scan.close();
        for (int i= min; i>0; --i){
            if(i<0)  {
                break;
            }
                for(int z= 59; z>= 0; --z ){
                    System.out.println("\r" + (i-1)+"minutes and " +z+ "second left");
                    //there is no timer reader

            }
        }
        System.out.println("\n\n");
        System.err.println("\t\t\t*****************************************");
        System.err.println("\t\t\t*                                       *");
        System.err.println("\t\t\t*                                       *");
        System.err.println("\t\t\t*                                       *");
        System.err.println("\t\t\t*****************************************");
    }
}
