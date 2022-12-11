package day11_Switcher_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=11;
  if(number>=1 && number<= 12) {
      switch (number) {
          case 2:
              System.out.println("28 Days");
              break;
          case 4:
          case 6:
          case 9:
          case 11:
              System.out.println("30 Days");
              break;
          default:
              System.out.println("31 Days");

      }

  }else{
      System.out.println("invalid Number");
  }

    }
}

/*
NumberOfDays
28 Days:2
30Days:4,6,9,11
31 Days: 1,3,5,7,8,10,12
if(~){
}else {
invalid

 */