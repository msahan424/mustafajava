package day23_CustomMethods_Void;



public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(5);
    }
    //create a function that can check if a number is odd or even
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }
}
