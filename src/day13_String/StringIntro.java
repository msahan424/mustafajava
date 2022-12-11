package day13_String;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String  name3 = "Wooden Spoon";
        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println("--------------------------------------------------------------");
        String str = "Java";
        String str1= new String("Java");
        System.out.println(str.equals(str1));
        System.out.println("-------------------------------------------------------------------");
        String s3= "Java";
        String s4 = new String("Java");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
