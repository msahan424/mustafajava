package day14_String;

public class Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)
        String word= "Independent Collage";
        //            01234...
       String str= word.substring(4,11+3);
       // System.out.println("str = " + str);
        //string brand
        String str1= word.substring(11);
      //  System.out.println("str1 = " + str1);
        System.out.println("-----------------------------------------------------------------------------------------");
        String word2= "Java Programming Language";
        String s1= word2.substring(0, word2.indexOf(" "));
        String s2= word2.substring(word2.indexOf("")+1, word2.indexOf(""));

        System.out.println("s1 = " + s1);
         System.out.println("s2 = " + s2);
        //System.out.println("s3 = " + s3);
    }
}
