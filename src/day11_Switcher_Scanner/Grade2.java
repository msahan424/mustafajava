package day11_Switcher_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        // if the grades A, B, C, D,  === passed
        // otherwise grades is  F=== Failed
        char ch = 'E';

        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }

    }
}
