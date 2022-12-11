package day12_Scanner;

import java.util.Scanner;

public class NextLineScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName = scan.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("Enter your age");
        int age= scan.nextInt();//14enter

        System.out.println("age = " + age);
        scan.nextLine();
        String schoolName= scan.nextLine();
        System.out.println("schoolName = " + schoolName);
    }
}
