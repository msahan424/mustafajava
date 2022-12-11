package day15_FoorLoop;

public class ForLoopExamples2 {
    public static void main(String[] args) {
        //100,99,98... 50
        for (int i= 100; i>=50; i--){
            System.out.println(i);
        }
        //100,90,80,...,10,0
        for (int i=100; i>=0; i-=10){
            System.out.println(i);
        }
    }


}
