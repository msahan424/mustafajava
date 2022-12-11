package day23_CustomMethods_Void;

public class CustomTwoMethods {
    public static void main(String[] args) {
        helloWorld5Times();
        helloMySchool5Times();
        oddNumbers1to10();
        System.out.println("-------------------------------------------------------------------------------------");
        evenNumbers1to10();
    }
    //create a function that can print hello world 5 times;
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    //create a function that can print "Hello My School " 5 times====>
    public static void helloMySchool5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello My School");

        }
    }
    // create a function that can print all the odd numbers from 1~10 ====> oddNumber1to10
    public static void oddNumbers1to10(){
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;

            }
            System.out.print(i);
        }
    }
    //create a function that can print all even numbers from 1 to 10 ==== > evenNumber1to10
    public static void evenNumbers1to10(){
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                System.out.print(i);
            }

        }
    }
}
