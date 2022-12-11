package day15_FoorLoop;

public class EqualsMethods {
    public static void main(String[] args) {
        String input = "Java";
        String  input2 = "java";
        String  input3 = "Java";
        String input4 = " I love Java";
        System.out.println(input.equals(input2));
        System.out.println(input.equals(input3));;
        System.out.println(input.equalsIgnoreCase(input3));
        System.out.println(input.equalsIgnoreCase(input2));
        System.out.println(input.equalsIgnoreCase(input4));
    }
}
