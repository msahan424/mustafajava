package day16_FoorLoopString;

public class Palindrome {
    public static void main(String[] args) {
       String word = "level";
       String reversed= "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);
        }
        boolean isPalindrome= word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
/* "Java"====> "avaJ"=====> false(not Palindrome)
    "Anna" ====> "Anna"===> true
 */