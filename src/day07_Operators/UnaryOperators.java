package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -4;
        System.out.println(num1<0);
        System.out.println(num2<0);
        int division= 25/-4;
        int remainder= 25%-4;

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        System.out.println(division<remainder);
        System.out.println((division+remainder)< 0);
        System.out.println((division*remainder)>0);

    }
}
