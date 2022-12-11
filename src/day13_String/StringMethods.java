package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);
        s1=s1.toUpperCase();
        System.out.println(s1);
        String s2 = "JAVA";
        s2= s2.toLowerCase();
        System.out.println("s2 = " + s2);
    }
}
