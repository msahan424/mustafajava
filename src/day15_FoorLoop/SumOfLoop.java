package day15_FoorLoop;

import java.util.Scanner;

public class SumOfLoop {
    public static void main(String[] args) {
        double sum= 0;
        for (int i = 1; i < 101; i++) {
          sum += i;
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println("----------------------------------------------------------------");
        int total= 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number:");
            total+=scan.nextInt();
        }
        System.out.println("total = " + total);

    }
}
