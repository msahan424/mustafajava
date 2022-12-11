package day08_IfStatement;

public class CreditScore {
    public static void main(String[] args) {
        int creditScore = 800;
        String name = "John";
        int age  =24;
        int income = 32000;
        boolean isEligible = creditScore >= 700 && age >=18 && income>= 29000;
        System.out.println(name + " is eligible for loan " + isEligible);

    }
}
