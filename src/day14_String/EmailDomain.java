package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email= "mustafa@pascaledu.net";
        //domain
        int beginningIndex= email.indexOf("@") +1;
        int endingIndex= email.lastIndexOf(".");
        String domain= email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

    }
}
