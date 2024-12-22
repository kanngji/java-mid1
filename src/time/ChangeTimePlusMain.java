package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("dt = " + dt);

        LocalDateTime plus1 =dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusdt1 = " + plus1);

        LocalDateTime plus2 =dt.plusYears(10);
        System.out.println("plusdt2 = " + plus2);


    }
}
