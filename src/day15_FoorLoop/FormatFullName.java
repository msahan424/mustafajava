package day15_FoorLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName= "inDEpendENt";
        String lastName= "COLLAGE";
        //firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        firstName= (""+ firstName.charAt(0)).toUpperCase() +firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.print(firstName+ " " + lastName);


    }
}
