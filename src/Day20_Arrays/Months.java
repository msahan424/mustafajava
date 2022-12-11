package Day20_Arrays;

import java.util.Arrays;

public class Months {
    public static void main(String[] args) {
        String[] months= {"January", "February", "March","April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String[] weeks= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //System.out.println(Arrays.toString(months));
        for (int i = 0; i < months.length; i++) {//i:represents the index numbers of array starting from 09
            for (int j = 0; j <4; j++) {
                System.out.println(Arrays.toString(weeks));
            }
            System.out.println(months[i]);
        }
    }
}
