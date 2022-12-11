package day04_Variable;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours
        double hourslyRate = 10.80;
        int weeklyHours = 20;

        double salary = hourslyRate*weeklyHours*52;
        //When we click "soutv" it is providing this "System.out.println("salary = " + salary);"
        System.out.println("salary = $ " + salary);


    }
}
