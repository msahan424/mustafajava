package Replit;

import java.util.Scanner;

public class times_Up {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour;
        int minute;
        int second;
        String amOrPm;
        hour= scan.nextInt();
        minute= scan.nextInt();
        second= scan.nextInt();
        amOrPm= scan.next();
        //12:24:33 PM
        System.out.println(hour +":"+minute+":"+second+":"+amOrPm);
    }
}
