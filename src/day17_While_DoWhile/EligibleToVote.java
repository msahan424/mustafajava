package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        while(!(age>=1&& age<=120)){
            System.err.println("Invalid entry, Please Re-enter");
            age=scan.nextInt();

        }
        System.out.println("are you an Ireland citizen Yes/No");
        String answer=scan.nextLine().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("invalid entry, re-enter please");
            System.err.println("are you an ireland citizen Yes/No");
            answer=scan.next().toLowerCase();
        }
        if (age>=18&& answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }

    }
}
