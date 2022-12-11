package day15_FoorLoop;

public class ForLoopEvenNumbers {
    public static void main(String[] args) {
        //print all the even numbers between 1~100
        for (int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("even numbers: " +i);
            }else if(i%2!=0){
                System.out.println("odd numbers: " + i);
            }
        }
    }
}
