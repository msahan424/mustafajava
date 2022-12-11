package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scan.nextLine();
        System.out.println("enter your street name");
        String building = scan.next();
        scan.nextLine();
        System.out.println("Enter your Street name");
        String street = scan.nextLine();
        System.out.println("name = " + name);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
    }
}
