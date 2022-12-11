package day25_CustomMethods_OverLoading;

public class SumOfNumbers {
    public static void main(String[] args) {
       int num= sumOfTwoNumbers(10,20);
        System.out.println("num = " + num);
      int num2=  sumOfThreeNumbers(10,20,30);
        System.out.println("num2 = " + num2);
       int num3= sumOfFourNumbers(10,20,30,40);
        System.out.println("num3 = " + num3);
       int result= num + num2+ num3;
        System.out.println("result = " + result);

    }

    public static int sumOfTwoNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOfThreeNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfFourNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
}
