package day11_Switcher_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch= 'B';
        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Percentage of 10");
            case 'B':
                System.out.println("great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;


        }
    }
}
