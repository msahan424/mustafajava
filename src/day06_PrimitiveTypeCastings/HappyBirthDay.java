package day06_PrimitiveTypeCastings;

import java.time.LocalDate;

public class HappyBirthDay {

    public static void main(String[] args) {
        //happyBirtDay(year: 1990, month:6, day:15 );


    }
    public static void happyBirthDay(int year, int month, int day){
        LocalDate birtDay= LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int month2= today.getMonthValue();
        int day2= today.getDayOfMonth();
    }
}
 