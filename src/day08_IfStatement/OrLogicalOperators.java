package day08_IfStatement;

public class OrLogicalOperators {
    public static void main(String[] args) {
        String name = "Aisle";
        int age = 22;
        char gender = 'F';
                boolean isEligible = age>= 18 && (gender== 'M'||gender=='F');
        System.out.println(name +" is eligible to work: " + isEligible);
    }
}
