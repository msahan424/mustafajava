package day24_CustomMethods_Return;

public class day24_CustomMethods_Return {
    public static void main(String[] args) {
         initials("Alex de", "Souza");

    }
    //create a method that can display the initials of the person.  initials(String firstName, string lastName)

    public static void initials(String firstName, String lastName){
        //System.out.println("Hello king");
        String initial= firstName.charAt(0)+ "." +lastName.charAt(0);
        System.out.println("initial= " + initial);
    }

}
