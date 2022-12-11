package day08_IfStatement;

public class Eligible {
    public static void main(String[] args) {


    /*Tasks:
1. Given a number (byte) age, write a program that can check if the  person is eligible to buy Cigarettes
      */
        String name = "Alex";

        byte age = 19;
        String citizen = "UK";
        boolean isEligible = age > 18;
        System.out.println(name + "is eligible to buy cigarettes: " + isEligible);

    }
}
