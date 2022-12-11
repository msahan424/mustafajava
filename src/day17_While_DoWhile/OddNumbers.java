package day17_While_DoWhile;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {//skip even numbers
            if (i%2==0){
                continue;
            }
            System.out.print(i+ " ");
        }
    }
}
