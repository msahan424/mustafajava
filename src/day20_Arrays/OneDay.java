package day20_Arrays;

public class OneDay {
    public static void main(String[] args) {
        String[] months= {"January", "February", "March","April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String[] weeks= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int i = (int) (Math.random() * months.length);
        int j = (int) (Math.random() * weeks.length);
        System.out.println(" on " +weeks[j] + "  " + months[i]);
    }
}
