package day11_Switcher_Scanner;

public class NumberTwoWords {
    public static void main(String[] args) {
        int num= 7;

        String result = (num>=0 && num<= 9)?
                (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ? "Four" : (num == 5) ? "Five"
                : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine"
                : "invalid Number";
        System.out.println(result);

    }
}
