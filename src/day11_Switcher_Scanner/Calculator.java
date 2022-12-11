package day11_Switcher_Scanner;

public class Calculator {
    public static void main(String[] args) {
   double n1 =200.5;
   double n2 = 10.5;
   char operator = '+';
   boolean valid = operator=='+'||operator=='-'||operator=='*'||operator=='/';
   if(valid){
       switch (operator){
           case '+':
               System.out.println(n1+n2);
               break;
           case '-':
               System.out.println(n1-n2);
               break;
           case '*':
               System.out.println(n1*n2);
               break;
           case '/':
               System.out.println(n1/n2);
               break;

       }
   }else{
       System.err.println("Invalid Operator: " + operator);
   }

    }
}
/*
given two variable n1, n2 and a char variable named operator.
Use switch statement to calculate the result if n1, n2 based on the given the operator.
Valid operators are: -, +, /, *
 */