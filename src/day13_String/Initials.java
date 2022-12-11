package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname= scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();
        char i= firstname.charAt(1);
        char a = lastName.charAt(3);
        String initial = "" +i + a;
        System.out.println(initial);


    }
}
