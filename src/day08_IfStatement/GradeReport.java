package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        boolean a =  score<= 100 && score>= 90;
        boolean b =  score<= 89 && score >= 80;
        boolean c =  score<= 79 && score >= 70;
        boolean d = score <= 69 && score>= 50;
        boolean e = score<=49 && score >= 40;
        boolean f =  score<= 39 && score >= 0;

        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Nicely Good");
        }
        if(e){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }

    }
}
