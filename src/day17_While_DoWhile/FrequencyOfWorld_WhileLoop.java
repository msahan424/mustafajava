package day17_While_DoWhile;

public class FrequencyOfWorld_WhileLoop {
    public static void main(String[] args) {
        String str= "Java Java Java Python Python";
        int frequency= 0;
        while (str.contains("Java")){
            str=str.replaceFirst("Java", "C#");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println(str);
    }
}
