package day25_CustomMethods_OverLoading;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str1= "Java programing Language ";
        StringUtility.printEachChar(str1);
        StringUtility.reverse(str1);
        System.out.println("-----------------------------------------------");
        String s1 = "wooden spoon";
        String s = StringUtility.reverse(s1);
       StringUtility.printEachChar(s1);
        System.out.println(s);
        System.out.println("-------------------------------------------------");
        String word= "Civic";
        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println(palindrome);
        System.out.println("---------------------------------------------------");
        String[] names = {"Anna", "Java", "Python", "racecar", "Mom"};
        int count=0;
        for (String each: names){
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("---------------------------------------------------");
          String s2 = "dormitory";
          String s3 =  "dirtyroom";
          boolean result =StringUtility.anagram(s2,s3);
        System.out.println(result);
        String s4= "aaaaaaaaaafffffffffffggggggggggg";
        String d1= StringUtility.removeDuplicates(s4);
        System.out.println(d1);
    }
}
