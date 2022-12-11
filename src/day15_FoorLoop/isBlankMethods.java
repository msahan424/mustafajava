package day15_FoorLoop;

public class isBlankMethods {
    public static void main(String[] args) {
        String str = " ";
        boolean empty = str.isEmpty();
        System.out.println("empty = " + empty);
        boolean blank = str.isBlank();
        System.out.println("blank = " + blank);
    }
}
