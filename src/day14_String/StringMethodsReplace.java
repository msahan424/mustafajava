package day14_String;

public class StringMethodsReplace {
    public static void main(String[] args) {
        String str= "Java is fun, I love learning Java";
        System.out.println("str = " + str);
        String str1= str.replace("Java", "Python" );
        System.out.println("str1 = " + str1);
        String email = "JohnSmith@yahoo.com";
        email= email.replace("yahoo", "gmail");
        System.out.println("email = " + email);
    }
}
