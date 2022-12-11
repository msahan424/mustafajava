package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String s = "Java Nova Cava Wava orange";
        int firstA= s.indexOf("a");
        int secondA= s.indexOf("a ");
        int lastA= s.lastIndexOf("a");
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
    }
}
