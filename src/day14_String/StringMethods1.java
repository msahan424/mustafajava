package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "   batch 25          ";

        str=str.trim();
        System.out.println(str);
        System.out.println("-----------------------------------------------------------------------------------");
        String str1 = "Independent Collage";
       int totalChars= str1.length();
        System.out.println("totalChars = " + totalChars);
        int n2= str1.indexOf("ent");
        System.out.println("n2 = " + n2);
        int n1 = str1.indexOf("o");
        System.out.println("n1 = " + n1);

        int n = str1.indexOf("ll");
        System.out.println("n = " + n);
        int n4 = str1.lastIndexOf("g");
        System.out.println("n4 = " + n4);
    }
}
