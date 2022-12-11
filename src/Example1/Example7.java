package Example1;

public class Example7 {
    public static void main(String[] args) {
        int number= 5;
        while(number<100){
            number+=number;

        }
        System.out.println(number);
        System.out.println("--------------------------------------------------------------------------------");
        int a= 0;
        do{
            a=a++ + --a - (a%3);
        }while(++a<4);
        System.out.println(a);
        System.out.println("--------------------------------------------------------------------------------------");
        String str= "The whole time it was raining.";
        do {
            System.out.println(str.charAt(0));
            str = str.substring(3);
        }while(!str.isEmpty());
    }
}
