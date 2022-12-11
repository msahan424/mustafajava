package Example1;

public class Example10 {
    public static void main(String[] args) {
        String input= "today it will be 100 degrees !";
        int n= 0;
        int input2 = input.length();

        while(n<input.length()){
            n++;
            System.out.print(input.charAt(++n));
            //if(n==8){
              //  continue;
            //}else if(n==9){
                //break;
            }

        }

    }

