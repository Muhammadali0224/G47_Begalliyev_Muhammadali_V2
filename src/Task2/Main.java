package Task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate time1 = LocalDate.of(2019,3,1);
        LocalDate time2 = LocalDate.of(2024,9,30);

        int result = 0;



        while (time2.isAfter(time1)) {
            DayOfWeek dayOfWeek = time1.getDayOfWeek();
            if (dayOfWeek.getValue() == 6) {
                result += 6;
            }
            if (dayOfWeek.getValue() == 7) {
                result += 9;
            }
            time1 = time1.plusDays(1);
        }

        System.out.println("All hours -> " + result);
    }
}
