package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number= 19;
        String result = "";
     if(number>= 1&& number<= 18){
         switch (number){
             case 1: case 2: case 3: case 4: case 5:
                 result ="Elementary School";
                 break;
                 case 6: case 7: case 8:
                     result = "Middle school";
                     break;
                     case 9: case 10: case 11: case 12:
                         result = "High School";
                         break;
                         case 13:  case 14: case 15: case 16:
                             result = "Collage";
                             break;
             default:
                result = "Grad School";
                break;
         }

     }else{
         result = "Invalid Grade";

     }
        System.out.println(result);
    }
}
/*
Warm ip:
1. Create a class called Grade level, given a number(byte0 grade level determine and  print which school type someone is in.
grade level and types are:
1-5: Elementary School
6-8: Middle School
9-12: High School
13-16: Collage
17-18: Grad School
     for Any Other grade: Invalid grade level given

 */