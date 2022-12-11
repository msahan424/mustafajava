package day16_FoorLoopString;

public class DigitsLetterSpacialCharacters {
    public static void main(String[] args) {
        String str= "IndependentCollage12345!@#%$WoodenSpoon";
        String digits= ""; //12345
        String letters=""; //IndependentCollageWoodenSpoon
        String specialChars= "";//!@$%
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);//ch: each character that have in str
            if (ch>='0'&& ch<= '9'){
                digits+=ch;
            }else if(ch>= 'A'&& ch<='Z'){
                letters+=ch;

            }else if(ch>= 'a'&& ch<='z'){
                letters+= ch;
            }else{
                specialChars+=ch;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);
    }
}
