package day15_FoorLoop;

public class StartsWithMethods {
    public static void main(String[] args) {
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.startsWith("oo");
        boolean z = a.endsWith("den");
        boolean k = a.endsWith("oon");
        boolean m = a.toLowerCase().startsWith("wooden");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
        System.out.println(m);
    }
}
