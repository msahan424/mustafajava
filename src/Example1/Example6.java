package Example1;

public class Example6 {
    public static void main(String[] args) {
        /*String s= "the game was tied at 2-2";
        String s2= s.substring(5);
        int index1= s.indexOf("game");
        int index2 = s2.indexOf("game");
        if (index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
        String z= "popcorn";
        z= z.substring(1,8);
        if(z.equals("opcor")) {
            System.out.println(z.length());
        }else{
            System.out.println(z.replace("o", "a"));
        }*/
        System.out.println("-------------------------------------------------------------------------------------");
        String a= "today I will go to beach";
        boolean b =a.contains("i");
        boolean c= a.substring(12).startsWith("go");
        String result = b&&c?"go": "don't go";
        System.out.println(result);
    }
}
