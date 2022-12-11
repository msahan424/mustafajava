package day15_FoorLoop;

public class Alphabet {
    public static void main(String[] args) {
        //A~Z,====> (AsciiTable) 65~90;
        for (int i= 65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        for (char i = 'A'; i<= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        for (char i =1;  i<=3500; i++){
            System.out.print(i+" ");
        }
    }
}
