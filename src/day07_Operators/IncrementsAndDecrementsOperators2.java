package day07_Operators;

public class IncrementsAndDecrementsOperators2 {
    public static void main(String[] args) {
        int c =100;
        System.out.println(++c); //pre increment: increase the value by 1 right away
        int d =100;
        System.out.println(d++); // post increment : first passes the current value, then increases the value by 1
        System.out.println(d);
          int x =50;
        System.out.println("x = " + --x);
        int y = 50;
        System.out.println("y = " + y--);
        System.out.println("y = " + y);

    }
}
