package day11_Switcher_Scanner;

public class DayInWeek {
    public static void main(String[] args) {
        // long number=9L
        // float number
        //double number
        //boolean number


       int number=9;

        switch (number){//1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default: // only gets executed if none of the case blocks of the case blocks are matching
                System.out.println("Invalid");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
           // default:
               // System.out.println("Invalid");
        }

      /*  if(number==1){
            System.out.println("Monday");
        } else if (number==2) {
            System.out.println("Tuesday");

        }else if (number==3){

        }

       */
        System.out.println();
    }
}
