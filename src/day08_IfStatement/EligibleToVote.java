package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Antony";
        byte age =18;
        String citizen = "Ireland";
        boolean isEligible = age>= 21&& citizen == "Ireland";
        if(isEligible){
            System.out.println(name + " is eligible to vote:");

            }
        if(!isEligible){
            System.out.println(name + " is not eligible to vote");
        }

    }
}
