package day17_While_DoWhile;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 'A'; i < 'Z'; i++) {

            if (i=='B'){
                i+=i;

                break;
            }
            System.out.print(i);
        }
    }
}
