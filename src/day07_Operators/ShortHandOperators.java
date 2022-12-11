package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment:=
        int num =100;
        System.out.println("num = " + num);  //100
        num =200;
        System.out.println("num = " + num); //200

        String word = "Java";
        System.out.println("word = " + word);
        word = "Wooden";
        System.out.println("word = " + word);
        word = "123" + 42 + 20;
        System.out.println("word = " + word);
        word = "Ali " + "Ahmet";
        System.out.println("word = " + word);
        int x= 20;
        x+= 10;
        System.out.println("x = " + x);
        x-= 15;
        System.out.println("x = " + x);
        String str = "Phone";
        str += " Apple";
        System.out.println("str = " + str);


    }
}
