package day15_FoorLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        System.out.println("enter a word");
        String word =new Scanner(System.in).next();//xcodes
        if(word.charAt(0)=='x'){
          word= word.replaceFirst("x", "a");
        }
        System.out.println(word);

    }
}
