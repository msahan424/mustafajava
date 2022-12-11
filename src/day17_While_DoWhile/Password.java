package day17_While_DoWhile;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your  username please");
        String username= scan.nextLine();
        System.out.println("Enter your  password please");
        String password= scan.nextLine();
       if (username.equals("mahan")&&password.equals("Akdeniz123.")){
           System.out.println("Welcome, again");
       }else{
           int attempts=3;
           while(!((username.equals("mahan"))&& (password.equals("Akdeniz123.")))&& (attempts>0)){
               System.out.println("Incorrect username or password, please re-enter");
               System.out.println("Enter your username, please");
               username= scan.nextLine();
               System.out.println("enter your password, please ");
               password=scan.nextLine();
               attempts--;

           }
           if ((username.equals("mahan"))&&(password.equals("Akdeniz123."))){

               System.out.println("Welcome, again");
           }else{
               System.out.println("you are account is Lucked ");
           }
       }
       scan.close();
    }
}
