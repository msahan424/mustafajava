package day15_FoorLoop;

public class equalsIgnoreCaseMethods {
    public static void main(String[] args) {
        String sentence= "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains(("java"));
        boolean hasJava3= sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java")|| sentence.contains("Java");
        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("r3 = " + r3);
    }
}
