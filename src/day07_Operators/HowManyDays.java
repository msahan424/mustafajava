package day07_Operators;

public class HowManyDays {
    public static void main(String[] args) {
        
   
    /* in 5000000000 minutes how many days and how many hours?
    1 h = 60 min
    1 day= 24 h
    1 day = 60*24 min = 1440
    
     */
        int h = 60;
        int day = 1440;
        double x= 5_000_000;
        int resultDay;
        int resultHours;
        resultDay = (int) (x/day);
        resultHours= (int) (x/h);

        System.out.println("resultHours = " + resultHours);
        System.out.println("resultDay = " + resultDay);

    }
}
