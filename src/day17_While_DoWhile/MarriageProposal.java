package day17_While_DoWhile;

import org.w3c.dom.css.CSSStyleRule;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me, please?");
        String marriage= scan.next().toString();
        while(!((marriage.equals("yes"))||(marriage.equals("no")))){
            System.out.println("Invalid answer please say again ");
            marriage=scan.next().toLowerCase();

        }
        if (marriage.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
