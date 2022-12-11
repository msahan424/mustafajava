package day16_FoorLoopString;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "saaaaaaffkkkka";
        String result="";

        for (int i = 0; i < str.length(); i++) {//i:index of the numbers of starting from 0)
            char ch= str.charAt(i);// ch:each characters of str
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;

            }

        }


        System.out.println(result);
    }
}
