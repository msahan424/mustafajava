package Example1;

public class LoopsShort {
    public static void main(String[] args) {
         String ta= "A";
         ta= ta.concat("B");
         String tb= "C";
         ta= ta+tb;
         ta.replace('C', 'D');
         ta=ta+tb;
        System.out.println(ta);


    }
}
