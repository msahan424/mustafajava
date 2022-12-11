package day17_While_DoWhile;

public class NestedLoops1 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.print("*");

            }
            System.out.println();

            }
        }
    }

