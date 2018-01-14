package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeAPISpecificTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 11, 9, 10);
        System.out.println(localDateTime);

        System.out.println(localDateTime.plusMonths(6));
        System.out.println(localDateTime.minusMonths(6));
    }
}
