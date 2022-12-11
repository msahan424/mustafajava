package day14_String;

public class ReplaceFirst {
    public static void main(String[] args) {
        String s= "Dog Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog", "Cat");
        System.out.println("s = " + s);
        String s2 = "C# is cool, C# is cool";
        s2=s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);
        System.out.println("------------------------------------------------------------------------------------");
        String result = "Java Java Java";
        result= result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);
        String result2 = result.replace("Java", "Python");
        System.out.println("result2 = " + result2);
    }
}
