package day23_CustomMethods_Void;

public class BirthYear {
    public static void main(String[] args) {
        ageOfPerson(1993);
        printNumbers(3,8);
    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022-birthYear;
        System.out.println("you are age is " + age);
    }
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for ( int i=x; i < y; i++) {
            int result =i;
            System.out.println(result);
            
        }
    }
}
