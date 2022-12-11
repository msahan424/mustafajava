package day24_CustomMethods_Return;

public class DomainEmailMethods {
    public static void main(String[] args) {
        domain("mstf@icloud.com");
        domain("lklm@amazon.com");
        nameOfMonth(12);
       nameOfDay(7);
    }
    //create a method that can display the domain of the email. domain(string email)
    public static void domain(String email){
        String domain= email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );
        System.out.println("domain = " + domain);
    }
    //3. create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name= "";
        if (number>=1 &&number<= 12){
             name= (number==1)? "Jan" : (number==2)?"February": (number==3) ? "March" : (number==4)? "April": (number==5)?
                     "May" : (number==6)? "june" : (number==7)?"July" : (number==8) ?"August"   :(number==9) ?"September"   :
                     (number==10) ?"October"   :(number==11) ?"November"   :"December"  ;
        }else{
            name="Invalid";
        }
        System.out.println("name = " + name);
    }
    //4. Create a method that can print the name of the day based on the given number to the method
    public  static void nameOfDay(int number){

        switch (number) {//1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default: // only gets executed if none of the case blocks of the case blocks are matching
                System.out.println("Invalid");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // default:
            // System.out.println("Invalid");
        }
       /* if (number>=1 &&number<= 7){
            name= (number==1)? "Monday" : (number==2)?"Tuesday": (number==3) ? "Wednesday" : (number==4)? "Thursday": (number==5)?
                    "Friday" : (number==6)? "Saturday" : "Sunday" ;
*/
    }
    //5. Create a method that can print how many days a month has
    /*public static void daysInMonth(int number){

    }

    */
}
