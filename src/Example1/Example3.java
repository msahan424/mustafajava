package Example1;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isTall = scan.nextBoolean();
        boolean isFast= scan.nextBoolean();
        boolean isFlexible= scan.nextBoolean();
        String sport= "";
        if(isTall){
            if(isFast){
                sport ="basket";
            } else if (isFlexible) {
                sport= "gym";

            }else{
                sport="volleyball";
            }
        }else{
            if(isFast){
                sport= "soccer";
            }else{
                sport= "tennis";
            }
        }
        System.out.println(sport);
    }
}