package day08_IfStatement;

public class SingleIfStatement {
    public static void main(String[] args) {
        int num = 150;
        boolean oddNumber = num % 2 == 0;
        boolean evenNumber = num % 2 != 0;
        if (oddNumber) {
            System.out.println(num + " is a odd number");
        }
        if(evenNumber){
            System.out.println(num + " is even number");
        }
    }
}
