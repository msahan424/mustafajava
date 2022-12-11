package day24_CustomMethods_Return;

public class ReturnMethodFindMaxNumber {
    public static void main(String[] args) {
        //find the max number between 100 & 200;
       int value=  maxNumber(100,200);
        System.out.println(value);

        //multiply the number by 2;
        int c= value*2;
        System.out.println(c);
    }
    public  static int maxNumber(int a, int b){
        int result= 0;
        if (a>b){
            result= a;
        }else{
            result= b;
        }
        return result;
    }
}
